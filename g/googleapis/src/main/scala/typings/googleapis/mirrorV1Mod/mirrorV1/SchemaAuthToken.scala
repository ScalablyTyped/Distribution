package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAuthToken extends js.Object {
  var authToken: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAuthToken {
  @scala.inline
  def apply(): SchemaAuthToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthToken]
  }
  @scala.inline
  implicit class SchemaAuthTokenOps[Self <: SchemaAuthToken] (val x: Self) extends AnyVal {
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
    def setAuthToken(value: String): Self = this.set("authToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthToken: Self = this.set("authToken", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

