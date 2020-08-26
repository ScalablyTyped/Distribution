package typings.luminoWidgets.docklayoutMod.DockLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dock layout configuration object.
  */
@js.native
trait ILayoutConfig extends js.Object {
  /**
    * The layout config for the main dock area.
    */
  var main: AreaConfig | Null = js.native
}

object ILayoutConfig {
  @scala.inline
  def apply(): ILayoutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILayoutConfig]
  }
  @scala.inline
  implicit class ILayoutConfigOps[Self <: ILayoutConfig] (val x: Self) extends AnyVal {
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
    def setMain(value: AreaConfig): Self = this.set("main", value.asInstanceOf[js.Any])
    @scala.inline
    def setMainNull: Self = this.set("main", null)
  }
  
}

