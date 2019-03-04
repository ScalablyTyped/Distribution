package typings
package makerDotJsLib.MakerJsNs

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
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional minimum value of the range.
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional step value between min and max.
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * Display text of the parameter.
    */
  var title: java.lang.String
  /**
    * Type of the parameter. Currently supports "range".
    */
  var `type`: java.lang.String
  /**
    * Initial sample value for this parameter.
    */
  var value: js.Any
}

object IMetaParameter {
  @scala.inline
  def apply(
    title: java.lang.String,
    `type`: java.lang.String,
    value: js.Any,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
  ): IMetaParameter = {
    val __obj = js.Dynamic.literal(title = title, value = value)
    __obj.updateDynamic("type")(`type`)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetaParameter]
  }
}

