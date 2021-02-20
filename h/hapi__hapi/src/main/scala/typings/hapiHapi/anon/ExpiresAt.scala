package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpiresAt extends StObject {
  
  var expiresAt: js.UndefOr[scala.Nothing] = js.native
  
  var expiresIn: js.UndefOr[Double] = js.native
}
object ExpiresAt {
  
  @scala.inline
  def apply(): ExpiresAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiresAt]
  }
  
  @scala.inline
  implicit class ExpiresAtMutableBuilder[Self <: ExpiresAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
  }
}
