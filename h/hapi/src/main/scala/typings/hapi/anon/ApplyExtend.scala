package typings.hapi.anon

import typings.hapi.hapiBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyExtend extends js.Object {
  @JSName("apply")
  var apply: `true`
  var extend: js.UndefOr[Boolean] = js.undefined
}

object ApplyExtend {
  @scala.inline
  def apply(apply: `true`, extend: js.UndefOr[Boolean] = js.undefined): ApplyExtend = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any])
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyExtend]
  }
}

