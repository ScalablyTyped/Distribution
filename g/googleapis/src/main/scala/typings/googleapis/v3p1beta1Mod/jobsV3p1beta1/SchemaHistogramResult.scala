package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Result of a histogram call. The response contains the
  * histogram map for the search type specified by HistogramResult.field. The
  * response is a map of each filter value to the corresponding count of jobs
  * for that filter.
  */
@js.native
trait SchemaHistogramResult extends StObject {
  
  /**
    * The Histogram search filters.
    */
  var searchType: js.UndefOr[String] = js.native
  
  /**
    * A map from the values of field to the number of jobs with that value in
    * this search result.  Key: search type (filter names, such as the
    * companyName).  Values: the count of jobs that match the filter for this
    * search.
    */
  var values: js.UndefOr[StringDictionary[Double]] = js.native
}
object SchemaHistogramResult {
  
  @scala.inline
  def apply(): SchemaHistogramResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramResult]
  }
  
  @scala.inline
  implicit class SchemaHistogramResultMutableBuilder[Self <: SchemaHistogramResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchType(value: String): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    @scala.inline
    def setValues(value: StringDictionary[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
