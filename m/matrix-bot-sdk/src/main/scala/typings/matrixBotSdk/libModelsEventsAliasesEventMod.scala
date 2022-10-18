package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsAliasesEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/AliasesEvent", "AliasesEvent")
  @js.native
  open class AliasesEvent protected () extends StateEvent[AliasesEventContent] {
    def this(event: Any) = this()
    
    /**
      * The aliases the domain has published to the room.
      */
    def aliases: js.Array[String] = js.native
    
    /**
      * The domain the aliases belong to.
      */
    def forDomain: String = js.native
  }
  
  trait AliasesEventContent extends StObject {
    
    /**
      * The aliases this domain has published to the room.
      */
    var aliases: js.Array[String]
  }
  object AliasesEventContent {
    
    inline def apply(aliases: js.Array[String]): AliasesEventContent = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasesEventContent]
    }
    
    extension [Self <: AliasesEventContent](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
    }
  }
}
