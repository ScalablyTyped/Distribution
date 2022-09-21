package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSettings extends StObject {
  
  /**
    * The access lock of the meeting space that lets owner control who can join the meeting. True if the access lock feature is enabled for the meeting space.
    */
  var accessLock: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether attendance report is enabled for the meeting space.
    */
  var attendanceReportEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The chat lock of the meeting space that lets owner control whether the participants can send chat messages. True if the chat lock feature is enabled for the meeting space.
    */
  var chatLock: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether meeting artifacts will be shared with co-hosts.
    */
  var cohostArtifactSharingEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether Client-side Encryption is enabled for the meeting space.
    */
  var cseEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether the default role is viewer or not.
    */
  var defaultAsViewer: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the meeting space is moderated. go/meet-multimod-dd
    */
  var moderationEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The present lock of the meeting space that lets owner control whether the participants can present their screen. True if the present lock feature is enabled for the meeting space.
    */
  var presentLock: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The reactions lock of the meeting space that lets owner control whether the participants can send reactions. True if the reactions lock feature is enabled for the meeting space.
    */
  var reactionsLock: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSettings {
  
  inline def apply(): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettings]
  }
  
  extension [Self <: SchemaSettings](x: Self) {
    
    inline def setAccessLock(value: Boolean): Self = StObject.set(x, "accessLock", value.asInstanceOf[js.Any])
    
    inline def setAccessLockNull: Self = StObject.set(x, "accessLock", null)
    
    inline def setAccessLockUndefined: Self = StObject.set(x, "accessLock", js.undefined)
    
    inline def setAttendanceReportEnabled(value: Boolean): Self = StObject.set(x, "attendanceReportEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttendanceReportEnabledNull: Self = StObject.set(x, "attendanceReportEnabled", null)
    
    inline def setAttendanceReportEnabledUndefined: Self = StObject.set(x, "attendanceReportEnabled", js.undefined)
    
    inline def setChatLock(value: Boolean): Self = StObject.set(x, "chatLock", value.asInstanceOf[js.Any])
    
    inline def setChatLockNull: Self = StObject.set(x, "chatLock", null)
    
    inline def setChatLockUndefined: Self = StObject.set(x, "chatLock", js.undefined)
    
    inline def setCohostArtifactSharingEnabled(value: Boolean): Self = StObject.set(x, "cohostArtifactSharingEnabled", value.asInstanceOf[js.Any])
    
    inline def setCohostArtifactSharingEnabledNull: Self = StObject.set(x, "cohostArtifactSharingEnabled", null)
    
    inline def setCohostArtifactSharingEnabledUndefined: Self = StObject.set(x, "cohostArtifactSharingEnabled", js.undefined)
    
    inline def setCseEnabled(value: Boolean): Self = StObject.set(x, "cseEnabled", value.asInstanceOf[js.Any])
    
    inline def setCseEnabledNull: Self = StObject.set(x, "cseEnabled", null)
    
    inline def setCseEnabledUndefined: Self = StObject.set(x, "cseEnabled", js.undefined)
    
    inline def setDefaultAsViewer(value: Boolean): Self = StObject.set(x, "defaultAsViewer", value.asInstanceOf[js.Any])
    
    inline def setDefaultAsViewerNull: Self = StObject.set(x, "defaultAsViewer", null)
    
    inline def setDefaultAsViewerUndefined: Self = StObject.set(x, "defaultAsViewer", js.undefined)
    
    inline def setModerationEnabled(value: Boolean): Self = StObject.set(x, "moderationEnabled", value.asInstanceOf[js.Any])
    
    inline def setModerationEnabledNull: Self = StObject.set(x, "moderationEnabled", null)
    
    inline def setModerationEnabledUndefined: Self = StObject.set(x, "moderationEnabled", js.undefined)
    
    inline def setPresentLock(value: Boolean): Self = StObject.set(x, "presentLock", value.asInstanceOf[js.Any])
    
    inline def setPresentLockNull: Self = StObject.set(x, "presentLock", null)
    
    inline def setPresentLockUndefined: Self = StObject.set(x, "presentLock", js.undefined)
    
    inline def setReactionsLock(value: Boolean): Self = StObject.set(x, "reactionsLock", value.asInstanceOf[js.Any])
    
    inline def setReactionsLockNull: Self = StObject.set(x, "reactionsLock", null)
    
    inline def setReactionsLockUndefined: Self = StObject.set(x, "reactionsLock", js.undefined)
  }
}
