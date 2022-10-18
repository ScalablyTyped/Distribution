package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsPresenceEventMod.PresenceEventContent
import typings.matrixBotSdk.libModelsEventsPresenceEventMod.PresenceState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsPresenceMod {
  
  @JSImport("matrix-bot-sdk/lib/models/Presence", "Presence")
  @js.native
  open class Presence protected () extends StObject {
    def this(presence: PresenceEventContent) = this()
    
    /**
      * Whether or not the user is currently active.
      */
    def currentlyActive: Boolean = js.native
    
    /**
      * How long ago in milliseconds this presence was changed. May be falsey.
      */
    def lastActiveAgo: Double = js.native
    
    /* protected */ var presence: PresenceEventContent = js.native
    
    /**
      * The state for this presence update.
      */
    def state: PresenceState = js.native
    
    /**
      * The status message which accompanies this presence. May be falsey.
      */
    def statusMessage: String = js.native
  }
}
