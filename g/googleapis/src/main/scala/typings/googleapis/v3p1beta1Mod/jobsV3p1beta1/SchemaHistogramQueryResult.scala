package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Histogram result that matches HistogramSpec specified in
  * searches.
  */
@js.native
trait SchemaHistogramQueryResult extends js.Object {
  
  /**
    * A map from the values of the facet associated with distinct values to the
    * number of matching entries with corresponding value.  The key format is:
    * * (for string histogram) string values stored in the field. * (for named
    * numeric bucket) name specified in `bucket()` function, like   for
    * `bucket(0, MAX, &quot;non-negative&quot;)`, the key will be
    * `non-negative`. * (for anonymous numeric bucket) range formatted as
    * `&lt;low&gt;-&lt;high&gt;`, for example, `0-1000`, `MIN-0`, and `0-MAX`.
    */
  var histogram: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Requested histogram expression.
    */
  var histogramQuery: js.UndefOr[String] = js.native
}
object SchemaHistogramQueryResult {
  
  @scala.inline
  def apply(): SchemaHistogramQueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistogramQueryResult]
  }
  
  @scala.inline
  implicit class SchemaHistogramQueryResultOps[Self <: SchemaHistogramQueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHistogram(value: StringDictionary[String]): Self = this.set("histogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogram: Self = this.set("histogram", js.undefined)
    
    @scala.inline
    def setHistogramQuery(value: String): Self = this.set("histogramQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistogramQuery: Self = this.set("histogramQuery", js.undefined)
  }
}
