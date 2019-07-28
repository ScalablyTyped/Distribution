package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wsMod {
  type CloseEventHandler = js.Function1[/* code */ Double, Unit]
  type ErrorEventHandler = js.Function1[/* error */ WebSocketError, Unit]
  type EventHandler[ET /* <: EventType */] = PongEventHandler | PingEventHandler | OpenEventHandler | MessageEventHandler | ErrorEventHandler | CloseEventHandler
  type Executor = js.Function1[/* socket */ Socket, Unit]
  type MessageEventHandler = js.Function1[/* message */ String, Unit]
  type OpenEventHandler = js.Function0[Unit]
  type PingEventHandler = js.Function0[Unit]
  type PongEventHandler = js.Function0[Unit]
  type TimerHandler = js.Function0[Unit]
}
