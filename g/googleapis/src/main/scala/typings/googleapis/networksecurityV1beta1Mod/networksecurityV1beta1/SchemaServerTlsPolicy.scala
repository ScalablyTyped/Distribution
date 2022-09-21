package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServerTlsPolicy extends StObject {
  
  /**
    *  Determines if server allows plaintext connections. If set to true, server allows plain text connections. By default, it is set to false. This setting is not exclusive of other encryption modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections. See documentation of other encryption modes to confirm compatibility. Consider using it if you wish to upgrade in place your deployment to TLS while having mixed TLS and non-TLS traffic reaching port :80.
    */
  var allowOpen: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Free-text description of the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Set of label tags associated with the resource.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    *  Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections.
    */
  var mtlsPolicy: js.UndefOr[SchemaMTLSPolicy] = js.undefined
  
  /**
    * Required. Name of the ServerTlsPolicy resource. It matches the pattern `projects/x/locations/{location\}/serverTlsPolicies/{server_tls_policy\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    *  Defines a mechanism to provision server identity (public and private keys). Cannot be combined with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
    */
  var serverCertificate: js.UndefOr[SchemaGoogleCloudNetworksecurityV1beta1CertificateProvider] = js.undefined
  
  /**
    * Output only. The timestamp when the resource was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaServerTlsPolicy {
  
  inline def apply(): SchemaServerTlsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerTlsPolicy]
  }
  
  extension [Self <: SchemaServerTlsPolicy](x: Self) {
    
    inline def setAllowOpen(value: Boolean): Self = StObject.set(x, "allowOpen", value.asInstanceOf[js.Any])
    
    inline def setAllowOpenNull: Self = StObject.set(x, "allowOpen", null)
    
    inline def setAllowOpenUndefined: Self = StObject.set(x, "allowOpen", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMtlsPolicy(value: SchemaMTLSPolicy): Self = StObject.set(x, "mtlsPolicy", value.asInstanceOf[js.Any])
    
    inline def setMtlsPolicyUndefined: Self = StObject.set(x, "mtlsPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServerCertificate(value: SchemaGoogleCloudNetworksecurityV1beta1CertificateProvider): Self = StObject.set(x, "serverCertificate", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateUndefined: Self = StObject.set(x, "serverCertificate", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
