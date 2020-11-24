package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSearchAnalyticsQueryRequest extends js.Object {
  
  /**
    * [Optional; Default is &quot;auto&quot;] How data is aggregated. If
    * aggregated by property, all data for the same property is aggregated; if
    * aggregated by page, all data is aggregated by canonical URI. If you
    * filter or group by page, choose AUTO; otherwise you can aggregate either
    * by property or by page, depending on how you want your data calculated;
    * see  the help documentation to learn how data is calculated differently
    * by site versus by page.  Note: If you group or filter by page, you cannot
    * aggregate by property.  If you specify any value other than AUTO, the
    * aggregation type in the result will match the requested type, or if you
    * request an invalid type, you will get an error. The API will never change
    * your aggregation type if the requested type is invalid.
    */
  var aggregationType: js.UndefOr[String] = js.native
  
  /**
    * [Optional] Zero or more filters to apply to the dimension grouping
    * values; for example, &#39;query contains &quot;buy&quot;&#39; to see only
    * data where the query string contains the substring &quot;buy&quot; (not
    * case-sensitive). You can filter by a dimension without grouping by it.
    */
  var dimensionFilterGroups: js.UndefOr[js.Array[SchemaApiDimensionFilterGroup]] = js.native
  
  /**
    * [Optional] Zero or more dimensions to group results by. Dimensions are
    * the group-by values in the Search Analytics page. Dimensions are combined
    * to create a unique row key for each row. Results are grouped in the order
    * that you supply these dimensions.
    */
  var dimensions: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * [Required] End date of the requested date range, in YYYY-MM-DD format, in
    * PST (UTC - 8:00). Must be greater than or equal to the start date. This
    * value is included in the range.
    */
  var endDate: js.UndefOr[String] = js.native
  
  /**
    * [Optional; Default is 1000] The maximum number of rows to return. Must be
    * a number from 1 to 5,000 (inclusive).
    */
  var rowLimit: js.UndefOr[Double] = js.native
  
  /**
    * [Optional; Default is &quot;web&quot;] The search type to filter for.
    */
  var searchType: js.UndefOr[String] = js.native
  
  /**
    * [Required] Start date of the requested date range, in YYYY-MM-DD format,
    * in PST time (UTC - 8:00). Must be less than or equal to the end date.
    * This value is included in the range.
    */
  var startDate: js.UndefOr[String] = js.native
  
  /**
    * [Optional; Default is 0] Zero-based index of the first row in the
    * response. Must be a non-negative number.
    */
  var startRow: js.UndefOr[Double] = js.native
}
object SchemaSearchAnalyticsQueryRequest {
  
  @scala.inline
  def apply(): SchemaSearchAnalyticsQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchAnalyticsQueryRequest]
  }
  
  @scala.inline
  implicit class SchemaSearchAnalyticsQueryRequestOps[Self <: SchemaSearchAnalyticsQueryRequest] (val x: Self) extends AnyVal {
    
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
    def setAggregationType(value: String): Self = this.set("aggregationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationType: Self = this.set("aggregationType", js.undefined)
    
    @scala.inline
    def setDimensionFilterGroupsVarargs(value: SchemaApiDimensionFilterGroup*): Self = this.set("dimensionFilterGroups", js.Array(value :_*))
    
    @scala.inline
    def setDimensionFilterGroups(value: js.Array[SchemaApiDimensionFilterGroup]): Self = this.set("dimensionFilterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionFilterGroups: Self = this.set("dimensionFilterGroups", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: String*): Self = this.set("dimensions", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[String]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setRowLimit(value: Double): Self = this.set("rowLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowLimit: Self = this.set("rowLimit", js.undefined)
    
    @scala.inline
    def setSearchType(value: String): Self = this.set("searchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchType: Self = this.set("searchType", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRow: Self = this.set("startRow", js.undefined)
  }
}
