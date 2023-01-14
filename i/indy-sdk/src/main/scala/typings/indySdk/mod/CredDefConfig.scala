package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredDefConfig extends StObject {
  
  var support_revocation: js.UndefOr[Boolean] = js.undefined
}
object CredDefConfig {
  
  inline def apply(): CredDefConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredDefConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CredDefConfig] (val x: Self) extends AnyVal {
    
    inline def setSupport_revocation(value: Boolean): Self = StObject.set(x, "support_revocation", value.asInstanceOf[js.Any])
    
    inline def setSupport_revocationUndefined: Self = StObject.set(x, "support_revocation", js.undefined)
  }
}
