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
  var layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SegmentButtonLayout */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SegmentButtonLayout */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
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
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    value: java.lang.String,
    layout: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SegmentButtonLayout */ js.Any = null
  ): IonSegmentButton = {
    val __obj = js.Dynamic.literal(checked = checked, disabled = disabled, mode = mode, value = value)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[IonSegmentButton]
  }
}

