package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typ extends js.Object {
  var alg: String
  var typ: String
}

object Typ {
  @scala.inline
  def apply(alg: String, typ: String): Typ = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typ]
  }
}

