package typings.googleapis.v33Mod.dfareportingV33

import typings.googleapis.anon.Active
import typings.googleapis.anon.Activities
import typings.googleapis.anon.ActivityFilters
import typings.googleapis.anon.Breakdown
import typings.googleapis.anon.CustomRichMediaEvents
import typings.googleapis.anon.DateRange
import typings.googleapis.anon.EmailOwner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReport extends StObject {
  
  /**
    * The account ID to which this report belongs.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The report criteria for a report of type "STANDARD".
    */
  var criteria: js.UndefOr[Activities | Null] = js.undefined
  
  /**
    * The report criteria for a report of type "CROSS_DIMENSION_REACH".
    */
  var crossDimensionReachCriteria: js.UndefOr[Breakdown | Null] = js.undefined
  
  /**
    * The report's email delivery settings.
    */
  var delivery: js.UndefOr[EmailOwner | Null] = js.undefined
  
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The filename used when generating report files for this report.
    */
  var fileName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The report criteria for a report of type "FLOODLIGHT".
    */
  var floodlightCriteria: js.UndefOr[CustomRichMediaEvents | Null] = js.undefined
  
  /**
    * The output format of the report. If not specified, default format is "CSV". Note that the actual format in the completed report file might differ if for instance the report's size exceeds the format's capabilities. "CSV" will then be the fallback format.
    */
  var format: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID identifying this report resource.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kind of resource this is, in this case dfareporting#report.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp (in milliseconds since epoch) of when this report was last modified.
    */
  var lastModifiedTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the report.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user profile id of the owner of this report.
    */
  var ownerProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The report criteria for a report of type "PATH_TO_CONVERSION".
    */
  var pathToConversionCriteria: js.UndefOr[ActivityFilters | Null] = js.undefined
  
  /**
    * The report criteria for a report of type "REACH".
    */
  var reachCriteria: js.UndefOr[DateRange | Null] = js.undefined
  
  /**
    * The report's schedule. Can only be set if the report's 'dateRange' is a relative date range and the relative date range is not "TODAY".
    */
  var schedule: js.UndefOr[Active | Null] = js.undefined
  
  /**
    * The subaccount ID to which this report belongs if applicable.
    */
  var subAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the report.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaReport {
  
  inline def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  
  extension [Self <: SchemaReport](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCriteria(value: Activities): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaNull: Self = StObject.set(x, "criteria", null)
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setCrossDimensionReachCriteria(value: Breakdown): Self = StObject.set(x, "crossDimensionReachCriteria", value.asInstanceOf[js.Any])
    
    inline def setCrossDimensionReachCriteriaNull: Self = StObject.set(x, "crossDimensionReachCriteria", null)
    
    inline def setCrossDimensionReachCriteriaUndefined: Self = StObject.set(x, "crossDimensionReachCriteria", js.undefined)
    
    inline def setDelivery(value: EmailOwner): Self = StObject.set(x, "delivery", value.asInstanceOf[js.Any])
    
    inline def setDeliveryNull: Self = StObject.set(x, "delivery", null)
    
    inline def setDeliveryUndefined: Self = StObject.set(x, "delivery", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameNull: Self = StObject.set(x, "fileName", null)
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFloodlightCriteria(value: CustomRichMediaEvents): Self = StObject.set(x, "floodlightCriteria", value.asInstanceOf[js.Any])
    
    inline def setFloodlightCriteriaNull: Self = StObject.set(x, "floodlightCriteria", null)
    
    inline def setFloodlightCriteriaUndefined: Self = StObject.set(x, "floodlightCriteria", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastModifiedTime(value: String): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeNull: Self = StObject.set(x, "lastModifiedTime", null)
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwnerProfileId(value: String): Self = StObject.set(x, "ownerProfileId", value.asInstanceOf[js.Any])
    
    inline def setOwnerProfileIdNull: Self = StObject.set(x, "ownerProfileId", null)
    
    inline def setOwnerProfileIdUndefined: Self = StObject.set(x, "ownerProfileId", js.undefined)
    
    inline def setPathToConversionCriteria(value: ActivityFilters): Self = StObject.set(x, "pathToConversionCriteria", value.asInstanceOf[js.Any])
    
    inline def setPathToConversionCriteriaNull: Self = StObject.set(x, "pathToConversionCriteria", null)
    
    inline def setPathToConversionCriteriaUndefined: Self = StObject.set(x, "pathToConversionCriteria", js.undefined)
    
    inline def setReachCriteria(value: DateRange): Self = StObject.set(x, "reachCriteria", value.asInstanceOf[js.Any])
    
    inline def setReachCriteriaNull: Self = StObject.set(x, "reachCriteria", null)
    
    inline def setReachCriteriaUndefined: Self = StObject.set(x, "reachCriteria", js.undefined)
    
    inline def setSchedule(value: Active): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleNull: Self = StObject.set(x, "schedule", null)
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setSubAccountId(value: String): Self = StObject.set(x, "subAccountId", value.asInstanceOf[js.Any])
    
    inline def setSubAccountIdNull: Self = StObject.set(x, "subAccountId", null)
    
    inline def setSubAccountIdUndefined: Self = StObject.set(x, "subAccountId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
