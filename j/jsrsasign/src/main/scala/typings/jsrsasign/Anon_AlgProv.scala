package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlgProv extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var prov: js.UndefOr[String] = js.undefined
}

object Anon_AlgProv {
  @scala.inline
  def apply(alg: String = null, prov: String = null): Anon_AlgProv = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (prov != null) __obj.updateDynamic("prov")(prov.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlgProv]
  }
}

