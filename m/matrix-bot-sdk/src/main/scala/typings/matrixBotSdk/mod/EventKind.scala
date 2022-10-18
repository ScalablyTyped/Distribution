package typings.matrixBotSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "EventKind")
@js.native
object EventKind extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.matrixBotSdk.libModelsEventsEventKindMod.EventKind & String] = js.native
  
  /* "ephemeral" */ val EphemeralEvent: typings.matrixBotSdk.libModelsEventsEventKindMod.EventKind.EphemeralEvent & String = js.native
  
  /* "room" */ val RoomEvent: typings.matrixBotSdk.libModelsEventsEventKindMod.EventKind.RoomEvent & String = js.native
}
