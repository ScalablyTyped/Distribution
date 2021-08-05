package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Recording information associated with the video.
  */
trait SchemaVideoRecordingDetails extends StObject {
  
  /**
    * The geolocation information associated with the video.
    */
  var location: js.UndefOr[SchemaGeoPoint] = js.undefined
  
  /**
    * The text description of the location where the video was recorded.
    */
  var locationDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the video was recorded. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sssZ) format.
    */
  var recordingDate: js.UndefOr[String] = js.undefined
}
object SchemaVideoRecordingDetails {
  
  inline def apply(): SchemaVideoRecordingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoRecordingDetails]
  }
  
  extension [Self <: SchemaVideoRecordingDetails](x: Self) {
    
    inline def setLocation(value: SchemaGeoPoint): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationDescription(value: String): Self = StObject.set(x, "locationDescription", value.asInstanceOf[js.Any])
    
    inline def setLocationDescriptionUndefined: Self = StObject.set(x, "locationDescription", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRecordingDate(value: String): Self = StObject.set(x, "recordingDate", value.asInstanceOf[js.Any])
    
    inline def setRecordingDateUndefined: Self = StObject.set(x, "recordingDate", js.undefined)
  }
}
