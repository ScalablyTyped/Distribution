package typings.googleapis.v1Dot1Mod.doubleclickbidmanagerV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportMetadata extends StObject {
  
  /**
    * The path to the location in Google Cloud Storage where the report is stored.
    */
  var googleCloudStoragePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ending time for the data that is shown in the report.
    */
  var reportDataEndTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The starting time for the data that is shown in the report.
    */
  var reportDataStartTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Report status.
    */
  var status: js.UndefOr[SchemaReportStatus] = js.undefined
}
object SchemaReportMetadata {
  
  inline def apply(): SchemaReportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportMetadata]
  }
  
  extension [Self <: SchemaReportMetadata](x: Self) {
    
    inline def setGoogleCloudStoragePath(value: String): Self = StObject.set(x, "googleCloudStoragePath", value.asInstanceOf[js.Any])
    
    inline def setGoogleCloudStoragePathNull: Self = StObject.set(x, "googleCloudStoragePath", null)
    
    inline def setGoogleCloudStoragePathUndefined: Self = StObject.set(x, "googleCloudStoragePath", js.undefined)
    
    inline def setReportDataEndTimeMs(value: String): Self = StObject.set(x, "reportDataEndTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReportDataEndTimeMsNull: Self = StObject.set(x, "reportDataEndTimeMs", null)
    
    inline def setReportDataEndTimeMsUndefined: Self = StObject.set(x, "reportDataEndTimeMs", js.undefined)
    
    inline def setReportDataStartTimeMs(value: String): Self = StObject.set(x, "reportDataStartTimeMs", value.asInstanceOf[js.Any])
    
    inline def setReportDataStartTimeMsNull: Self = StObject.set(x, "reportDataStartTimeMs", null)
    
    inline def setReportDataStartTimeMsUndefined: Self = StObject.set(x, "reportDataStartTimeMs", js.undefined)
    
    inline def setStatus(value: SchemaReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
