package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRecordingInfo extends StObject {
  
  /**
    * The latest recording event. This can be used by clients to help explain what is going on, why recording stopped, etc. This will always be set if there is or was an active recording, which means there can be latest event when recording is INACTIVE.
    */
  var latestRecordingEvent: js.UndefOr[SchemaRecordingEvent] = js.undefined
  
  /**
    * The display name of the owner of the recording output. Email notifications about uploaded recordings will also be sent to this owner.
    */
  var ownerDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The device resource name of the producer device for the currently active recording. Note that, after the producer drops/leaves the conference, this field will be cleaned up by the server after a delay.
    */
  var producerDeviceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The application type of the current active recording. `RECORDING_APPLICATION_TYPE_UNSPECIFIED` if `recording_status` is inactive.
    */
  var recordingApplicationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An identifier for the current recording, if any. This is returned whenever recording_status is either `RECORDING_STARTING` or `RECORDING_STARTED`.
    */
  var recordingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current status of the recording. This can be used by clients to show a recording dot or similar to indicated to the user that a recording is taking place.
    */
  var recordingStatus: js.UndefOr[String | Null] = js.undefined
}
object SchemaRecordingInfo {
  
  inline def apply(): SchemaRecordingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecordingInfo]
  }
  
  extension [Self <: SchemaRecordingInfo](x: Self) {
    
    inline def setLatestRecordingEvent(value: SchemaRecordingEvent): Self = StObject.set(x, "latestRecordingEvent", value.asInstanceOf[js.Any])
    
    inline def setLatestRecordingEventUndefined: Self = StObject.set(x, "latestRecordingEvent", js.undefined)
    
    inline def setOwnerDisplayName(value: String): Self = StObject.set(x, "ownerDisplayName", value.asInstanceOf[js.Any])
    
    inline def setOwnerDisplayNameNull: Self = StObject.set(x, "ownerDisplayName", null)
    
    inline def setOwnerDisplayNameUndefined: Self = StObject.set(x, "ownerDisplayName", js.undefined)
    
    inline def setProducerDeviceId(value: String): Self = StObject.set(x, "producerDeviceId", value.asInstanceOf[js.Any])
    
    inline def setProducerDeviceIdNull: Self = StObject.set(x, "producerDeviceId", null)
    
    inline def setProducerDeviceIdUndefined: Self = StObject.set(x, "producerDeviceId", js.undefined)
    
    inline def setRecordingApplicationType(value: String): Self = StObject.set(x, "recordingApplicationType", value.asInstanceOf[js.Any])
    
    inline def setRecordingApplicationTypeNull: Self = StObject.set(x, "recordingApplicationType", null)
    
    inline def setRecordingApplicationTypeUndefined: Self = StObject.set(x, "recordingApplicationType", js.undefined)
    
    inline def setRecordingId(value: String): Self = StObject.set(x, "recordingId", value.asInstanceOf[js.Any])
    
    inline def setRecordingIdNull: Self = StObject.set(x, "recordingId", null)
    
    inline def setRecordingIdUndefined: Self = StObject.set(x, "recordingId", js.undefined)
    
    inline def setRecordingStatus(value: String): Self = StObject.set(x, "recordingStatus", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusNull: Self = StObject.set(x, "recordingStatus", null)
    
    inline def setRecordingStatusUndefined: Self = StObject.set(x, "recordingStatus", js.undefined)
  }
}
