package typings.helmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetDnsPrefetchControlConfiguration extends js.Object {
  var allow: js.UndefOr[Boolean] = js.undefined
}

object IHelmetDnsPrefetchControlConfiguration {
  @scala.inline
  def apply(allow: js.UndefOr[Boolean] = js.undefined): IHelmetDnsPrefetchControlConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow)) __obj.updateDynamic("allow")(allow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHelmetDnsPrefetchControlConfiguration]
  }
}

