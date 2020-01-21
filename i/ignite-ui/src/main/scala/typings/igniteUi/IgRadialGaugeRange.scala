package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialGaugeRange
  extends /**
	 * Option for IgRadialGaugeRange
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the brush for the entire range.
  	 */
  var brush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the ending value of the range.
  	 */
  var endValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the ending value of the inner extent of the range.
  	 */
  var innerEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the starting value of the inner extent of the range.
  	 */
  var innerStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the name of the range.
  	 */
  var name: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the ending value of the outer extent of the range.
  	 */
  var outerEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the starting value of the outer extent of the range.
  	 */
  var outerStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the brush for the outline of the range.
  	 */
  var outline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the flag used to determine if the range should be removed. If set to true, the range (if existing) is removed.
  	 */
  var remove: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the starting value of the range.
  	 */
  var startValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the thickness of the range outline.
  	 */
  var strokeThickness: js.UndefOr[Double] = js.undefined
}

object IgRadialGaugeRange {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgRadialGaugeRange
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    brush: String = null,
    endValue: Int | Double = null,
    innerEndExtent: Int | Double = null,
    innerStartExtent: Int | Double = null,
    name: String = null,
    outerEndExtent: Int | Double = null,
    outerStartExtent: Int | Double = null,
    outline: String = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    startValue: Int | Double = null,
    strokeThickness: Int | Double = null
  ): IgRadialGaugeRange = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (brush != null) __obj.updateDynamic("brush")(brush.asInstanceOf[js.Any])
    if (endValue != null) __obj.updateDynamic("endValue")(endValue.asInstanceOf[js.Any])
    if (innerEndExtent != null) __obj.updateDynamic("innerEndExtent")(innerEndExtent.asInstanceOf[js.Any])
    if (innerStartExtent != null) __obj.updateDynamic("innerStartExtent")(innerStartExtent.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outerEndExtent != null) __obj.updateDynamic("outerEndExtent")(outerEndExtent.asInstanceOf[js.Any])
    if (outerStartExtent != null) __obj.updateDynamic("outerStartExtent")(outerStartExtent.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRadialGaugeRange]
  }
}

