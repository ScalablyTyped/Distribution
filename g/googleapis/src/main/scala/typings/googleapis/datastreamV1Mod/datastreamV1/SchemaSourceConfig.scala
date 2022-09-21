package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceConfig extends StObject {
  
  /**
    * MySQL data source configuration.
    */
  var mysqlSourceConfig: js.UndefOr[SchemaMysqlSourceConfig] = js.undefined
  
  /**
    * Oracle data source configuration.
    */
  var oracleSourceConfig: js.UndefOr[SchemaOracleSourceConfig] = js.undefined
  
  /**
    * Required. Source connection profile resoource. Format: `projects/{project\}/locations/{location\}/connectionProfiles/{name\}`
    */
  var sourceConnectionProfile: js.UndefOr[String | Null] = js.undefined
}
object SchemaSourceConfig {
  
  inline def apply(): SchemaSourceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceConfig]
  }
  
  extension [Self <: SchemaSourceConfig](x: Self) {
    
    inline def setMysqlSourceConfig(value: SchemaMysqlSourceConfig): Self = StObject.set(x, "mysqlSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setMysqlSourceConfigUndefined: Self = StObject.set(x, "mysqlSourceConfig", js.undefined)
    
    inline def setOracleSourceConfig(value: SchemaOracleSourceConfig): Self = StObject.set(x, "oracleSourceConfig", value.asInstanceOf[js.Any])
    
    inline def setOracleSourceConfigUndefined: Self = StObject.set(x, "oracleSourceConfig", js.undefined)
    
    inline def setSourceConnectionProfile(value: String): Self = StObject.set(x, "sourceConnectionProfile", value.asInstanceOf[js.Any])
    
    inline def setSourceConnectionProfileNull: Self = StObject.set(x, "sourceConnectionProfile", null)
    
    inline def setSourceConnectionProfileUndefined: Self = StObject.set(x, "sourceConnectionProfile", js.undefined)
  }
}
