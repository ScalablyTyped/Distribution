package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typings.maximMazurokGapiClientAnalytics.anon.BucketId
import typings.maximMazurokGapiClientAnalytics.anon.DocumentId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsampledReport extends StObject {
  
  /** Account ID to which this unsampled report belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Download details for a file stored in Google Cloud Storage. */
  var cloudStorageDownloadDetails: js.UndefOr[BucketId] = js.undefined
  
  /** Time this unsampled report was created. */
  var created: js.UndefOr[String] = js.undefined
  
  /** The dimensions for the unsampled report. */
  var dimensions: js.UndefOr[String] = js.undefined
  
  /**
    * The type of download you need to use for the report data file. Possible values include `GOOGLE_DRIVE` and `GOOGLE_CLOUD_STORAGE`. If the value is `GOOGLE_DRIVE`, see the
    * `driveDownloadDetails` field. If the value is `GOOGLE_CLOUD_STORAGE`, see the `cloudStorageDownloadDetails` field.
    */
  var downloadType: js.UndefOr[String] = js.undefined
  
  /** Download details for a file stored in Google Drive. */
  var driveDownloadDetails: js.UndefOr[DocumentId] = js.undefined
  
  /** The end date for the unsampled report. */
  var `end-date`: js.UndefOr[String] = js.undefined
  
  /** The filters for the unsampled report. */
  var filters: js.UndefOr[String] = js.undefined
  
  /** Unsampled report ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Resource type for an Analytics unsampled report. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The metrics for the unsampled report. */
  var metrics: js.UndefOr[String] = js.undefined
  
  /** View (Profile) ID to which this unsampled report belongs. */
  var profileId: js.UndefOr[String] = js.undefined
  
  /** The segment for the unsampled report. */
  var segment: js.UndefOr[String] = js.undefined
  
  /** Link for this unsampled report. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** The start date for the unsampled report. */
  var `start-date`: js.UndefOr[String] = js.undefined
  
  /** Status of this unsampled report. Possible values are PENDING, COMPLETED, or FAILED. */
  var status: js.UndefOr[String] = js.undefined
  
  /** Title of the unsampled report. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Time this unsampled report was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** Web property ID to which this unsampled report belongs. The web property ID is of the form UA-XXXXX-YY. */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object UnsampledReport {
  
  inline def apply(): UnsampledReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnsampledReport]
  }
  
  extension [Self <: UnsampledReport](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCloudStorageDownloadDetails(value: BucketId): Self = StObject.set(x, "cloudStorageDownloadDetails", value.asInstanceOf[js.Any])
    
    inline def setCloudStorageDownloadDetailsUndefined: Self = StObject.set(x, "cloudStorageDownloadDetails", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDimensions(value: String): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setDownloadType(value: String): Self = StObject.set(x, "downloadType", value.asInstanceOf[js.Any])
    
    inline def setDownloadTypeUndefined: Self = StObject.set(x, "downloadType", js.undefined)
    
    inline def setDriveDownloadDetails(value: DocumentId): Self = StObject.set(x, "driveDownloadDetails", value.asInstanceOf[js.Any])
    
    inline def setDriveDownloadDetailsUndefined: Self = StObject.set(x, "driveDownloadDetails", js.undefined)
    
    inline def `setEnd-date`(value: String): Self = StObject.set(x, "end-date", value.asInstanceOf[js.Any])
    
    inline def `setEnd-dateUndefined`: Self = StObject.set(x, "end-date", js.undefined)
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMetrics(value: String): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setSegment(value: String): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def `setStart-date`(value: String): Self = StObject.set(x, "start-date", value.asInstanceOf[js.Any])
    
    inline def `setStart-dateUndefined`: Self = StObject.set(x, "start-date", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
