package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHistogramResult extends StObject {
  
  /**
    * The Histogram search filters.
    */
  var searchType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A map from the values of field to the number of jobs with that value in this search result. Key: search type (filter names, such as the companyName). Values: the count of jobs that match the filter for this search.
    */
  var values: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
}
object SchemaHistogramResult {
  
  inline def apply(): SchemaHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramResult]
  }
  
  extension [Self <: SchemaHistogramResult](x: Self) {
    
    inline def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    inline def setSearchTypeNull: Self = StObject.set(x, "searchType", null)
    
    inline def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    inline def setValues(value: StringDictionary[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesNull: Self = StObject.set(x, "values", null)
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
