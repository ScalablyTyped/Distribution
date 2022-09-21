package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunQueryRequest extends StObject {
  
  /**
    * Report data range used to generate the report.
    */
  var dataRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ending time for the data that is shown in the report. Note, reportDataEndTimeMs is required if dataRange is CUSTOM_DATES and ignored otherwise.
    */
  var reportDataEndTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The starting time for the data that is shown in the report. Note, reportDataStartTimeMs is required if dataRange is CUSTOM_DATES and ignored otherwise.
    */
  var reportDataStartTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Canonical timezone code for report data time. Defaults to America/New_York.
    */
  var timezoneCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaRunQueryRequest {
  
  inline def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  
  extension [Self <: SchemaRunQueryRequest](x: Self) {
    
    inline def setDataRange(value: String): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
    
    inline def setDataRangeNull: Self = StObject.set(x, "dataRange", null)
    
    inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
    
    inline def setReportDataEndTimeMs(value: String): Self = StObject.set(x, "reportDataEndTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReportDataEndTimeMsNull: Self = StObject.set(x, "reportDataEndTimeMs", null)
    
    inline def setReportDataEndTimeMsUndefined: Self = StObject.set(x, "reportDataEndTimeMs", js.undefined)
    
    inline def setReportDataStartTimeMs(value: String): Self = StObject.set(x, "reportDataStartTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReportDataStartTimeMsNull: Self = StObject.set(x, "reportDataStartTimeMs", null)
    
    inline def setReportDataStartTimeMsUndefined: Self = StObject.set(x, "reportDataStartTimeMs", js.undefined)
    
    inline def setTimezoneCode(value: String): Self = StObject.set(x, "timezoneCode", value.asInstanceOf[js.Any])
    
    inline def setTimezoneCodeNull: Self = StObject.set(x, "timezoneCode", null)
    
    inline def setTimezoneCodeUndefined: Self = StObject.set(x, "timezoneCode", js.undefined)
  }
}
