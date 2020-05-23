package typings.materialRipple.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsUnbounded extends js.Object {
  var isUnbounded: js.UndefOr[Boolean] = js.undefined
}

object IsUnbounded {
  @scala.inline
  def apply(isUnbounded: js.UndefOr[Boolean] = js.undefined): IsUnbounded = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isUnbounded)) __obj.updateDynamic("isUnbounded")(isUnbounded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUnbounded]
  }
}

