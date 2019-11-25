package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apply extends js.Object {
  @JSName("apply")
  var apply: js.UndefOr[Boolean] = js.undefined
  var extend: js.UndefOr[Boolean] = js.undefined
}

object Anon_Apply {
  @scala.inline
  def apply(apply: js.UndefOr[Boolean] = js.undefined, extend: js.UndefOr[Boolean] = js.undefined): Anon_Apply = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(apply)) __obj.updateDynamic("apply")(apply.asInstanceOf[js.Any])
    if (!js.isUndefined(extend)) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Apply]
  }
}

