package typings.maximMazurokGapiClientAnalyticsreporting.gapi.client.analyticsreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Report extends StObject {
  
  /** The column headers. */
  var columnHeader: js.UndefOr[ColumnHeader] = js.undefined
  
  /** Response data. */
  var data: js.UndefOr[ReportData] = js.undefined
  
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object Report {
  
  inline def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  
  extension [Self <: Report](x: Self) {
    
    inline def setColumnHeader(value: ColumnHeader): Self = StObject.set(x, "columnHeader", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderUndefined: Self = StObject.set(x, "columnHeader", js.undefined)
    
    inline def setData(value: ReportData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
