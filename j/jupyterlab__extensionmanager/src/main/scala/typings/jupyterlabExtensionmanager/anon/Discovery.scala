package typings.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Discovery extends js.Object {
  var discovery: js.UndefOr[Kernel] = js.undefined
}

object Discovery {
  @scala.inline
  def apply(discovery: Kernel = null): Discovery = {
    val __obj = js.Dynamic.literal()
    if (discovery != null) __obj.updateDynamic("discovery")(discovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Discovery]
  }
}

