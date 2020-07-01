package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents intent parameters.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1IntentParameter extends js.Object {
  /**
    * Optional. The default value to use when the `value` yields an empty
    * result. Default values can be extracted from contexts by using the
    * following syntax: `#context_name.parameter_name`.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * Required. The name of the parameter.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. The name of the entity type, prefixed with `@`, that describes
    * values of the parameter. If the parameter is required, this must be
    * provided.
    */
  var entityTypeDisplayName: js.UndefOr[String] = js.native
  /**
    * Optional. Indicates whether the parameter represents a list of values.
    */
  var isList: js.UndefOr[Boolean] = js.native
  /**
    * Optional. Indicates whether the parameter is required. That is, whether
    * the intent cannot be completed without collecting the parameter value.
    */
  var mandatory: js.UndefOr[Boolean] = js.native
  /**
    * The unique identifier of this parameter.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of prompts that the agent can present to the
    * user in order to collect value for the parameter.
    */
  var prompts: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional. The definition of the parameter value. It can be: - a constant
    * string, - a parameter value defined as `$parameter_name`, - an original
    * parameter value defined as `$parameter_name.original`, - a parameter
    * value from some context defined as   `#context_name.parameter_name`.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1IntentParameter {
  @scala.inline
  def apply(
    defaultValue: String = null,
    displayName: String = null,
    entityTypeDisplayName: String = null,
    isList: js.UndefOr[Boolean] = js.undefined,
    mandatory: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    prompts: js.Array[String] = null,
    value: String = null
  ): SchemaGoogleCloudDialogflowV2beta1IntentParameter = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (entityTypeDisplayName != null) __obj.updateDynamic("entityTypeDisplayName")(entityTypeDisplayName.asInstanceOf[js.Any])
    if (!js.isUndefined(isList)) __obj.updateDynamic("isList")(isList.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mandatory)) __obj.updateDynamic("mandatory")(mandatory.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (prompts != null) __obj.updateDynamic("prompts")(prompts.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentParameter]
  }
}

