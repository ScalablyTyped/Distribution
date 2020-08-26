package typings.luminoWidgets.tabbarMod.TabBar

import typings.luminoWidgets.titleMod.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `tabCloseRequested` signal.
  */
@js.native
trait ITabCloseRequestedArgs[T] extends js.Object {
  /**
    * The index of the tab to close.
    */
  val index: Double = js.native
  /**
    * The title for the tab.
    */
  val title: Title[T] = js.native
}

object ITabCloseRequestedArgs {
  @scala.inline
  def apply[T](index: Double, title: Title[T]): ITabCloseRequestedArgs[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabCloseRequestedArgs[T]]
  }
  @scala.inline
  implicit class ITabCloseRequestedArgsOps[Self <: ITabCloseRequestedArgs[_], T] (val x: Self with ITabCloseRequestedArgs[T]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: Title[T]): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}

