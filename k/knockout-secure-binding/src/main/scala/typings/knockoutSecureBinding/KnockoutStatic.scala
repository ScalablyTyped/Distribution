package typings.knockoutSecureBinding

import typings.knockoutSecureBinding.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutStatic extends StObject {
  
  var secureBindingsProvider: Instantiable = js.native
}
object KnockoutStatic {
  
  @scala.inline
  def apply(secureBindingsProvider: Instantiable): KnockoutStatic = {
    val __obj = js.Dynamic.literal(secureBindingsProvider = secureBindingsProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutStatic]
  }
  
  @scala.inline
  implicit class KnockoutStaticMutableBuilder[Self <: KnockoutStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecureBindingsProvider(value: Instantiable): Self = StObject.set(x, "secureBindingsProvider", value.asInstanceOf[js.Any])
  }
}
