package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgTyp extends js.Object {
  var alg: String
  var typ: String
}

object AnonAlgTyp {
  @scala.inline
  def apply(alg: String, typ: String): AnonAlgTyp = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlgTyp]
  }
}

