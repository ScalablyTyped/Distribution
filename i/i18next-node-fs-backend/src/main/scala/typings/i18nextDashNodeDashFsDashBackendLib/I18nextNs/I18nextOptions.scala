package typings
package i18nextDashNodeDashFsDashBackendLib.I18nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I18nextOptions
  extends i18nextDashNodeDashFsDashBackendLib.i18nextNodeFsBackEndNs.I18nextOptions

object I18nextOptions {
  @scala.inline
  def apply(
    backend: i18nextDashNodeDashFsDashBackendLib.i18nextNodeFsBackEndNs.i18nextNodeFsBackEndOptions = null
  ): I18nextOptions = {
    val __obj = js.Dynamic.literal()
    if (backend != null) __obj.updateDynamic("backend")(backend)
    __obj.asInstanceOf[I18nextOptions]
  }
}

