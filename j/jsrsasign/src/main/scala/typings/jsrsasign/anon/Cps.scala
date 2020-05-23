package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cps extends js.Object {
  var cps: String
  var id: String
  var unotice: String
}

object Cps {
  @scala.inline
  def apply(cps: String, id: String, unotice: String): Cps = {
    val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unotice = unotice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cps]
  }
}

