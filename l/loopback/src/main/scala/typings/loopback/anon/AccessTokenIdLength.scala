package typings.loopback.anon

import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessTokenIdLength extends js.Object {
  var accessTokenIdLength: Double = js.native
  var acls: js.Array[ACL] = js.native
  var http: Path = js.native
}

object AccessTokenIdLength {
  @scala.inline
  def apply(accessTokenIdLength: Double, acls: js.Array[ACL], http: Path): AccessTokenIdLength = {
    val __obj = js.Dynamic.literal(accessTokenIdLength = accessTokenIdLength.asInstanceOf[js.Any], acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenIdLength]
  }
  @scala.inline
  implicit class AccessTokenIdLengthOps[Self <: AccessTokenIdLength] (val x: Self) extends AnyVal {
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
    def setAccessTokenIdLength(value: Double): Self = this.set("accessTokenIdLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setAclsVarargs(value: ACL*): Self = this.set("acls", js.Array(value :_*))
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = this.set("acls", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: Path): Self = this.set("http", value.asInstanceOf[js.Any])
  }
  
}

