package typings.luminoWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the data to render a menu item.
  */
@js.native
trait IRenderData extends js.Object {
  /**
    * Whether the item is the active item.
    */
  val active: Boolean = js.native
  /**
    * Whether the item should be collapsed.
    */
  val collapsed: Boolean = js.native
  /**
    * The item to be rendered.
    */
  val item: IItem = js.native
}

object IRenderData {
  @scala.inline
  def apply(active: Boolean, collapsed: Boolean, item: IItem): IRenderData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], collapsed = collapsed.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderData]
  }
  @scala.inline
  implicit class IRenderDataOps[Self <: IRenderData] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: IItem): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

