package typings.atIonicCore.distTypesComponentsMod.ComponentsNs

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
  var options: js.Array[SelectPopoverOption]
  /**
    * Subheader text for the popover
    */
  var subHeader: js.UndefOr[String] = js.undefined
}

object IonSelectPopover {
  @scala.inline
  def apply(
    options: js.Array[SelectPopoverOption],
    header: String = null,
    message: String = null,
    subHeader: String = null
  ): IonSelectPopover = {
    val __obj = js.Dynamic.literal(options = options)
    if (header != null) __obj.updateDynamic("header")(header)
    if (message != null) __obj.updateDynamic("message")(message)
    if (subHeader != null) __obj.updateDynamic("subHeader")(subHeader)
    __obj.asInstanceOf[IonSelectPopover]
  }
}

