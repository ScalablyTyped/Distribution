package typings.googleapis.mlV1Mod.mlV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single hyperparameter to optimize.
  */
@js.native
trait SchemaGoogleCloudMlV1ParameterSpec extends js.Object {
  /**
    * Required if type is `CATEGORICAL`. The list of possible categories.
    */
  var categoricalValues: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required if type is `DISCRETE`. A list of feasible points. The list
    * should be in strictly increasing order. For instance, this parameter
    * might have possible settings of 1.5, 2.5, and 4.0. This list should not
    * contain more than 1,000 values.
    */
  var discreteValues: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if
    * type is `CATEGORICAL`. This value should be integers if type is
    * `INTEGER`.
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * Required if type is `DOUBLE` or `INTEGER`. This field should be unset if
    * type is `CATEGORICAL`. This value should be integers if type is INTEGER.
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * Required. The parameter name must be unique amongst all ParameterConfigs
    * in a HyperparameterSpec message. E.g., &quot;learning_rate&quot;.
    */
  var parameterName: js.UndefOr[String] = js.native
  /**
    * Optional. How the parameter should be scaled to the hypercube. Leave
    * unset for categorical parameters. Some kind of scaling is strongly
    * recommended for real or integral parameters (e.g., `UNIT_LINEAR_SCALE`).
    */
  var scaleType: js.UndefOr[String] = js.native
  /**
    * Required. The type of the parameter.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudMlV1ParameterSpec {
  @scala.inline
  def apply(
    categoricalValues: js.Array[String] = null,
    discreteValues: js.Array[Double] = null,
    maxValue: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    parameterName: String = null,
    scaleType: String = null,
    `type`: String = null
  ): SchemaGoogleCloudMlV1ParameterSpec = {
    val __obj = js.Dynamic.literal()
    if (categoricalValues != null) __obj.updateDynamic("categoricalValues")(categoricalValues.asInstanceOf[js.Any])
    if (discreteValues != null) __obj.updateDynamic("discreteValues")(discreteValues.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValue)) __obj.updateDynamic("maxValue")(maxValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (parameterName != null) __obj.updateDynamic("parameterName")(parameterName.asInstanceOf[js.Any])
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ParameterSpec]
  }
}

