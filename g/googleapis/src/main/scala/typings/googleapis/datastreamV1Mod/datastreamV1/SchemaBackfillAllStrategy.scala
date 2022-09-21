package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackfillAllStrategy extends StObject {
  
  /**
    * MySQL data source objects to avoid backfilling.
    */
  var mysqlExcludedObjects: js.UndefOr[SchemaMysqlRdbms] = js.undefined
  
  /**
    * Oracle data source objects to avoid backfilling.
    */
  var oracleExcludedObjects: js.UndefOr[SchemaOracleRdbms] = js.undefined
}
object SchemaBackfillAllStrategy {
  
  inline def apply(): SchemaBackfillAllStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackfillAllStrategy]
  }
  
  extension [Self <: SchemaBackfillAllStrategy](x: Self) {
    
    inline def setMysqlExcludedObjects(value: SchemaMysqlRdbms): Self = StObject.set(x, "mysqlExcludedObjects", value.asInstanceOf[js.Any])
    
    inline def setMysqlExcludedObjectsUndefined: Self = StObject.set(x, "mysqlExcludedObjects", js.undefined)
    
    inline def setOracleExcludedObjects(value: SchemaOracleRdbms): Self = StObject.set(x, "oracleExcludedObjects", value.asInstanceOf[js.Any])
    
    inline def setOracleExcludedObjectsUndefined: Self = StObject.set(x, "oracleExcludedObjects", js.undefined)
  }
}
