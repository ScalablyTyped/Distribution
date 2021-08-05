package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options allows customized resource handling by Deployment Manager.
  */
trait SchemaOptions extends StObject {
  
  /**
    * Options regarding how to thread async requests.
    */
  var asyncOptions: js.UndefOr[js.Array[SchemaAsyncOptions]] = js.undefined
  
  /**
    * The mappings that apply for requests.
    */
  var inputMappings: js.UndefOr[js.Array[SchemaInputMapping]] = js.undefined
  
  /**
    * The json path to the field in the resource JSON body into which the
    * resource name should be mapped. Leaving this empty indicates that there
    * should be no mapping performed.
    */
  var nameProperty: js.UndefOr[String] = js.undefined
  
  /**
    * Options for how to validate and process properties on a resource.
    */
  var validationOptions: js.UndefOr[SchemaValidationOptions] = js.undefined
}
object SchemaOptions {
  
  inline def apply(): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOptions]
  }
  
  extension [Self <: SchemaOptions](x: Self) {
    
    inline def setAsyncOptions(value: js.Array[SchemaAsyncOptions]): Self = StObject.set(x, "asyncOptions", value.asInstanceOf[js.Any])
    
    inline def setAsyncOptionsUndefined: Self = StObject.set(x, "asyncOptions", js.undefined)
    
    inline def setAsyncOptionsVarargs(value: SchemaAsyncOptions*): Self = StObject.set(x, "asyncOptions", js.Array(value :_*))
    
    inline def setInputMappings(value: js.Array[SchemaInputMapping]): Self = StObject.set(x, "inputMappings", value.asInstanceOf[js.Any])
    
    inline def setInputMappingsUndefined: Self = StObject.set(x, "inputMappings", js.undefined)
    
    inline def setInputMappingsVarargs(value: SchemaInputMapping*): Self = StObject.set(x, "inputMappings", js.Array(value :_*))
    
    inline def setNameProperty(value: String): Self = StObject.set(x, "nameProperty", value.asInstanceOf[js.Any])
    
    inline def setNamePropertyUndefined: Self = StObject.set(x, "nameProperty", js.undefined)
    
    inline def setValidationOptions(value: SchemaValidationOptions): Self = StObject.set(x, "validationOptions", value.asInstanceOf[js.Any])
    
    inline def setValidationOptionsUndefined: Self = StObject.set(x, "validationOptions", js.undefined)
  }
}
