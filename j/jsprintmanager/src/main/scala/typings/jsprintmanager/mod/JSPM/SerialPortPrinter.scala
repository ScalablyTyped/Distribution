package typings.jsprintmanager.mod.JSPM

import typings.jsprintmanager.mod.JSPM.Serial.Handshake
import typings.jsprintmanager.mod.JSPM.Serial.Parity
import typings.jsprintmanager.mod.JSPM.Serial.StopBits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.SerialPortPrinter")
@js.native
open class SerialPortPrinter protected ()
  extends StObject
     with IClientPrinter {
  def this(
    portName: String,
    baudRate: Double,
    parity: Parity,
    stopBits: StopBits,
    dataBits: Double,
    flowControl: Handshake
  ) = this()
  
  /* CompleteClass */
  var Id: Any = js.native
  @JSName("Id")
  var Id_SerialPortPrinter: String = js.native
  
  /* private */ var _serialPortBaudRate: Any = js.native
  
  /* private */ var _serialPortDataBits: Any = js.native
  
  /* private */ var _serialPortFlowControl: Any = js.native
  
  /* private */ var _serialPortName: Any = js.native
  
  /* private */ var _serialPortParity: Any = js.native
  
  /* private */ var _serialPortStopBits: Any = js.native
  
  var baudRate: Double = js.native
  
  var dataBits: Double = js.native
  
  var flowControl: Handshake = js.native
  
  var parity: Parity = js.native
  
  var portName: String = js.native
  
  /* CompleteClass */
  override def serialize(): Any = js.native
  
  var stopBits: StopBits = js.native
}
