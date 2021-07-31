package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Histogram result that matches HistogramSpec specified in
  * searches.
  */
trait SchemaHistogramQueryResult extends StObject {
  
  /**
    * A map from the values of the facet associated with distinct values to the
    * number of matching entries with corresponding value.  The key format is:
    * * (for string histogram) string values stored in the field. * (for named
    * numeric bucket) name specified in `bucket()` function, like   for
    * `bucket(0, MAX, &quot;non-negative&quot;)`, the key will be
    * `non-negative`. * (for anonymous numeric bucket) range formatted as
    * `&lt;low&gt;-&lt;high&gt;`, for example, `0-1000`, `MIN-0`, and `0-MAX`.
    */
  var histogram: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Requested histogram expression.
    */
  var histogramQuery: js.UndefOr[String] = js.undefined
}
object SchemaHistogramQueryResult {
  
  @scala.inline
  def apply(): SchemaHistogramQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramQueryResult]
  }
  
  @scala.inline
  implicit class SchemaHistogramQueryResultMutableBuilder[Self <: SchemaHistogramQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHistogram(value: StringDictionary[String]): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramQuery(value: String): Self = StObject.set(x, "histogramQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramQueryUndefined: Self = StObject.set(x, "histogramQuery", js.undefined)
    
    @scala.inline
    def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
  }
}
