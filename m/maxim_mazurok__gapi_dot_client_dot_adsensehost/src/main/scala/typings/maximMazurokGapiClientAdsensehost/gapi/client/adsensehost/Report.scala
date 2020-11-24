package typings.maximMazurokGapiClientAdsensehost.gapi.client.adsensehost

import typings.maximMazurokGapiClientAdsensehost.anon.Currency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Report extends js.Object {
  
  /** The averages of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var averages: js.UndefOr[js.Array[String]] = js.native
  
  /** The header information of the columns requested in the report. This is a list of headers; one for each dimension in the request, followed by one for each metric in the request. */
  var headers: js.UndefOr[js.Array[Currency]] = js.native
  
  /** Kind this is, in this case adsensehost#report. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The output rows of the report. Each row is a list of cells; one for each dimension in the request, followed by one for each metric in the request. The dimension cells contain
    * strings, and the metric cells contain numbers.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.native
  
  /** The total number of rows matched by the report request. Fewer rows may be returned in the response due to being limited by the row count requested or the report row limit. */
  var totalMatchedRows: js.UndefOr[String] = js.native
  
  /** The totals of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var totals: js.UndefOr[js.Array[String]] = js.native
  
  /** Any warnings associated with generation of the report. */
  var warnings: js.UndefOr[js.Array[String]] = js.native
}
object Report {
  
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    
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
    def setAveragesVarargs(value: String*): Self = this.set("averages", js.Array(value :_*))
    
    @scala.inline
    def setAverages(value: js.Array[String]): Self = this.set("averages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverages: Self = this.set("averages", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: Currency*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: js.Array[Currency]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[String]*): Self = this.set("rows", js.Array(value :_*))
    
    @scala.inline
    def setRows(value: js.Array[js.Array[String]]): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setTotalMatchedRows(value: String): Self = this.set("totalMatchedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalMatchedRows: Self = this.set("totalMatchedRows", js.undefined)
    
    @scala.inline
    def setTotalsVarargs(value: String*): Self = this.set("totals", js.Array(value :_*))
    
    @scala.inline
    def setTotals(value: js.Array[String]): Self = this.set("totals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotals: Self = this.set("totals", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = this.set("warnings", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
}
