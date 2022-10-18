package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsSpaceChildEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/SpaceChildEvent", "SpaceChildEvent")
  @js.native
  open class SpaceChildEvent protected () extends StateEvent[SpaceChildEventContent] {
    def this(event: Any) = this()
    
    /**
      * The room ID of the space or room this child represents.
      */
    def entityRoomId: String = js.native
    
    /**
      * Whether or not this child is "active" or valid. Inactive children are
      * not considered part of a space.
      */
    def isActiveChild: Boolean = js.native
    
    /**
      * An optional short string to differentiate the rendering order of entities.
      * @see validateSpaceOrderString
      */
    def order: String = js.native
    
    /**
      * Whether or not the child is a suggested entity for users to join.
      */
    def suggested: Boolean = js.native
    
    /**
      * The servers the client should provide to the homeserver when trying to
      * join the entity (room). May be empty or falsey to denote the child is
      * inactive.
      */
    def viaServers: js.Array[String] = js.native
  }
  
  trait SpaceChildEventContent extends StObject {
    
    /**
      * A short string to differentiate the rendering order of entities.
      * @see validateSpaceOrderString
      */
    var order: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not the entity is intended to be a suggested entity.
      */
    var suggested: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The servers the client should provide to the server when trying to join the room.
      * When not provided or empty, the child is considered not part of the space.
      */
    var via: js.Array[String]
  }
  object SpaceChildEventContent {
    
    inline def apply(via: js.Array[String]): SpaceChildEventContent = {
      val __obj = js.Dynamic.literal(via = via.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceChildEventContent]
    }
    
    extension [Self <: SpaceChildEventContent](x: Self) {
      
      inline def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setSuggested(value: Boolean): Self = StObject.set(x, "suggested", value.asInstanceOf[js.Any])
      
      inline def setSuggestedUndefined: Self = StObject.set(x, "suggested", js.undefined)
      
      inline def setVia(value: js.Array[String]): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      inline def setViaVarargs(value: String*): Self = StObject.set(x, "via", js.Array(value*))
    }
  }
}
