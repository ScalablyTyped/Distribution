package typings.atIonicCore.distTypesComponentsMod.LocalJSX

import typings.atIonicCore.distTypesComponentsSelectDashPopoverSelectDashPopoverDashInterfaceMod.SelectPopoverOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSelectPopover extends js.Object {
  /**
    * Header text for the popover
    */
  var header: js.UndefOr[String] = js.undefined
  /**
    * Text for popover body
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Array of options for the popover
    */
  var options: js.UndefOr[js.Array[SelectPopoverOption]] = js.undefined
  /**
    * Subheader text for the popover
    */
  var subHeader: js.UndefOr[String] = js.undefined
}

object IonSelectPopover {
  @scala.inline
  def apply(
    header: String = null,
    message: String = null,
    options: js.Array[SelectPopoverOption] = null,
    subHeader: String = null
  ): IonSelectPopover = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (subHeader != null) __obj.updateDynamic("subHeader")(subHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSelectPopover]
  }
}

