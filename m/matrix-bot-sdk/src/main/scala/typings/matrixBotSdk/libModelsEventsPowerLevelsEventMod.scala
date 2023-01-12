package typings.matrixBotSdk

import org.scalablytyped.runtime.StringDictionary
import typings.matrixBotSdk.anon.Room
import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsPowerLevelsEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/PowerLevelsEvent", "PowerLevelsEvent")
  @js.native
  open class PowerLevelsEvent protected () extends StateEvent[PowerLevelsEventContent] {
    def this(event: Any) = this()
    
    /**
      * The power level required to ban users.
      */
    def banLevel: Double = js.native
    
    /**
      * The default power level required to send room events.
      */
    def defaultEventLevel: Double = js.native
    
    /**
      * The default power level required to send state events.
      */
    def defaultStateEventLevel: Double = js.native
    
    /**
      * The default power level for users.
      */
    def defaultUserLevel: Double = js.native
    
    /**
      * The power level required to invite users.
      */
    def inviteLevel: Double = js.native
    
    /**
      * The power level required to kick users.
      */
    def kickLevel: Double = js.native
    
    /**
      * The power level required to send "@room" notifications.
      */
    def notifyWholeRoomLevel: Double = js.native
    
    /**
      * The power level required to redact messages sent by other users.
      */
    def redactLevel: Double = js.native
  }
  
  trait PowerLevelsEventContent extends StObject {
    
    /**
      * The power level required to ban. Default 50.
      */
    var ban: js.UndefOr[Double] = js.undefined
    
    /**
      * A map of event types to the power level required to send them.
      */
    var events: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    /**
      * The power level required to send events in the room. Default 50.
      */
    var events_default: js.UndefOr[Double] = js.undefined
    
    /**
      * The power level required to invite users to the room. Default 50.
      */
    var invite: js.UndefOr[Double] = js.undefined
    
    /**
      * The power level required to kick users from the room. Default 50.
      */
    var kick: js.UndefOr[Double] = js.undefined
    
    /**
      * Power levels required to send certain kinds of notifications.
      */
    var notifications: js.UndefOr[Room] = js.undefined
    
    /**
      * The power level required to redact other people's events in the room. Default 50.
      */
    var redact: js.UndefOr[Double] = js.undefined
    
    /**
      * The power level required to send state events in the room. Default 50.
      */
    var state_default: js.UndefOr[Double] = js.undefined
    
    /**
      * A map of user IDs to power levels.
      */
    var users: js.UndefOr[StringDictionary[Double]] = js.undefined
    
    /**
      * The power level of users not listed in `users`. Default 0.
      */
    var users_default: js.UndefOr[Double] = js.undefined
  }
  object PowerLevelsEventContent {
    
    inline def apply(): PowerLevelsEventContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PowerLevelsEventContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PowerLevelsEventContent] (val x: Self) extends AnyVal {
      
      inline def setBan(value: Double): Self = StObject.set(x, "ban", value.asInstanceOf[js.Any])
      
      inline def setBanUndefined: Self = StObject.set(x, "ban", js.undefined)
      
      inline def setEvents(value: StringDictionary[Double]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEvents_default(value: Double): Self = StObject.set(x, "events_default", value.asInstanceOf[js.Any])
      
      inline def setEvents_defaultUndefined: Self = StObject.set(x, "events_default", js.undefined)
      
      inline def setInvite(value: Double): Self = StObject.set(x, "invite", value.asInstanceOf[js.Any])
      
      inline def setInviteUndefined: Self = StObject.set(x, "invite", js.undefined)
      
      inline def setKick(value: Double): Self = StObject.set(x, "kick", value.asInstanceOf[js.Any])
      
      inline def setKickUndefined: Self = StObject.set(x, "kick", js.undefined)
      
      inline def setNotifications(value: Room): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      inline def setRedact(value: Double): Self = StObject.set(x, "redact", value.asInstanceOf[js.Any])
      
      inline def setRedactUndefined: Self = StObject.set(x, "redact", js.undefined)
      
      inline def setState_default(value: Double): Self = StObject.set(x, "state_default", value.asInstanceOf[js.Any])
      
      inline def setState_defaultUndefined: Self = StObject.set(x, "state_default", js.undefined)
      
      inline def setUsers(value: StringDictionary[Double]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
      
      inline def setUsers_default(value: Double): Self = StObject.set(x, "users_default", value.asInstanceOf[js.Any])
      
      inline def setUsers_defaultUndefined: Self = StObject.set(x, "users_default", js.undefined)
    }
  }
}
