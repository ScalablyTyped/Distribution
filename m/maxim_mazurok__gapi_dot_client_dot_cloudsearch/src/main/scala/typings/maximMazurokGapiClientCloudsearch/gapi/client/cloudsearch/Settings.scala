package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  /** The access lock of the meeting space that lets owner control who can join the meeting. True if the access lock feature is enabled for the meeting space. */
  var accessLock: js.UndefOr[Boolean] = js.undefined
  
  /** Whether attendance report is enabled for the meeting space. */
  var attendanceReportEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** The chat lock of the meeting space that lets owner control whether the participants can send chat messages. True if the chat lock feature is enabled for the meeting space. */
  var chatLock: js.UndefOr[Boolean] = js.undefined
  
  /** Whether meeting artifacts will be shared with co-hosts. */
  var cohostArtifactSharingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether Client-side Encryption is enabled for the meeting space. */
  var cseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the default role is viewer or not. */
  var defaultAsViewer: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the meeting space is moderated. go/meet-multimod-dd */
  var moderationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** The present lock of the meeting space that lets owner control whether the participants can present their screen. True if the present lock feature is enabled for the meeting space. */
  var presentLock: js.UndefOr[Boolean] = js.undefined
  
  /** The reactions lock of the meeting space that lets owner control whether the participants can send reactions. True if the reactions lock feature is enabled for the meeting space. */
  var reactionsLock: js.UndefOr[Boolean] = js.undefined
}
object Settings {
  
  inline def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    inline def setAccessLock(value: Boolean): Self = StObject.set(x, "accessLock", value.asInstanceOf[js.Any])
    
    inline def setAccessLockUndefined: Self = StObject.set(x, "accessLock", js.undefined)
    
    inline def setAttendanceReportEnabled(value: Boolean): Self = StObject.set(x, "attendanceReportEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttendanceReportEnabledUndefined: Self = StObject.set(x, "attendanceReportEnabled", js.undefined)
    
    inline def setChatLock(value: Boolean): Self = StObject.set(x, "chatLock", value.asInstanceOf[js.Any])
    
    inline def setChatLockUndefined: Self = StObject.set(x, "chatLock", js.undefined)
    
    inline def setCohostArtifactSharingEnabled(value: Boolean): Self = StObject.set(x, "cohostArtifactSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCohostArtifactSharingEnabledUndefined: Self = StObject.set(x, "cohostArtifactSharingEnabled", js.undefined)
    
    inline def setCseEnabled(value: Boolean): Self = StObject.set(x, "cseEnabled", value.asInstanceOf[js.Any])
    
    inline def setCseEnabledUndefined: Self = StObject.set(x, "cseEnabled", js.undefined)
    
    inline def setDefaultAsViewer(value: Boolean): Self = StObject.set(x, "defaultAsViewer", value.asInstanceOf[js.Any])
    
    inline def setDefaultAsViewerUndefined: Self = StObject.set(x, "defaultAsViewer", js.undefined)
    
    inline def setModerationEnabled(value: Boolean): Self = StObject.set(x, "moderationEnabled", value.asInstanceOf[js.Any])
    
    inline def setModerationEnabledUndefined: Self = StObject.set(x, "moderationEnabled", js.undefined)
    
    inline def setPresentLock(value: Boolean): Self = StObject.set(x, "presentLock", value.asInstanceOf[js.Any])
    
    inline def setPresentLockUndefined: Self = StObject.set(x, "presentLock", js.undefined)
    
    inline def setReactionsLock(value: Boolean): Self = StObject.set(x, "reactionsLock", value.asInstanceOf[js.Any])
    
    inline def setReactionsLockUndefined: Self = StObject.set(x, "reactionsLock", js.undefined)
  }
}
