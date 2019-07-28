package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLinearGaugeRange
  extends /**
	 * Option for IgLinearGaugeRange
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the brush to use to fill the range.
  	 */
  var brush: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the value at which the range ends along the scale.
  	 */
  var endValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to end rendering the inner edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var innerEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to start rendering the inner edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var innerStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the name of the range.
  	 */
  var name: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to end rendering the outer edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var outerEndExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the distance measured from the front/bottom of the bullet graph (from 0 to 1) at which to start rendering the outer edge of the range.
  	 * Values further from zero than 1 can be used to make this extend further than the normal width/height of the bullet graph.
  	 */
  var outerStartExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the outline to use when rendering the range.
  	 */
  var outline: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the value at which the range starts along the scale.
  	 */
  var startValue: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the stroke thickness to use when rendering this range's outline.
  	 */
  var strokeThickness: js.UndefOr[Double] = js.undefined
}

object IgLinearGaugeRange {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgLinearGaugeRange
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
    startValue: Int | Double = null,
    strokeThickness: Int | Double = null
  ): IgLinearGaugeRange = {
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
    if (startValue != null) __obj.updateDynamic("startValue")(startValue.asInstanceOf[js.Any])
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLinearGaugeRange]
  }
}

