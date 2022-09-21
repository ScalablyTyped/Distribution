package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSheetsChart extends StObject {
  
  /**
    * The ID of the specific chart in the Google Sheets spreadsheet that is embedded.
    */
  var chartId: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The URL of an image of the embedded chart, with a default lifetime of 30 minutes. This URL is tagged with the account of the requester. Anyone with the URL effectively accesses the image as the original requester. Access to the image may be lost if the presentation's sharing settings change.
    */
  var contentUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The properties of the Sheets chart.
    */
  var sheetsChartProperties: js.UndefOr[SchemaSheetsChartProperties] = js.undefined
  
  /**
    * The ID of the Google Sheets spreadsheet that contains the source chart.
    */
  var spreadsheetId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSheetsChart {
  
  inline def apply(): SchemaSheetsChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSheetsChart]
  }
  
  extension [Self <: SchemaSheetsChart](x: Self) {
    
    inline def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    inline def setChartIdNull: Self = StObject.set(x, "chartId", null)
    
    inline def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setSheetsChartProperties(value: SchemaSheetsChartProperties): Self = StObject.set(x, "sheetsChartProperties", value.asInstanceOf[js.Any])
    
    inline def setSheetsChartPropertiesUndefined: Self = StObject.set(x, "sheetsChartProperties", js.undefined)
    
    inline def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    inline def setSpreadsheetIdNull: Self = StObject.set(x, "spreadsheetId", null)
    
    inline def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
