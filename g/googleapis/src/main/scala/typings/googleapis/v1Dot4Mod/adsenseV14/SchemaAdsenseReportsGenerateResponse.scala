package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleapis.anon.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAdsenseReportsGenerateResponse extends StObject {
  
  /**
    * The averages of the report. This is the same length as any other row in
    * the report; cells corresponding to dimension columns are empty.
    */
  var averages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The requested end date in yyyy-mm-dd format.
    */
  var endDate: js.UndefOr[String] = js.undefined
  
  /**
    * The header information of the columns requested in the report. This is a
    * list of headers; one for each dimension in the request, followed by one
    * for each metric in the request.
    */
  var headers: js.UndefOr[js.Array[Currency]] = js.undefined
  
  /**
    * Kind this is, in this case adsense#report.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The output rows of the report. Each row is a list of cells; one for each
    * dimension in the request, followed by one for each metric in the request.
    * The dimension cells contain strings, and the metric cells contain
    * numbers.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    * The requested start date in yyyy-mm-dd format.
    */
  var startDate: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of rows matched by the report request. Fewer rows may be
    * returned in the response due to being limited by the row count requested
    * or the report row limit.
    */
  var totalMatchedRows: js.UndefOr[String] = js.undefined
  
  /**
    * The totals of the report. This is the same length as any other row in the
    * report; cells corresponding to dimension columns are empty.
    */
  var totals: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Any warnings associated with generation of the report.
    */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaAdsenseReportsGenerateResponse {
  
  @scala.inline
  def apply(): SchemaAdsenseReportsGenerateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdsenseReportsGenerateResponse]
  }
  
  @scala.inline
  implicit class SchemaAdsenseReportsGenerateResponseMutableBuilder[Self <: SchemaAdsenseReportsGenerateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAverages(value: js.Array[String]): Self = StObject.set(x, "averages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAveragesUndefined: Self = StObject.set(x, "averages", js.undefined)
    
    @scala.inline
    def setAveragesVarargs(value: String*): Self = StObject.set(x, "averages", js.Array(value :_*))
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Array[Currency]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: Currency*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[js.Array[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setTotalMatchedRows(value: String): Self = StObject.set(x, "totalMatchedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalMatchedRowsUndefined: Self = StObject.set(x, "totalMatchedRows", js.undefined)
    
    @scala.inline
    def setTotals(value: js.Array[String]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    @scala.inline
    def setTotalsVarargs(value: String*): Self = StObject.set(x, "totals", js.Array(value :_*))
    
    @scala.inline
    def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
