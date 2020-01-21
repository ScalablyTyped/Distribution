package typings.jupyterlabExtensionmanager.companionsMod

import typings.jupyterlabExtensionmanager.AnonDiscovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJupyterLabPackageData extends js.Object {
  var jupyterlab: js.UndefOr[AnonDiscovery] = js.undefined
}

object IJupyterLabPackageData {
  @scala.inline
  def apply(jupyterlab: AnonDiscovery = null): IJupyterLabPackageData = {
    val __obj = js.Dynamic.literal()
    if (jupyterlab != null) __obj.updateDynamic("jupyterlab")(jupyterlab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJupyterLabPackageData]
  }
}

