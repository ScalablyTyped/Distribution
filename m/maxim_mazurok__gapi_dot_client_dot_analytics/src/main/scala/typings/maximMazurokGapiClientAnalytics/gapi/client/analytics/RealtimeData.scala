package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientAnalytics.anon.AccountId
import typings.maximMazurokGapiClientAnalytics.anon.ColumnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealtimeData extends js.Object {
  
  /** Column headers that list dimension names followed by the metric names. The order of dimensions and metrics is same as specified in the request. */
  var columnHeaders: js.UndefOr[js.Array[ColumnType]] = js.native
  
  /** Unique ID for this data response. */
  var id: js.UndefOr[String] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** Information for the view (profile), for which the real time data was requested. */
  var profileInfo: js.UndefOr[AccountId] = js.native
  
  /** Real time data request query parameters. */
  var query: js.UndefOr[typings.maximMazurokGapiClientAnalytics.anon.Filters] = js.native
  
  /** Real time data rows, where each row contains a list of dimension values followed by the metric values. The order of dimensions and metrics is same as specified in the request. */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  /** Link to this page. */
  var selfLink: js.UndefOr[String] = js.native
  
  /** The total number of rows for the query, regardless of the number of rows in the response. */
  var totalResults: js.UndefOr[Double] = js.native
  
  /**
    * Total values for the requested metrics over all the results, not just the results returned in this response. The order of the metric totals is same as the metric order specified in
    * the request.
    */
  var totalsForAllResults: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.RealtimeData with TopLevel[js.Any]
  ] = js.native
}
object RealtimeData {
  
  @scala.inline
  def apply(): RealtimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RealtimeData]
  }
  
  @scala.inline
  implicit class RealtimeDataOps[Self <: RealtimeData] (val x: Self) extends AnyVal {
    
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
    def setColumnHeadersVarargs(value: ColumnType*): Self = this.set("columnHeaders", js.Array(value :_*))
    
    @scala.inline
    def setColumnHeaders(value: js.Array[ColumnType]): Self = this.set("columnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHeaders: Self = this.set("columnHeaders", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProfileInfo(value: AccountId): Self = this.set("profileInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileInfo: Self = this.set("profileInfo", js.undefined)
    
    @scala.inline
    def setQuery(value: typings.maximMazurokGapiClientAnalytics.anon.Filters): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[String]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[js.Array[String]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setTotalResults(value: Double): Self = this.set("totalResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalResults: Self = this.set("totalResults", js.undefined)
    
    @scala.inline
    def setTotalsForAllResults(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientAnalytics.maximMazurokGapiClientAnalyticsStrings.RealtimeData with TopLevel[js.Any]
    ): Self = this.set("totalsForAllResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalsForAllResults: Self = this.set("totalsForAllResults", js.undefined)
  }
}
