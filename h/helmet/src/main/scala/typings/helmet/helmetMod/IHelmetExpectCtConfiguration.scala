package typings.helmet.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetExpectCtConfiguration extends js.Object {
  var enforce: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var reportUri: js.UndefOr[String] = js.undefined
}

object IHelmetExpectCtConfiguration {
  @scala.inline
  def apply(enforce: js.UndefOr[Boolean] = js.undefined, maxAge: Int | Double = null, reportUri: String = null): IHelmetExpectCtConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enforce)) __obj.updateDynamic("enforce")(enforce)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri)
    __obj.asInstanceOf[IHelmetExpectCtConfiguration]
  }
}

