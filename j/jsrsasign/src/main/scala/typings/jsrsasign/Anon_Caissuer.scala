package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Caissuer extends js.Object {
  var caissuer: js.Array[String]
  var ocsp: js.Array[String]
}

object Anon_Caissuer {
  @scala.inline
  def apply(caissuer: js.Array[String], ocsp: js.Array[String]): Anon_Caissuer = {
    val __obj = js.Dynamic.literal(caissuer = caissuer.asInstanceOf[js.Any], ocsp = ocsp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Caissuer]
  }
}

