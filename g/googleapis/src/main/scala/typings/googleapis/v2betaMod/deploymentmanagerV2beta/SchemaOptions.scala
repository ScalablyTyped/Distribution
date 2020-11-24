package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  
  @scala.inline
  implicit class SchemaOptionsOps[Self <: SchemaOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsyncOptionsVarargs(value: SchemaAsyncOptions*): Self = this.set("asyncOptions", js.Array(value :_*))
    
    @scala.inline
    def setAsyncOptions(value: js.Array[SchemaAsyncOptions]): Self = this.set("asyncOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncOptions: Self = this.set("asyncOptions", js.undefined)
    
    @scala.inline
    def setInputMappingsVarargs(value: SchemaInputMapping*): Self = this.set("inputMappings", js.Array(value :_*))
    
    @scala.inline
    def setInputMappings(value: js.Array[SchemaInputMapping]): Self = this.set("inputMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMappings: Self = this.set("inputMappings", js.undefined)
    
    @scala.inline
    def setValidationOptions(value: SchemaValidationOptions): Self = this.set("validationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationOptions: Self = this.set("validationOptions", js.undefined)
    
    @scala.inline
    def setVirtualProperties(value: String): Self = this.set("virtualProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualProperties: Self = this.set("virtualProperties", js.undefined)
  }
}
