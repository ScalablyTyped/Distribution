package typings.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiscovery extends js.Object {
  var discovery: js.UndefOr[AnonKernel] = js.undefined
}

object AnonDiscovery {
  @scala.inline
  def apply(discovery: AnonKernel = null): AnonDiscovery = {
    val __obj = js.Dynamic.literal()
    if (discovery != null) __obj.updateDynamic("discovery")(discovery.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiscovery]
  }
}

