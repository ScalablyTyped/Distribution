package typings.googleapis.fitnessV1Mod.fitnessV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The specification of which data to aggregate.
  */
trait SchemaAggregateBy extends StObject {
  
  /**
    * A data source ID to aggregate. Mutually exclusive of dataTypeName. Only
    * data from the specified data source ID will be included in the
    * aggregation. The dataset in the response will have the same data source
    * ID.
    */
  var dataSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The data type to aggregate. All data sources providing this data type
    * will contribute data to the aggregation. The response will contain a
    * single dataset for this data type name. The dataset will have a data
    * source ID of derived:com.google.:com.google.android.gms:aggregated
    */
  var dataTypeName: js.UndefOr[String] = js.undefined
}
object SchemaAggregateBy {
  
  inline def apply(): SchemaAggregateBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAggregateBy]
  }
  
  extension [Self <: SchemaAggregateBy](x: Self) {
    
    inline def setDataSourceId(value: String): Self = StObject.set(x, "dataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceIdUndefined: Self = StObject.set(x, "dataSourceId", js.undefined)
    
    inline def setDataTypeName(value: String): Self = StObject.set(x, "dataTypeName", value.asInstanceOf[js.Any])
    
    inline def setDataTypeNameUndefined: Self = StObject.set(x, "dataTypeName", js.undefined)
  }
}
