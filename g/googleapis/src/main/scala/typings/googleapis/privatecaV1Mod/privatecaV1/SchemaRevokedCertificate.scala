package typings.googleapis.privatecaV1Mod.privatecaV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRevokedCertificate extends StObject {
  
  /**
    * The resource name for the Certificate in the format `projects/x/locations/x/caPools/x/certificates/x`.
    */
  var certificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The serial number of the Certificate.
    */
  var hexSerialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason the Certificate was revoked.
    */
  var revocationReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaRevokedCertificate {
  
  inline def apply(): SchemaRevokedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevokedCertificate]
  }
  
  extension [Self <: SchemaRevokedCertificate](x: Self) {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setHexSerialNumber(value: String): Self = StObject.set(x, "hexSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setHexSerialNumberNull: Self = StObject.set(x, "hexSerialNumber", null)
    
    inline def setHexSerialNumberUndefined: Self = StObject.set(x, "hexSerialNumber", js.undefined)
    
    inline def setRevocationReason(value: String): Self = StObject.set(x, "revocationReason", value.asInstanceOf[js.Any])
    
    inline def setRevocationReasonNull: Self = StObject.set(x, "revocationReason", null)
    
    inline def setRevocationReasonUndefined: Self = StObject.set(x, "revocationReason", js.undefined)
  }
}
