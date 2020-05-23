package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Caissuer extends js.Object {
  var caissuer: js.Array[String]
  var ocsp: js.Array[String]
}

object Caissuer {
  @scala.inline
  def apply(caissuer: js.Array[String], ocsp: js.Array[String]): Caissuer = {
    val __obj = js.Dynamic.literal(caissuer = caissuer.asInstanceOf[js.Any], ocsp = ocsp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caissuer]
  }
}

