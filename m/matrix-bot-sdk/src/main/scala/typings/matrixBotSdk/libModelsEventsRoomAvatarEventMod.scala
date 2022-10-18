package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsMessageEventMod.DimensionalFileInfo
import typings.matrixBotSdk.libModelsEventsRoomEventMod.StateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsRoomAvatarEventMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/RoomAvatarEvent", "RoomAvatarEvent")
  @js.native
  open class RoomAvatarEvent protected () extends StateEvent[RoomAvatarEventContent] {
    def this(event: Any) = this()
    
    /**
      * The URL for the avatar of the room.
      */
    def avatarUrl: String = js.native
  }
  
  trait RoomAvatarEventContent extends StObject {
    
    /**
      * Optional information about the avatar.
      */
    var info: js.UndefOr[DimensionalFileInfo] = js.undefined
    
    /**
      * The URL to the image for the avatar of the room.
      */
    var url: String
  }
  object RoomAvatarEventContent {
    
    inline def apply(url: String): RoomAvatarEventContent = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoomAvatarEventContent]
    }
    
    extension [Self <: RoomAvatarEventContent](x: Self) {
      
      inline def setInfo(value: DimensionalFileInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
