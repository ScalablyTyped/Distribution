package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the data to render a tab.
  */
@js.native
trait IRenderData[T] extends js.Object {
  /**
    * Whether the tab is the current tab.
    */
  val current: Boolean = js.native
  /**
    * The title associated with the tab.
    */
  val title: Title[T] = js.native
  /**
    * The z-index for the tab.
    */
  val zIndex: Double = js.native
}

object IRenderData {
  @scala.inline
  def apply[T](current: Boolean, title: Title[T], zIndex: Double): IRenderData[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderData[T]]
  }
  @scala.inline
  implicit class IRenderDataOps[Self <: IRenderData[_], T] (val x: Self with IRenderData[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: Title[T]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
  }
  
}

