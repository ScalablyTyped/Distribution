package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wsMod {
  type CloseEventHandler = js.Function1[/* code */ scala.Double, scala.Unit]
  type ErrorEventHandler = js.Function1[/* error */ WebSocketError, scala.Unit]
  type EventHandler[ET /* <: EventType */] = PongEventHandler | PingEventHandler | OpenEventHandler | MessageEventHandler | ErrorEventHandler | CloseEventHandler
  type Executor = js.Function1[/* socket */ Socket, scala.Unit]
  type MessageEventHandler = js.Function1[/* message */ java.lang.String, scala.Unit]
  type OpenEventHandler = js.Function0[scala.Unit]
  type PingEventHandler = js.Function0[scala.Unit]
  type PongEventHandler = js.Function0[scala.Unit]
  type TimerHandler = js.Function0[scala.Unit]
}
