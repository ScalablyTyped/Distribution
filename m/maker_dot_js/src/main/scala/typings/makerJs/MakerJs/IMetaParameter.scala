package typings.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a parameter and its limits.
  */
trait IMetaParameter extends js.Object {
  /**
    * Optional maximum value of the range.
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Optional minimum value of the range.
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Optional step value between min and max.
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Display text of the parameter.
    */
  var title: String
  /**
    * Type of the parameter. Currently supports "range".
    */
  var `type`: String
  /**
    * Initial sample value for this parameter.
    */
  var value: js.Any
}

object IMetaParameter {
  @scala.inline
  def apply(
    title: String,
    `type`: String,
    value: js.Any,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): IMetaParameter = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaParameter]
  }
}

