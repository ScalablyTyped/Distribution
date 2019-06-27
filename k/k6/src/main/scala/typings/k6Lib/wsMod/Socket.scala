package typings
package k6Lib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/ws", "Socket")
@js.native
abstract class Socket () extends js.Object {
  var __brand: scala.Nothing = js.native
  def close(): scala.Unit = js.native
  def close(code: scala.Double): scala.Unit = js.native
  def on[ET /* <: EventType */](event: ET, handler: EventHandler[ET]): scala.Unit = js.native
  def ping(): scala.Unit = js.native
  def send(data: java.lang.String): scala.Unit = js.native
  def setInterval(handler: TimerHandler, interval: scala.Double): scala.Unit = js.native
  def setTimeout(handler: TimerHandler, delay: scala.Double): scala.Unit = js.native
}

