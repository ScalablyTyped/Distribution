package typings.ibmOpenapiValidator

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * OpenAPI document validator
    * @param openApiDoc - OpenAPI document object
    * @param defaultMode - If set to true, the validator will ignore the .validaterc file and will use the [configuration defaults](https://github.com/IBM/openapi-validator#default-values).
    * @returns Validation results
    */
  @JSImport("ibm-openapi-validator", JSImport.Namespace)
  @js.native
  def apply(openApiDoc: StringDictionary[js.Any]): js.Promise[validatorResult] = js.native
  @JSImport("ibm-openapi-validator", JSImport.Namespace)
  @js.native
  def apply(openApiDoc: StringDictionary[js.Any], defaultMode: validatorParameterDefaultMode): js.Promise[validatorResult] = js.native
  
  /**
    * @default false
    */
  type validatorParameterDefaultMode = Boolean
  
  @js.native
  trait validatorResult extends StObject {
    
    var errors: js.Array[js.Any | validatorResultItem] = js.native
    
    var warnings: js.Array[js.Any | validatorResultItem] = js.native
  }
  object validatorResult {
    
    @scala.inline
    def apply(errors: js.Array[js.Any | validatorResultItem], warnings: js.Array[js.Any | validatorResultItem]): validatorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[validatorResult]
    }
    
    @scala.inline
    implicit class validatorResultMutableBuilder[Self <: validatorResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[js.Any | validatorResultItem]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: (js.Any | validatorResultItem)*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setWarnings(value: js.Array[js.Any | validatorResultItem]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningsVarargs(value: (js.Any | validatorResultItem)*): Self = StObject.set(x, "warnings", js.Array(value :_*))
    }
  }
  
  @js.native
  trait validatorResultItem extends StObject {
    
    var message: String = js.native
    
    var path: String = js.native
  }
  object validatorResultItem {
    
    @scala.inline
    def apply(message: String, path: String): validatorResultItem = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[validatorResultItem]
    }
    
    @scala.inline
    implicit class validatorResultItemMutableBuilder[Self <: validatorResultItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
