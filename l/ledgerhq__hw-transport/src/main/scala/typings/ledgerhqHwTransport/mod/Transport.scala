package typings.ledgerhqHwTransport.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport[TDescriptor /* <: Descriptor */] extends js.Object {
  
  def close(): js.Promise[Unit] = js.native
  
  def decorateAppAPIMethods(self: js.Any, methods: js.Array[String], scrambleKey: String): Unit = js.native
  
  def exchange(apdu: Buffer): js.Promise[Buffer] = js.native
  
  def off(eventName: String, cb: js.Any): Unit = js.native
  
  def on(eventName: String, cb: js.Any): Unit = js.native
  
  /**
    * A wrapper around exchange to simplify work of the implementation.
    * @param data The data to be sent. Defaults to a zero-length Buffer.
    * @param statusList A list of accepted status code (shorts). [0x9000] by default.
    * @return A Promise of the response Buffer
    */
  def send(cla: Double, ins: Double, p1: Double, p2: Double): js.Promise[Buffer] = js.native
  def send(
    cla: Double,
    ins: Double,
    p1: Double,
    p2: Double,
    data: js.UndefOr[scala.Nothing],
    statusList: js.Array[Double]
  ): js.Promise[Buffer] = js.native
  def send(cla: Double, ins: Double, p1: Double, p2: Double, data: Buffer): js.Promise[Buffer] = js.native
  def send(cla: Double, ins: Double, p1: Double, p2: Double, data: Buffer, statusList: js.Array[Double]): js.Promise[Buffer] = js.native
  
  def setDebugMode(debug: js.Function1[/* log */ String, Unit]): Unit = js.native
  def setDebugMode(debug: Boolean): Unit = js.native
  
  def setExchangeTimeout(exchangeTimeout: Double): Unit = js.native
  
  def setScrambleKey(key: String): Unit = js.native
}
