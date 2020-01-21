package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCriticalOid extends js.Object {
  var critical: Boolean
  var oid: String
  var vidx: Double
}

object AnonCriticalOid {
  @scala.inline
  def apply(critical: Boolean, oid: String, vidx: Double): AnonCriticalOid = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], vidx = vidx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCriticalOid]
  }
}

