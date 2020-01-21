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
  def apply(expiresAt: Int | Double = null, expiresIn: Int | Double = null, privacy: String = null): ICacheConfig = {
    val __obj = js.Dynamic.literal()
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICacheConfig]
  }
}

