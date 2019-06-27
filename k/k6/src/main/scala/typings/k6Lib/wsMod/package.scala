package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wsMod {
  type EventHandler[ET /* <: EventType */] = js.Function0[scala.Unit] | (js.Function1[
    (/* code */ scala.Double) | (/* message */ java.lang.String) | (/* error */ WebSocketError), 
    scala.Unit
  ])
  type Executor = js.Function1[/* socket */ Socket, scala.Unit]
  type TimerHandler = js.Function0[scala.Unit]
}
