package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewModelOptions extends OptionsBase {
  
  // the path to the value (used to create related observables from the factory).
  var factories: js.UndefOr[js.Any] = js.native
  
  // restricts the keys used on a model. Useful for reducing the number of kb.Observables created from a limited set of Backbone.Model attributes
  def `if`(objOrArray: js.Any): js.Any = js.native
  
  var internals: js.UndefOr[js.Array[String]] = js.native
  
  // an array of atttributes that will have kb.Observables created even if they do not exist on the Backbone.Model. Useful for binding Views that require specific observables to exist
  var keys: js.UndefOr[js.Array[String]] = js.native
  
  // an array of atttributes that should be scoped with an underscore, eg. name -> _name
  var requires: js.UndefOr[js.Array[String]] = js.native
}
object ViewModelOptions {
  
  @scala.inline
  def apply(`if`: js.Any => js.Any): ViewModelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("if")(js.Any.fromFunction1(`if`))
    __obj.asInstanceOf[ViewModelOptions]
  }
  
  @scala.inline
  implicit class ViewModelOptionsMutableBuilder[Self <: ViewModelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFactories(value: js.Any): Self = StObject.set(x, "factories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFactoriesUndefined: Self = StObject.set(x, "factories", js.undefined)
    
    @scala.inline
    def setIf(value: js.Any => js.Any): Self = StObject.set(x, "if", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInternals(value: js.Array[String]): Self = StObject.set(x, "internals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalsUndefined: Self = StObject.set(x, "internals", js.undefined)
    
    @scala.inline
    def setInternalsVarargs(value: String*): Self = StObject.set(x, "internals", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setRequires(value: js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    @scala.inline
    def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
  }
}
