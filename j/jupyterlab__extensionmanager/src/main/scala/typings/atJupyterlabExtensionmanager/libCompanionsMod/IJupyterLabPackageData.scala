package typings.atJupyterlabExtensionmanager.libCompanionsMod

import typings.atJupyterlabExtensionmanager.Anon_Discovery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJupyterLabPackageData extends js.Object {
  var jupyterlab: js.UndefOr[Anon_Discovery] = js.undefined
}

object IJupyterLabPackageData {
  @scala.inline
  def apply(jupyterlab: Anon_Discovery = null): IJupyterLabPackageData = {
    val __obj = js.Dynamic.literal()
    if (jupyterlab != null) __obj.updateDynamic("jupyterlab")(jupyterlab)
    __obj.asInstanceOf[IJupyterLabPackageData]
  }
}

