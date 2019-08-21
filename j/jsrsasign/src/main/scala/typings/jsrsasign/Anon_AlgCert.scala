package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgCert extends js.Object {
  var alg: String
  var cert: String
}

object Anon_AlgCert {
  @scala.inline
  def apply(alg: String, cert: String): Anon_AlgCert = {
    val __obj = js.Dynamic.literal(alg = alg, cert = cert)
  
    __obj.asInstanceOf[Anon_AlgCert]
  }
}

