package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a specific parameter.
  */
@js.native
trait SchemaParameterMetadata extends js.Object {
  /**
    * Required. The help text to display for the parameter.
    */
  var helpText: js.UndefOr[String] = js.native
  /**
    * Optional. Whether the parameter is optional. Defaults to false.
    */
  var isOptional: js.UndefOr[Boolean] = js.native
  /**
    * Required. The label to display for the parameter.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * Required. The name of the parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. Regexes that the parameter must match.
    */
  var regexes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaParameterMetadata {
  @scala.inline
  def apply(
    helpText: String = null,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    name: String = null,
    regexes: js.Array[String] = null
  ): SchemaParameterMetadata = {
    val __obj = js.Dynamic.literal()
    if (helpText != null) __obj.updateDynamic("helpText")(helpText.asInstanceOf[js.Any])
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (regexes != null) __obj.updateDynamic("regexes")(regexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParameterMetadata]
  }
}

