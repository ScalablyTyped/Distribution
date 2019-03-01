package typings
package helmetLib.helmetMod.helmetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetExpectCtConfiguration extends js.Object {
  var enforce: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var reportUri: js.UndefOr[java.lang.String] = js.undefined
}

object IHelmetExpectCtConfiguration {
  @scala.inline
  def apply(
    enforce: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    reportUri: java.lang.String = null
  ): IHelmetExpectCtConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enforce)) __obj.updateDynamic("enforce")(enforce)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri)
    __obj.asInstanceOf[IHelmetExpectCtConfiguration]
  }
}

