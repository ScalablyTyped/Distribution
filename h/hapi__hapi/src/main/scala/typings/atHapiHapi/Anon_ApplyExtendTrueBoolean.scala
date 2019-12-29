package typings.atHapiHapi

import typings.atHapiHapi.atHapiHapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyExtendTrueBoolean extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  var extend: `true`
}

object Anon_ApplyExtendTrueBoolean {
  @scala.inline
  def apply(extend: `true`, apply: js.UndefOr[Boolean] = js.undefined): Anon_ApplyExtendTrueBoolean = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any])
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ApplyExtendTrueBoolean]
  }
}

