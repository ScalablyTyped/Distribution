package typings.loopback.anon

import typings.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashAlgorithm extends js.Object {
  var acls: js.Array[ACL] = js.native
  var hashAlgorithm: String = js.native
  var http: Path = js.native
  var ignoreErrors: Boolean = js.native
}

object HashAlgorithm {
  @scala.inline
  def apply(acls: js.Array[ACL], hashAlgorithm: String, http: Path, ignoreErrors: Boolean): HashAlgorithm = {
    val __obj = js.Dynamic.literal(acls = acls.asInstanceOf[js.Any], hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], ignoreErrors = ignoreErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashAlgorithm]
  }
  @scala.inline
  implicit class HashAlgorithmOps[Self <: HashAlgorithm] (val x: Self) extends AnyVal {
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
    def setAclsVarargs(value: ACL*): Self = this.set("acls", js.Array(value :_*))
    @scala.inline
    def setAcls(value: js.Array[ACL]): Self = this.set("acls", value.asInstanceOf[js.Any])
    @scala.inline
    def setHashAlgorithm(value: String): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttp(value: Path): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreErrors(value: Boolean): Self = this.set("ignoreErrors", value.asInstanceOf[js.Any])
  }
  
}

