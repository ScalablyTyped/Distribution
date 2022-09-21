package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewModelOptions
  extends StObject
     with OptionsBase {
  
  // the path to the value (used to create related observables from the factory).
  var factories: js.UndefOr[Any] = js.undefined
  
  // restricts the keys used on a model. Useful for reducing the number of kb.Observables created from a limited set of Backbone.Model attributes
  def `if`(objOrArray: Any): Any
  
  var internals: js.UndefOr[js.Array[String]] = js.undefined
  
  // an array of atttributes that will have kb.Observables created even if they do not exist on the Backbone.Model. Useful for binding Views that require specific observables to exist
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  
  // an array of atttributes that should be scoped with an underscore, eg. name -> _name
  var requires: js.UndefOr[js.Array[String]] = js.undefined
}
object ViewModelOptions {
  
  inline def apply(`if`: Any => Any): ViewModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("if")(js.Any.fromFunction1(`if`))
    __obj.asInstanceOf[ViewModelOptions]
  }
  
  extension [Self <: ViewModelOptions](x: Self) {
    
    inline def setFactories(value: Any): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
    
    inline def setFactoriesUndefined: Self = StObject.set(x, "factories", js.undefined)
    
    inline def setIf(value: Any => Any): Self = StObject.set(x, "if", js.Any.fromFunction1(value))
    
    inline def setInternals(value: js.Array[String]): Self = StObject.set(x, "internals", value.asInstanceOf[js.Any])
    
    inline def setInternalsUndefined: Self = StObject.set(x, "internals", js.undefined)
    
    inline def setInternalsVarargs(value: String*): Self = StObject.set(x, "internals", js.Array(value*))
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value*))
  }
}
