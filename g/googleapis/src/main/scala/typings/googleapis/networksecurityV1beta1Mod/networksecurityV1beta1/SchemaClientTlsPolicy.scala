package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClientTlsPolicy extends StObject {
  
  /**
    * Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
    */
  var clientCertificate: js.UndefOr[SchemaGoogleCloudNetworksecurityV1beta1CertificateProvider] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Free-text description of the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Set of label tags associated with the resource.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. Name of the ClientTlsPolicy resource. It matches the pattern `projects/x/locations/{location\}/clientTlsPolicies/{client_tls_policy\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
    */
  var serverValidationCa: js.UndefOr[js.Array[SchemaValidationCA]] = js.undefined
  
  /**
    * Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
    */
  var sni: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaClientTlsPolicy {
  
  inline def apply(): SchemaClientTlsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientTlsPolicy]
  }
  
  extension [Self <: SchemaClientTlsPolicy](x: Self) {
    
    inline def setClientCertificate(value: SchemaGoogleCloudNetworksecurityV1beta1CertificateProvider): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServerValidationCa(value: js.Array[SchemaValidationCA]): Self = StObject.set(x, "serverValidationCa", value.asInstanceOf[js.Any])
    
    inline def setServerValidationCaUndefined: Self = StObject.set(x, "serverValidationCa", js.undefined)
    
    inline def setServerValidationCaVarargs(value: SchemaValidationCA*): Self = StObject.set(x, "serverValidationCa", js.Array(value*))
    
    inline def setSni(value: String): Self = StObject.set(x, "sni", value.asInstanceOf[js.Any])
    
    inline def setSniNull: Self = StObject.set(x, "sni", null)
    
    inline def setSniUndefined: Self = StObject.set(x, "sni", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
