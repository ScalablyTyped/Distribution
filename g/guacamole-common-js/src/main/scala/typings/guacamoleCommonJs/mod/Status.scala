package typings.guacamoleCommonJs.mod

import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0000`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0100`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0200`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0201`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0202`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0203`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0204`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0205`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0206`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0207`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0208`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0209`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x020a`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x020b`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0300`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0301`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0303`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x0308`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x030d`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x030f`
import typings.guacamoleCommonJs.guacamoleCommonJsNumbers.`0x031d`
import typings.guacamoleCommonJs.statusMod.Status.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "Status")
@js.native
open class Status protected ()
  extends typings.guacamoleCommonJs.statusMod.Status {
  /**
    * @param code The Guacamole status code, as defined by Guacamole.Status.Code.
    * @param [message] An optional human-readable message.
    */
  def this(code: Code) = this()
  def this(code: Code, message: String) = this()
}
object Status {
  
  /* Inlined guacamole-common-js.guacamole-common-js/lib/Status.Status.StatusCode & std.Readonly<{fromHTTPCode (status : number): guacamole-common-js.guacamole-common-js/lib/Status.Status.Code, fromWebSocketCode (code : number): guacamole-common-js.guacamole-common-js/lib/Status.Status.Code}> */
  object Code {
    
    @JSImport("guacamole-common-js", "Status.Code")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.CLIENT_BAD_REQUEST")
    @js.native
    val CLIENT_BAD_REQUEST: `0x0300` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.CLIENT_BAD_TYPE")
    @js.native
    val CLIENT_BAD_TYPE: `0x030f` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.CLIENT_FORBIDDEN")
    @js.native
    val CLIENT_FORBIDDEN: `0x0303` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.CLIENT_OVERRUN")
    @js.native
    val CLIENT_OVERRUN: `0x030d` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.CLIENT_TIMEOUT")
    @js.native
    val CLIENT_TIMEOUT: `0x0308` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.CLIENT_TOO_MANY")
    @js.native
    val CLIENT_TOO_MANY: `0x031d` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.CLIENT_UNAUTHORIZED")
    @js.native
    val CLIENT_UNAUTHORIZED: `0x0301` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.RESOURCE_CLOSED")
    @js.native
    val RESOURCE_CLOSED: `0x0206` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.RESOURCE_CONFLICT")
    @js.native
    val RESOURCE_CONFLICT: `0x0205` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.RESOURCE_NOT_FOUND")
    @js.native
    val RESOURCE_NOT_FOUND: `0x0204` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.SERVER_BUSY")
    @js.native
    val SERVER_BUSY: `0x0201` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.SERVER_ERROR")
    @js.native
    val SERVER_ERROR: `0x0200` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.SESSION_CLOSED")
    @js.native
    val SESSION_CLOSED: `0x020b` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.SESSION_CONFLICT")
    @js.native
    val SESSION_CONFLICT: `0x0209` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.SESSION_TIMEOUT")
    @js.native
    val SESSION_TIMEOUT: `0x020a` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.SUCCESS")
    @js.native
    val SUCCESS: `0x0000` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.UNSUPPORTED")
    @js.native
    val UNSUPPORTED: `0x0100` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.UPSTREAM_ERROR")
    @js.native
    val UPSTREAM_ERROR: `0x0203` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.UPSTREAM_NOT_FOUND")
    @js.native
    val UPSTREAM_NOT_FOUND: `0x0207` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.UPSTREAM_TIMEOUT")
    @js.native
    val UPSTREAM_TIMEOUT: `0x0202` = js.native
    
    @JSImport("guacamole-common-js", "Status.Code.UPSTREAM_UNAVAILABLE")
    @js.native
    val UPSTREAM_UNAVAILABLE: `0x0208` = js.native
    
    inline def fromHTTPCode(status: Double): typings.guacamoleCommonJs.statusMod.Status.Code = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHTTPCode")(status.asInstanceOf[js.Any]).asInstanceOf[typings.guacamoleCommonJs.statusMod.Status.Code]
    
    inline def fromWebSocketCode(code: Double): typings.guacamoleCommonJs.statusMod.Status.Code = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWebSocketCode")(code.asInstanceOf[js.Any]).asInstanceOf[typings.guacamoleCommonJs.statusMod.Status.Code]
  }
}
