package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCps extends js.Object {
  var cps: String
  var id: String
  var unotice: String
}

object AnonCps {
  @scala.inline
  def apply(cps: String, id: String, unotice: String): AnonCps = {
    val __obj = js.Dynamic.literal(cps = cps.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], unotice = unotice.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCps]
  }
}

