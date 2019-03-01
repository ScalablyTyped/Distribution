package typings
package hapiDashDecoratorsLib.hapiDashDecoratorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICacheConfig extends js.Object {
  var expiresAt: js.UndefOr[scala.Double] = js.undefined
  var expiresIn: js.UndefOr[scala.Double] = js.undefined
  var privacy: js.UndefOr[java.lang.String] = js.undefined
}

object ICacheConfig {
  @scala.inline
  def apply(
    expiresAt: scala.Int | scala.Double = null,
    expiresIn: scala.Int | scala.Double = null,
    privacy: java.lang.String = null
  ): ICacheConfig = {
    val __obj = js.Dynamic.literal()
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (privacy != null) __obj.updateDynamic("privacy")(privacy)
    __obj.asInstanceOf[ICacheConfig]
  }
}

