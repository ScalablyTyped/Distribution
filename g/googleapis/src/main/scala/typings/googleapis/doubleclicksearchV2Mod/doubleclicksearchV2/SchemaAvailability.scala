package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAvailability extends StObject {
  
  /**
    * DS advertiser ID.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS agency ID.
    */
  var agencyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time by which all conversions have been uploaded, in epoch millis UTC.
    */
  var availabilityTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
    */
  var segmentationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name).
    */
  var segmentationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The segmentation type that this availability is for (its default value is `FLOODLIGHT`).
    */
  var segmentationType: js.UndefOr[String | Null] = js.undefined
}
object SchemaAvailability {
  
  inline def apply(): SchemaAvailability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAvailability]
  }
  
  extension [Self <: SchemaAvailability](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdNull: Self = StObject.set(x, "agencyId", null)
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setAvailabilityTimestamp(value: String): Self = StObject.set(x, "availabilityTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityTimestampNull: Self = StObject.set(x, "availabilityTimestamp", null)
    
    inline def setAvailabilityTimestampUndefined: Self = StObject.set(x, "availabilityTimestamp", js.undefined)
    
    inline def setSegmentationId(value: String): Self = StObject.set(x, "segmentationId", value.asInstanceOf[js.Any])
    
    inline def setSegmentationIdNull: Self = StObject.set(x, "segmentationId", null)
    
    inline def setSegmentationIdUndefined: Self = StObject.set(x, "segmentationId", js.undefined)
    
    inline def setSegmentationName(value: String): Self = StObject.set(x, "segmentationName", value.asInstanceOf[js.Any])
    
    inline def setSegmentationNameNull: Self = StObject.set(x, "segmentationName", null)
    
    inline def setSegmentationNameUndefined: Self = StObject.set(x, "segmentationName", js.undefined)
    
    inline def setSegmentationType(value: String): Self = StObject.set(x, "segmentationType", value.asInstanceOf[js.Any])
    
    inline def setSegmentationTypeNull: Self = StObject.set(x, "segmentationType", null)
    
    inline def setSegmentationTypeUndefined: Self = StObject.set(x, "segmentationType", js.undefined)
  }
}
