package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAggregateBy extends StObject {
  
  /**
    * A data source ID to aggregate. Only data from the specified data source ID will be included in the aggregation. If specified, this data source must exist; the OAuth scopes in the supplied credentials must grant read access to this data type. The dataset in the response will have the same data source ID. Note: Data can be aggregated by either the dataTypeName or the dataSourceId, not both.
    */
  var dataSourceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data type to aggregate. All data sources providing this data type will contribute data to the aggregation. The response will contain a single dataset for this data type name. The dataset will have a data source ID of derived::com.google.android.gms:aggregated. If the user has no data for this data type, an empty data set will be returned. Note: Data can be aggregated by either the dataTypeName or the dataSourceId, not both.
    */
  var dataTypeName: js.UndefOr[String | Null] = js.undefined
}
object SchemaAggregateBy {
  
  inline def apply(): SchemaAggregateBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateBy]
  }
  
  extension [Self <: SchemaAggregateBy](x: Self) {
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdNull: Self = StObject.set(x, "dataSourceId", null)
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setDataTypeName(value: String): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNameNull: Self = StObject.set(x, "dataTypeName", null)
    
    inline def setDataTypeNameUndefined: Self = StObject.set(x, "dataTypeName", js.undefined)
  }
}
