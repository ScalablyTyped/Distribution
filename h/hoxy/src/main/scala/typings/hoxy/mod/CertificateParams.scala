package typings.hoxy.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateParams extends js.Object {
  var cert: String | (js.Array[Buffer | String]) | Buffer = js.native
  var key: String | (js.Array[Buffer | js.Object | String]) | Buffer = js.native
}

object CertificateParams {
  @scala.inline
  def apply(
    cert: String | (js.Array[Buffer | String]) | Buffer,
    key: String | (js.Array[Buffer | js.Object | String]) | Buffer
  ): CertificateParams = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateParams]
  }
  @scala.inline
  implicit class CertificateParamsOps[Self <: CertificateParams] (val x: Self) extends AnyVal {
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
    def setCertVarargs(value: (Buffer | String)*): Self = this.set("cert", js.Array(value :_*))
    @scala.inline
    def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyVarargs(value: (Buffer | js.Object | String)*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: String | (js.Array[Buffer | js.Object | String]) | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

