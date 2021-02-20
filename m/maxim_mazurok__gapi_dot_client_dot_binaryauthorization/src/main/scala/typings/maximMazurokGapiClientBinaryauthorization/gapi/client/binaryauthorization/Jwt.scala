package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jwt extends StObject {
  
  /** The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1 */
  var compactJwt: js.UndefOr[String] = js.native
}
object Jwt {
  
  @scala.inline
  def apply(): Jwt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwt]
  }
  
  @scala.inline
  implicit class JwtMutableBuilder[Self <: Jwt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactJwt(value: String): Self = StObject.set(x, "compactJwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactJwtUndefined: Self = StObject.set(x, "compactJwt", js.undefined)
  }
}
