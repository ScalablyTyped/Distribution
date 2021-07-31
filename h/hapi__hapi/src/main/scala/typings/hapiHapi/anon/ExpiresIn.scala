package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiresIn extends StObject {
  
  var expiresAt: js.UndefOr[String] = js.undefined
  
  var expiresIn: Unit
}
object ExpiresIn {
  
  @scala.inline
  def apply(expiresIn: Unit): ExpiresIn = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiresIn]
  }
  
  @scala.inline
  implicit class ExpiresInMutableBuilder[Self <: ExpiresIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    @scala.inline
    def setExpiresIn(value: Unit): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
  }
}
