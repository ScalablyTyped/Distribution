package typings.makerDotJs.MakerJsNs

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
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null
  ): IMetaParameter = {
    val __obj = js.Dynamic.literal(title = title, value = value)
    __obj.updateDynamic("type")(`type`)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaParameter]
  }
}

