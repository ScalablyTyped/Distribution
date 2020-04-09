package typings.hoxy.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateParams extends js.Object {
  var cert: String | (js.Array[Buffer | String]) | Buffer
  var key: String | (js.Array[Buffer | js.Object | String]) | Buffer
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
}

