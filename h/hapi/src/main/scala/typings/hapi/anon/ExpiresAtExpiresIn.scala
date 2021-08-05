package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiresAtExpiresIn extends StObject {
  
  var expiresAt: Unit
  
  var expiresIn: Unit
}
object ExpiresAtExpiresIn {
  
  inline def apply(expiresAt: Unit, expiresIn: Unit): ExpiresAtExpiresIn = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiresAtExpiresIn]
  }
  
  extension [Self <: ExpiresAtExpiresIn](x: Self) {
    
    inline def setExpiresAt(value: Unit): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresIn(value: Unit): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
  }
}
