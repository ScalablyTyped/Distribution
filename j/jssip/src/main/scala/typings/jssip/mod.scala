package typings.jssip

import typings.debug.mod.Debug
import typings.jssip.constantsMod.causes
import typings.jssip.grammarMod.Grammar
import typings.jssip.jssipInts.`300`
import typings.jssip.jssipInts.`301`
import typings.jssip.jssipInts.`302`
import typings.jssip.jssipInts.`305`
import typings.jssip.jssipInts.`380`
import typings.jssip.jssipInts.`401`
import typings.jssip.jssipInts.`403`
import typings.jssip.jssipInts.`404`
import typings.jssip.jssipInts.`407`
import typings.jssip.jssipInts.`408`
import typings.jssip.jssipInts.`410`
import typings.jssip.jssipInts.`424`
import typings.jssip.jssipInts.`430`
import typings.jssip.jssipInts.`480`
import typings.jssip.jssipInts.`484`
import typings.jssip.jssipInts.`486`
import typings.jssip.jssipInts.`488`
import typings.jssip.jssipInts.`600`
import typings.jssip.jssipInts.`603`
import typings.jssip.jssipInts.`604`
import typings.jssip.jssipInts.`606`
import typings.jssip.uAMod.UAConfiguration
import typings.jssip.uriMod.Headers
import typings.jssip.uriMod.Parameters
import typings.jssip.uriMod.URIScheme
import typings.std.MediaStream
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object C {
    
    @JSImport("jssip", "C.ACCEPTED_BODY_TYPES")
    @js.native
    val ACCEPTED_BODY_TYPES: /* "application/sdp, application/dtmf-relay" */ String = js.native
    
    @JSImport("jssip", "C.ACK")
    @js.native
    val ACK: /* "ACK" */ String = js.native
    
    @JSImport("jssip", "C.ALLOWED_METHODS")
    @js.native
    val ALLOWED_METHODS: /* "INVITE,ACK,CANCEL,BYE,UPDATE,MESSAGE,OPTIONS,REFER,INFO,NOTIFY" */ String = js.native
    
    @JSImport("jssip", "C.BYE")
    @js.native
    val BYE: /* "BYE" */ String = js.native
    
    @JSImport("jssip", "C.CANCEL")
    @js.native
    val CANCEL: /* "CANCEL" */ String = js.native
    
    @JSImport("jssip", "C.CONNECTION_RECOVERY_MAX_INTERVAL")
    @js.native
    val CONNECTION_RECOVERY_MAX_INTERVAL: /* 30 */ Double = js.native
    
    @JSImport("jssip", "C.CONNECTION_RECOVERY_MIN_INTERVAL")
    @js.native
    val CONNECTION_RECOVERY_MIN_INTERVAL: /* 2 */ Double = js.native
    
    @JSImport("jssip", "C.DTMF_TRANSPORT")
    @js.native
    object DTMF_TRANSPORT extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.jssip.constantsMod.DTMF_TRANSPORT & String] = js.native
      
      /* "INFO" */ val INFO: typings.jssip.constantsMod.DTMF_TRANSPORT.INFO & String = js.native
      
      /* "RFC2833" */ val RFC2833: typings.jssip.constantsMod.DTMF_TRANSPORT.RFC2833 & String = js.native
    }
    
    @JSImport("jssip", "C.INFO")
    @js.native
    val INFO: /* "INFO" */ String = js.native
    
    @JSImport("jssip", "C.INVITE")
    @js.native
    val INVITE: /* "INVITE" */ String = js.native
    
    @JSImport("jssip", "C.MAX_FORWARDS")
    @js.native
    val MAX_FORWARDS: /* 69 */ Double = js.native
    
    @JSImport("jssip", "C.MESSAGE")
    @js.native
    val MESSAGE: /* "MESSAGE" */ String = js.native
    
    @JSImport("jssip", "C.MIN_SESSION_EXPIRES")
    @js.native
    val MIN_SESSION_EXPIRES: /* 60 */ Double = js.native
    
    @JSImport("jssip", "C.NOTIFY")
    @js.native
    val NOTIFY: /* "NOTIFY" */ String = js.native
    
    @JSImport("jssip", "C.OPTIONS")
    @js.native
    val OPTIONS: /* "OPTIONS" */ String = js.native
    
    @JSImport("jssip", "C.REASON_PHRASE")
    @js.native
    val REASON_PHRASE: Record[Double, String] = js.native
    
    @JSImport("jssip", "C.REFER")
    @js.native
    val REFER: /* "REFER" */ String = js.native
    
    @JSImport("jssip", "C.REGISTER")
    @js.native
    val REGISTER: /* "REGISTER" */ String = js.native
    
    @JSImport("jssip", "C.SESSION_EXPIRES")
    @js.native
    val SESSION_EXPIRES: /* 90 */ Double = js.native
    
    @JSImport("jssip", "C.SIP")
    @js.native
    val SIP: /* "sip" */ String = js.native
    
    @JSImport("jssip", "C.SIPS")
    @js.native
    val SIPS: /* "sips" */ String = js.native
    
    object SIP_ERROR_CAUSES {
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES.ADDRESS_INCOMPLETE")
      @js.native
      def ADDRESS_INCOMPLETE: js.Tuple2[`484`, `424`] = js.native
      inline def ADDRESS_INCOMPLETE_=(x: js.Tuple2[`484`, `424`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDRESS_INCOMPLETE")(x.asInstanceOf[js.Any])
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES.AUTHENTICATION_ERROR")
      @js.native
      def AUTHENTICATION_ERROR: js.Tuple2[`401`, `407`] = js.native
      inline def AUTHENTICATION_ERROR_=(x: js.Tuple2[`401`, `407`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHENTICATION_ERROR")(x.asInstanceOf[js.Any])
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES.BUSY")
      @js.native
      def BUSY: js.Tuple2[`486`, `600`] = js.native
      inline def BUSY_=(x: js.Tuple2[`486`, `600`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUSY")(x.asInstanceOf[js.Any])
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES.INCOMPATIBLE_SDP")
      @js.native
      def INCOMPATIBLE_SDP: js.Tuple2[`488`, `606`] = js.native
      inline def INCOMPATIBLE_SDP_=(x: js.Tuple2[`488`, `606`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCOMPATIBLE_SDP")(x.asInstanceOf[js.Any])
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES.NOT_FOUND")
      @js.native
      def NOT_FOUND: js.Tuple2[`404`, `604`] = js.native
      inline def NOT_FOUND_=(x: js.Tuple2[`404`, `604`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES.REDIRECTED")
      @js.native
      def REDIRECTED: js.Tuple5[`300`, `301`, `302`, `305`, `380`] = js.native
      inline def REDIRECTED_=(x: js.Tuple5[`300`, `301`, `302`, `305`, `380`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REDIRECTED")(x.asInstanceOf[js.Any])
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES.REJECTED")
      @js.native
      def REJECTED: js.Tuple2[`403`, `603`] = js.native
      inline def REJECTED_=(x: js.Tuple2[`403`, `603`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED")(x.asInstanceOf[js.Any])
      
      @JSImport("jssip", "C.SIP_ERROR_CAUSES.UNAVAILABLE")
      @js.native
      def UNAVAILABLE: js.Tuple4[`480`, `410`, `408`, `430`] = js.native
      inline def UNAVAILABLE_=(x: js.Tuple4[`480`, `410`, `408`, `430`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAVAILABLE")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("jssip", "C.SUBSCRIBE")
    @js.native
    val SUBSCRIBE: /* "SUBSCRIBE" */ String = js.native
    
    @JSImport("jssip", "C.UPDATE")
    @js.native
    val UPDATE: /* "UPDATE" */ String = js.native
    
    @JSImport("jssip", "C.USER_AGENT")
    @js.native
    val USER_AGENT: String = js.native
    
    @JSImport("jssip", "C.causes")
    @js.native
    object causes extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.jssip.constantsMod.causes & String] = js.native
      
      /* "Address Incomplete" */ val ADDRESS_INCOMPLETE: typings.jssip.constantsMod.causes.ADDRESS_INCOMPLETE & String = js.native
      
      /* "Authentication Error" */ val AUTHENTICATION_ERROR: typings.jssip.constantsMod.causes.AUTHENTICATION_ERROR & String = js.native
      
      /* "Bad Media Description" */ val BAD_MEDIA_DESCRIPTION: typings.jssip.constantsMod.causes.BAD_MEDIA_DESCRIPTION & String = js.native
      
      /* "Busy" */ val BUSY: typings.jssip.constantsMod.causes.BUSY & String = js.native
      
      /* "Terminated" */ val BYE: typings.jssip.constantsMod.causes.BYE & String = js.native
      
      /* "Canceled" */ val CANCELED: typings.jssip.constantsMod.causes.CANCELED & String = js.native
      
      /* "Connection Error" */ val CONNECTION_ERROR: typings.jssip.constantsMod.causes.CONNECTION_ERROR & String = js.native
      
      /* "Dialog Error" */ val DIALOG_ERROR: typings.jssip.constantsMod.causes.DIALOG_ERROR & String = js.native
      
      /* "Expires" */ val EXPIRES: typings.jssip.constantsMod.causes.EXPIRES & String = js.native
      
      /* "Incompatible SDP" */ val INCOMPATIBLE_SDP: typings.jssip.constantsMod.causes.INCOMPATIBLE_SDP & String = js.native
      
      /* "Internal Error" */ val INTERNAL_ERROR: typings.jssip.constantsMod.causes.INTERNAL_ERROR & String = js.native
      
      /* "Missing SDP" */ val MISSING_SDP: typings.jssip.constantsMod.causes.MISSING_SDP & String = js.native
      
      /* "Not Found" */ val NOT_FOUND: typings.jssip.constantsMod.causes.NOT_FOUND & String = js.native
      
      /* "No ACK" */ val NO_ACK: typings.jssip.constantsMod.causes.NO_ACK & String = js.native
      
      /* "No Answer" */ val NO_ANSWER: typings.jssip.constantsMod.causes.NO_ANSWER & String = js.native
      
      /* "Redirected" */ val REDIRECTED: typings.jssip.constantsMod.causes.REDIRECTED & String = js.native
      
      /* "Rejected" */ val REJECTED: typings.jssip.constantsMod.causes.REJECTED & String = js.native
      
      /* "Request Timeout" */ val REQUEST_TIMEOUT: typings.jssip.constantsMod.causes.REQUEST_TIMEOUT & String = js.native
      
      /* "RTP Timeout" */ val RTP_TIMEOUT: typings.jssip.constantsMod.causes.RTP_TIMEOUT & String = js.native
      
      /* "SIP Failure Code" */ val SIP_FAILURE_CODE: typings.jssip.constantsMod.causes.SIP_FAILURE_CODE & String = js.native
      
      /* "Unavailable" */ val UNAVAILABLE: typings.jssip.constantsMod.causes.UNAVAILABLE & String = js.native
      
      /* "User Denied Media Access" */ val USER_DENIED_MEDIA_ACCESS: typings.jssip.constantsMod.causes.USER_DENIED_MEDIA_ACCESS & String = js.native
      
      /* "WebRTC Error" */ val WEBRTC_ERROR: typings.jssip.constantsMod.causes.WEBRTC_ERROR & String = js.native
    }
  }
  
  object Exceptions {
    
    @JSImport("jssip", "Exceptions.ConfigurationError")
    @js.native
    open class ConfigurationError protected ()
      extends typings.jssip.exceptionsMod.ConfigurationError {
      def this(parameter: String) = this()
      def this(parameter: String, value: Any) = this()
    }
    
    @JSImport("jssip", "Exceptions.InvalidStateError")
    @js.native
    open class InvalidStateError protected ()
      extends typings.jssip.exceptionsMod.InvalidStateError {
      def this(status: Double) = this()
    }
    
    @JSImport("jssip", "Exceptions.NotReadyError")
    @js.native
    open class NotReadyError protected ()
      extends typings.jssip.exceptionsMod.NotReadyError {
      def this(message: String) = this()
    }
    
    @JSImport("jssip", "Exceptions.NotSupportedError")
    @js.native
    open class NotSupportedError protected ()
      extends typings.jssip.exceptionsMod.NotSupportedError {
      def this(message: String) = this()
    }
  }
  
  object Grammar {
    
    @JSImport("jssip", "Grammar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(input: String): typings.jssip.grammarMod.Grammar = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any]).asInstanceOf[typings.jssip.grammarMod.Grammar]
    inline def parse(input: String, startRule: String): typings.jssip.grammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], startRule.asInstanceOf[js.Any])).asInstanceOf[typings.jssip.grammarMod.Grammar]
    
    inline def toSource(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toSource")().asInstanceOf[Any]
  }
  
  @JSImport("jssip", "NameAddrHeader")
  @js.native
  open class NameAddrHeader protected ()
    extends typings.jssip.nameAddrHeaderMod.NameAddrHeader {
    def this(uri: typings.jssip.uriMod.URI) = this()
    def this(uri: typings.jssip.uriMod.URI, display_name: String) = this()
    def this(uri: typings.jssip.uriMod.URI, display_name: String, parameters: Parameters) = this()
    def this(uri: typings.jssip.uriMod.URI, display_name: Unit, parameters: Parameters) = this()
  }
  /* static members */
  object NameAddrHeader {
    
    @JSImport("jssip", "NameAddrHeader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(uri: String): js.UndefOr[Grammar] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Grammar]]
  }
  
  @JSImport("jssip", "Socket")
  @js.native
  open class Socket ()
    extends typings.jssip.webSocketInterfaceMod.Socket
  
  @JSImport("jssip", "UA")
  @js.native
  open class UA protected ()
    extends typings.jssip.uAMod.UA {
    def this(configuration: UAConfiguration) = this()
  }
  
  @JSImport("jssip", "URI")
  @js.native
  open class URI protected ()
    extends typings.jssip.uriMod.URI {
    def this(scheme: URIScheme, user: String, host: String) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Double) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Double, parameters: Parameters) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Unit, parameters: Parameters) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Double, parameters: Unit, headers: Headers) = this()
    def this(
      scheme: URIScheme,
      user: String,
      host: String,
      port: Double,
      parameters: Parameters,
      headers: Headers
    ) = this()
    def this(scheme: URIScheme, user: String, host: String, port: Unit, parameters: Unit, headers: Headers) = this()
    def this(
      scheme: URIScheme,
      user: String,
      host: String,
      port: Unit,
      parameters: Parameters,
      headers: Headers
    ) = this()
  }
  /* static members */
  object URI {
    
    @JSImport("jssip", "URI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(uri: String): js.UndefOr[Grammar] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Grammar]]
  }
  
  object Utils {
    
    @JSImport("jssip", "Utils")
    @js.native
    val ^ : js.Any = js.native
    
    inline def calculateMD5(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMD5")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def cloneArray[T](arr: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArray")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    
    inline def cloneObject[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def cloneObject[T](obj: T, fallback: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneObject")(obj.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def closeMediaStream(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeMediaStream")().asInstanceOf[Unit]
    inline def closeMediaStream(stream: MediaStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeMediaStream")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def escapeUser(user: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeUser")(user.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getRandomTestNetIP(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomTestNetIP")().asInstanceOf[String]
    
    inline def hasMethods(obj: Any, methodNames: String*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMethods")(scala.List(obj.asInstanceOf[js.Any]).`++`(methodNames.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Boolean]
    
    inline def headerize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("headerize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hostType(host: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hostType")(host.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isDecimal(num: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(num.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
    
    inline def isEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isString(str: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(str.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def newTag(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newTag")().asInstanceOf[String]
    
    inline def newUUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("newUUID")().asInstanceOf[String]
    
    inline def normalizeTarget(target: String): js.UndefOr[typings.jssip.uriMod.URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.jssip.uriMod.URI]]
    inline def normalizeTarget(target: String, domain: String): js.UndefOr[typings.jssip.uriMod.URI] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.jssip.uriMod.URI]]
    inline def normalizeTarget(target: typings.jssip.uriMod.URI): js.UndefOr[typings.jssip.uriMod.URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[typings.jssip.uriMod.URI]]
    inline def normalizeTarget(target: typings.jssip.uriMod.URI, domain: String): js.UndefOr[typings.jssip.uriMod.URI] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTarget")(target.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[typings.jssip.uriMod.URI]]
    
    inline def sipErrorCause(status_code: Double): causes = ^.asInstanceOf[js.Dynamic].applyDynamic("sipErrorCause")(status_code.asInstanceOf[js.Any]).asInstanceOf[causes]
    
    inline def strUtf8Length(str: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("str_utf8_length")(str.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSImport("jssip", "WebSocketInterface")
  @js.native
  open class WebSocketInterface protected ()
    extends typings.jssip.webSocketInterfaceMod.WebSocketInterface {
    def this(url: String) = this()
  }
  
  @JSImport("jssip", "debug")
  @js.native
  val debug: Debug = js.native
  
  @JSImport("jssip", "name")
  @js.native
  val name: String = js.native
  
  @JSImport("jssip", "version")
  @js.native
  val version: String = js.native
}
