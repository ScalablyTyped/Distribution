package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgTyp extends js.Object {
  var alg: String
  var typ: String
}

object Anon_AlgTyp {
  @scala.inline
  def apply(alg: String, typ: String): Anon_AlgTyp = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlgTyp]
  }
}

