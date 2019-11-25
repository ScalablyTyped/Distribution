package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CriticalOid extends js.Object {
  var critical: Boolean
  var oid: String
  var vidx: Double
}

object Anon_CriticalOid {
  @scala.inline
  def apply(critical: Boolean, oid: String, vidx: Double): Anon_CriticalOid = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], vidx = vidx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CriticalOid]
  }
}

