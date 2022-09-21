package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceConfig extends StObject {
  
  /**
    * MySQL data source configuration
    */
  var mysqlSourceConfig: js.UndefOr[SchemaMysqlSourceConfig] = js.undefined
  
  /**
    * Oracle data source configuration
    */
  var oracleSourceConfig: js.UndefOr[SchemaOracleSourceConfig] = js.undefined
  
  /**
    * Required. Source connection profile identifier.
    */
  var sourceConnectionProfileName: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setSourceConnectionProfileName(value: String): Self = StObject.set(x, "sourceConnectionProfileName", value.asInstanceOf[js.Any])
    
    inline def setSourceConnectionProfileNameNull: Self = StObject.set(x, "sourceConnectionProfileName", null)
    
    inline def setSourceConnectionProfileNameUndefined: Self = StObject.set(x, "sourceConnectionProfileName", js.undefined)
  }
}
