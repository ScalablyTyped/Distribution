package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionInfo extends js.Object {
  var application_name: js.UndefOr[String] = js.native
  var database: js.UndefOr[String] = js.native
  var fallback_application_name: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var password: js.UndefOr[String | Null] = js.native
  var port: js.UndefOr[Double] = js.native
  var ssl: js.UndefOr[Boolean] = js.native
  var user: js.UndefOr[String] = js.native
}

object ConnectionInfo {
  @scala.inline
  def apply(): ConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionInfo]
  }
  @scala.inline
  implicit class ConnectionInfoOps[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
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
    def setApplication_name(value: String): Self = this.set("application_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplication_name: Self = this.set("application_name", js.undefined)
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setFallback_application_name(value: Boolean): Self = this.set("fallback_application_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback_application_name: Self = this.set("fallback_application_name", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPasswordNull: Self = this.set("password", null)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

