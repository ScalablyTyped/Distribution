package typings.googleapis.v41Mod.adsensehostV41

import typings.googleapis.anon.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReport extends StObject {
  
  /**
    * The averages of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty.
    */
  var averages: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The header information of the columns requested in the report. This is a list of headers; one for each dimension in the request, followed by one for each metric in the request.
    */
  var headers: js.UndefOr[js.Array[Currency] | Null] = js.undefined
  
  /**
    * Kind this is, in this case adsensehost#report.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The output rows of the report. Each row is a list of cells; one for each dimension in the request, followed by one for each metric in the request. The dimension cells contain strings, and the metric cells contain numbers.
    */
  var rows: js.UndefOr[js.Array[js.Array[String]] | Null] = js.undefined
  
  /**
    * The total number of rows matched by the report request. Fewer rows may be returned in the response due to being limited by the row count requested or the report row limit.
    */
  var totalMatchedRows: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The totals of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty.
    */
  var totals: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Any warnings associated with generation of the report.
    */
  var warnings: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaReport {
  
  inline def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  
  extension [Self <: SchemaReport](x: Self) {
    
    inline def setAverages(value: js.Array[String]): Self = StObject.set(x, "averages", value.asInstanceOf[js.Any])
    
    inline def setAveragesNull: Self = StObject.set(x, "averages", null)
    
    inline def setAveragesUndefined: Self = StObject.set(x, "averages", js.undefined)
    
    inline def setAveragesVarargs(value: String*): Self = StObject.set(x, "averages", js.Array(value*))
    
    inline def setHeaders(value: js.Array[Currency]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: Currency*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRows(value: js.Array[js.Array[String]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsNull: Self = StObject.set(x, "rows", null)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: js.Array[String]*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setTotalMatchedRows(value: String): Self = StObject.set(x, "totalMatchedRows", value.asInstanceOf[js.Any])
    
    inline def setTotalMatchedRowsNull: Self = StObject.set(x, "totalMatchedRows", null)
    
    inline def setTotalMatchedRowsUndefined: Self = StObject.set(x, "totalMatchedRows", js.undefined)
    
    inline def setTotals(value: js.Array[String]): Self = StObject.set(x, "totals", value.asInstanceOf[js.Any])
    
    inline def setTotalsNull: Self = StObject.set(x, "totals", null)
    
    inline def setTotalsUndefined: Self = StObject.set(x, "totals", js.undefined)
    
    inline def setTotalsVarargs(value: String*): Self = StObject.set(x, "totals", js.Array(value*))
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsNull: Self = StObject.set(x, "warnings", null)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
