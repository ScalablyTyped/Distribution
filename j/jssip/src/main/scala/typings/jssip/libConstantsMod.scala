package typings.jssip

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
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConstantsMod {
  
  @JSImport("jssip/lib/Constants", "ACCEPTED_BODY_TYPES")
  @js.native
  val ACCEPTED_BODY_TYPES: /* "application/sdp, application/dtmf-relay" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "ACK")
  @js.native
  val ACK: /* "ACK" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "ALLOWED_METHODS")
  @js.native
  val ALLOWED_METHODS: /* "INVITE,ACK,CANCEL,BYE,UPDATE,MESSAGE,OPTIONS,REFER,INFO,NOTIFY" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "BYE")
  @js.native
  val BYE: /* "BYE" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "CANCEL")
  @js.native
  val CANCEL: /* "CANCEL" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "CONNECTION_RECOVERY_MAX_INTERVAL")
  @js.native
  val CONNECTION_RECOVERY_MAX_INTERVAL: /* 30 */ Double = js.native
  
  @JSImport("jssip/lib/Constants", "CONNECTION_RECOVERY_MIN_INTERVAL")
  @js.native
  val CONNECTION_RECOVERY_MIN_INTERVAL: /* 2 */ Double = js.native
  
  @js.native
  sealed trait DTMF_TRANSPORT extends StObject
  @JSImport("jssip/lib/Constants", "DTMF_TRANSPORT")
  @js.native
  object DTMF_TRANSPORT extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DTMF_TRANSPORT & String] = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with DTMF_TRANSPORT
    /* "INFO" */ val INFO: typings.jssip.libConstantsMod.DTMF_TRANSPORT.INFO & String = js.native
    
    @js.native
    sealed trait RFC2833
      extends StObject
         with DTMF_TRANSPORT
    /* "RFC2833" */ val RFC2833: typings.jssip.libConstantsMod.DTMF_TRANSPORT.RFC2833 & String = js.native
  }
  
  @JSImport("jssip/lib/Constants", "INFO")
  @js.native
  val INFO: /* "INFO" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "INVITE")
  @js.native
  val INVITE: /* "INVITE" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "MAX_FORWARDS")
  @js.native
  val MAX_FORWARDS: /* 69 */ Double = js.native
  
  @JSImport("jssip/lib/Constants", "MESSAGE")
  @js.native
  val MESSAGE: /* "MESSAGE" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "MIN_SESSION_EXPIRES")
  @js.native
  val MIN_SESSION_EXPIRES: /* 60 */ Double = js.native
  
  @JSImport("jssip/lib/Constants", "NOTIFY")
  @js.native
  val NOTIFY: /* "NOTIFY" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "OPTIONS")
  @js.native
  val OPTIONS: /* "OPTIONS" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "REASON_PHRASE")
  @js.native
  val REASON_PHRASE: Record[Double, String] = js.native
  
  @JSImport("jssip/lib/Constants", "REFER")
  @js.native
  val REFER: /* "REFER" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "REGISTER")
  @js.native
  val REGISTER: /* "REGISTER" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "SESSION_EXPIRES")
  @js.native
  val SESSION_EXPIRES: /* 90 */ Double = js.native
  
  @JSImport("jssip/lib/Constants", "SIP")
  @js.native
  val SIP: /* "sip" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "SIPS")
  @js.native
  val SIPS: /* "sips" */ String = js.native
  
  object SIP_ERROR_CAUSES {
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES.ADDRESS_INCOMPLETE")
    @js.native
    def ADDRESS_INCOMPLETE: js.Tuple2[`484`, `424`] = js.native
    inline def ADDRESS_INCOMPLETE_=(x: js.Tuple2[`484`, `424`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDRESS_INCOMPLETE")(x.asInstanceOf[js.Any])
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES.AUTHENTICATION_ERROR")
    @js.native
    def AUTHENTICATION_ERROR: js.Tuple2[`401`, `407`] = js.native
    inline def AUTHENTICATION_ERROR_=(x: js.Tuple2[`401`, `407`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHENTICATION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES.BUSY")
    @js.native
    def BUSY: js.Tuple2[`486`, `600`] = js.native
    inline def BUSY_=(x: js.Tuple2[`486`, `600`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BUSY")(x.asInstanceOf[js.Any])
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES.INCOMPATIBLE_SDP")
    @js.native
    def INCOMPATIBLE_SDP: js.Tuple2[`488`, `606`] = js.native
    inline def INCOMPATIBLE_SDP_=(x: js.Tuple2[`488`, `606`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCOMPATIBLE_SDP")(x.asInstanceOf[js.Any])
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES.NOT_FOUND")
    @js.native
    def NOT_FOUND: js.Tuple2[`404`, `604`] = js.native
    inline def NOT_FOUND_=(x: js.Tuple2[`404`, `604`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_FOUND")(x.asInstanceOf[js.Any])
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES.REDIRECTED")
    @js.native
    def REDIRECTED: js.Tuple5[`300`, `301`, `302`, `305`, `380`] = js.native
    inline def REDIRECTED_=(x: js.Tuple5[`300`, `301`, `302`, `305`, `380`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REDIRECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES.REJECTED")
    @js.native
    def REJECTED: js.Tuple2[`403`, `603`] = js.native
    inline def REJECTED_=(x: js.Tuple2[`403`, `603`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("jssip/lib/Constants", "SIP_ERROR_CAUSES.UNAVAILABLE")
    @js.native
    def UNAVAILABLE: js.Tuple4[`480`, `410`, `408`, `430`] = js.native
    inline def UNAVAILABLE_=(x: js.Tuple4[`480`, `410`, `408`, `430`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNAVAILABLE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("jssip/lib/Constants", "SUBSCRIBE")
  @js.native
  val SUBSCRIBE: /* "SUBSCRIBE" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "UPDATE")
  @js.native
  val UPDATE: /* "UPDATE" */ String = js.native
  
  @JSImport("jssip/lib/Constants", "USER_AGENT")
  @js.native
  val USER_AGENT: String = js.native
  
  @js.native
  sealed trait causes extends StObject
  @JSImport("jssip/lib/Constants", "causes")
  @js.native
  object causes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[causes & String] = js.native
    
    @js.native
    sealed trait ADDRESS_INCOMPLETE
      extends StObject
         with causes
    /* "Address Incomplete" */ val ADDRESS_INCOMPLETE: typings.jssip.libConstantsMod.causes.ADDRESS_INCOMPLETE & String = js.native
    
    @js.native
    sealed trait AUTHENTICATION_ERROR
      extends StObject
         with causes
    /* "Authentication Error" */ val AUTHENTICATION_ERROR: typings.jssip.libConstantsMod.causes.AUTHENTICATION_ERROR & String = js.native
    
    @js.native
    sealed trait BAD_MEDIA_DESCRIPTION
      extends StObject
         with causes
    /* "Bad Media Description" */ val BAD_MEDIA_DESCRIPTION: typings.jssip.libConstantsMod.causes.BAD_MEDIA_DESCRIPTION & String = js.native
    
    @js.native
    sealed trait BUSY
      extends StObject
         with causes
    /* "Busy" */ val BUSY: typings.jssip.libConstantsMod.causes.BUSY & String = js.native
    
    @js.native
    sealed trait BYE
      extends StObject
         with causes
    /* "Terminated" */ val BYE: typings.jssip.libConstantsMod.causes.BYE & String = js.native
    
    @js.native
    sealed trait CANCELED
      extends StObject
         with causes
    /* "Canceled" */ val CANCELED: typings.jssip.libConstantsMod.causes.CANCELED & String = js.native
    
    @js.native
    sealed trait CONNECTION_ERROR
      extends StObject
         with causes
    /* "Connection Error" */ val CONNECTION_ERROR: typings.jssip.libConstantsMod.causes.CONNECTION_ERROR & String = js.native
    
    @js.native
    sealed trait DIALOG_ERROR
      extends StObject
         with causes
    /* "Dialog Error" */ val DIALOG_ERROR: typings.jssip.libConstantsMod.causes.DIALOG_ERROR & String = js.native
    
    @js.native
    sealed trait EXPIRES
      extends StObject
         with causes
    /* "Expires" */ val EXPIRES: typings.jssip.libConstantsMod.causes.EXPIRES & String = js.native
    
    @js.native
    sealed trait INCOMPATIBLE_SDP
      extends StObject
         with causes
    /* "Incompatible SDP" */ val INCOMPATIBLE_SDP: typings.jssip.libConstantsMod.causes.INCOMPATIBLE_SDP & String = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with causes
    /* "Internal Error" */ val INTERNAL_ERROR: typings.jssip.libConstantsMod.causes.INTERNAL_ERROR & String = js.native
    
    @js.native
    sealed trait MISSING_SDP
      extends StObject
         with causes
    /* "Missing SDP" */ val MISSING_SDP: typings.jssip.libConstantsMod.causes.MISSING_SDP & String = js.native
    
    @js.native
    sealed trait NOT_FOUND
      extends StObject
         with causes
    /* "Not Found" */ val NOT_FOUND: typings.jssip.libConstantsMod.causes.NOT_FOUND & String = js.native
    
    @js.native
    sealed trait NO_ACK
      extends StObject
         with causes
    /* "No ACK" */ val NO_ACK: typings.jssip.libConstantsMod.causes.NO_ACK & String = js.native
    
    @js.native
    sealed trait NO_ANSWER
      extends StObject
         with causes
    /* "No Answer" */ val NO_ANSWER: typings.jssip.libConstantsMod.causes.NO_ANSWER & String = js.native
    
    @js.native
    sealed trait REDIRECTED
      extends StObject
         with causes
    /* "Redirected" */ val REDIRECTED: typings.jssip.libConstantsMod.causes.REDIRECTED & String = js.native
    
    @js.native
    sealed trait REJECTED
      extends StObject
         with causes
    /* "Rejected" */ val REJECTED: typings.jssip.libConstantsMod.causes.REJECTED & String = js.native
    
    @js.native
    sealed trait REQUEST_TIMEOUT
      extends StObject
         with causes
    /* "Request Timeout" */ val REQUEST_TIMEOUT: typings.jssip.libConstantsMod.causes.REQUEST_TIMEOUT & String = js.native
    
    @js.native
    sealed trait RTP_TIMEOUT
      extends StObject
         with causes
    /* "RTP Timeout" */ val RTP_TIMEOUT: typings.jssip.libConstantsMod.causes.RTP_TIMEOUT & String = js.native
    
    @js.native
    sealed trait SIP_FAILURE_CODE
      extends StObject
         with causes
    /* "SIP Failure Code" */ val SIP_FAILURE_CODE: typings.jssip.libConstantsMod.causes.SIP_FAILURE_CODE & String = js.native
    
    @js.native
    sealed trait UNAVAILABLE
      extends StObject
         with causes
    /* "Unavailable" */ val UNAVAILABLE: typings.jssip.libConstantsMod.causes.UNAVAILABLE & String = js.native
    
    @js.native
    sealed trait USER_DENIED_MEDIA_ACCESS
      extends StObject
         with causes
    /* "User Denied Media Access" */ val USER_DENIED_MEDIA_ACCESS: typings.jssip.libConstantsMod.causes.USER_DENIED_MEDIA_ACCESS & String = js.native
    
    @js.native
    sealed trait WEBRTC_ERROR
      extends StObject
         with causes
    /* "WebRTC Error" */ val WEBRTC_ERROR: typings.jssip.libConstantsMod.causes.WEBRTC_ERROR & String = js.native
  }
}
