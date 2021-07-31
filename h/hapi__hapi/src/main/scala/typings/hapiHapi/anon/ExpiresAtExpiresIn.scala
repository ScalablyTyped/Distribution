package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiresAtExpiresIn extends StObject {
  
  var expiresAt: Unit
  
  var expiresIn: Unit
}
object ExpiresAtExpiresIn {
  
  @scala.inline
  def apply(expiresAt: Unit, expiresIn: Unit): ExpiresAtExpiresIn = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiresAtExpiresIn]
  }
  
  @scala.inline
  implicit class ExpiresAtExpiresInMutableBuilder[Self <: ExpiresAtExpiresIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresAt(value: Unit): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Unit): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
  }
}
