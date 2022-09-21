package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1Schema extends StObject {
  
  /** The unified GoogleSQL-like schema of columns. The overall maximum number of columns and nested columns is 10,000. The maximum nested depth is 15 levels. */
  var columns: js.UndefOr[js.Array[GoogleCloudDatacatalogV1ColumnSchema]] = js.undefined
}
object GoogleCloudDatacatalogV1Schema {
  
  inline def apply(): GoogleCloudDatacatalogV1Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1Schema]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1Schema](x: Self) {
    
    inline def setColumns(value: js.Array[GoogleCloudDatacatalogV1ColumnSchema]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: GoogleCloudDatacatalogV1ColumnSchema*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
