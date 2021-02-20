package typings.googleapis.v32Mod.dfareportingV32

import typings.googleapis.anon.Active
import typings.googleapis.anon.ConversionDimensions
import typings.googleapis.anon.Dimension
import typings.googleapis.anon.DimensionFilters
import typings.googleapis.anon.EmailOwnerDeliveryType
import typings.googleapis.anon.EnableAllDimensionCombinations
import typings.googleapis.anon.FloodlightConfigId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Report resource.
  */
@js.native
trait SchemaReport extends StObject {
  
  /**
    * The account ID to which this report belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The report criteria for a report of type &quot;STANDARD&quot;.
    */
  var criteria: js.UndefOr[DimensionFilters] = js.native
  
  /**
    * The report criteria for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachCriteria: js.UndefOr[Dimension] = js.native
  
  /**
    * The report&#39;s email delivery settings.
    */
  var delivery: js.UndefOr[EmailOwnerDeliveryType] = js.native
  
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The filename used when generating report files for this report.
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * The report criteria for a report of type &quot;FLOODLIGHT&quot;.
    */
  var floodlightCriteria: js.UndefOr[FloodlightConfigId] = js.native
  
  /**
    * The output format of the report. If not specified, default format is
    * &quot;CSV&quot;. Note that the actual format in the completed report file
    * might differ if for instance the report&#39;s size exceeds the
    * format&#39;s capabilities. &quot;CSV&quot; will then be the fallback
    * format.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * The unique ID identifying this report resource.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The kind of resource this is, in this case dfareporting#report.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The timestamp (in milliseconds since epoch) of when this report was last
    * modified.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  
  /**
    * The name of the report.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The user profile id of the owner of this report.
    */
  var ownerProfileId: js.UndefOr[String] = js.native
  
  /**
    * The report criteria for a report of type &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionCriteria: js.UndefOr[ConversionDimensions] = js.native
  
  /**
    * The report criteria for a report of type &quot;REACH&quot;.
    */
  var reachCriteria: js.UndefOr[EnableAllDimensionCombinations] = js.native
  
  /**
    * The report&#39;s schedule. Can only be set if the report&#39;s
    * &#39;dateRange&#39; is a relative date range and the relative date range
    * is not &quot;TODAY&quot;.
    */
  var schedule: js.UndefOr[Active] = js.native
  
  /**
    * The subaccount ID to which this report belongs if applicable.
    */
  var subAccountId: js.UndefOr[String] = js.native
  
  /**
    * The type of the report.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaReport {
  
  @scala.inline
  def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  
  @scala.inline
  implicit class SchemaReportMutableBuilder[Self <: SchemaReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCriteria(value: DimensionFilters): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setCrossDimensionReachCriteria(value: Dimension): Self = StObject.set(x, "crossDimensionReachCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossDimensionReachCriteriaUndefined: Self = StObject.set(x, "crossDimensionReachCriteria", js.undefined)
    
    @scala.inline
    def setDelivery(value: EmailOwnerDeliveryType): Self = StObject.set(x, "delivery", value.asInstanceOf[js.Any])
    
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
    def setFloodlightCriteria(value: FloodlightConfigId): Self = StObject.set(x, "floodlightCriteria", value.asInstanceOf[js.Any])
    
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
    def setPathToConversionCriteria(value: ConversionDimensions): Self = StObject.set(x, "pathToConversionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathToConversionCriteriaUndefined: Self = StObject.set(x, "pathToConversionCriteria", js.undefined)
    
    @scala.inline
    def setReachCriteria(value: EnableAllDimensionCombinations): Self = StObject.set(x, "reachCriteria", value.asInstanceOf[js.Any])
    
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
