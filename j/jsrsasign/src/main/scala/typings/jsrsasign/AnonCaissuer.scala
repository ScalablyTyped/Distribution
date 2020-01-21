package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCaissuer extends js.Object {
  var caissuer: js.Array[String]
  var ocsp: js.Array[String]
}

object AnonCaissuer {
  @scala.inline
  def apply(caissuer: js.Array[String], ocsp: js.Array[String]): AnonCaissuer = {
    val __obj = js.Dynamic.literal(caissuer = caissuer.asInstanceOf[js.Any], ocsp = ocsp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCaissuer]
  }
}

