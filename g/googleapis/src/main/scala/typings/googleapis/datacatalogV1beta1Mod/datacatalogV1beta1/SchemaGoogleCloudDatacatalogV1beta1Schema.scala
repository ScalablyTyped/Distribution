package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1Schema extends StObject {
  
  /**
    * Required. Schema of columns. A maximum of 10,000 columns and sub-columns can be specified.
    */
  var columns: js.UndefOr[js.Array[SchemaGoogleCloudDatacatalogV1beta1ColumnSchema]] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1Schema {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1Schema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1Schema]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1Schema](x: Self) {
    
    inline def setColumns(value: js.Array[SchemaGoogleCloudDatacatalogV1beta1ColumnSchema]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: SchemaGoogleCloudDatacatalogV1beta1ColumnSchema*): Self = StObject.set(x, "columns", js.Array(value*))
  }
}
