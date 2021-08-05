package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrappingPublicKey extends StObject {
  
  /**
    * The public key, encoded in PEM format. For more information, see the [RFC 7468](https://tools.ietf.org/html/rfc7468) sections for [General
    * Considerations](https://tools.ietf.org/html/rfc7468#section-2) and [Textual Encoding of Subject Public Key Info] (https://tools.ietf.org/html/rfc7468#section-13).
    */
  var pem: js.UndefOr[String] = js.undefined
}
object WrappingPublicKey {
  
  inline def apply(): WrappingPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrappingPublicKey]
  }
  
  extension [Self <: WrappingPublicKey](x: Self) {
    
    inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    inline def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
  }
}
