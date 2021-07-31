package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import typings.maximMazurokGapiClientDfareporting.anon.Active
import typings.maximMazurokGapiClientDfareporting.anon.ActivityFilters
import typings.maximMazurokGapiClientDfareporting.anon.Breakdown
import typings.maximMazurokGapiClientDfareporting.anon.ConversionDimensions
import typings.maximMazurokGapiClientDfareporting.anon.EmailOwner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Report extends StObject {
  
  /** The account ID to which this report belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The report criteria for a report of type "STANDARD". */
  var criteria: js.UndefOr[typings.maximMazurokGapiClientDfareporting.anon.Activities] = js.undefined
  
  /** The report criteria for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachCriteria: js.UndefOr[Breakdown] = js.undefined
  
  /** The report's email delivery settings. */
  var delivery: js.UndefOr[EmailOwner] = js.undefined
  
  /** The eTag of this response for caching purposes. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** The filename used when generating report files for this report. */
  var fileName: js.UndefOr[String] = js.undefined
  
  /** The report criteria for a report of type "FLOODLIGHT". */
  var floodlightCriteria: js.UndefOr[typings.maximMazurokGapiClientDfareporting.anon.CustomRichMediaEvents] = js.undefined
  
  /**
    * The output format of the report. If not specified, default format is "CSV". Note that the actual format in the completed report file might differ if for instance the report's size
    * exceeds the format's capabilities. "CSV" will then be the fallback format.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /** The unique ID identifying this report resource. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The kind of resource this is, in this case dfareporting#report. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The timestamp (in milliseconds since epoch) of when this report was last modified. */
  var lastModifiedTime: js.UndefOr[String] = js.undefined
  
  /** The name of the report. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The user profile id of the owner of this report. */
  var ownerProfileId: js.UndefOr[String] = js.undefined
  
  /** The report criteria for a report of type "PATH_ATTRIBUTION". */
  var pathAttributionCriteria: js.UndefOr[ActivityFilters] = js.undefined
  
  /** The report criteria for a report of type "PATH". */
  var pathCriteria: js.UndefOr[ActivityFilters] = js.undefined
  
  /** The report criteria for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionCriteria: js.UndefOr[ConversionDimensions] = js.undefined
  
  /** The report criteria for a report of type "REACH". */
  var reachCriteria: js.UndefOr[typings.maximMazurokGapiClientDfareporting.anon.DateRange] = js.undefined
  
  /** The report's schedule. Can only be set if the report's 'dateRange' is a relative date range and the relative date range is not "TODAY". */
  var schedule: js.UndefOr[Active] = js.undefined
  
  /** The subaccount ID to which this report belongs if applicable. */
  var subAccountId: js.UndefOr[String] = js.undefined
  
  /** The type of the report. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Report {
  
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  
  @scala.inline
  implicit class ReportMutableBuilder[Self <: Report] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCriteria(value: typings.maximMazurokGapiClientDfareporting.anon.Activities): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setCrossDimensionReachCriteria(value: Breakdown): Self = StObject.set(x, "crossDimensionReachCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossDimensionReachCriteriaUndefined: Self = StObject.set(x, "crossDimensionReachCriteria", js.undefined)
    
    @scala.inline
    def setDelivery(value: EmailOwner): Self = StObject.set(x, "delivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryUndefined: Self = StObject.set(x, "delivery", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFloodlightCriteria(value: typings.maximMazurokGapiClientDfareporting.anon.CustomRichMediaEvents): Self = StObject.set(x, "floodlightCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightCriteriaUndefined: Self = StObject.set(x, "floodlightCriteria", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwnerProfileId(value: String): Self = StObject.set(x, "ownerProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerProfileIdUndefined: Self = StObject.set(x, "ownerProfileId", js.undefined)
    
    @scala.inline
    def setPathAttributionCriteria(value: ActivityFilters): Self = StObject.set(x, "pathAttributionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathAttributionCriteriaUndefined: Self = StObject.set(x, "pathAttributionCriteria", js.undefined)
    
    @scala.inline
    def setPathCriteria(value: ActivityFilters): Self = StObject.set(x, "pathCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathCriteriaUndefined: Self = StObject.set(x, "pathCriteria", js.undefined)
    
    @scala.inline
    def setPathToConversionCriteria(value: ConversionDimensions): Self = StObject.set(x, "pathToConversionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToConversionCriteriaUndefined: Self = StObject.set(x, "pathToConversionCriteria", js.undefined)
    
    @scala.inline
    def setReachCriteria(value: typings.maximMazurokGapiClientDfareporting.anon.DateRange): Self = StObject.set(x, "reachCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReachCriteriaUndefined: Self = StObject.set(x, "reachCriteria", js.undefined)
    
    @scala.inline
    def setSchedule(value: Active): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setSubAccountId(value: String): Self = StObject.set(x, "subAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubAccountIdUndefined: Self = StObject.set(x, "subAccountId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
