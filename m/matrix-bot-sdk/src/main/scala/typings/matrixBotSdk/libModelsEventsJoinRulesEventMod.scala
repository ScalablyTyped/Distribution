package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsJoinRulesEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/JoinRulesEvent", "JoinRulesEvent")
  @js.native
  open class JoinRulesEvent protected () extends StateEvent[JoinRulesEventContent] {
    def this(event: Any) = this()
    
    /**
      * The join rule for the room.
      */
    def rule: JoinRule = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixBotSdk.matrixBotSdkStrings.public
    - typings.matrixBotSdk.matrixBotSdkStrings.knock
    - typings.matrixBotSdk.matrixBotSdkStrings.invite
    - typings.matrixBotSdk.matrixBotSdkStrings.`private`
  */
  trait JoinRule extends StObject
  object JoinRule {
    
    inline def invite: typings.matrixBotSdk.matrixBotSdkStrings.invite = "invite".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.invite]
    
    inline def knock: typings.matrixBotSdk.matrixBotSdkStrings.knock = "knock".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.knock]
    
    inline def `private`: typings.matrixBotSdk.matrixBotSdkStrings.`private` = "private".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.`private`]
    
    inline def public: typings.matrixBotSdk.matrixBotSdkStrings.public = "public".asInstanceOf[typings.matrixBotSdk.matrixBotSdkStrings.public]
  }
  
  trait JoinRulesEventContent extends StObject {
    
    /**
      * The join rule for the room.
      */
    var join_rule: JoinRule
  }
  object JoinRulesEventContent {
    
    inline def apply(join_rule: JoinRule): JoinRulesEventContent = {
      val __obj = js.Dynamic.literal(join_rule = join_rule.asInstanceOf[js.Any])
      __obj.asInstanceOf[JoinRulesEventContent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JoinRulesEventContent] (val x: Self) extends AnyVal {
      
      inline def setJoin_rule(value: JoinRule): Self = StObject.set(x, "join_rule", value.asInstanceOf[js.Any])
    }
  }
}
