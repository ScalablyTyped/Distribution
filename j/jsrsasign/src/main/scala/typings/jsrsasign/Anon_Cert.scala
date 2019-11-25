package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cert extends js.Object {
  var cert: String
  var hasis: Boolean
}

object Anon_Cert {
  @scala.inline
  def apply(cert: String, hasis: Boolean): Anon_Cert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], hasis = hasis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cert]
  }
}

