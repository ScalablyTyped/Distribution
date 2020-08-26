package typings.guacamoleClient.statusMod.Status

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  SUCCESS :0x0000,   UNSUPPORTED :0x0100,   SERVER_ERROR :0x0200,   SERVER_BUSY :0x0201,   UPSTREAM_TIMEOUT :0x0202,   UPSTREAM_ERROR :0x0203,   RESOURCE_NOT_FOUND :0x0204,   RESOURCE_CONFLICT :0x0205,   RESOURCE_CLOSED :0x0206,   UPSTREAM_NOT_FOUND :0x0207,   UPSTREAM_UNAVAILABLE :0x0208,   SESSION_CONFLICT :0x0209,   SESSION_TIMEOUT :0x020a,   SESSION_CLOSED :0x020b,   CLIENT_BAD_REQUEST :0x0300,   CLIENT_UNAUTHORIZED :0x0301,   CLIENT_FORBIDDEN :0x0303,   CLIENT_TIMEOUT :0x0308,   CLIENT_OVERRUN :0x030d,   CLIENT_BAD_TYPE :0x030f,   CLIENT_TOO_MANY :0x031d}> */
@js.native
trait StatusCode extends js.Object {
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
  implicit class StatusCodeOps[Self <: StatusCode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCLIENT_BAD_REQUEST(value: `0x0300`): Self = this.set("CLIENT_BAD_REQUEST", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIENT_BAD_TYPE(value: `0x030f`): Self = this.set("CLIENT_BAD_TYPE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIENT_FORBIDDEN(value: `0x0303`): Self = this.set("CLIENT_FORBIDDEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIENT_OVERRUN(value: `0x030d`): Self = this.set("CLIENT_OVERRUN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIENT_TIMEOUT(value: `0x0308`): Self = this.set("CLIENT_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIENT_TOO_MANY(value: `0x031d`): Self = this.set("CLIENT_TOO_MANY", value.asInstanceOf[js.Any])
    @scala.inline
    def setCLIENT_UNAUTHORIZED(value: `0x0301`): Self = this.set("CLIENT_UNAUTHORIZED", value.asInstanceOf[js.Any])
    @scala.inline
    def setRESOURCE_CLOSED(value: `0x0206`): Self = this.set("RESOURCE_CLOSED", value.asInstanceOf[js.Any])
    @scala.inline
    def setRESOURCE_CONFLICT(value: `0x0205`): Self = this.set("RESOURCE_CONFLICT", value.asInstanceOf[js.Any])
    @scala.inline
    def setRESOURCE_NOT_FOUND(value: `0x0204`): Self = this.set("RESOURCE_NOT_FOUND", value.asInstanceOf[js.Any])
    @scala.inline
    def setSERVER_BUSY(value: `0x0201`): Self = this.set("SERVER_BUSY", value.asInstanceOf[js.Any])
    @scala.inline
    def setSERVER_ERROR(value: `0x0200`): Self = this.set("SERVER_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSESSION_CLOSED(value: `0x020b`): Self = this.set("SESSION_CLOSED", value.asInstanceOf[js.Any])
    @scala.inline
    def setSESSION_CONFLICT(value: `0x0209`): Self = this.set("SESSION_CONFLICT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSESSION_TIMEOUT(value: `0x020a`): Self = this.set("SESSION_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setSUCCESS(value: `0x0000`): Self = this.set("SUCCESS", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNSUPPORTED(value: `0x0100`): Self = this.set("UNSUPPORTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPSTREAM_ERROR(value: `0x0203`): Self = this.set("UPSTREAM_ERROR", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPSTREAM_NOT_FOUND(value: `0x0207`): Self = this.set("UPSTREAM_NOT_FOUND", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPSTREAM_TIMEOUT(value: `0x0202`): Self = this.set("UPSTREAM_TIMEOUT", value.asInstanceOf[js.Any])
    @scala.inline
    def setUPSTREAM_UNAVAILABLE(value: `0x0208`): Self = this.set("UPSTREAM_UNAVAILABLE", value.asInstanceOf[js.Any])
  }
  
}

