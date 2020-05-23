package typings.jupyterlabApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/application.@jupyterlab/application/lib/frontend.JupyterFrontEnd.IPaths> */
trait PartialIPaths extends js.Object {
  var directories: js.UndefOr[AppSettings] = js.undefined
  var urls: js.UndefOr[App] = js.undefined
}

object PartialIPaths {
  @scala.inline
  def apply(directories: AppSettings = null, urls: App = null): PartialIPaths = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIPaths]
  }
}

