package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgRadialGaugeRange
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    brush: String = null,
    endValue: js.UndefOr[Double] = js.undefined,
    innerEndExtent: js.UndefOr[Double] = js.undefined,
    innerStartExtent: js.UndefOr[Double] = js.undefined,
    name: String = null,
    outerEndExtent: js.UndefOr[Double] = js.undefined,
    outerStartExtent: js.UndefOr[Double] = js.undefined,
    outline: String = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    startValue: js.UndefOr[Double] = js.undefined,
    strokeThickness: js.UndefOr[Double] = js.undefined
  ): IgRadialGaugeRange = {
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
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startValue)) __obj.updateDynamic("startValue")(startValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeThickness)) __obj.updateDynamic("strokeThickness")(strokeThickness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgRadialGaugeRange]
  }
}

