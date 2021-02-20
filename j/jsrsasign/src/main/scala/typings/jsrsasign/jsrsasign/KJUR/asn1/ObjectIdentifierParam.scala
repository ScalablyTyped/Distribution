package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectIdentifierParam extends StObject {
  
  var oid: String = js.native
}
object ObjectIdentifierParam {
  
  @scala.inline
  def apply(oid: String): ObjectIdentifierParam = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectIdentifierParam]
  }
  
  @scala.inline
  implicit class ObjectIdentifierParamMutableBuilder[Self <: ObjectIdentifierParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
  }
}
