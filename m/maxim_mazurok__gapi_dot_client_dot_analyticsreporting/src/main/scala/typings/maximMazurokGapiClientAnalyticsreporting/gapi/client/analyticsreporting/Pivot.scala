package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pivot extends js.Object {
  
  /**
    * DimensionFilterClauses are logically combined with an `AND` operator: only data that is included by all these DimensionFilterClauses contributes to the values in this pivot region.
    * Dimension filters can be used to restrict the columns shown in the pivot region. For example if you have `ga:browser` as the requested dimension in the pivot region, and you specify
    * key filters to restrict `ga:browser` to only "IE" or "Firefox", then only those two browsers would show up as columns.
    */
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.native
  
  /**
    * A list of dimensions to show as pivot columns. A Pivot can have a maximum of 4 dimensions. Pivot dimensions are part of the restriction on the total number of dimensions allowed in
    * the request.
    */
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  
  /** Specifies the maximum number of groups to return. The default value is 10, also the maximum value is 1,000. */
  var maxGroupCount: js.UndefOr[Double] = js.native
  
  /** The pivot metrics. Pivot metrics are part of the restriction on total number of metrics allowed in the request. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  
  /**
    * If k metrics were requested, then the response will contain some data-dependent multiple of k columns in the report. E.g., if you pivoted on the dimension `ga:browser` then you'd
    * get k columns for "Firefox", k columns for "IE", k columns for "Chrome", etc. The ordering of the groups of columns is determined by descending order of "total" for the first of the
    * k values. Ties are broken by lexicographic ordering of the first pivot dimension, then lexicographic ordering of the second pivot dimension, and so on. E.g., if the totals for the
    * first value for Firefox, IE, and Chrome were 8, 2, 8, respectively, the order of columns would be Chrome, Firefox, IE. The following let you choose which of the groups of k columns
    * are included in the response.
    */
  var startGroup: js.UndefOr[Double] = js.native
}
object Pivot {
  
  @scala.inline
  def apply(): Pivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pivot]
  }
  
  @scala.inline
  implicit class PivotOps[Self <: Pivot] (val x: Self) extends AnyVal {
    
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
    def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = this.set("dimensionFilterClauses", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = this.set("dimensionFilterClauses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilterClauses: Self = this.set("dimensionFilterClauses", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setMaxGroupCount(value: Double): Self = this.set("maxGroupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxGroupCount: Self = this.set("maxGroupCount", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = this.set("metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setStartGroup(value: Double): Self = this.set("startGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartGroup: Self = this.set("startGroup", js.undefined)
  }
}
