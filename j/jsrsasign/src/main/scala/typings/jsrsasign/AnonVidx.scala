package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVidx extends js.Object {
  var critical: Boolean
  var oid: String
  var vidx: Double
}

object AnonVidx {
  @scala.inline
  def apply(critical: Boolean, oid: String, vidx: Double): AnonVidx = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], vidx = vidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVidx]
  }
}

