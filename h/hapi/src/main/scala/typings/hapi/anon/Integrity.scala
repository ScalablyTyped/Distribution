package typings.hapi.anon

import typings.iron.mod.SealOptionsSub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Integrity extends StObject {
  
  var integrity: js.UndefOr[SealOptionsSub] = js.native
  
  var password: String = js.native
}
object Integrity {
  
  @scala.inline
  def apply(password: String): Integrity = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integrity]
  }
  
  @scala.inline
  implicit class IntegrityMutableBuilder[Self <: Integrity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntegrity(value: SealOptionsSub): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
