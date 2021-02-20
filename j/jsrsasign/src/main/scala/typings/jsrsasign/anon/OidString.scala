package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OidString extends StObject {
  
  var oid: String = js.native
}
object OidString {
  
  @scala.inline
  def apply(oid: String): OidString = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidString]
  }
  
  @scala.inline
  implicit class OidStringMutableBuilder[Self <: OidString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
  }
}
