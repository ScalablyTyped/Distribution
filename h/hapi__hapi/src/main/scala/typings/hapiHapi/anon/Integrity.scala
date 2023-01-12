package typings.hapiHapi.anon

import typings.hapiIron.mod.SealOptionsSub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integrity extends StObject {
  
  var integrity: js.UndefOr[SealOptionsSub] = js.undefined
  
  var password: String
}
object Integrity {
  
  inline def apply(password: String): Integrity = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integrity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Integrity] (val x: Self) extends AnyVal {
    
    inline def setIntegrity(value: SealOptionsSub): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
