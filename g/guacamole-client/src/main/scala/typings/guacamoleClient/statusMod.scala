package typings.guacamoleClient

import typings.guacamoleClient.guacamoleClientNumbers.`0x0000`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0100`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0200`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0201`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0202`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0203`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0204`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0205`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0206`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0207`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0208`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0209`
import typings.guacamoleClient.guacamoleClientNumbers.`0x020a`
import typings.guacamoleClient.guacamoleClientNumbers.`0x020b`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0300`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0301`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0303`
import typings.guacamoleClient.guacamoleClientNumbers.`0x0308`
import typings.guacamoleClient.guacamoleClientNumbers.`0x030d`
import typings.guacamoleClient.guacamoleClientNumbers.`0x030f`
import typings.guacamoleClient.guacamoleClientNumbers.`0x031d`
import typings.guacamoleClient.statusMod.Status.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusMod {
  
  @JSImport("guacamole-client/lib/Status", "Status")
  @js.native
  class Status protected () extends StObject {
    /**
      * @param code The Guacamole status code, as defined by Guacamole.Status.Code.
      * @param [message] An optional human-readable message.
      */
    def this(code: Code) = this()
    def this(code: Code, message: String) = this()
    
    /**
      * The Guacamole status code.
      * @see Guacamole.Status.Code
      */
    var code: Code = js.native
    
    /**
      * Returns whether this status represents an error.
      * @returns true if this status represents an error, false otherwise.
      */
    def isError(): Boolean = js.native
    
    /**
      * An arbitrary human-readable message associated with this status, if any.
      * The human-readable message is not required, and is generally provided
      * for debugging purposes only. For user feedback, it is better to translate
      * the Guacamole status code into a message.
      */
    var message: js.UndefOr[String] = js.native
  }
  object Status {
    
    /* Rewritten from type alias, can be one of: 
      - typings.guacamoleClient.guacamoleClientNumbers.`0x031d`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0200`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0301`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x020a`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0201`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0303`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x020b`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0207`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0206`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x030d`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0205`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0308`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0203`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0204`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0209`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0208`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0100`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x030f`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0300`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0000`
      - typings.guacamoleClient.guacamoleClientNumbers.`0x0202`
    */
    trait Code extends StObject
    /* Inlined guacamole-client.guacamole-client/lib/Status.Status.StatusCode & std.Readonly<{fromHTTPCode (status : number): guacamole-client.guacamole-client/lib/Status.Status.Code, fromWebSocketCode (code : number): guacamole-client.guacamole-client/lib/Status.Status.Code}> */
    object Code {
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_BAD_REQUEST")
      @js.native
      val CLIENT_BAD_REQUEST: `0x0300` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_BAD_TYPE")
      @js.native
      val CLIENT_BAD_TYPE: `0x030f` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_FORBIDDEN")
      @js.native
      val CLIENT_FORBIDDEN: `0x0303` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_OVERRUN")
      @js.native
      val CLIENT_OVERRUN: `0x030d` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_TIMEOUT")
      @js.native
      val CLIENT_TIMEOUT: `0x0308` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_TOO_MANY")
      @js.native
      val CLIENT_TOO_MANY: `0x031d` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.CLIENT_UNAUTHORIZED")
      @js.native
      val CLIENT_UNAUTHORIZED: `0x0301` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.RESOURCE_CLOSED")
      @js.native
      val RESOURCE_CLOSED: `0x0206` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.RESOURCE_CONFLICT")
      @js.native
      val RESOURCE_CONFLICT: `0x0205` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.RESOURCE_NOT_FOUND")
      @js.native
      val RESOURCE_NOT_FOUND: `0x0204` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SERVER_BUSY")
      @js.native
      val SERVER_BUSY: `0x0201` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SERVER_ERROR")
      @js.native
      val SERVER_ERROR: `0x0200` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SESSION_CLOSED")
      @js.native
      val SESSION_CLOSED: `0x020b` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SESSION_CONFLICT")
      @js.native
      val SESSION_CONFLICT: `0x0209` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SESSION_TIMEOUT")
      @js.native
      val SESSION_TIMEOUT: `0x020a` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.SUCCESS")
      @js.native
      val SUCCESS: `0x0000` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UNSUPPORTED")
      @js.native
      val UNSUPPORTED: `0x0100` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UPSTREAM_ERROR")
      @js.native
      val UPSTREAM_ERROR: `0x0203` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UPSTREAM_NOT_FOUND")
      @js.native
      val UPSTREAM_NOT_FOUND: `0x0207` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UPSTREAM_TIMEOUT")
      @js.native
      val UPSTREAM_TIMEOUT: `0x0202` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.UPSTREAM_UNAVAILABLE")
      @js.native
      val UPSTREAM_UNAVAILABLE: `0x0208` = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.fromHTTPCode")
      @js.native
      def fromHTTPCode(status: Double): Code = js.native
      
      @JSImport("guacamole-client/lib/Status", "Status.Code.fromWebSocketCode")
      @js.native
      def fromWebSocketCode(code: Double): Code = js.native
    }
    
    /* Inlined std.Readonly<{  SUCCESS :0x0000,   UNSUPPORTED :0x0100,   SERVER_ERROR :0x0200,   SERVER_BUSY :0x0201,   UPSTREAM_TIMEOUT :0x0202,   UPSTREAM_ERROR :0x0203,   RESOURCE_NOT_FOUND :0x0204,   RESOURCE_CONFLICT :0x0205,   RESOURCE_CLOSED :0x0206,   UPSTREAM_NOT_FOUND :0x0207,   UPSTREAM_UNAVAILABLE :0x0208,   SESSION_CONFLICT :0x0209,   SESSION_TIMEOUT :0x020a,   SESSION_CLOSED :0x020b,   CLIENT_BAD_REQUEST :0x0300,   CLIENT_UNAUTHORIZED :0x0301,   CLIENT_FORBIDDEN :0x0303,   CLIENT_TIMEOUT :0x0308,   CLIENT_OVERRUN :0x030d,   CLIENT_BAD_TYPE :0x030f,   CLIENT_TOO_MANY :0x031d}> */
    @js.native
    trait StatusCode extends StObject {
      
      val CLIENT_BAD_REQUEST: `0x0300` = js.native
      
      val CLIENT_BAD_TYPE: `0x030f` = js.native
      
      val CLIENT_FORBIDDEN: `0x0303` = js.native
      
      val CLIENT_OVERRUN: `0x030d` = js.native
      
      val CLIENT_TIMEOUT: `0x0308` = js.native
      
      val CLIENT_TOO_MANY: `0x031d` = js.native
      
      val CLIENT_UNAUTHORIZED: `0x0301` = js.native
      
      val RESOURCE_CLOSED: `0x0206` = js.native
      
      val RESOURCE_CONFLICT: `0x0205` = js.native
      
      val RESOURCE_NOT_FOUND: `0x0204` = js.native
      
      val SERVER_BUSY: `0x0201` = js.native
      
      val SERVER_ERROR: `0x0200` = js.native
      
      val SESSION_CLOSED: `0x020b` = js.native
      
      val SESSION_CONFLICT: `0x0209` = js.native
      
      val SESSION_TIMEOUT: `0x020a` = js.native
      
      val SUCCESS: `0x0000` = js.native
      
      val UNSUPPORTED: `0x0100` = js.native
      
      val UPSTREAM_ERROR: `0x0203` = js.native
      
      val UPSTREAM_NOT_FOUND: `0x0207` = js.native
      
      val UPSTREAM_TIMEOUT: `0x0202` = js.native
      
      val UPSTREAM_UNAVAILABLE: `0x0208` = js.native
    }
    object StatusCode {
      
      @scala.inline
      def apply(
        CLIENT_BAD_REQUEST: `0x0300`,
        CLIENT_BAD_TYPE: `0x030f`,
        CLIENT_FORBIDDEN: `0x0303`,
        CLIENT_OVERRUN: `0x030d`,
        CLIENT_TIMEOUT: `0x0308`,
        CLIENT_TOO_MANY: `0x031d`,
        CLIENT_UNAUTHORIZED: `0x0301`,
        RESOURCE_CLOSED: `0x0206`,
        RESOURCE_CONFLICT: `0x0205`,
        RESOURCE_NOT_FOUND: `0x0204`,
        SERVER_BUSY: `0x0201`,
        SERVER_ERROR: `0x0200`,
        SESSION_CLOSED: `0x020b`,
        SESSION_CONFLICT: `0x0209`,
        SESSION_TIMEOUT: `0x020a`,
        SUCCESS: `0x0000`,
        UNSUPPORTED: `0x0100`,
        UPSTREAM_ERROR: `0x0203`,
        UPSTREAM_NOT_FOUND: `0x0207`,
        UPSTREAM_TIMEOUT: `0x0202`,
        UPSTREAM_UNAVAILABLE: `0x0208`
      ): StatusCode = {
        val __obj = js.Dynamic.literal(CLIENT_BAD_REQUEST = CLIENT_BAD_REQUEST.asInstanceOf[js.Any], CLIENT_BAD_TYPE = CLIENT_BAD_TYPE.asInstanceOf[js.Any], CLIENT_FORBIDDEN = CLIENT_FORBIDDEN.asInstanceOf[js.Any], CLIENT_OVERRUN = CLIENT_OVERRUN.asInstanceOf[js.Any], CLIENT_TIMEOUT = CLIENT_TIMEOUT.asInstanceOf[js.Any], CLIENT_TOO_MANY = CLIENT_TOO_MANY.asInstanceOf[js.Any], CLIENT_UNAUTHORIZED = CLIENT_UNAUTHORIZED.asInstanceOf[js.Any], RESOURCE_CLOSED = RESOURCE_CLOSED.asInstanceOf[js.Any], RESOURCE_CONFLICT = RESOURCE_CONFLICT.asInstanceOf[js.Any], RESOURCE_NOT_FOUND = RESOURCE_NOT_FOUND.asInstanceOf[js.Any], SERVER_BUSY = SERVER_BUSY.asInstanceOf[js.Any], SERVER_ERROR = SERVER_ERROR.asInstanceOf[js.Any], SESSION_CLOSED = SESSION_CLOSED.asInstanceOf[js.Any], SESSION_CONFLICT = SESSION_CONFLICT.asInstanceOf[js.Any], SESSION_TIMEOUT = SESSION_TIMEOUT.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any], UNSUPPORTED = UNSUPPORTED.asInstanceOf[js.Any], UPSTREAM_ERROR = UPSTREAM_ERROR.asInstanceOf[js.Any], UPSTREAM_NOT_FOUND = UPSTREAM_NOT_FOUND.asInstanceOf[js.Any], UPSTREAM_TIMEOUT = UPSTREAM_TIMEOUT.asInstanceOf[js.Any], UPSTREAM_UNAVAILABLE = UPSTREAM_UNAVAILABLE.asInstanceOf[js.Any])
        __obj.asInstanceOf[StatusCode]
      }
      
      @scala.inline
      implicit class StatusCodeMutableBuilder[Self <: StatusCode] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCLIENT_BAD_REQUEST(value: `0x0300`): Self = StObject.set(x, "CLIENT_BAD_REQUEST", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCLIENT_BAD_TYPE(value: `0x030f`): Self = StObject.set(x, "CLIENT_BAD_TYPE", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCLIENT_FORBIDDEN(value: `0x0303`): Self = StObject.set(x, "CLIENT_FORBIDDEN", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCLIENT_OVERRUN(value: `0x030d`): Self = StObject.set(x, "CLIENT_OVERRUN", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCLIENT_TIMEOUT(value: `0x0308`): Self = StObject.set(x, "CLIENT_TIMEOUT", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCLIENT_TOO_MANY(value: `0x031d`): Self = StObject.set(x, "CLIENT_TOO_MANY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCLIENT_UNAUTHORIZED(value: `0x0301`): Self = StObject.set(x, "CLIENT_UNAUTHORIZED", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRESOURCE_CLOSED(value: `0x0206`): Self = StObject.set(x, "RESOURCE_CLOSED", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRESOURCE_CONFLICT(value: `0x0205`): Self = StObject.set(x, "RESOURCE_CONFLICT", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRESOURCE_NOT_FOUND(value: `0x0204`): Self = StObject.set(x, "RESOURCE_NOT_FOUND", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSERVER_BUSY(value: `0x0201`): Self = StObject.set(x, "SERVER_BUSY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSERVER_ERROR(value: `0x0200`): Self = StObject.set(x, "SERVER_ERROR", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSESSION_CLOSED(value: `0x020b`): Self = StObject.set(x, "SESSION_CLOSED", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSESSION_CONFLICT(value: `0x0209`): Self = StObject.set(x, "SESSION_CONFLICT", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSESSION_TIMEOUT(value: `0x020a`): Self = StObject.set(x, "SESSION_TIMEOUT", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSUCCESS(value: `0x0000`): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUNSUPPORTED(value: `0x0100`): Self = StObject.set(x, "UNSUPPORTED", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUPSTREAM_ERROR(value: `0x0203`): Self = StObject.set(x, "UPSTREAM_ERROR", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUPSTREAM_NOT_FOUND(value: `0x0207`): Self = StObject.set(x, "UPSTREAM_NOT_FOUND", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUPSTREAM_TIMEOUT(value: `0x0202`): Self = StObject.set(x, "UPSTREAM_TIMEOUT", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUPSTREAM_UNAVAILABLE(value: `0x0208`): Self = StObject.set(x, "UPSTREAM_UNAVAILABLE", value.asInstanceOf[js.Any])
      }
    }
  }
}
