package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallSettings extends StObject {
  
  /** Indicates whether the access lock is currently on or off. */
  var accessLock: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the attendance report is currently enabled or disabled. */
  var attendanceReportEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the audio lock is currently on or off. */
  var audioLock: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the chat lock is currently on or off. */
  var chatLock: js.UndefOr[Boolean] = js.undefined
  
  /** Whether Client-side Encryption is enabled for this conference. */
  var cseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the current call is moderated. go/meet-multimod-dd */
  var moderationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the present lock is currently on or off. */
  var presentLock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether project Dino is currently on or off. WARNING: This is currently an experimental field. It should not be used without getting an explicit review and approval from
    * the Meet team.
    */
  var projectDinoEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the reactions lock is currently on or off. */
  var reactionsLock: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether the video lock is currently on or off. */
  var videoLock: js.UndefOr[Boolean] = js.undefined
}
object CallSettings {
  
  inline def apply(): CallSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallSettings] (val x: Self) extends AnyVal {
    
    inline def setAccessLock(value: Boolean): Self = StObject.set(x, "accessLock", value.asInstanceOf[js.Any])
    
    inline def setAccessLockUndefined: Self = StObject.set(x, "accessLock", js.undefined)
    
    inline def setAttendanceReportEnabled(value: Boolean): Self = StObject.set(x, "attendanceReportEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttendanceReportEnabledUndefined: Self = StObject.set(x, "attendanceReportEnabled", js.undefined)
    
    inline def setAudioLock(value: Boolean): Self = StObject.set(x, "audioLock", value.asInstanceOf[js.Any])
    
    inline def setAudioLockUndefined: Self = StObject.set(x, "audioLock", js.undefined)
    
    inline def setChatLock(value: Boolean): Self = StObject.set(x, "chatLock", value.asInstanceOf[js.Any])
    
    inline def setChatLockUndefined: Self = StObject.set(x, "chatLock", js.undefined)
    
    inline def setCseEnabled(value: Boolean): Self = StObject.set(x, "cseEnabled", value.asInstanceOf[js.Any])
    
    inline def setCseEnabledUndefined: Self = StObject.set(x, "cseEnabled", js.undefined)
    
    inline def setModerationEnabled(value: Boolean): Self = StObject.set(x, "moderationEnabled", value.asInstanceOf[js.Any])
    
    inline def setModerationEnabledUndefined: Self = StObject.set(x, "moderationEnabled", js.undefined)
    
    inline def setPresentLock(value: Boolean): Self = StObject.set(x, "presentLock", value.asInstanceOf[js.Any])
    
    inline def setPresentLockUndefined: Self = StObject.set(x, "presentLock", js.undefined)
    
    inline def setProjectDinoEnabled(value: Boolean): Self = StObject.set(x, "projectDinoEnabled", value.asInstanceOf[js.Any])
    
    inline def setProjectDinoEnabledUndefined: Self = StObject.set(x, "projectDinoEnabled", js.undefined)
    
    inline def setReactionsLock(value: Boolean): Self = StObject.set(x, "reactionsLock", value.asInstanceOf[js.Any])
    
    inline def setReactionsLockUndefined: Self = StObject.set(x, "reactionsLock", js.undefined)
    
    inline def setVideoLock(value: Boolean): Self = StObject.set(x, "videoLock", value.asInstanceOf[js.Any])
    
    inline def setVideoLockUndefined: Self = StObject.set(x, "videoLock", js.undefined)
  }
}
