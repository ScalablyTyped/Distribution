package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateChains extends StObject {
  
  /** Cavium certificate chain corresponding to the attestation. */
  var caviumCerts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Google card certificate chain corresponding to the attestation. */
  var googleCardCerts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Google partition certificate chain corresponding to the attestation. */
  var googlePartitionCerts: js.UndefOr[js.Array[String]] = js.undefined
}
object CertificateChains {
  
  inline def apply(): CertificateChains = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateChains]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateChains] (val x: Self) extends AnyVal {
    
    inline def setCaviumCerts(value: js.Array[String]): Self = StObject.set(x, "caviumCerts", value.asInstanceOf[js.Any])
    
    inline def setCaviumCertsUndefined: Self = StObject.set(x, "caviumCerts", js.undefined)
    
    inline def setCaviumCertsVarargs(value: String*): Self = StObject.set(x, "caviumCerts", js.Array(value*))
    
    inline def setGoogleCardCerts(value: js.Array[String]): Self = StObject.set(x, "googleCardCerts", value.asInstanceOf[js.Any])
    
    inline def setGoogleCardCertsUndefined: Self = StObject.set(x, "googleCardCerts", js.undefined)
    
    inline def setGoogleCardCertsVarargs(value: String*): Self = StObject.set(x, "googleCardCerts", js.Array(value*))
    
    inline def setGooglePartitionCerts(value: js.Array[String]): Self = StObject.set(x, "googlePartitionCerts", value.asInstanceOf[js.Any])
    
    inline def setGooglePartitionCertsUndefined: Self = StObject.set(x, "googlePartitionCerts", js.undefined)
    
    inline def setGooglePartitionCertsVarargs(value: String*): Self = StObject.set(x, "googlePartitionCerts", js.Array(value*))
  }
}
