package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgString extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
}

object Anon_AlgString {
  @scala.inline
  def apply(alg: String = null): Anon_AlgString = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    __obj.asInstanceOf[Anon_AlgString]
  }
}

