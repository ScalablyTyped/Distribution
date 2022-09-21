package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportMetadata extends StObject {
  
  /**
    * Output only. The path to the location in Google Cloud Storage where the report is stored.
    */
  var googleCloudStoragePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ending time for the data that is shown in the report.
    */
  var reportDataEndDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The starting time for the data that is shown in the report.
    */
  var reportDataStartDate: js.UndefOr[SchemaDate] = js.undefined
  
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
    
    inline def setReportDataEndDate(value: SchemaDate): Self = StObject.set(x, "reportDataEndDate", value.asInstanceOf[js.Any])
    
    inline def setReportDataEndDateUndefined: Self = StObject.set(x, "reportDataEndDate", js.undefined)
    
    inline def setReportDataStartDate(value: SchemaDate): Self = StObject.set(x, "reportDataStartDate", value.asInstanceOf[js.Any])
    
    inline def setReportDataStartDateUndefined: Self = StObject.set(x, "reportDataStartDate", js.undefined)
    
    inline def setStatus(value: SchemaReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
