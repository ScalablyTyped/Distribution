package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialGaugeRange
  extends /**
	 * Option for IgRadialGaugeRange
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets or sets the brush for the entire range.
  	 */
  var brush: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the ending value of the range.
  	 */
  var endValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the ending value of the inner extent of the range.
  	 */
  var innerEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the starting value of the inner extent of the range.
  	 */
  var innerStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the name of the range.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the ending value of the outer extent of the range.
  	 */
  var outerEndExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the starting value of the outer extent of the range.
  	 */
  var outerStartExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the brush for the outline of the range.
  	 */
  var outline: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the flag used to determine if the range should be removed. If set to true, the range (if existing) is removed.
  	 */
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the starting value of the range.
  	 */
  var startValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the thickness of the range outline.
  	 */
  var strokeThickness: js.UndefOr[scala.Double] = js.undefined
}

object IgRadialGaugeRange {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgRadialGaugeRange
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    brush: java.lang.String = null,
    endValue: scala.Int | scala.Double = null,
    innerEndExtent: scala.Int | scala.Double = null,
    innerStartExtent: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    outerEndExtent: scala.Int | scala.Double = null,
    outerStartExtent: scala.Int | scala.Double = null,
    outline: java.lang.String = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    startValue: scala.Int | scala.Double = null,
    strokeThickness: scala.Int | scala.Double = null
  ): IgRadialGaugeRange = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (brush != null) __obj.updateDynamic("brush")(brush)
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (innerEndExtent != null) __obj.updateDynamic("innerEndExtent")(innerEndExtent.asInstanceOf[js.Any])
    if (innerStartExtent != null) __obj.updateDynamic("innerStartExtent")(innerStartExtent.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (outerEndExtent != null) __obj.updateDynamic("outerEndExtent")(outerEndExtent.asInstanceOf[js.Any])
    if (outerStartExtent != null) __obj.updateDynamic("outerStartExtent")(outerStartExtent.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRadialGaugeRange]
  }
}

