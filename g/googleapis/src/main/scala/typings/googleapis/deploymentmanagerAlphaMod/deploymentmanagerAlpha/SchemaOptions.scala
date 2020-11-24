package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

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
    * The json path to the field in the resource JSON body into which the
    * resource name should be mapped. Leaving this empty indicates that there
    * should be no mapping performed.
    */
  var nameProperty: js.UndefOr[String] = js.native
  
  /**
    * Options for how to validate and process properties on a resource.
    */
  var validationOptions: js.UndefOr[SchemaValidationOptions] = js.native
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
    def setNameProperty(value: String): Self = this.set("nameProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameProperty: Self = this.set("nameProperty", js.undefined)
    
    @scala.inline
    def setValidationOptions(value: SchemaValidationOptions): Self = this.set("validationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationOptions: Self = this.set("validationOptions", js.undefined)
  }
}
