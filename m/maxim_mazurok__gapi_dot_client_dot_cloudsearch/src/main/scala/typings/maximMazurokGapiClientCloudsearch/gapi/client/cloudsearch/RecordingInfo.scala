package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingInfo extends StObject {
  
  /**
    * The latest recording event. This can be used by clients to help explain what is going on, why recording stopped, etc. This will always be set if there is or was an active recording,
    * which means there can be latest event when recording is INACTIVE.
    */
  var latestRecordingEvent: js.UndefOr[RecordingEvent] = js.undefined
  
  /** The display name of the owner of the recording output. Email notifications about uploaded recordings will also be sent to this owner. */
  var ownerDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The device resource name of the producer device for the currently active recording. Note that, after the producer drops/leaves the conference, this field will be cleaned up by the
    * server after a delay.
    */
  var producerDeviceId: js.UndefOr[String] = js.undefined
  
  /** The application type of the current active recording. `RECORDING_APPLICATION_TYPE_UNSPECIFIED` if `recording_status` is inactive. */
  var recordingApplicationType: js.UndefOr[String] = js.undefined
  
  /** An identifier for the current recording, if any. This is returned whenever recording_status is either `RECORDING_STARTING` or `RECORDING_STARTED`. */
  var recordingId: js.UndefOr[String] = js.undefined
  
  /** The current status of the recording. This can be used by clients to show a recording dot or similar to indicated to the user that a recording is taking place. */
  var recordingStatus: js.UndefOr[String] = js.undefined
}
object RecordingInfo {
  
  inline def apply(): RecordingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecordingInfo]
  }
  
  extension [Self <: RecordingInfo](x: Self) {
    
    inline def setLatestRecordingEvent(value: RecordingEvent): Self = StObject.set(x, "latestRecordingEvent", value.asInstanceOf[js.Any])
    
    inline def setLatestRecordingEventUndefined: Self = StObject.set(x, "latestRecordingEvent", js.undefined)
    
    inline def setOwnerDisplayName(value: String): Self = StObject.set(x, "ownerDisplayName", value.asInstanceOf[js.Any])
    
    inline def setOwnerDisplayNameUndefined: Self = StObject.set(x, "ownerDisplayName", js.undefined)
    
    inline def setProducerDeviceId(value: String): Self = StObject.set(x, "producerDeviceId", value.asInstanceOf[js.Any])
    
    inline def setProducerDeviceIdUndefined: Self = StObject.set(x, "producerDeviceId", js.undefined)
    
    inline def setRecordingApplicationType(value: String): Self = StObject.set(x, "recordingApplicationType", value.asInstanceOf[js.Any])
    
    inline def setRecordingApplicationTypeUndefined: Self = StObject.set(x, "recordingApplicationType", js.undefined)
    
    inline def setRecordingId(value: String): Self = StObject.set(x, "recordingId", value.asInstanceOf[js.Any])
    
    inline def setRecordingIdUndefined: Self = StObject.set(x, "recordingId", js.undefined)
    
    inline def setRecordingStatus(value: String): Self = StObject.set(x, "recordingStatus", value.asInstanceOf[js.Any])
    
    inline def setRecordingStatusUndefined: Self = StObject.set(x, "recordingStatus", js.undefined)
  }
}
