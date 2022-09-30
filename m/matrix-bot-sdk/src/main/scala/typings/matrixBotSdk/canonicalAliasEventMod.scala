package typings.matrixBotSdk

import typings.matrixBotSdk.roomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canonicalAliasEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/CanonicalAliasEvent", "CanonicalAliasEvent")
  @js.native
  open class CanonicalAliasEvent protected () extends StateEvent[CanonicalAliasEventContent] {
    def this(event: Any) = this()
    
    /**
      * The alias the room is considering canonical
      */
    def aliases: String = js.native
  }
  
  trait CanonicalAliasEventContent extends StObject {
    
    /**
      * The canonical alias for the room.
      */
    var alias: String
  }
  object CanonicalAliasEventContent {
    
    inline def apply(alias: String): CanonicalAliasEventContent = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanonicalAliasEventContent]
    }
    
    extension [Self <: CanonicalAliasEventContent](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    }
  }
}
