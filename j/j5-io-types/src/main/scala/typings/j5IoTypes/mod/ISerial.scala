package typings.j5IoTypes.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISerial extends IPeripheral {
  val baudRate: Double = js.native
  val dataBits: Double = js.native
  val parity: String = js.native
  val port: String = js.native
  val stopBits: Double = js.native
  def close(): Unit = js.native
  def close(cb: SerialErrorCallback): Unit = js.native
  def flush(): Unit = js.native
  def flush(cb: SerialErrorCallback): Unit = js.native
  def open(): Unit = js.native
  def open(cb: SerialCallback): Unit = js.native
  def write(data: String): Unit = js.native
  def write(data: String, cb: SerialCallback): Unit = js.native
  def write(data: Buffer): Unit = js.native
  def write(data: Buffer, cb: SerialCallback): Unit = js.native
}

