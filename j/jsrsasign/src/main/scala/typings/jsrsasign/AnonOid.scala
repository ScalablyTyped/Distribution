package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOid extends js.Object {
  var oid: String
}

object AnonOid {
  @scala.inline
  def apply(oid: String): AnonOid = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOid]
  }
}

