package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLinearGaugeRange
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    brush: String = null,
    endValue: js.UndefOr[Double] = js.undefined,
    innerEndExtent: js.UndefOr[Double] = js.undefined,
    innerStartExtent: js.UndefOr[Double] = js.undefined,
    name: String = null,
    outerEndExtent: js.UndefOr[Double] = js.undefined,
    outerStartExtent: js.UndefOr[Double] = js.undefined,
    outline: String = null,
    startValue: js.UndefOr[Double] = js.undefined,
    strokeThickness: js.UndefOr[Double] = js.undefined
  ): IgLinearGaugeRange = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (brush != null) __obj.updateDynamic("brush")(brush.asInstanceOf[js.Any])
    if (!js.isUndefined(endValue)) __obj.updateDynamic("endValue")(endValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerEndExtent)) __obj.updateDynamic("innerEndExtent")(innerEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerStartExtent)) __obj.updateDynamic("innerStartExtent")(innerStartExtent.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(outerEndExtent)) __obj.updateDynamic("outerEndExtent")(outerEndExtent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(outerStartExtent)) __obj.updateDynamic("outerStartExtent")(outerStartExtent.get.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeThickness)) __obj.updateDynamic("strokeThickness")(strokeThickness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLinearGaugeRange]
  }
}

