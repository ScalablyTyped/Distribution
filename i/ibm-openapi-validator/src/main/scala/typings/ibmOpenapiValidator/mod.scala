package typings.ibmOpenapiValidator

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * OpenAPI document validator
    * @param openApiDoc - OpenAPI document object
    * @param defaultMode - If set to true, the validator will ignore the .validaterc file and will use the [configuration defaults](https://github.com/IBM/openapi-validator#default-values).
    * @returns Validation results
    */
  inline def apply(openApiDoc: StringDictionary[Any]): js.Promise[validatorResult] = ^.asInstanceOf[js.Dynamic].apply(openApiDoc.asInstanceOf[js.Any]).asInstanceOf[js.Promise[validatorResult]]
  inline def apply(openApiDoc: StringDictionary[Any], defaultMode: validatorParameterDefaultMode): js.Promise[validatorResult] = (^.asInstanceOf[js.Dynamic].apply(openApiDoc.asInstanceOf[js.Any], defaultMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[validatorResult]]
  
  @JSImport("ibm-openapi-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @default false
    */
  type validatorParameterDefaultMode = Boolean
  
  trait validatorResult extends StObject {
    
    var errors: js.Array[Any | validatorResultItem]
    
    var warnings: js.Array[Any | validatorResultItem]
  }
  object validatorResult {
    
    inline def apply(errors: js.Array[Any | validatorResultItem], warnings: js.Array[Any | validatorResultItem]): validatorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[validatorResult]
    }
    
    extension [Self <: validatorResult](x: Self) {
      
      inline def setErrors(value: js.Array[Any | validatorResultItem]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: (Any | validatorResultItem)*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setWarnings(value: js.Array[Any | validatorResultItem]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsVarargs(value: (Any | validatorResultItem)*): Self = StObject.set(x, "warnings", js.Array(value*))
    }
  }
  
  trait validatorResultItem extends StObject {
    
    var message: String
    
    var path: String
  }
  object validatorResultItem {
    
    inline def apply(message: String, path: String): validatorResultItem = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[validatorResultItem]
    }
    
    extension [Self <: validatorResultItem](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
