package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Curve extends js.Object {
  var curve: String
  var pub: js.UndefOr[String] = js.undefined
}

object Anon_Curve {
  @scala.inline
  def apply(curve: String, pub: String = null): Anon_Curve = {
    val __obj = js.Dynamic.literal(curve = curve)
    if (pub != null) __obj.updateDynamic("pub")(pub)
    __obj.asInstanceOf[Anon_Curve]
  }
}

