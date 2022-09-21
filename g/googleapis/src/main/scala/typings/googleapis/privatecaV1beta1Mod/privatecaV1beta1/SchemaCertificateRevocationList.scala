package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateRevocationList extends StObject {
  
  /**
    * Output only. The location where 'pem_crl' can be accessed.
    */
  var accessUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which this CertificateRevocationList was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Labels with user-defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The resource path for this CertificateRevocationList in the format `projects/x/locations/x/certificateAuthorities/x/ certificateRevocationLists/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The PEM-encoded X.509 CRL.
    */
  var pemCrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The revoked serial numbers that appear in pem_crl.
    */
  var revokedCertificates: js.UndefOr[js.Array[SchemaRevokedCertificate]] = js.undefined
  
  /**
    * Output only. The CRL sequence number that appears in pem_crl.
    */
  var sequenceNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The State for this CertificateRevocationList.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which this CertificateRevocationList was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateRevocationList {
  
  inline def apply(): SchemaCertificateRevocationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateRevocationList]
  }
  
  extension [Self <: SchemaCertificateRevocationList](x: Self) {
    
    inline def setAccessUrl(value: String): Self = StObject.set(x, "accessUrl", value.asInstanceOf[js.Any])
    
    inline def setAccessUrlNull: Self = StObject.set(x, "accessUrl", null)
    
    inline def setAccessUrlUndefined: Self = StObject.set(x, "accessUrl", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPemCrl(value: String): Self = StObject.set(x, "pemCrl", value.asInstanceOf[js.Any])
    
    inline def setPemCrlNull: Self = StObject.set(x, "pemCrl", null)
    
    inline def setPemCrlUndefined: Self = StObject.set(x, "pemCrl", js.undefined)
    
    inline def setRevokedCertificates(value: js.Array[SchemaRevokedCertificate]): Self = StObject.set(x, "revokedCertificates", value.asInstanceOf[js.Any])
    
    inline def setRevokedCertificatesUndefined: Self = StObject.set(x, "revokedCertificates", js.undefined)
    
    inline def setRevokedCertificatesVarargs(value: SchemaRevokedCertificate*): Self = StObject.set(x, "revokedCertificates", js.Array(value*))
    
    inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberNull: Self = StObject.set(x, "sequenceNumber", null)
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
