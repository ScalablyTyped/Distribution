package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiresAt extends StObject {
  
  var expiresAt: Unit
  
  var expiresIn: js.UndefOr[Double] = js.undefined
}
object ExpiresAt {
  
  @scala.inline
  def apply(expiresAt: Unit): ExpiresAt = {
    val __obj = js.Dynamic.literal(expiresAt = expiresAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiresAt]
  }
  
  @scala.inline
  implicit class ExpiresAtMutableBuilder[Self <: ExpiresAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresAt(value: Unit): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
  }
}
