package typings
package helmetLib.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetDnsPrefetchControlConfiguration extends js.Object {
  var allow: js.UndefOr[scala.Boolean] = js.undefined
}

object IHelmetDnsPrefetchControlConfiguration {
  @scala.inline
  def apply(allow: js.UndefOr[scala.Boolean] = js.undefined): IHelmetDnsPrefetchControlConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow)) __obj.updateDynamic("allow")(allow)
    __obj.asInstanceOf[IHelmetDnsPrefetchControlConfiguration]
  }
}

