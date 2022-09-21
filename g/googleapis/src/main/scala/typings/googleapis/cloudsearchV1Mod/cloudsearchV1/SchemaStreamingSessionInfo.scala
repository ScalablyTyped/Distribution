package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStreamingSessionInfo extends StObject {
  
  /**
    * The application type of the current streaming session.
    */
  var applicationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The latest streaming session event. This can be used by clients to help explain what is going on, why recording stopped, etc. This will always be set to a valid event and consistent with the status. It can be set when current session is inactive to indicate latest event that makes current session to become inactive.
    */
  var latestSessionEvent: js.UndefOr[SchemaSessionEvent] = js.undefined
  
  /**
    * The display name of the owner of the recording output. It's only set when there will be uploaded recordings. Currently, it's only set when application type is RECORDING or GLIVE_STREAM.
    */
  var ownerDisplayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is the REST name and unique identifier of this streaming session and has the form `spaces//recordings/` This is returned whenever status is either `STARTING` or `STARTED`.
    */
  var sessionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current status of this streaming session. This can be used by clients to show session status indicator and/or notification.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When true, this recording may be used for training new transcription models.
    */
  var trainingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The policy that controls who can view the broadcast. This setting applies for broadcast session.
    */
  var viewerAccessPolicy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains information about viewers of the livestream. It is only set when application type is BROADCAST.
    */
  var viewerStats: js.UndefOr[SchemaStreamViewerStats] = js.undefined
}
object SchemaStreamingSessionInfo {
  
  inline def apply(): SchemaStreamingSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingSessionInfo]
  }
  
  extension [Self <: SchemaStreamingSessionInfo](x: Self) {
    
    inline def setApplicationType(value: String): Self = StObject.set(x, "applicationType", value.asInstanceOf[js.Any])
    
    inline def setApplicationTypeNull: Self = StObject.set(x, "applicationType", null)
    
    inline def setApplicationTypeUndefined: Self = StObject.set(x, "applicationType", js.undefined)
    
    inline def setLatestSessionEvent(value: SchemaSessionEvent): Self = StObject.set(x, "latestSessionEvent", value.asInstanceOf[js.Any])
    
    inline def setLatestSessionEventUndefined: Self = StObject.set(x, "latestSessionEvent", js.undefined)
    
    inline def setOwnerDisplayName(value: String): Self = StObject.set(x, "ownerDisplayName", value.asInstanceOf[js.Any])
    
    inline def setOwnerDisplayNameNull: Self = StObject.set(x, "ownerDisplayName", null)
    
    inline def setOwnerDisplayNameUndefined: Self = StObject.set(x, "ownerDisplayName", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdNull: Self = StObject.set(x, "sessionId", null)
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTrainingEnabled(value: Boolean): Self = StObject.set(x, "trainingEnabled", value.asInstanceOf[js.Any])
    
    inline def setTrainingEnabledNull: Self = StObject.set(x, "trainingEnabled", null)
    
    inline def setTrainingEnabledUndefined: Self = StObject.set(x, "trainingEnabled", js.undefined)
    
    inline def setViewerAccessPolicy(value: String): Self = StObject.set(x, "viewerAccessPolicy", value.asInstanceOf[js.Any])
    
    inline def setViewerAccessPolicyNull: Self = StObject.set(x, "viewerAccessPolicy", null)
    
    inline def setViewerAccessPolicyUndefined: Self = StObject.set(x, "viewerAccessPolicy", js.undefined)
    
    inline def setViewerStats(value: SchemaStreamViewerStats): Self = StObject.set(x, "viewerStats", value.asInstanceOf[js.Any])
    
    inline def setViewerStatsUndefined: Self = StObject.set(x, "viewerStats", js.undefined)
  }
}
