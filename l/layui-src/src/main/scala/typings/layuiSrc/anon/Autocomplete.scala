package typings.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autocomplete extends StObject {
  
  var autocomplete: Any
  
  /**
    * form内置的验证
    */
  var verify: Date
}
object Autocomplete {
  
  inline def apply(autocomplete: Any, verify: Date): Autocomplete = {
    val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autocomplete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Autocomplete] (val x: Self) extends AnyVal {
    
    inline def setAutocomplete(value: Any): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
    
    inline def setVerify(value: Date): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
  }
}
