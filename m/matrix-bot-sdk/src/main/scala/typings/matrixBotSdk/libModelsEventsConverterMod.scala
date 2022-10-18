package typings.matrixBotSdk

import typings.matrixBotSdk.libModelsEventsRoomEventMod.RoomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsEventsConverterMod {
  
  @JSImport("matrix-bot-sdk/lib/models/events/converter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapRoomEvent(event: Any): RoomEvent[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRoomEvent")(event.asInstanceOf[js.Any]).asInstanceOf[RoomEvent[Any]]
}
