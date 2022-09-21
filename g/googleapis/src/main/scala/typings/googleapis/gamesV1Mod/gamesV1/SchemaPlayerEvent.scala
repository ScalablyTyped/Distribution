package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlayerEvent extends StObject {
  
  /**
    * The ID of the event definition.
    */
  var definitionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current number of times this event has occurred, as a string. The formatting of this string depends on the configuration of your event in the Play Games Developer Console.
    */
  var formattedNumEvents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#playerEvent`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current number of times this event has occurred.
    */
  var numEvents: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the player.
    */
  var playerId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPlayerEvent {
  
  inline def apply(): SchemaPlayerEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerEvent]
  }
  
  extension [Self <: SchemaPlayerEvent](x: Self) {
    
    inline def setDefinitionId(value: String): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setDefinitionIdNull: Self = StObject.set(x, "definitionId", null)
    
    inline def setDefinitionIdUndefined: Self = StObject.set(x, "definitionId", js.undefined)
    
    inline def setFormattedNumEvents(value: String): Self = StObject.set(x, "formattedNumEvents", value.asInstanceOf[js.Any])
    
    inline def setFormattedNumEventsNull: Self = StObject.set(x, "formattedNumEvents", null)
    
    inline def setFormattedNumEventsUndefined: Self = StObject.set(x, "formattedNumEvents", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNumEvents(value: String): Self = StObject.set(x, "numEvents", value.asInstanceOf[js.Any])
    
    inline def setNumEventsNull: Self = StObject.set(x, "numEvents", null)
    
    inline def setNumEventsUndefined: Self = StObject.set(x, "numEvents", js.undefined)
    
    inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdNull: Self = StObject.set(x, "playerId", null)
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}
