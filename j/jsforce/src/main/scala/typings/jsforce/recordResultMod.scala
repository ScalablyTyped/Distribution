package typings.jsforce

import typings.jsforce.jsforceBooleans.`false`
import typings.jsforce.jsforceBooleans.`true`
import typings.jsforce.salesforceIdMod.SalesforceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordResultMod {
  
  @js.native
  trait ErrorResult extends RecordResult {
    
    var errors: js.Array[String] = js.native
    
    var success: `false` = js.native
  }
  object ErrorResult {
    
    @scala.inline
    def apply(errors: js.Array[String], success: `false`): ErrorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResult]
    }
    
    @scala.inline
    implicit class ErrorResultMutableBuilder[Self <: ErrorResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsforce.recordResultMod.SuccessResult
    - typings.jsforce.recordResultMod.ErrorResult
  */
  trait RecordResult extends StObject
  object RecordResult {
    
    @scala.inline
    def ErrorResult(errors: js.Array[String], success: `false`): typings.jsforce.recordResultMod.ErrorResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsforce.recordResultMod.ErrorResult]
    }
    
    @scala.inline
    def SuccessResult(id: SalesforceId, success: `true`): typings.jsforce.recordResultMod.SuccessResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsforce.recordResultMod.SuccessResult]
    }
  }
  
  @js.native
  trait SuccessResult extends RecordResult {
    
    var id: SalesforceId = js.native
    
    var success: `true` = js.native
  }
  object SuccessResult {
    
    @scala.inline
    def apply(id: SalesforceId, success: `true`): SuccessResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessResult]
    }
    
    @scala.inline
    implicit class SuccessResultMutableBuilder[Self <: SuccessResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: SalesforceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: `true`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
}
