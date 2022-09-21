package typings.googleapis.datastreamV1alpha1Mod.datastreamV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOracleObjectIdentifier extends StObject {
  
  /**
    * Required. The schema name.
    */
  var schema: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The table name.
    */
  var table: js.UndefOr[String | Null] = js.undefined
}
object SchemaOracleObjectIdentifier {
  
  inline def apply(): SchemaOracleObjectIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOracleObjectIdentifier]
  }
  
  extension [Self <: SchemaOracleObjectIdentifier](x: Self) {
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableNull: Self = StObject.set(x, "table", null)
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
