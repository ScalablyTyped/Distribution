package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message containing availability data relevant to DoubleClick Search.
  */
@js.native
trait SchemaAvailability extends StObject {
  
  /**
    * DS advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * DS agency ID.
    */
  var agencyId: js.UndefOr[String] = js.native
  
  /**
    * The time by which all conversions have been uploaded, in epoch millis
    * UTC.
    */
  var availabilityTimestamp: js.UndefOr[String] = js.native
  
  /**
    * The numeric segmentation identifier (for example, DoubleClick Search
    * Floodlight activity ID).
    */
  var segmentationId: js.UndefOr[String] = js.native
  
  /**
    * The friendly segmentation identifier (for example, DoubleClick Search
    * Floodlight activity name).
    */
  var segmentationName: js.UndefOr[String] = js.native
  
  /**
    * The segmentation type that this availability is for (its default value is
    * FLOODLIGHT).
    */
  var segmentationType: js.UndefOr[String] = js.native
}
object SchemaAvailability {
  
  @scala.inline
  def apply(): SchemaAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAvailability]
  }
  
  @scala.inline
  implicit class SchemaAvailabilityMutableBuilder[Self <: SchemaAvailability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    @scala.inline
    def setAvailabilityTimestamp(value: String): Self = StObject.set(x, "availabilityTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityTimestampUndefined: Self = StObject.set(x, "availabilityTimestamp", js.undefined)
    
    @scala.inline
    def setSegmentationId(value: String): Self = StObject.set(x, "segmentationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentationIdUndefined: Self = StObject.set(x, "segmentationId", js.undefined)
    
    @scala.inline
    def setSegmentationName(value: String): Self = StObject.set(x, "segmentationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentationNameUndefined: Self = StObject.set(x, "segmentationName", js.undefined)
    
    @scala.inline
    def setSegmentationType(value: String): Self = StObject.set(x, "segmentationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentationTypeUndefined: Self = StObject.set(x, "segmentationType", js.undefined)
  }
}
