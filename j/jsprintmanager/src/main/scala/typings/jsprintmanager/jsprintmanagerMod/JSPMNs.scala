package typings.jsprintmanager.jsprintmanagerMod

import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.ClientPrintJob
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.FileSourceType
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.IClientPrinter
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.JSPMWebSocket
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintFile
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintOrientation
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintRotation
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Handshake
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Parity
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.StopBits
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.TextAlignment
import typings.jsprintmanager.jsprintmanagerMod.JSPMNs.WSStatus
import typings.jsprintmanager.jsprintmanagerMod.zipNs.Reader
import typings.std.Blob
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM")
@js.native
object JSPMNs extends js.Object {
  @js.native
  class ClientPrintJob () extends js.Object {
    var _binaryPrinterCommands: js.Any = js.native
    var _clientPrinter: js.Any = js.native
    var _printFileGroup: js.Any = js.native
    var _printerCommands: js.Any = js.native
    var _printerCommandsCopies: js.Any = js.native
    var binaryPrinterCommands: Uint8Array = js.native
    var clientPrinter: IClientPrinter = js.native
    val files: js.Array[PrintFile] = js.native
    var printerCommands: String = js.native
    var printerCommandsCopies: Double = js.native
    def _genPCArrayAsync(printerCommands: String, binPrinterCommands: Uint8Array, printerCopies: Double): js.Promise[Blob] = js.native
    def _genPFGArrayAsync(printFileGroup: js.Array[PrintFile]): js.Promise[Blob] = js.native
    def _genPrinterArrayAsync(clientPrinter: IClientPrinter): js.Promise[Uint8Array] = js.native
    def _generateDataAsync(): js.Promise[Blob] = js.native
    def _intToByteArray(number: Double): Uint8Array = js.native
    def _str2UTF8Array(str: String): js.Array[Double] = js.native
    def sendToClient(): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class ClientPrintJobGroup () extends js.Object {
    var _jobs: js.Array[ClientPrintJob] = js.native
    val jobs: js.Array[ClientPrintJob] = js.native
    /* private */ def _generateDataAsync(): js.Any = js.native
    /* private */ def _generateMiniJob(cj: js.Any): js.Any = js.native
    /* private */ def _intToArray(number: js.Any): js.Any = js.native
    def sendToClient(): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class DefaultPrinter () extends IClientPrinter {
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_DefaultPrinter: String = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  sealed trait FileSourceType extends js.Object
  
  trait IClientPrinter extends js.Object {
    var Id: js.Any
    def serialize(): js.Any
  }
  
  @js.native
  class InstalledPrinter protected () extends IClientPrinter {
    def this(printerName: String) = this()
    def this(printerName: String, printToDefaultIfNotFound: Boolean) = this()
    def this(printerName: String, printToDefaultIfNotFound: Boolean, trayName: String) = this()
    def this(printerName: String, printToDefaultIfNotFound: Boolean, trayName: String, paperName: String) = this()
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_InstalledPrinter: String = js.native
    var _name: js.Any = js.native
    var _paper: js.Any = js.native
    var _printDefault: js.Any = js.native
    var _tray: js.Any = js.native
    var paperName: String = js.native
    var printToDefaultIfNotFound: Boolean = js.native
    var printerName: String = js.native
    var trayName: String = js.native
    /* private */ def bool2str(value: js.Any): js.Any = js.native
    /* private */ def bool2str(value: js.Any, true_val: js.Any): js.Any = js.native
    /* private */ def bool2str(value: js.Any, true_val: js.Any, false_val: js.Any): js.Any = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  class JSPMWebSocket () extends js.Object {
    def this(addr: String) = this()
    def this(addr: String, port: Double) = this()
    def this(addr: String, port: Double, secure: Boolean) = this()
    def this(addr: String, port: Double, secure: Boolean, auto_reconnect: Boolean) = this()
    var _addr: js.Any = js.native
    var _job_list: js.Any = js.native
    var _port: js.Any = js.native
    var _secure: js.Any = js.native
    var _status: js.Any = js.native
    var _ws: js.Any = js.native
    val address: String = js.native
    var autoReconnect: Boolean = js.native
    val isSecure: Boolean = js.native
    val port: Double = js.native
    val status: WSStatus = js.native
    /* private */ def _genID(): js.Any = js.native
    /* private */ def _onClose(e: js.Any, __this: js.Any): js.Any = js.native
    /* private */ def _onError(e: js.Any): js.Any = js.native
    /* private */ def _onMessage(e: js.Any, job_list: js.Any): js.Any = js.native
    /* private */ def _onOpen(e: js.Any, __this: js.Any): js.Any = js.native
    /* private */ def _pingPong(): js.Any = js.native
    /* private */ def _send(data: js.Any, ok: js.Any, err: js.Any): js.Any = js.native
    def onClose(e: js.Any): Unit = js.native
    def onOpen(e: js.Any): Unit = js.native
    def onStatusChanged(): Unit = js.native
    def send(data: js.Any): js.Promise[_] = js.native
    def start(): js.Promise[Unit] = js.native
    def stop(): Unit = js.native
  }
  
  @js.native
  class NetworkPrinter protected () extends IClientPrinter {
    def this(port: Double) = this()
    def this(port: Double, ipAddress: String) = this()
    def this(port: Double, ipAddress: String, dnsName: String) = this()
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_NetworkPrinter: Double = js.native
    var _dnsName: js.Any = js.native
    var _networkIPAddress: js.Any = js.native
    var _networkPort: js.Any = js.native
    var dnsName: String = js.native
    var ipAddress: String = js.native
    var port: Double = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  class ParallelPortPrinter protected () extends IClientPrinter {
    def this(portName: String) = this()
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_ParallelPortPrinter: String = js.native
    var _parallelPortName: js.Any = js.native
    var portName: String = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  class PrintFile protected () extends js.Object {
    def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String) = this()
    def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String, copies: Double) = this()
    var _copies: js.Any = js.native
    var copies: Double = js.native
    var fileContent: js.Any = js.native
    var fileContentType: FileSourceType = js.native
    var fileName: String = js.native
    /* protected */ def bool2str(value: js.Any): String = js.native
    /* protected */ def bool2str(value: js.Any, true_val: String): String = js.native
    /* protected */ def bool2str(value: js.Any, true_val: String, false_val: String): String = js.native
    /* private */ def escapeInvalidFileNameChars(): js.Any = js.native
    def serialize(): js.Promise[Reader] = js.native
  }
  
  @js.native
  class PrintFilePDF protected () extends PrintFile {
    def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String) = this()
    def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: String, copies: Double) = this()
    var printAnnotations: Boolean = js.native
    var printAsGrayscale: Boolean = js.native
    var printInReverseOrder: Boolean = js.native
    var printRange: String = js.native
    var printRotation: PrintRotation = js.native
    /* private */ def getBLOBContent(): js.Any = js.native
    def isValidRange(range: String): Boolean = js.native
  }
  
  @js.native
  class PrintFileTXT protected () extends PrintFile {
    def this(fileContent: String, fileName: String) = this()
    def this(fileContent: String, fileName: String, copies: Double) = this()
    var fontBold: Boolean = js.native
    var fontColor: String = js.native
    var fontItalic: Boolean = js.native
    var fontName: String = js.native
    var fontSize: Double = js.native
    var fontStrikethrough: Boolean = js.native
    var fontUnderline: Boolean = js.native
    var marginBottom: Double = js.native
    var marginLeft: Double = js.native
    var marginRight: Double = js.native
    var marginTop: Double = js.native
    var printOrientation: PrintOrientation = js.native
    var textAligment: TextAlignment = js.native
    var textContent: String = js.native
  }
  
  @js.native
  sealed trait PrintOrientation extends js.Object
  
  @js.native
  sealed trait PrintRotation extends js.Object
  
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
  
  @js.native
  sealed trait TextAlignment extends js.Object
  
  @js.native
  class UserSelectedPrinter () extends IClientPrinter {
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_UserSelectedPrinter: String = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  sealed trait WSStatus extends js.Object
  
  @js.native
  object FileSourceType extends js.Object {
    @js.native
    sealed trait BLOB extends FileSourceType
    
    @js.native
    sealed trait Base64 extends FileSourceType
    
    @js.native
    sealed trait Text extends FileSourceType
    
    @js.native
    sealed trait URL extends FileSourceType
    
    /* 2 */ val BLOB: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.FileSourceType.BLOB with Double = js.native
    /* 0 */ val Base64: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.FileSourceType.Base64 with Double = js.native
    /* 1 */ val Text: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.FileSourceType.Text with Double = js.native
    /* 3 */ val URL: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.FileSourceType.URL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileSourceType with Double] = js.native
  }
  
  @JSName("JSPrintManager")
  @js.native
  object JSPrintManagerNs extends js.Object {
    var WS: JSPMWebSocket = js.native
    var auto_reconnect: Boolean = js.native
    val websocket_status: WSStatus = js.native
    def getPrinters(): js.Promise[js.Object] = js.native
    def getPrintersInfo(): js.Promise[js.Object] = js.native
    def showAbout(): js.Promise[_] = js.native
    def start(): js.Promise[Unit] = js.native
    def start(secure: Boolean): js.Promise[Unit] = js.native
    def start(secure: Boolean, host: String): js.Promise[Unit] = js.native
    def start(secure: Boolean, host: String, port: Double): js.Promise[Unit] = js.native
    def stop(): Unit = js.native
    def updateClient(): js.Promise[_] = js.native
  }
  
  @js.native
  object PrintOrientation extends js.Object {
    @js.native
    sealed trait Landscape extends PrintOrientation
    
    @js.native
    sealed trait Portrait extends PrintOrientation
    
    /* 1 */ val Landscape: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintOrientation.Landscape with Double = js.native
    /* 0 */ val Portrait: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintOrientation.Portrait with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PrintOrientation with Double] = js.native
  }
  
