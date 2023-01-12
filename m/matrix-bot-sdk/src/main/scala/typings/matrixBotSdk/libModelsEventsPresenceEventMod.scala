package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsEventMod.MatrixEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsPresenceEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/PresenceEvent", "PresenceEvent")
  @js.native
  open class PresenceEvent protected () extends MatrixEvent[PresenceEventContent] {
    def this(event: Any) = this()
    
    /**
      * The current presence state for the user.
      */
    def presence: PresenceState = js.native
  }
  
  trait PresenceEventContent extends StObject {
    
    /**
      * The avatar URL for the user, if any.
      */
    var avatar_url: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the user is currently active.
      */
    var currently_active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The display name for the user, if any.
      */
    var displayname: js.UndefOr[String] = js.undefined
    
    /**
      * How long ago the user performed some action, in milliseconds.
      */
    var last_active_ago: js.UndefOr[Double] = js.undefined
    
    /**
      * The user's presence state.
      */
    var presence: PresenceState
    
    /**
      * A status message associated with this presence.
      */
    var status_msg: js.UndefOr[String] = js.undefined
  }
  object PresenceEventContent {
    
    inline def apply(presence: PresenceState): PresenceEventContent = {
      val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresenceEventContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PresenceEventContent] (val x: Self) extends AnyVal {
      
      inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
      
      inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
      
      inline def setCurrently_active(value: Boolean): Self = StObject.set(x, "currently_active", value.asInstanceOf[js.Any])
      
      inline def setCurrently_activeUndefined: Self = StObject.set(x, "currently_active", js.undefined)
      
      inline def setDisplayname(value: String): Self = StObject.set(x, "displayname", value.asInstanceOf[js.Any])
      
      inline def setDisplaynameUndefined: Self = StObject.set(x, "displayname", js.undefined)
      
      inline def setLast_active_ago(value: Double): Self = StObject.set(x, "last_active_ago", value.asInstanceOf[js.Any])
      
      inline def setLast_active_agoUndefined: Self = StObject.set(x, "last_active_ago", js.undefined)
      
      inline def setPresence(value: PresenceState): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
      
      inline def setStatus_msg(value: String): Self = StObject.set(x, "status_msg", value.asInstanceOf[js.Any])
      
      inline def setStatus_msgUndefined: Self = StObject.set(x, "status_msg", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixBotSdk.matrixBotSdkStrings.online
    - typings.matrixBotSdk.matrixBotSdkStrings.offline
    - typings.matrixBotSdk.matrixBotSdkStrings.unavailable
  */
  trait PresenceState extends StObject
  object PresenceState {
    
    inline def offline: typings.matrixBotSdk.matrixBotSdkStrings.offline = "offline".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.offline]
    
    inline def online: typings.matrixBotSdk.matrixBotSdkStrings.online = "online".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.online]
    
    inline def unavailable: typings.matrixBotSdk.matrixBotSdkStrings.unavailable = "unavailable".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.unavailable]
  }
}
