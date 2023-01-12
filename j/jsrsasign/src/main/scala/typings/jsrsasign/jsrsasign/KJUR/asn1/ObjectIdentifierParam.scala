package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectIdentifierParam extends StObject {
  
  var oid: String
}
object ObjectIdentifierParam {
  
  inline def apply(oid: String): ObjectIdentifierParam = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifierParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectIdentifierParam] (val x: Self) extends AnyVal {
    
    inline def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
  }
}
