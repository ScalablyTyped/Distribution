package typings.googleapis.privatecaV1beta1Mod.privatecaV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateAuthority extends StObject {
  
  /**
    * Output only. URLs for accessing content published by this CA, such as the CA certificate and CRLs.
    */
  var accessUrls: js.UndefOr[SchemaAccessUrls] = js.undefined
  
  /**
    * Output only. A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root.
    */
  var caCertificateDescriptions: js.UndefOr[js.Array[SchemaCertificateDescription]] = js.undefined
  
  /**
    * Optional. The CertificateAuthorityPolicy to enforce when issuing Certificates from this CertificateAuthority.
    */
  var certificatePolicy: js.UndefOr[SchemaCertificateAuthorityPolicy] = js.undefined
  
  /**
    * Required. Immutable. The config used to create a self-signed X.509 certificate or CSR.
    */
  var config: js.UndefOr[SchemaCertificateConfig] = js.undefined
  
  /**
    * Output only. The time at which this CertificateAuthority was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which this CertificateAuthority will be deleted, if scheduled for deletion.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
    */
  var gcsBucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The IssuingOptions to follow when issuing Certificates from this CertificateAuthority.
    */
  var issuingOptions: js.UndefOr[SchemaIssuingOptions] = js.undefined
  
  /**
    * Required. Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
    */
  var keySpec: js.UndefOr[SchemaKeyVersionSpec] = js.undefined
  
  /**
    * Optional. Labels with user-defined metadata.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
    */
  var lifetime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The resource name for this CertificateAuthority in the format `projects/x/locations/x/certificateAuthorities/x`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
    */
  var pemCaCertificates: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The State for this CertificateAuthority.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
    */
  var subordinateConfig: js.UndefOr[SchemaSubordinateConfig] = js.undefined
  
  /**
    * Required. Immutable. The Tier of this CertificateAuthority.
    */
  var tier: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Immutable. The Type of this CertificateAuthority.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which this CertificateAuthority was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateAuthority {
  
  inline def apply(): SchemaCertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateAuthority]
  }
  
  extension [Self <: SchemaCertificateAuthority](x: Self) {
    
    inline def setAccessUrls(value: SchemaAccessUrls): Self = StObject.set(x, "accessUrls", value.asInstanceOf[js.Any])
    
    inline def setAccessUrlsUndefined: Self = StObject.set(x, "accessUrls", js.undefined)
    
    inline def setCaCertificateDescriptions(value: js.Array[SchemaCertificateDescription]): Self = StObject.set(x, "caCertificateDescriptions", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateDescriptionsUndefined: Self = StObject.set(x, "caCertificateDescriptions", js.undefined)
    
    inline def setCaCertificateDescriptionsVarargs(value: SchemaCertificateDescription*): Self = StObject.set(x, "caCertificateDescriptions", js.Array(value*))
    
    inline def setCertificatePolicy(value: SchemaCertificateAuthorityPolicy): Self = StObject.set(x, "certificatePolicy", value.asInstanceOf[js.Any])
    
    inline def setCertificatePolicyUndefined: Self = StObject.set(x, "certificatePolicy", js.undefined)
    
    inline def setConfig(value: SchemaCertificateConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setGcsBucket(value: String): Self = StObject.set(x, "gcsBucket", value.asInstanceOf[js.Any])
    
    inline def setGcsBucketNull: Self = StObject.set(x, "gcsBucket", null)
    
    inline def setGcsBucketUndefined: Self = StObject.set(x, "gcsBucket", js.undefined)
    
    inline def setIssuingOptions(value: SchemaIssuingOptions): Self = StObject.set(x, "issuingOptions", value.asInstanceOf[js.Any])
    
    inline def setIssuingOptionsUndefined: Self = StObject.set(x, "issuingOptions", js.undefined)
    
    inline def setKeySpec(value: SchemaKeyVersionSpec): Self = StObject.set(x, "keySpec", value.asInstanceOf[js.Any])
    
    inline def setKeySpecUndefined: Self = StObject.set(x, "keySpec", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    inline def setLifetimeNull: Self = StObject.set(x, "lifetime", null)
    
    inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPemCaCertificates(value: js.Array[String]): Self = StObject.set(x, "pemCaCertificates", value.asInstanceOf[js.Any])
    
    inline def setPemCaCertificatesNull: Self = StObject.set(x, "pemCaCertificates", null)
    
    inline def setPemCaCertificatesUndefined: Self = StObject.set(x, "pemCaCertificates", js.undefined)
    
    inline def setPemCaCertificatesVarargs(value: String*): Self = StObject.set(x, "pemCaCertificates", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubordinateConfig(value: SchemaSubordinateConfig): Self = StObject.set(x, "subordinateConfig", value.asInstanceOf[js.Any])
    
    inline def setSubordinateConfigUndefined: Self = StObject.set(x, "subordinateConfig", js.undefined)
    
    inline def setTier(value: String): Self = StObject.set(x, "tier", value.asInstanceOf[js.Any])
    
    inline def setTierNull: Self = StObject.set(x, "tier", null)
    
    inline def setTierUndefined: Self = StObject.set(x, "tier", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
