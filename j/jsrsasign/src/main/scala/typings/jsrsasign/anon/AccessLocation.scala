package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessLocation extends StObject {
  
  var accessLocation: UriParam = js.native
  
  var accessMethod: OidString = js.native
}
object AccessLocation {
  
  @scala.inline
  def apply(accessLocation: UriParam, accessMethod: OidString): AccessLocation = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation.asInstanceOf[js.Any], accessMethod = accessMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLocation]
  }
  
  @scala.inline
  implicit class AccessLocationMutableBuilder[Self <: AccessLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessLocation(value: UriParam): Self = StObject.set(x, "accessLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessMethod(value: OidString): Self = StObject.set(x, "accessMethod", value.asInstanceOf[js.Any])
  }
}
