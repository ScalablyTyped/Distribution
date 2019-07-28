package typings.hapi

import typings.hapi.hapiNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApplyExtendTrue extends js.Object {
  @JSName("apply")
  var apply: `true`
  var extend: js.UndefOr[Boolean] = js.undefined
}

object Anon_ApplyExtendTrue {
  @scala.inline
  def apply(apply: `true`, extend: js.UndefOr[Boolean] = js.undefined): Anon_ApplyExtendTrue = {
    val __obj = js.Dynamic.literal(apply = apply)
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend)
    __obj.asInstanceOf[Anon_ApplyExtendTrue]
  }
}

