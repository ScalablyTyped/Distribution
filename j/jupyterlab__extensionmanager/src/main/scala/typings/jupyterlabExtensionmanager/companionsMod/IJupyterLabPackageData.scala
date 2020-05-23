package typings.jupyterlabExtensionmanager.companionsMod

import typings.jupyterlabExtensionmanager.anon.Discovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJupyterLabPackageData extends js.Object {
  var jupyterlab: js.UndefOr[Discovery] = js.undefined
}

object IJupyterLabPackageData {
  @scala.inline
  def apply(jupyterlab: Discovery = null): IJupyterLabPackageData = {
    val __obj = js.Dynamic.literal()
    if (jupyterlab != null) __obj.updateDynamic("jupyterlab")(jupyterlab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJupyterLabPackageData]
  }
}

