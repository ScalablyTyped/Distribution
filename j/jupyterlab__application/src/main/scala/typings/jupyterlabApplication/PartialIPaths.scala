package typings.jupyterlabApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IPaths> */
trait PartialIPaths extends js.Object {
  var directories: js.UndefOr[AnonAppSettings] = js.undefined
  var urls: js.UndefOr[AnonApp] = js.undefined
}

object PartialIPaths {
  @scala.inline
  def apply(directories: AnonAppSettings = null, urls: AnonApp = null): PartialIPaths = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIPaths]
  }
}

