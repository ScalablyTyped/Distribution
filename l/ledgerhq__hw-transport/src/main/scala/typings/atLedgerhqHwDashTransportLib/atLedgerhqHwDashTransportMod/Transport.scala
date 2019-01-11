package typings
package atLedgerhqHwDashTransportLib.atLedgerhqHwDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transport[TDescriptor /* <: Descriptor */] extends js.Object {
  def close(): js.Promise[scala.Unit] = js.native
  def exchange(apdu: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def off(eventName: java.lang.String, cb: js.Any): scala.Unit = js.native
  def on(eventName: java.lang.String, cb: js.Any): scala.Unit = js.native
  def send(
    cla: scala.Double,
    ins: scala.Double,
    p1: scala.Double,
    p2: scala.Double,
    data: nodeLib.Buffer,
    statusList: js.Array[scala.Double]
  ): js.Promise[nodeLib.Buffer] = js.native
  def setDebugMode(debug: js.Function1[/* log */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def setDebugMode(debug: scala.Boolean): scala.Unit = js.native
  def setExchangeTimeout(exchangeTimeout: scala.Double): scala.Unit = js.native
  def setScrambleKey(key: java.lang.String): scala.Unit = js.native
}

