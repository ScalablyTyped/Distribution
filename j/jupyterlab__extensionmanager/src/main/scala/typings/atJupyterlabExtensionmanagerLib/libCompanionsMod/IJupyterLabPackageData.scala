package typings
package atJupyterlabExtensionmanagerLib.libCompanionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJupyterLabPackageData extends js.Object {
  var jupyterlab: js.UndefOr[atJupyterlabExtensionmanagerLib.Anon_Discovery] = js.undefined
}

object IJupyterLabPackageData {
  @scala.inline
  def apply(jupyterlab: atJupyterlabExtensionmanagerLib.Anon_Discovery = null): IJupyterLabPackageData = {
    val __obj = js.Dynamic.literal()
    if (jupyterlab != null) __obj.updateDynamic("jupyterlab")(jupyterlab)
    __obj.asInstanceOf[IJupyterLabPackageData]
  }
}

