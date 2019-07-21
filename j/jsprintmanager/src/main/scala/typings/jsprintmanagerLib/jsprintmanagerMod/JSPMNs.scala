package typings
package jsprintmanagerLib.jsprintmanagerMod

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
    var binaryPrinterCommands: stdLib.Uint8Array = js.native
    var clientPrinter: IClientPrinter = js.native
    val files: js.Array[PrintFile] = js.native
    var printerCommands: java.lang.String = js.native
    var printerCommandsCopies: scala.Double = js.native
    def _genPCArrayAsync(
      printerCommands: java.lang.String,
      binPrinterCommands: stdLib.Uint8Array,
      printerCopies: scala.Double
    ): js.Promise[stdLib.Blob] = js.native
    def _genPFGArrayAsync(printFileGroup: js.Array[PrintFile]): js.Promise[stdLib.Blob] = js.native
    def _genPrinterArrayAsync(clientPrinter: IClientPrinter): js.Promise[stdLib.Uint8Array] = js.native
    def _generateDataAsync(): js.Promise[stdLib.Blob] = js.native
    def _intToByteArray(number: scala.Double): stdLib.Uint8Array = js.native
    def _str2UTF8Array(str: java.lang.String): js.Array[scala.Double] = js.native
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
    var Id_DefaultPrinter: java.lang.String = js.native
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
    def this(printerName: java.lang.String) = this()
    def this(printerName: java.lang.String, printToDefaultIfNotFound: scala.Boolean) = this()
    def this(printerName: java.lang.String, printToDefaultIfNotFound: scala.Boolean, trayName: java.lang.String) = this()
    def this(printerName: java.lang.String, printToDefaultIfNotFound: scala.Boolean, trayName: java.lang.String, paperName: java.lang.String) = this()
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_InstalledPrinter: java.lang.String = js.native
    var _name: js.Any = js.native
    var _paper: js.Any = js.native
    var _printDefault: js.Any = js.native
    var _tray: js.Any = js.native
    var paperName: java.lang.String = js.native
    var printToDefaultIfNotFound: scala.Boolean = js.native
    var printerName: java.lang.String = js.native
    var trayName: java.lang.String = js.native
    /* private */ def bool2str(value: js.Any): js.Any = js.native
    /* private */ def bool2str(value: js.Any, true_val: js.Any): js.Any = js.native
    /* private */ def bool2str(value: js.Any, true_val: js.Any, false_val: js.Any): js.Any = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  class JSPMWebSocket () extends js.Object {
    def this(addr: java.lang.String) = this()
    def this(addr: java.lang.String, port: scala.Double) = this()
    def this(addr: java.lang.String, port: scala.Double, secure: scala.Boolean) = this()
    def this(addr: java.lang.String, port: scala.Double, secure: scala.Boolean, auto_reconnect: scala.Boolean) = this()
    var _addr: js.Any = js.native
    var _job_list: js.Any = js.native
    var _port: js.Any = js.native
    var _secure: js.Any = js.native
    var _status: js.Any = js.native
    var _ws: js.Any = js.native
    val address: java.lang.String = js.native
    var autoReconnect: scala.Boolean = js.native
    val isSecure: scala.Boolean = js.native
    val port: scala.Double = js.native
    val status: WSStatus = js.native
    /* private */ def _genID(): js.Any = js.native
    /* private */ def _onClose(e: js.Any, __this: js.Any): js.Any = js.native
    /* private */ def _onError(e: js.Any): js.Any = js.native
    /* private */ def _onMessage(e: js.Any, job_list: js.Any): js.Any = js.native
    /* private */ def _onOpen(e: js.Any, __this: js.Any): js.Any = js.native
    /* private */ def _pingPong(): js.Any = js.native
    /* private */ def _send(data: js.Any, ok: js.Any, err: js.Any): js.Any = js.native
    def onClose(e: js.Any): scala.Unit = js.native
    def onOpen(e: js.Any): scala.Unit = js.native
    def onStatusChanged(): scala.Unit = js.native
    def send(data: js.Any): js.Promise[_] = js.native
    def start(): js.Promise[scala.Unit] = js.native
    def stop(): scala.Unit = js.native
  }
  
  @js.native
  class NetworkPrinter protected () extends IClientPrinter {
    def this(port: scala.Double) = this()
    def this(port: scala.Double, ipAddress: java.lang.String) = this()
    def this(port: scala.Double, ipAddress: java.lang.String, dnsName: java.lang.String) = this()
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_NetworkPrinter: scala.Double = js.native
    var _dnsName: js.Any = js.native
    var _networkIPAddress: js.Any = js.native
    var _networkPort: js.Any = js.native
    var dnsName: java.lang.String = js.native
    var ipAddress: java.lang.String = js.native
    var port: scala.Double = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  class ParallelPortPrinter protected () extends IClientPrinter {
    def this(portName: java.lang.String) = this()
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_ParallelPortPrinter: java.lang.String = js.native
    var _parallelPortName: js.Any = js.native
    var portName: java.lang.String = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  class PrintFile protected () extends js.Object {
    def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: java.lang.String) = this()
    def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: java.lang.String, copies: scala.Double) = this()
    var _copies: js.Any = js.native
    var copies: scala.Double = js.native
    var fileContent: js.Any = js.native
    var fileContentType: FileSourceType = js.native
    var fileName: java.lang.String = js.native
    /* protected */ def bool2str(value: js.Any): java.lang.String = js.native
    /* protected */ def bool2str(value: js.Any, true_val: java.lang.String): java.lang.String = js.native
    /* protected */ def bool2str(value: js.Any, true_val: java.lang.String, false_val: java.lang.String): java.lang.String = js.native
    /* private */ def escapeInvalidFileNameChars(): js.Any = js.native
    def serialize(): js.Promise[jsprintmanagerLib.jsprintmanagerMod.zipNs.Reader] = js.native
  }
  
  @js.native
  class PrintFilePDF protected () extends PrintFile {
    def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: java.lang.String) = this()
    def this(fileContent: js.Any, fileContentType: FileSourceType, fileName: java.lang.String, copies: scala.Double) = this()
    var printAnnotations: scala.Boolean = js.native
    var printAsGrayscale: scala.Boolean = js.native
    var printInReverseOrder: scala.Boolean = js.native
    var printRange: java.lang.String = js.native
    var printRotation: PrintRotation = js.native
    /* private */ def getBLOBContent(): js.Any = js.native
    def isValidRange(range: java.lang.String): scala.Boolean = js.native
  }
  
  @js.native
  class PrintFileTXT protected () extends PrintFile {
    def this(fileContent: java.lang.String, fileName: java.lang.String) = this()
    def this(fileContent: java.lang.String, fileName: java.lang.String, copies: scala.Double) = this()
    var fontBold: scala.Boolean = js.native
    var fontColor: java.lang.String = js.native
    var fontItalic: scala.Boolean = js.native
    var fontName: java.lang.String = js.native
    var fontSize: scala.Double = js.native
    var fontStrikethrough: scala.Boolean = js.native
    var fontUnderline: scala.Boolean = js.native
    var marginBottom: scala.Double = js.native
    var marginLeft: scala.Double = js.native
    var marginRight: scala.Double = js.native
    var marginTop: scala.Double = js.native
    var printOrientation: PrintOrientation = js.native
    var textAligment: TextAlignment = js.native
    var textContent: java.lang.String = js.native
  }
  
  @js.native
  sealed trait PrintOrientation extends js.Object
  
  @js.native
  sealed trait PrintRotation extends js.Object
  
  @js.native
  class SerialPortPrinter protected () extends IClientPrinter {
    def this(portName: java.lang.String, baudRate: scala.Double, parity: jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Parity, stopBits: jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.StopBits, dataBits: scala.Double, flowControl: jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Handshake) = this()
    /* CompleteClass */
    override var Id: js.Any = js.native
    @JSName("Id")
    var Id_SerialPortPrinter: java.lang.String = js.native
    var _serialPortBaudRate: js.Any = js.native
    var _serialPortDataBits: js.Any = js.native
    var _serialPortFlowControl: js.Any = js.native
    var _serialPortName: js.Any = js.native
    var _serialPortParity: js.Any = js.native
    var _serialPortStopBits: js.Any = js.native
    var baudRate: scala.Double = js.native
    var dataBits: scala.Double = js.native
    var flowControl: jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Handshake = js.native
    var parity: jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Parity = js.native
    var portName: java.lang.String = js.native
    var stopBits: jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.StopBits = js.native
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
    var Id_UserSelectedPrinter: java.lang.String = js.native
    /* CompleteClass */
    override def serialize(): js.Any = js.native
  }
  
  @js.native
  sealed trait WSStatus extends js.Object
  
  @js.native
  object FileSourceType extends js.Object {
    @js.native
    sealed trait BLOB
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.FileSourceType
    
    @js.native
    sealed trait Base64
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.FileSourceType
    
    @js.native
    sealed trait Text
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.FileSourceType
    
    @js.native
    sealed trait URL
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.FileSourceType
    
    /* 2 */ val BLOB: BLOB with scala.Double = js.native
    /* 0 */ val Base64: Base64 with scala.Double = js.native
    /* 1 */ val Text: Text with scala.Double = js.native
    /* 3 */ val URL: URL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[jsprintmanagerLib.jsprintmanagerMod.JSPMNs.FileSourceType with scala.Double] = js.native
  }
  
  @JSName("JSPrintManager")
  @js.native
  object JSPrintManagerNs extends js.Object {
    var WS: jsprintmanagerLib.jsprintmanagerMod.JSPMNs.JSPMWebSocket = js.native
    var auto_reconnect: scala.Boolean = js.native
    val websocket_status: jsprintmanagerLib.jsprintmanagerMod.JSPMNs.WSStatus = js.native
    def getPrinters(): js.Promise[js.Object] = js.native
    def getPrintersInfo(): js.Promise[js.Object] = js.native
    def showAbout(): js.Promise[_] = js.native
    def start(): js.Promise[scala.Unit] = js.native
    def start(secure: scala.Boolean): js.Promise[scala.Unit] = js.native
    def start(secure: scala.Boolean, host: java.lang.String): js.Promise[scala.Unit] = js.native
    def start(secure: scala.Boolean, host: java.lang.String, port: scala.Double): js.Promise[scala.Unit] = js.native
    def stop(): scala.Unit = js.native
    def updateClient(): js.Promise[_] = js.native
  }
  
  @js.native
  object PrintOrientation extends js.Object {
    @js.native
    sealed trait Landscape
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.PrintOrientation
    
    @js.native
    sealed trait Portrait
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.PrintOrientation
    
    /* 1 */ val Landscape: Landscape with scala.Double = js.native
    /* 0 */ val Portrait: Portrait with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[jsprintmanagerLib.jsprintmanagerMod.JSPMNs.PrintOrientation with scala.Double] = js.native
  }
  
  @js.native
  object PrintRotation extends js.Object {
    @js.native
    sealed trait None
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.PrintRotation
    
    @js.native
    sealed trait Rot180
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.PrintRotation
    
    @js.native
    sealed trait Rot270
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.PrintRotation
    
    @js.native
    sealed trait Rot90
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.PrintRotation
    
    /* 3 */ val None: None with scala.Double = js.native
    /* 6 */ val Rot180: Rot180 with scala.Double = js.native
    /* 4 */ val Rot270: Rot270 with scala.Double = js.native
    /* 5 */ val Rot90: Rot90 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[jsprintmanagerLib.jsprintmanagerMod.JSPMNs.PrintRotation with scala.Double] = js.native
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
      sealed trait None
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Handshake
      
      @js.native
      sealed trait RequestToSend
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Handshake
      
      @js.native
      sealed trait RequestToSendXOnXOff
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Handshake
      
      @js.native
      sealed trait XOnXOff
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Handshake
      
      /* 0 */ val None: None with scala.Double = js.native
      /* 1 */ val RequestToSend: RequestToSend with scala.Double = js.native
      /* 2 */ val RequestToSendXOnXOff: RequestToSendXOnXOff with scala.Double = js.native
      /* 3 */ val XOnXOff: XOnXOff with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Handshake with scala.Double] = js.native
    }
    
    @js.native
    object Parity extends js.Object {
      @js.native
      sealed trait Even
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Parity
      
      @js.native
      sealed trait Mark
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Parity
      
      @js.native
      sealed trait None
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Parity
      
      @js.native
      sealed trait Odd
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Parity
      
      @js.native
      sealed trait Space
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Parity
      
      /* 2 */ val Even: Even with scala.Double = js.native
      /* 3 */ val Mark: Mark with scala.Double = js.native
      /* 0 */ val None: None with scala.Double = js.native
      /* 1 */ val Odd: Odd with scala.Double = js.native
      /* 4 */ val Space: Space with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.Parity with scala.Double] = js.native
    }
    
    @js.native
    object StopBits extends js.Object {
      @js.native
      sealed trait None
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.StopBits
      
      @js.native
      sealed trait One
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.StopBits
      
      @js.native
      sealed trait OnePointFive
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.StopBits
      
      @js.native
      sealed trait Two
        extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.StopBits
      
      /* 0 */ val None: None with scala.Double = js.native
      /* 1 */ val One: One with scala.Double = js.native
      /* 3 */ val OnePointFive: OnePointFive with scala.Double = js.native
      /* 2 */ val Two: Two with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[jsprintmanagerLib.jsprintmanagerMod.JSPMNs.SerialNs.StopBits with scala.Double] = js.native
    }
    
  }
  
  @js.native
  object TextAlignment extends js.Object {
    @js.native
    sealed trait Center
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.TextAlignment
    
    @js.native
    sealed trait Justify
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.TextAlignment
    
    @js.native
    sealed trait Left
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.TextAlignment
    
    @js.native
    sealed trait Right
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.TextAlignment
    
    /* 1 */ val Center: Center with scala.Double = js.native
    /* 3 */ val Justify: Justify with scala.Double = js.native
    /* 0 */ val Left: Left with scala.Double = js.native
    /* 2 */ val Right: Right with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[jsprintmanagerLib.jsprintmanagerMod.JSPMNs.TextAlignment with scala.Double] = js.native
  }
  
  @js.native
  object WSStatus extends js.Object {
    @js.native
    sealed trait BlackListed
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.WSStatus
    
    @js.native
    sealed trait Closed
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.WSStatus
    
    @js.native
    sealed trait Open
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.WSStatus
    
    @js.native
    sealed trait WaitingForUserResponse
      extends jsprintmanagerLib.jsprintmanagerMod.JSPMNs.WSStatus
    
    /* 2 */ val BlackListed: BlackListed with scala.Double = js.native
    /* 1 */ val Closed: Closed with scala.Double = js.native
    /* 0 */ val Open: Open with scala.Double = js.native
    /* 3 */ val WaitingForUserResponse: WaitingForUserResponse with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[jsprintmanagerLib.jsprintmanagerMod.JSPMNs.WSStatus with scala.Double] = js.native
  }
  
}