  @js.native
  object PrintRotation extends js.Object {
    @js.native
    sealed trait None extends PrintRotation
    
    @js.native
    sealed trait Rot180 extends PrintRotation
    
    @js.native
    sealed trait Rot270 extends PrintRotation
    
    @js.native
    sealed trait Rot90 extends PrintRotation
    
    /* 3 */ val None: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintRotation.None with Double = js.native
    /* 6 */ val Rot180: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintRotation.Rot180 with Double = js.native
    /* 4 */ val Rot270: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintRotation.Rot270 with Double = js.native
    /* 5 */ val Rot90: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.PrintRotation.Rot90 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PrintRotation with Double] = js.native
  }
  
  @JSName("Serial")
  @js.native
  object SerialNs extends js.Object {
    @js.native
    sealed trait Handshake extends js.Object
    
    @js.native
    sealed trait Parity extends js.Object
    
    @js.native
    sealed trait StopBits extends js.Object
    
    @js.native
    object Handshake extends js.Object {
      @js.native
      sealed trait None extends Handshake
      
      @js.native
      sealed trait RequestToSend extends Handshake
      
      @js.native
      sealed trait RequestToSendXOnXOff extends Handshake
      
      @js.native
      sealed trait XOnXOff extends Handshake
      
      /* 0 */ val None: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Handshake.None with Double = js.native
      /* 1 */ val RequestToSend: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Handshake.RequestToSend with Double = js.native
      /* 2 */ val RequestToSendXOnXOff: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Handshake.RequestToSendXOnXOff with Double = js.native
      /* 3 */ val XOnXOff: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Handshake.XOnXOff with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Handshake with Double] = js.native
    }
    
