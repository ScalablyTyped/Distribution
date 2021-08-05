package typings.knockoutSecureBinding

import typings.knockoutSecureBinding.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutStatic extends StObject {
  
  var secureBindingsProvider: Instantiable
}
object KnockoutStatic {
  
  inline def apply(secureBindingsProvider: Instantiable): KnockoutStatic = {
    val __obj = js.Dynamic.literal(secureBindingsProvider = secureBindingsProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  extension [Self <: KnockoutStatic](x: Self) {
    
    inline def setSecureBindingsProvider(value: Instantiable): Self = StObject.set(x, "secureBindingsProvider", value.asInstanceOf[js.Any])
  }
}
