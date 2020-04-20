package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X509Extension extends js.Object {
  var critical: Boolean
  var oid: String
  var vidx: Double
}

object X509Extension {
  @scala.inline
  def apply(critical: Boolean, oid: String, vidx: Double): X509Extension = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], vidx = vidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[X509Extension]
  }
}

