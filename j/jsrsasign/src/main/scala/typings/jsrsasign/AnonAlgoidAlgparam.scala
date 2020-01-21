package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgoidAlgparam extends js.Object {
  var algoid: String
  var algparam: String
  var key: String
}

object AnonAlgoidAlgparam {
  @scala.inline
  def apply(algoid: String, algparam: String, key: String): AnonAlgoidAlgparam = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], algparam = algparam.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlgoidAlgparam]
  }
}

