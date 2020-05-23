package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Curve extends js.Object {
  var curve: String
  var pub: js.UndefOr[String] = js.undefined
}

object Curve {
  @scala.inline
  def apply(curve: String, pub: String = null): Curve = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any])
    if (pub != null) __obj.updateDynamic("pub")(pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
}

