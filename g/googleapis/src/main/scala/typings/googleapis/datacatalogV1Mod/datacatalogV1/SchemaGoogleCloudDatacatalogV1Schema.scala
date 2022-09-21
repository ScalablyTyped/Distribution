package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1Schema extends StObject {
  
  /**
    * The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels.
    */
  var columns: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1ColumnSchema]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1Schema {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1Schema]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1Schema](x: Self) {
    
    inline def setColumns(value: js.Array[SchemaGoogleCloudDatacatalogV1ColumnSchema]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SchemaGoogleCloudDatacatalogV1ColumnSchema*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
