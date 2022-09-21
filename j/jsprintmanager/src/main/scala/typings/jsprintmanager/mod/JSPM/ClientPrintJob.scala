package typings.jsprintmanager.mod.JSPM

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsprintmanager", "JSPM.ClientPrintJob")
@js.native
open class ClientPrintJob () extends StObject {
  
  /* private */ var _binaryPrinterCommands: Any = js.native
  
  /* private */ var _clientPrinter: Any = js.native
  
  def _genPCArrayAsync(printerCommands: String, binPrinterCommands: js.typedarray.Uint8Array, printerCopies: Double): js.Promise[Blob] = js.native
  
  def _genPFGArrayAsync(printFileGroup: js.Array[PrintFile]): js.Promise[Blob] = js.native
  
  def _genPrinterArrayAsync(clientPrinter: IClientPrinter): js.Promise[js.typedarray.Uint8Array] = js.native
  
  def _generateDataAsync(): js.Promise[Blob] = js.native
  
  def _intToByteArray(number: Double): js.typedarray.Uint8Array = js.native
  
  /* private */ var _printFileGroup: Any = js.native
  
  /* private */ var _printerCommands: Any = js.native
  
  /* private */ var _printerCommandsCopies: Any = js.native
  
  def _str2UTF8Array(str: String): js.Array[Double] = js.native
  
  var binaryPrinterCommands: js.typedarray.Uint8Array = js.native
  
  var clientPrinter: IClientPrinter = js.native
  
  val files: js.Array[PrintFile] = js.native
  
  var printerCommands: String = js.native
  
  var printerCommandsCopies: Double = js.native
  
  def sendToClient(): js.Promise[js.Object] = js.native
}
