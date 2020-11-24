package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message containing availability data relevant to DoubleClick Search.
  */
@js.native
trait SchemaAvailability extends js.Object {
  
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
  implicit class SchemaAvailabilityOps[Self <: SchemaAvailability] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgencyId: Self = this.set("agencyId", js.undefined)
    
    @scala.inline
    def setAvailabilityTimestamp(value: String): Self = this.set("availabilityTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityTimestamp: Self = this.set("availabilityTimestamp", js.undefined)
    
    @scala.inline
    def setSegmentationId(value: String): Self = this.set("segmentationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationId: Self = this.set("segmentationId", js.undefined)
    
    @scala.inline
    def setSegmentationName(value: String): Self = this.set("segmentationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationName: Self = this.set("segmentationName", js.undefined)
    
    @scala.inline
    def setSegmentationType(value: String): Self = this.set("segmentationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentationType: Self = this.set("segmentationType", js.undefined)
  }
}
