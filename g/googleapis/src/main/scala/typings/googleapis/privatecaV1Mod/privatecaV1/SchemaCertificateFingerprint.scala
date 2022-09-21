package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateFingerprint extends StObject {
  
  /**
    * The SHA 256 hash, encoded in hexadecimal, of the DER x509 certificate.
    */
  var sha256Hash: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateFingerprint {
  
  inline def apply(): SchemaCertificateFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateFingerprint]
  }
  
  extension [Self <: SchemaCertificateFingerprint](x: Self) {
    
    inline def setSha256Hash(value: String): Self = StObject.set(x, "sha256Hash", value.asInstanceOf[js.Any])
    
    inline def setSha256HashNull: Self = StObject.set(x, "sha256Hash", null)
    
    inline def setSha256HashUndefined: Self = StObject.set(x, "sha256Hash", js.undefined)
  }
}
