package typings.atLedgerhqHwDashTransport.atLedgerhqHwDashTransportMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport[TDescriptor /* <: Descriptor */] extends js.Object {
  def close(): js.Promise[Unit] = js.native
  def exchange(apdu: Buffer): js.Promise[Buffer] = js.native
  def off(eventName: String, cb: js.Any): Unit = js.native
  def on(eventName: String, cb: js.Any): Unit = js.native
  def send(cla: Double, ins: Double, p1: Double, p2: Double, data: Buffer, statusList: js.Array[Double]): js.Promise[Buffer] = js.native
  def setDebugMode(debug: js.Function1[/* log */ String, Unit]): Unit = js.native
  def setDebugMode(debug: Boolean): Unit = js.native
  def setExchangeTimeout(exchangeTimeout: Double): Unit = js.native
  def setScrambleKey(key: String): Unit = js.native
}

