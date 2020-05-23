package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgString extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
}

object AlgString {
  @scala.inline
  def apply(alg: String = null): AlgString = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgString]
  }
}

