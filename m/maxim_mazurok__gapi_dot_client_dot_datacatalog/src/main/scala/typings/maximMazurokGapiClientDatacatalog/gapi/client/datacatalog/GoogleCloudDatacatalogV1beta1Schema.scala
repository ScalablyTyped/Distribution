package typings.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1beta1Schema extends StObject {
  
  /** Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be specified. */
  var columns: js.UndefOr[js.Array[GoogleCloudDatacatalogV1beta1ColumnSchema]] = js.undefined
}
object GoogleCloudDatacatalogV1beta1Schema {
  
  inline def apply(): GoogleCloudDatacatalogV1beta1Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1beta1Schema]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1beta1Schema](x: Self) {
    
    inline def setColumns(value: js.Array[GoogleCloudDatacatalogV1beta1ColumnSchema]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: GoogleCloudDatacatalogV1beta1ColumnSchema*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
