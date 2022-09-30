package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object powerLevelActionMod {
  
  @js.native
  sealed trait PowerLevelAction extends StObject
  @JSImport("matrix-bot-sdk/lib/models/PowerLevelAction", "PowerLevelAction")
  @js.native
  object PowerLevelAction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PowerLevelAction & String] = js.native
    
    /**
      * Power level required to ban other users.
      */
    @js.native
    sealed trait Ban
      extends StObject
         with PowerLevelAction
    /* "ban" */ val Ban: typings.matrixBotSdk.powerLevelActionMod.PowerLevelAction.Ban & String = js.native
    
    /**
      * Power level required to invite other users.
      */
    @js.native
    sealed trait Invite
      extends StObject
         with PowerLevelAction
    /* "invite" */ val Invite: typings.matrixBotSdk.powerLevelActionMod.PowerLevelAction.Invite & String = js.native
    
    /**
      * Power level required to kick other users.
      */
    @js.native
    sealed trait Kick
      extends StObject
         with PowerLevelAction
    /* "kick" */ val Kick: typings.matrixBotSdk.powerLevelActionMod.PowerLevelAction.Kick & String = js.native
    
    /**
      * Power level required to notify the whole room with "@room".
      */
    @js.native
    sealed trait NotifyRoom
      extends StObject
         with PowerLevelAction
    /* "notifications.room" */ val NotifyRoom: typings.matrixBotSdk.powerLevelActionMod.PowerLevelAction.NotifyRoom & String = js.native
    
    /**
      * Power level required to redact events sent by other users. Users can redact
      * their own messages regardless of this power level requirement, unless forbidden
      * by the `events` section of the power levels content.
      */
    @js.native
    sealed trait RedactEvents
      extends StObject
         with PowerLevelAction
    /* "redact" */ val RedactEvents: typings.matrixBotSdk.powerLevelActionMod.PowerLevelAction.RedactEvents & String = js.native
  }
}
