package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Result of a histogram call. The response contains the
  * histogram map for the search type specified by HistogramResult.field. The
  * response is a map of each filter value to the corresponding count of jobs
  * for that filter.
  */
trait SchemaHistogramResult extends StObject {
  
  /**
    * The Histogram search filters.
    */
  var searchType: js.UndefOr[String] = js.undefined
  
  /**
    * A map from the values of field to the number of jobs with that value in
    * this search result.  Key: search type (filter names, such as the
    * companyName).  Values: the count of jobs that match the filter for this
    * search.
    */
  var values: js.UndefOr[StringDictionary[Double]] = js.undefined
}
object SchemaHistogramResult {
  
  inline def apply(): SchemaHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramResult]
  }
  
  extension [Self <: SchemaHistogramResult](x: Self) {
    
    inline def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    inline def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    inline def setValues(value: StringDictionary[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
