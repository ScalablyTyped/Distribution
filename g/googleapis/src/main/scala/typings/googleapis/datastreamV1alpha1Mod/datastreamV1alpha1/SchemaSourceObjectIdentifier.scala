package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceObjectIdentifier extends StObject {
  
  /**
    * Mysql data source object identifier.
    */
  var mysqlIdentifier: js.UndefOr[SchemaMysqlObjectIdentifier] = js.undefined
  
  /**
    * Oracle data source object identifier.
    */
  var oracleIdentifier: js.UndefOr[SchemaOracleObjectIdentifier] = js.undefined
}
object SchemaSourceObjectIdentifier {
  
  inline def apply(): SchemaSourceObjectIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceObjectIdentifier]
  }
  
  extension [Self <: SchemaSourceObjectIdentifier](x: Self) {
    
    inline def setMysqlIdentifier(value: SchemaMysqlObjectIdentifier): Self = StObject.set(x, "mysqlIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMysqlIdentifierUndefined: Self = StObject.set(x, "mysqlIdentifier", js.undefined)
    
    inline def setOracleIdentifier(value: SchemaOracleObjectIdentifier): Self = StObject.set(x, "oracleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setOracleIdentifierUndefined: Self = StObject.set(x, "oracleIdentifier", js.undefined)
  }
}
