package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiscoverConnectionProfileResponse extends StObject {
  
  /**
    * Enriched MySQL RDBMS object.
    */
  var mysqlRdbms: js.UndefOr[SchemaMysqlRdbms] = js.undefined
  
  /**
    * Enriched Oracle RDBMS object.
    */
  var oracleRdbms: js.UndefOr[SchemaOracleRdbms] = js.undefined
}
object SchemaDiscoverConnectionProfileResponse {
  
  inline def apply(): SchemaDiscoverConnectionProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscoverConnectionProfileResponse]
  }
  
  extension [Self <: SchemaDiscoverConnectionProfileResponse](x: Self) {
    
    inline def setMysqlRdbms(value: SchemaMysqlRdbms): Self = StObject.set(x, "mysqlRdbms", value.asInstanceOf[js.Any])
    
    inline def setMysqlRdbmsUndefined: Self = StObject.set(x, "mysqlRdbms", js.undefined)
    
    inline def setOracleRdbms(value: SchemaOracleRdbms): Self = StObject.set(x, "oracleRdbms", value.asInstanceOf[js.Any])
    
    inline def setOracleRdbmsUndefined: Self = StObject.set(x, "oracleRdbms", js.undefined)
  }
}
