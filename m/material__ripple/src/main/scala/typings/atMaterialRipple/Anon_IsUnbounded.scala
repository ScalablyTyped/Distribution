package typings.atMaterialRipple

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsUnbounded extends js.Object {
  var isUnbounded: js.UndefOr[Boolean] = js.undefined
}

object Anon_IsUnbounded {
  @scala.inline
  def apply(isUnbounded: js.UndefOr[Boolean] = js.undefined): Anon_IsUnbounded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isUnbounded)) __obj.updateDynamic("isUnbounded")(isUnbounded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IsUnbounded]
  }
}

