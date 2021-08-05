package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OidString extends StObject {
  
  var oid: String
}
object OidString {
  
  inline def apply(oid: String): OidString = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidString]
  }
  
  extension [Self <: OidString](x: Self) {
    
    inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
  }
}
