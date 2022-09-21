package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jwt extends StObject {
  
  /** The compact encoding of a JWS, which is always three base64 encoded strings joined by periods. For details, see: https://tools.ietf.org/html/rfc7515.html#section-3.1 */
  var compactJwt: js.UndefOr[String] = js.undefined
}
object Jwt {
  
  inline def apply(): Jwt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwt]
  }
  
  extension [Self <: Jwt](x: Self) {
    
    inline def setCompactJwt(value: String): Self = StObject.set(x, "compactJwt", value.asInstanceOf[js.Any])
    
    inline def setCompactJwtUndefined: Self = StObject.set(x, "compactJwt", js.undefined)
  }
}
