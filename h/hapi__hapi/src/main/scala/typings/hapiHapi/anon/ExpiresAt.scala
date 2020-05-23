package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpiresAt extends js.Object {
  var expiresAt: js.UndefOr[scala.Nothing] = js.undefined
  var expiresIn: js.UndefOr[Double] = js.undefined
}

object ExpiresAt {
  @scala.inline
  def apply(expiresIn: js.UndefOr[Double] = js.undefined): ExpiresAt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiresAt]
  }
}

