package typings.ionicCore.componentsMod.Components

import typings.ionicCore.selectPopoverInterfaceMod.SelectPopoverOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonSelectPopover extends js.Object {
  /**
    * Header text for the popover
    */
  var header: js.UndefOr[String] = js.native
  /**
    * Text for popover body
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Array of options for the popover
    */
  var options: js.Array[SelectPopoverOption] = js.native
  /**
    * Subheader text for the popover
    */
  var subHeader: js.UndefOr[String] = js.native
}

object IonSelectPopover {
  @scala.inline
  def apply(options: js.Array[SelectPopoverOption]): IonSelectPopover = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSelectPopover]
  }
  @scala.inline
  implicit class IonSelectPopoverOps[Self <: IonSelectPopover] (val x: Self) extends AnyVal {
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
    def setOptionsVarargs(value: SelectPopoverOption*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[SelectPopoverOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setSubHeader(value: String): Self = this.set("subHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubHeader: Self = this.set("subHeader", js.undefined)
  }
  
}

