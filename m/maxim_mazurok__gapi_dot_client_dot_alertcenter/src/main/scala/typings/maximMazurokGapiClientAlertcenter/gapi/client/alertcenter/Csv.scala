package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Csv extends StObject {
  
  /** The list of data rows in a CSV file, as string arrays rather than as a single comma-separated string. */
  var dataRows: js.UndefOr[js.Array[CsvRow]] = js.undefined
  
  /** The list of headers for data columns in a CSV file. */
  var headers: js.UndefOr[js.Array[String]] = js.undefined
}
object Csv {
  
  inline def apply(): Csv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Csv]
  }
  
  extension [Self <: Csv](x: Self) {
    
    inline def setDataRows(value: js.Array[CsvRow]): Self = StObject.set(x, "dataRows", value.asInstanceOf[js.Any])
    
    inline def setDataRowsUndefined: Self = StObject.set(x, "dataRows", js.undefined)
    
    inline def setDataRowsVarargs(value: CsvRow*): Self = StObject.set(x, "dataRows", js.Array(value :_*))
    
    inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
  }
}
