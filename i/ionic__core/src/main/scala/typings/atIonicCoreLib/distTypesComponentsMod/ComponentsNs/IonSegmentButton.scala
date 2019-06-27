package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonSegmentButton extends js.Object {
  /**
    * If `true`, the segment button is selected.
    */
  var checked: scala.Boolean
  /**
    * If `true`, the user cannot interact with the segment button.
    */
  var disabled: scala.Boolean
  /**
    * Set the layout of the text and icon in the segment.
    */
  var layout: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SegmentButtonLayout */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
  /**
    * The type of the button.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button
  /**
    * The value of the segment button.
    */
  var value: java.lang.String
}

object IonSegmentButton {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    disabled: scala.Boolean,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button,
    value: java.lang.String,
    layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SegmentButtonLayout */ js.Any = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null
  ): IonSegmentButton = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonSegmentButton]
  }
}

