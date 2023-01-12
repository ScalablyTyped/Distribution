package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutSubscribableFunctions[T] extends StObject {
  
  def clearError(): Unit
  
  var error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ Any
  
  var isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  var isValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
  
  var isValidating: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
  
  var rules: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<KnockoutValidationRule> */ Any
  
  def setError(error: String): Unit
}
object KnockoutSubscribableFunctions {
  
  inline def apply[T](
    clearError: () => Unit,
    error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ Any,
    isModified: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    isValid: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any,
    isValidating: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any,
    rules: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<KnockoutValidationRule> */ Any,
    setError: String => Unit
  ): KnockoutSubscribableFunctions[T] = {
    val __obj = js.Dynamic.literal(clearError = js.Any.fromFunction0(clearError), error = error.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], isValidating = isValidating.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], setError = js.Any.fromFunction1(setError))
    __obj.asInstanceOf[KnockoutSubscribableFunctions[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnockoutSubscribableFunctions[?], T] (val x: Self & KnockoutSubscribableFunctions[T]) extends AnyVal {
    
    inline def setClearError(value: () => Unit): Self = StObject.set(x, "clearError", js.Any.fromFunction0(value))
    
    inline def setError(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ Any
    ): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setIsModified(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    inline def setIsValid(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
    ): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setIsValidating(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ Any
    ): Self = StObject.set(x, "isValidating", value.asInstanceOf[js.Any])
    
    inline def setRules(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<KnockoutValidationRule> */ Any
    ): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setSetError(value: String => Unit): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
  }
}
