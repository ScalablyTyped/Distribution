package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Refreshes an embedded Google Sheets chart by replacing it with the latest
  * version of the chart from Google Sheets.  NOTE: Refreshing charts requires
  * at least one of the spreadsheets.readonly, spreadsheets, drive.readonly, or
  * drive OAuth scopes.
  */
trait SchemaRefreshSheetsChartRequest extends StObject {
  
  /**
    * The object ID of the chart to refresh.
    */
  var objectId: js.UndefOr[String] = js.undefined
}
object SchemaRefreshSheetsChartRequest {
  
  inline def apply(): SchemaRefreshSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRefreshSheetsChartRequest]
  }
  
  extension [Self <: SchemaRefreshSheetsChartRequest](x: Self) {
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
