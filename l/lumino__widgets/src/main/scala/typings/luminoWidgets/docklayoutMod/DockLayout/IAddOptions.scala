package typings.luminoWidgets.docklayoutMod.DockLayout

import typings.luminoWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for adding a widget to the dock layout.
  */
@js.native
trait IAddOptions extends js.Object {
  /**
    * The insertion mode for adding the widget.
    *
    * The default is `'tab-after'`.
    */
  var mode: js.UndefOr[InsertMode] = js.native
  /**
    * The reference widget for the insert location.
    *
    * The default is `null`.
    */
  var ref: js.UndefOr[Widget | Null] = js.native
}

object IAddOptions {
  @scala.inline
  def apply(): IAddOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAddOptions]
  }
  @scala.inline
  implicit class IAddOptionsOps[Self <: IAddOptions] (val x: Self) extends AnyVal {
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
    def setMode(value: InsertMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setRef(value: Widget): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

