package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpiresIn extends StObject {
  
  var expiresAt: js.UndefOr[String] = js.native
  
  var expiresIn: js.UndefOr[scala.Nothing] = js.native
}
object ExpiresIn {
  
  @scala.inline
  def apply(): ExpiresIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiresIn]
  }
  
  @scala.inline
  implicit class ExpiresInMutableBuilder[Self <: ExpiresIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
  }
}
