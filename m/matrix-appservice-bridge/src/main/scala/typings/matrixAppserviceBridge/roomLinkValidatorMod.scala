package typings.matrixAppserviceBridge

import typings.matrixAppserviceBridge.anon.Conflict
import typings.matrixAppserviceBridge.appServiceBotMod.AppServiceBot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roomLinkValidatorMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/room-link-validator", "RoomLinkValidator")
  @js.native
  class RoomLinkValidator protected () extends StObject {
    /**
      * @param config Config for the validator.
      * @param config.ruleFile Filename for the rule file.
      * @param config.rules Rules if not using a rule file, will be
      *                               overwritten if both is set.
      * @param asBot The AS bot.
      */
    def this(config: typings.matrixAppserviceBridge.anon.Rules, asBot: AppServiceBot) = this()
    
    var asBot: js.Any = js.native
    
    var checkConflictCache: js.Any = js.native
    
    var conflictCache: js.Any = js.native
    
    var evaluateRules: js.Any = js.native
    
    def readRuleFile(): Rules = js.native
    def readRuleFile(filename: String): Rules = js.native
    
    var ruleFile: js.Any = js.native
    
    val rules: Rules = js.native
    
    def validateRoom(roomId: String): js.Promise[RoomLinkValidatorStatus] = js.native
    def validateRoom(roomId: String, cache: Boolean): js.Promise[RoomLinkValidatorStatus] = js.native
  }
  
  @js.native
  sealed trait RoomLinkValidatorStatus extends StObject
  @JSImport("matrix-appservice-bridge/lib/components/room-link-validator", "RoomLinkValidatorStatus")
  @js.native
  object RoomLinkValidatorStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RoomLinkValidatorStatus with Double] = js.native
    
    @js.native
    sealed trait ERROR extends RoomLinkValidatorStatus
    /* 3 */ val ERROR: typings.matrixAppserviceBridge.roomLinkValidatorMod.RoomLinkValidatorStatus.ERROR with Double = js.native
    
    @js.native
    sealed trait ERROR_CACHED extends RoomLinkValidatorStatus
    /* 2 */ val ERROR_CACHED: typings.matrixAppserviceBridge.roomLinkValidatorMod.RoomLinkValidatorStatus.ERROR_CACHED with Double = js.native
    
    @js.native
    sealed trait ERROR_USER_CONFLICT extends RoomLinkValidatorStatus
    /* 1 */ val ERROR_USER_CONFLICT: typings.matrixAppserviceBridge.roomLinkValidatorMod.RoomLinkValidatorStatus.ERROR_USER_CONFLICT with Double = js.native
    
    @js.native
    sealed trait PASSED extends RoomLinkValidatorStatus
    /* 0 */ val PASSED: typings.matrixAppserviceBridge.roomLinkValidatorMod.RoomLinkValidatorStatus.PASSED with Double = js.native
  }
  
  @js.native
  trait Rules extends StObject {
    
    var userIds: Conflict = js.native
  }
  object Rules {
    
    @scala.inline
    def apply(userIds: Conflict): Rules = {
      val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rules]
    }
    
    @scala.inline
    implicit class RulesMutableBuilder[Self <: Rules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserIds(value: Conflict): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    }
  }
}
