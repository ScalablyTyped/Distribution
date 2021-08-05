package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiresIn extends StObject {
  
  var expiresAt: js.UndefOr[String] = js.undefined
  
  var expiresIn: Unit
}
object ExpiresIn {
  
  inline def apply(expiresIn: Unit): ExpiresIn = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiresIn]
  }
  
  extension [Self <: ExpiresIn](x: Self) {
    
    inline def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setExpiresIn(value: Unit): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
  }
}
