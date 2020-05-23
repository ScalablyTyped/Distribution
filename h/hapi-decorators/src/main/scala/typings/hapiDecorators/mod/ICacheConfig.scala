package typings.hapiDecorators.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICacheConfig extends js.Object {
  var expiresAt: js.UndefOr[Double] = js.undefined
  var expiresIn: js.UndefOr[Double] = js.undefined
  var privacy: js.UndefOr[String] = js.undefined
}

object ICacheConfig {
  @scala.inline
  def apply(
    expiresAt: js.UndefOr[Double] = js.undefined,
    expiresIn: js.UndefOr[Double] = js.undefined,
    privacy: String = null
  ): ICacheConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expiresAt)) __obj.updateDynamic("expiresAt")(expiresAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.get.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICacheConfig]
  }
}

