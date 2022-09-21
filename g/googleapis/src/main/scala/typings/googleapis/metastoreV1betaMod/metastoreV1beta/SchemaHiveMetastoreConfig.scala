package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHiveMetastoreConfig extends StObject {
  
  /**
    * A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service's primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
    */
  var auxiliaryVersions: js.UndefOr[StringDictionary[SchemaAuxiliaryVersionConfig] | Null] = js.undefined
  
  /**
    * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version's AuxiliaryVersionConfig.
    */
  var configOverrides: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
    */
  var endpointProtocol: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field's path (hive_metastore_config.kerberos_config) in the request's update_mask while omitting this field from the request's service.
    */
  var kerberosConfig: js.UndefOr[SchemaKerberosConfig] = js.undefined
  
  /**
    * Immutable. The Hive metastore schema version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaHiveMetastoreConfig {
  
  inline def apply(): SchemaHiveMetastoreConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHiveMetastoreConfig]
  }
  
  extension [Self <: SchemaHiveMetastoreConfig](x: Self) {
    
    inline def setAuxiliaryVersions(value: StringDictionary[SchemaAuxiliaryVersionConfig]): Self = StObject.set(x, "auxiliaryVersions", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryVersionsNull: Self = StObject.set(x, "auxiliaryVersions", null)
    
    inline def setAuxiliaryVersionsUndefined: Self = StObject.set(x, "auxiliaryVersions", js.undefined)
    
    inline def setConfigOverrides(value: StringDictionary[String]): Self = StObject.set(x, "configOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigOverridesNull: Self = StObject.set(x, "configOverrides", null)
    
    inline def setConfigOverridesUndefined: Self = StObject.set(x, "configOverrides", js.undefined)
    
    inline def setEndpointProtocol(value: String): Self = StObject.set(x, "endpointProtocol", value.asInstanceOf[js.Any])
    
    inline def setEndpointProtocolNull: Self = StObject.set(x, "endpointProtocol", null)
    
    inline def setEndpointProtocolUndefined: Self = StObject.set(x, "endpointProtocol", js.undefined)
    
    inline def setKerberosConfig(value: SchemaKerberosConfig): Self = StObject.set(x, "kerberosConfig", value.asInstanceOf[js.Any])
    
    inline def setKerberosConfigUndefined: Self = StObject.set(x, "kerberosConfig", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
