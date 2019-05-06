package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSelectPopover extends js.Object {
  /**
    * Header text for the popover
    */
  var header: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text for popover body
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of options for the popover
    */
  var options: js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SelectPopoverOption */ _
  ]
  /**
    * Subheader text for the popover
    */
  var subHeader: js.UndefOr[java.lang.String] = js.undefined
}

object IonSelectPopover {
  @scala.inline
  def apply(
    options: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SelectPopoverOption */ _
    ],
    header: java.lang.String = null,
    message: java.lang.String = null,
    subHeader: java.lang.String = null
  ): IonSelectPopover = {
    val __obj = js.Dynamic.literal(options = options)
    if (header != null) __obj.updateDynamic("header")(header)
    if (message != null) __obj.updateDynamic("message")(message)
    if (subHeader != null) __obj.updateDynamic("subHeader")(subHeader)
    __obj.asInstanceOf[IonSelectPopover]
  }
}

