package typings.ibmDb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnStr extends js.Object {
  var DATABASE: String = js.native
  var HOSTNAME: String = js.native
  var PORT: Double | String = js.native
  var PROTOCOL: String = js.native
  var PWD: String = js.native
  var UID: String = js.native
}

object ConnStr {
  @scala.inline
  def apply(
    DATABASE: String,
    HOSTNAME: String,
    PORT: Double | String,
    PROTOCOL: String,
    PWD: String,
    UID: String
  ): ConnStr = {
    val __obj = js.Dynamic.literal(DATABASE = DATABASE.asInstanceOf[js.Any], HOSTNAME = HOSTNAME.asInstanceOf[js.Any], PORT = PORT.asInstanceOf[js.Any], PROTOCOL = PROTOCOL.asInstanceOf[js.Any], PWD = PWD.asInstanceOf[js.Any], UID = UID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnStr]
  }
  @scala.inline
  implicit class ConnStrOps[Self <: ConnStr] (val x: Self) extends AnyVal {
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
    def setDATABASE(value: String): Self = this.set("DATABASE", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOSTNAME(value: String): Self = this.set("HOSTNAME", value.asInstanceOf[js.Any])
    @scala.inline
    def setPORT(value: Double | String): Self = this.set("PORT", value.asInstanceOf[js.Any])
    @scala.inline
    def setPROTOCOL(value: String): Self = this.set("PROTOCOL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPWD(value: String): Self = this.set("PWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUID(value: String): Self = this.set("UID", value.asInstanceOf[js.Any])
  }
  
}

