package typings.hapiNes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketAuthObject extends js.Object {
  var artifacts: js.Any = js.native
  var credentials: js.Any = js.native
  var isAuthenticated: Boolean = js.native
}

object SocketAuthObject {
  @scala.inline
  def apply(artifacts: js.Any, credentials: js.Any, isAuthenticated: Boolean): SocketAuthObject = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketAuthObject]
  }
  @scala.inline
  implicit class SocketAuthObjectOps[Self <: SocketAuthObject] (val x: Self) extends AnyVal {
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
    def setArtifacts(value: js.Any): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentials(value: js.Any): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAuthenticated(value: Boolean): Self = this.set("isAuthenticated", value.asInstanceOf[js.Any])
  }
  
}

