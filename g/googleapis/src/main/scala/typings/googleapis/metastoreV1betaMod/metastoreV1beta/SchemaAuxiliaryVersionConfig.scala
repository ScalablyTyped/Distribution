package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAuxiliaryVersionConfig extends StObject {
  
  /**
    * A mapping of Hive metastore configuration key-value pairs to apply to the auxiliary Hive metastore (configured in hive-site.xml) in addition to the primary version's overrides. If keys are present in both the auxiliary version's overrides and the primary version's overrides, the value from the auxiliary version's overrides takes precedence.
    */
  var configOverrides: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Output only. The network configuration contains the endpoint URI(s) of the auxiliary Hive metastore service.
    */
  var networkConfig: js.UndefOr[SchemaNetworkConfig] = js.undefined
  
  /**
    * The Hive metastore version of the auxiliary service. It must be less than the primary Hive metastore service's version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaAuxiliaryVersionConfig {
  
  inline def apply(): SchemaAuxiliaryVersionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuxiliaryVersionConfig]
  }
  
  extension [Self <: SchemaAuxiliaryVersionConfig](x: Self) {
    
    inline def setConfigOverrides(value: StringDictionary[String]): Self = StObject.set(x, "configOverrides", value.asInstanceOf[js.Any])
    
    inline def setConfigOverridesNull: Self = StObject.set(x, "configOverrides", null)
    
    inline def setConfigOverridesUndefined: Self = StObject.set(x, "configOverrides", js.undefined)
    
    inline def setNetworkConfig(value: SchemaNetworkConfig): Self = StObject.set(x, "networkConfig", value.asInstanceOf[js.Any])
    
    inline def setNetworkConfigUndefined: Self = StObject.set(x, "networkConfig", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
