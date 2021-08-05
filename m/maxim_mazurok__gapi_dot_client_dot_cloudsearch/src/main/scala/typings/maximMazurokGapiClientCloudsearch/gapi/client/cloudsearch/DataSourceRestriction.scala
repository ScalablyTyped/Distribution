package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceRestriction extends StObject {
  
  /**
    * Filter options restricting the results. If multiple filters are present, they are grouped by object type before joining. Filters with the same object type are joined conjunctively,
    * then the resulting expressions are joined disjunctively. The maximum number of elements is 20. NOTE: Suggest API supports only few filters at the moment: "objecttype", "type" and
    * "mimetype". For now, schema specific filters cannot be used to filter suggestions.
    */
  var filterOptions: js.UndefOr[js.Array[FilterOptions]] = js.undefined
  
  /** The source of restriction. */
  var source: js.UndefOr[Source] = js.undefined
}
object DataSourceRestriction {
  
  inline def apply(): DataSourceRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceRestriction]
  }
  
  extension [Self <: DataSourceRestriction](x: Self) {
    
    inline def setFilterOptions(value: js.Array[FilterOptions]): Self = StObject.set(x, "filterOptions", value.asInstanceOf[js.Any])
    
    inline def setFilterOptionsUndefined: Self = StObject.set(x, "filterOptions", js.undefined)
    
    inline def setFilterOptionsVarargs(value: FilterOptions*): Self = StObject.set(x, "filterOptions", js.Array(value :_*))
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
