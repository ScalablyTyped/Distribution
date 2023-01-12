package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digest extends StObject {
  
  /** A message digest produced with the SHA-256 algorithm. */
  var sha256: js.UndefOr[String] = js.undefined
  
  /** A message digest produced with the SHA-384 algorithm. */
  var sha384: js.UndefOr[String] = js.undefined
  
  /** A message digest produced with the SHA-512 algorithm. */
  var sha512: js.UndefOr[String] = js.undefined
}
object Digest {
  
  inline def apply(): Digest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Digest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Digest] (val x: Self) extends AnyVal {
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    inline def setSha384(value: String): Self = StObject.set(x, "sha384", value.asInstanceOf[js.Any])
    
    inline def setSha384Undefined: Self = StObject.set(x, "sha384", js.undefined)
    
    inline def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
    
    inline def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
  }
}
