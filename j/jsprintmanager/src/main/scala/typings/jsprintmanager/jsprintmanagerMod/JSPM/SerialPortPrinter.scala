package typings.jsprintmanager.jsprintmanagerMod.JSPM

import typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Handshake
import typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.Parity
import typings.jsprintmanager.jsprintmanagerMod.JSPM.Serial.StopBits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.SerialPortPrinter")
@js.native
class SerialPortPrinter protected () extends IClientPrinter {
  def this(
    portName: String,
    baudRate: Double,
    parity: Parity,
    stopBits: StopBits,
    dataBits: Double,
    flowControl: Handshake
  ) = this()
  /* CompleteClass */
  override var Id: js.Any = js.native
  @JSName("Id")
  var Id_SerialPortPrinter: String = js.native
  var _serialPortBaudRate: js.Any = js.native
  var _serialPortDataBits: js.Any = js.native
  var _serialPortFlowControl: js.Any = js.native
  var _serialPortName: js.Any = js.native
  var _serialPortParity: js.Any = js.native
  var _serialPortStopBits: js.Any = js.native
  var baudRate: Double = js.native
  var dataBits: Double = js.native
  var flowControl: Handshake = js.native
  var parity: Parity = js.native
  var portName: String = js.native
  var stopBits: StopBits = js.native
  /* CompleteClass */
  override def serialize(): js.Any = js.native
}