    @js.native
    object Parity extends js.Object {
      @js.native
      sealed trait Even extends Parity
      
      @js.native
      sealed trait Mark extends Parity
      
      @js.native
      sealed trait None extends Parity
      
      @js.native
      sealed trait Odd extends Parity
      
      @js.native
      sealed trait Space extends Parity
      
      /* 2 */ val Even: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Parity.Even with Double = js.native
      /* 3 */ val Mark: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Parity.Mark with Double = js.native
      /* 0 */ val None: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Parity.None with Double = js.native
      /* 1 */ val Odd: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Parity.Odd with Double = js.native
      /* 4 */ val Space: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.Parity.Space with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[Parity with Double] = js.native
    }
    
    @js.native
    object StopBits extends js.Object {
      @js.native
      sealed trait None extends StopBits
      
      @js.native
      sealed trait One extends StopBits
      
      @js.native
      sealed trait OnePointFive extends StopBits
      
      @js.native
      sealed trait Two extends StopBits
      
      /* 0 */ val None: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.StopBits.None with Double = js.native
      /* 1 */ val One: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.StopBits.One with Double = js.native
      /* 3 */ val OnePointFive: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.StopBits.OnePointFive with Double = js.native
      /* 2 */ val Two: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.SerialNs.StopBits.Two with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[StopBits with Double] = js.native
    }
    
  }
  
  @js.native
  object TextAlignment extends js.Object {
    @js.native
    sealed trait Center extends TextAlignment
    
    @js.native
    sealed trait Justify extends TextAlignment
    
    @js.native
    sealed trait Left extends TextAlignment
    
    @js.native
    sealed trait Right extends TextAlignment
    
    /* 1 */ val Center: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.TextAlignment.Center with Double = js.native
    /* 3 */ val Justify: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.TextAlignment.Justify with Double = js.native
    /* 0 */ val Left: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.TextAlignment.Left with Double = js.native
    /* 2 */ val Right: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.TextAlignment.Right with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
  }
  
  @js.native
  object WSStatus extends js.Object {
    @js.native
    sealed trait BlackListed extends WSStatus
    
    @js.native
    sealed trait Closed extends WSStatus
    
    @js.native
    sealed trait Open extends WSStatus
    
    @js.native
    sealed trait WaitingForUserResponse extends WSStatus
    
    /* 2 */ val BlackListed: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.WSStatus.BlackListed with Double = js.native
    /* 1 */ val Closed: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.WSStatus.Closed with Double = js.native
    /* 0 */ val Open: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.WSStatus.Open with Double = js.native
    /* 3 */ val WaitingForUserResponse: typings.jsprintmanager.jsprintmanagerMod.JSPMNs.WSStatus.WaitingForUserResponse with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[WSStatus with Double] = js.native
  }
  
}

