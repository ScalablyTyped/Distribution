package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wsMod {
  type CloseEventHandler = js.Function1[/* code */ scala.Double, scala.Unit]
  type ErrorEventHandler = js.Function1[/* error */ typings.k6.wsMod.WebSocketError, scala.Unit]
  type EventHandler[ET /* <: typings.k6.wsMod.EventType */] = typings.k6.wsMod.PongEventHandler | typings.k6.wsMod.PingEventHandler | typings.k6.wsMod.OpenEventHandler | typings.k6.wsMod.MessageEventHandler | typings.k6.wsMod.ErrorEventHandler | typings.k6.wsMod.CloseEventHandler
  type Executor = js.Function1[/* socket */ typings.k6.wsMod.Socket, scala.Unit]
  type MessageEventHandler = js.Function1[/* message */ java.lang.String, scala.Unit]
  type OpenEventHandler = js.Function0[scala.Unit]
  type PingEventHandler = js.Function0[scala.Unit]
  type PongEventHandler = js.Function0[scala.Unit]
  type TimerHandler = js.Function0[scala.Unit]
}
