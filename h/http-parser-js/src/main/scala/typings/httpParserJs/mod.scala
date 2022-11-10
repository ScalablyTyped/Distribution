package typings.httpParserJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.httpParserJs.httpParserJsBooleans.`true`
import typings.httpParserJs.httpParserJsInts.`0`
import typings.httpParserJs.httpParserJsInts.`1`
import typings.httpParserJs.httpParserJsInts.`2`
import typings.httpParserJs.httpParserJsInts.`3`
import typings.httpParserJs.httpParserJsInts.`4`
import typings.httpParserJs.httpParserJsInts.`81920`
import typings.httpParserJs.httpParserJsStrings.ascii
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("http-parser-js", "HTTPParser")
  @js.native
  open class HTTPParser ()
    extends StObject
       with HTTPParserJS {
    def this(`type`: ParserType) = this()
  }
  @JSImport("http-parser-js", "HTTPParser")
  @js.native
  val HTTPParser: HTTPParserConstructor = js.native
  
  @JSImport("http-parser-js", "methods")
  @js.native
  val methods: js.Array[RequestMethod] = js.native
  
  @js.native
  trait HTTPParserConstructor
    extends js.Function
       with Instantiable0[HTTPParserJS]
       with Instantiable1[/* type */ ParserType, HTTPParserJS] {
    
    def apply(): Unit = js.native
    def apply(`type`: ParserType): Unit = js.native
    
    val REQUEST: typings.httpParserJs.httpParserJsStrings.REQUEST = js.native
    
    val RESPONSE: typings.httpParserJs.httpParserJsStrings.RESPONSE = js.native
    
    var encoding: ascii | String = js.native
    
    val kOnBody: `3` = js.native
    
    def kOnExecute(): Unit = js.native
    
    // Note: *not* starting with kOnHeaders=0 line the Node parser, because any
    // newly added constants (kOnTimeout in Node v12.19.0) will overwrite 0!
    val kOnHeaders: `1` = js.native
    
    val kOnHeadersComplete: `2` = js.native
    
    val kOnMessageComplete: `4` = js.native
    
    /**
      * maxHeaderSize (in bytes) is configurable, but 80kb by default;
      * @default 80 * 1024 = 80kb
      */
    var maxHeaderSize: `81920` | Double = js.native
    
    val methods: js.Array[RequestMethod] = js.native
  }
  
  @js.native
  trait HTTPParserJS extends StObject {
    
    /* private */ def BODY_CHUNK(): Unit = js.native
    
    /* private */ def BODY_CHUNKEMPTYLINE(): Unit = js.native
    
    /* private */ def BODY_CHUNKHEAD(): Unit = js.native
    
    /* private */ def BODY_CHUNKTRAILERS(): Unit = js.native
    
    /* private */ def BODY_RAW(): Unit = js.native
    
    /* private */ def BODY_SIZED(): Unit = js.native
    
    /**
      * For older versions of node (v6.x and older?), that return `skipBody=1` or `skipBody=true`, need this `return true;` if it's an upgrade request.
      */
    /* private */ def HEADER(): Unit | Boolean = js.native
    
    /* private */ def REQUEST_LINE(): Unit = js.native
    /* private */ @JSName("REQUEST_LINE")
    var REQUEST_LINE_Original: noop[Unit] = js.native
    
    /* private */ def RESPONSE_LINE(): Unit = js.native
    /* private */ @JSName("RESPONSE_LINE")
    var RESPONSE_LINE_Original: noop[Unit] = js.native
    
    /* private */ var _compatMode0_11: Boolean = js.native
    
    def close(): Unit = js.native
    @JSName("close")
    var close_Original: noop[Unit] = js.native
    
    // These three methods are used for an internal speed optimization, and it also
    // works if theses are noops. Basically consume() asks us to read the bytes
    // ourselves, but if we don't do it we get them through execute().
    def consume(): Unit = js.native
    
    /* private */ def consumeLine(): String | Unit = js.native
    /* private */ @JSName("consumeLine")
    var consumeLine_Original: noop[String | Unit] = js.native
    
    // These three methods are used for an internal speed optimization, and it also
    // works if theses are noops. Basically consume() asks us to read the bytes
    // ourselves, but if we don't do it we get them through execute().
    @JSName("consume")
    var consume_Original: noop[Unit] = js.native
    
    def execute(chunk: Buffer): Double | js.Error = js.native
    def execute(chunk: Buffer, start: Double): Double | js.Error = js.native
    def execute(chunk: Buffer, start: Double, length: Double): Double | js.Error = js.native
    def execute(chunk: Buffer, start: Unit, length: Double): Double | js.Error = js.native
    
    def finish(): Unit | js.Error = js.native
    
    def free(): Unit = js.native
    @JSName("free")
    var free_Original: noop[Unit] = js.native
    
    def getAsyncId(): `0` = js.native
    @JSName("getAsyncId")
    var getAsyncId_Original: noop[`0`] = js.native
    
    def getCurrentBuffer(): Unit = js.native
    @JSName("getCurrentBuffer")
    var getCurrentBuffer_Original: noop[Unit] = js.native
    
    def initialize(`type`: ParserType): Unit = js.native
    def initialize(`type`: ParserType, async_resource: Any): Unit = js.native
    
    /* private */ def nextRequest(): Unit = js.native
    /* private */ @JSName("nextRequest")
    var nextRequest_Original: noop[Unit] = js.native
    
    def onBody: OnBodyParser = js.native
    def onBody_=(to: OnBodyParser): Unit = js.native
    
    def onHeaders: OnHeadersParser = js.native
    
    def onHeadersComplete: OnHeadersCompleteParser[HeaderObject, `true`] = js.native
    @JSName("onHeadersComplete_=")
    def `onHeadersComplete_=_true`(to: OnHeadersCompleteParser[HeaderObject, `true`]): Unit = js.native
    
    def onHeaders_=(to: OnHeadersParser): Unit = js.native
    
    def onMessageComplete: noop[Unit] = js.native
    def onMessageComplete_=(to: noop[Unit]): Unit = js.native
    
    def parseHeader(line: String, headers: js.Array[String]): Unit = js.native
    
    def pause(): Unit = js.native
    @JSName("pause")
    var pause_Original: noop[Unit] = js.native
    
    def reinitialize(): Unit = js.native
    def reinitialize(`type`: ParserType): Unit = js.native
    @JSName("reinitialize")
    var reinitialize_Original: HTTPParserConstructor = js.native
    
    def resume(): Unit = js.native
    @JSName("resume")
    var resume_Original: noop[Unit] = js.native
    
    def shouldKeepAlive(): Boolean = js.native
    
    def unconsume(): Unit = js.native
    @JSName("unconsume")
    var unconsume_Original: noop[Unit] = js.native
    
    /**
      * For correct error handling - see HTTPParser#execute
      * @example this.userCall()(userFunction('arg'));
      */
    def userCall[T](): js.Function1[/* ret */ js.UndefOr[T], T] = js.native
  }
  
  trait HeaderInfo[HEADER] extends StObject {
    
    var headers: HEADER
    
    var method: Double
    
    var shouldKeepAlive: Boolean
    
    var statusCode: Double
    
    var statusMessage: String
    
    var upgrade: Boolean
    
    var url: String
    
    var versionMajor: Double
    
    var versionMinor: Double
  }
  object HeaderInfo {
    
    inline def apply[HEADER](
      headers: HEADER,
      method: Double,
      shouldKeepAlive: Boolean,
      statusCode: Double,
      statusMessage: String,
      upgrade: Boolean,
      url: String,
      versionMajor: Double,
      versionMinor: Double
    ): HeaderInfo[HEADER] = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shouldKeepAlive = shouldKeepAlive.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], versionMajor = versionMajor.asInstanceOf[js.Any], versionMinor = versionMinor.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderInfo[HEADER]]
    }
    
    extension [Self <: HeaderInfo[?], HEADER](x: Self & HeaderInfo[HEADER]) {
      
      inline def setHeaders(value: HEADER): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setShouldKeepAlive(value: Boolean): Self = StObject.set(x, "shouldKeepAlive", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersionMajor(value: Double): Self = StObject.set(x, "versionMajor", value.asInstanceOf[js.Any])
      
      inline def setVersionMinor(value: Double): Self = StObject.set(x, "versionMinor", value.asInstanceOf[js.Any])
    }
  }
  
  type HeaderObject = js.Array[String]
  
  type OnBodyParser = js.Function3[/* chunk */ Buffer, /* offset */ Double, /* length */ Double, Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Mode_0_12 extends true ? (info : http-parser-js.http-parser-js.HeaderInfo<HEADER>): number | void : (versionMajor : number, versionMinor : number, headers : HEADER, method : number, url : string, statusCode : number, statusMessage : string, upgrade : boolean, shouldKeepAlive : boolean): number | void
    }}}
    */
  type OnHeadersCompleteParser[HEADER, Mode_0_12 /* <: Boolean */] = js.Function1[/* info */ HeaderInfo[HEADER], Double | Unit]
  
  type OnHeadersParser = js.Function2[/* headers */ js.Array[String], /* url */ String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.httpParserJs.httpParserJsStrings.REQUEST
    - typings.httpParserJs.httpParserJsStrings.RESPONSE
  */
  trait ParserType extends StObject
  object ParserType {
    
    inline def REQUEST: typings.httpParserJs.httpParserJsStrings.REQUEST = "REQUEST".asInstanceOf[typings.httpParserJs.httpParserJsStrings.REQUEST]
    
    inline def RESPONSE: typings.httpParserJs.httpParserJsStrings.RESPONSE = "RESPONSE".asInstanceOf[typings.httpParserJs.httpParserJsStrings.RESPONSE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.httpParserJs.httpParserJsStrings.DELETE
    - typings.httpParserJs.httpParserJsStrings.GET
    - typings.httpParserJs.httpParserJsStrings.HEAD
    - typings.httpParserJs.httpParserJsStrings.POST
    - typings.httpParserJs.httpParserJsStrings.PUT
    - typings.httpParserJs.httpParserJsStrings.CONNECT
    - typings.httpParserJs.httpParserJsStrings.OPTIONS
    - typings.httpParserJs.httpParserJsStrings.TRACE
    - typings.httpParserJs.httpParserJsStrings.COPY
    - typings.httpParserJs.httpParserJsStrings.LOCK
    - typings.httpParserJs.httpParserJsStrings.MKCOL
    - typings.httpParserJs.httpParserJsStrings.MOVE
    - typings.httpParserJs.httpParserJsStrings.PROPFIND
    - typings.httpParserJs.httpParserJsStrings.PROPPATCH
    - typings.httpParserJs.httpParserJsStrings.SEARCH
    - typings.httpParserJs.httpParserJsStrings.UNLOCK
    - typings.httpParserJs.httpParserJsStrings.BIND
    - typings.httpParserJs.httpParserJsStrings.REBIND
    - typings.httpParserJs.httpParserJsStrings.UNBIND
    - typings.httpParserJs.httpParserJsStrings.ACL
    - typings.httpParserJs.httpParserJsStrings.REPORT
    - typings.httpParserJs.httpParserJsStrings.MKACTIVITY
    - typings.httpParserJs.httpParserJsStrings.CHECKOUT
    - typings.httpParserJs.httpParserJsStrings.MERGE
    - typings.httpParserJs.httpParserJsStrings.`M-SEARCH`
    - typings.httpParserJs.httpParserJsStrings.NOTIFY
    - typings.httpParserJs.httpParserJsStrings.SUBSCRIBE
    - typings.httpParserJs.httpParserJsStrings.UNSUBSCRIBE
    - typings.httpParserJs.httpParserJsStrings.PATCH
    - typings.httpParserJs.httpParserJsStrings.PURGE
    - typings.httpParserJs.httpParserJsStrings.MKCALENDAR
    - typings.httpParserJs.httpParserJsStrings.LINK
    - typings.httpParserJs.httpParserJsStrings.UNLINK
    - java.lang.String
  */
  type RequestMethod = _RequestMethod | String
  
  /* Rewritten from type alias, can be one of: 
    - typings.httpParserJs.httpParserJsStrings.REQUEST_LINE
    - typings.httpParserJs.httpParserJsStrings.RESPONSE_LINE
    - typings.httpParserJs.httpParserJsStrings.BODY_RAW
  */
  trait StateFinishAllowedKey extends StObject
  object StateFinishAllowedKey {
    
    inline def BODY_RAW: typings.httpParserJs.httpParserJsStrings.BODY_RAW = "BODY_RAW".asInstanceOf[typings.httpParserJs.httpParserJsStrings.BODY_RAW]
    
    inline def REQUEST_LINE: typings.httpParserJs.httpParserJsStrings.REQUEST_LINE = "REQUEST_LINE".asInstanceOf[typings.httpParserJs.httpParserJsStrings.REQUEST_LINE]
    
    inline def RESPONSE_LINE: typings.httpParserJs.httpParserJsStrings.RESPONSE_LINE = "RESPONSE_LINE".asInstanceOf[typings.httpParserJs.httpParserJsStrings.RESPONSE_LINE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.httpParserJs.httpParserJsStrings.REQUEST_LINE
    - typings.httpParserJs.httpParserJsStrings.RESPONSE_LINE
    - typings.httpParserJs.httpParserJsStrings.HEADER
  */
  trait StateHeaderKey extends StObject
  object StateHeaderKey {
    
    inline def HEADER: typings.httpParserJs.httpParserJsStrings.HEADER = "HEADER".asInstanceOf[typings.httpParserJs.httpParserJsStrings.HEADER]
    
    inline def REQUEST_LINE: typings.httpParserJs.httpParserJsStrings.REQUEST_LINE = "REQUEST_LINE".asInstanceOf[typings.httpParserJs.httpParserJsStrings.REQUEST_LINE]
    
    inline def RESPONSE_LINE: typings.httpParserJs.httpParserJsStrings.RESPONSE_LINE = "RESPONSE_LINE".asInstanceOf[typings.httpParserJs.httpParserJsStrings.RESPONSE_LINE]
  }
  
  trait _RequestMethod extends StObject
  
  type noop[T] = js.Function0[T]
}
