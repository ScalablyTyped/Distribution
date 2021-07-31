package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Report metadata.
  */
trait SchemaReportMetadata extends StObject {
  
  /**
    * The path to the location in Google Cloud Storage where the report is
    * stored.
    */
  var googleCloudStoragePath: js.UndefOr[String] = js.undefined
  
  /**
    * The ending time for the data that is shown in the report.
    */
  var reportDataEndTimeMs: js.UndefOr[String] = js.undefined
  
  /**
    * The starting time for the data that is shown in the report.
    */
  var reportDataStartTimeMs: js.UndefOr[String] = js.undefined
  
  /**
    * Report status.
    */
  var status: js.UndefOr[SchemaReportStatus] = js.undefined
}
object SchemaReportMetadata {
  
  @scala.inline
  def apply(): SchemaReportMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportMetadata]
  }
  
  @scala.inline
  implicit class SchemaReportMetadataMutableBuilder[Self <: SchemaReportMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGoogleCloudStoragePath(value: String): Self = StObject.set(x, "googleCloudStoragePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleCloudStoragePathUndefined: Self = StObject.set(x, "googleCloudStoragePath", js.undefined)
    
    @scala.inline
    def setReportDataEndTimeMs(value: String): Self = StObject.set(x, "reportDataEndTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportDataEndTimeMsUndefined: Self = StObject.set(x, "reportDataEndTimeMs", js.undefined)
    
    @scala.inline
    def setReportDataStartTimeMs(value: String): Self = StObject.set(x, "reportDataStartTimeMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportDataStartTimeMsUndefined: Self = StObject.set(x, "reportDataStartTimeMs", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaReportStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
