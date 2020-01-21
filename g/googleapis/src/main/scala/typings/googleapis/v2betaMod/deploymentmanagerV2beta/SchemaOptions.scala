package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options allows customized resource handling by Deployment Manager.
  */
@js.native
trait SchemaOptions extends js.Object {
  /**
    * Options regarding how to thread async requests.
    */
  var asyncOptions: js.UndefOr[js.Array[SchemaAsyncOptions]] = js.native
  /**
    * The mappings that apply for requests.
    */
  var inputMappings: js.UndefOr[js.Array[SchemaInputMapping]] = js.native
  /**
    * Options for how to validate and process properties on a resource.
    */
  var validationOptions: js.UndefOr[SchemaValidationOptions] = js.native
  /**
    * Additional properties block described as a jsonSchema, these properties
    * will never be part of the json payload, but they can be consumed by
    * InputMappings, this must be a valid json schema draft-04. The properties
    * specified here will be decouple in a different section. This schema will
    * be merged to the schema validation, and properties here will be extracted
    * From the payload and consumed explicitly by InputMappings. ex: field1:
    * type: string field2: type: number
    */
  var virtualProperties: js.UndefOr[String] = js.native
}

object SchemaOptions {
  @scala.inline
  def apply(
    asyncOptions: js.Array[SchemaAsyncOptions] = null,
    inputMappings: js.Array[SchemaInputMapping] = null,
    validationOptions: SchemaValidationOptions = null,
    virtualProperties: String = null
  ): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncOptions != null) __obj.updateDynamic("asyncOptions")(asyncOptions.asInstanceOf[js.Any])
    if (inputMappings != null) __obj.updateDynamic("inputMappings")(inputMappings.asInstanceOf[js.Any])
    if (validationOptions != null) __obj.updateDynamic("validationOptions")(validationOptions.asInstanceOf[js.Any])
    if (virtualProperties != null) __obj.updateDynamic("virtualProperties")(virtualProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOptions]
  }
}

