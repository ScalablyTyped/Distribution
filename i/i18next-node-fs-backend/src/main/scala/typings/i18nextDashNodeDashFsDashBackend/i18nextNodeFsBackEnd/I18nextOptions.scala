package typings.i18nextDashNodeDashFsDashBackend.i18nextNodeFsBackEnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Options for "i18next".
  * @interface
  */
trait I18nextOptions extends js.Object {
  var backend: js.UndefOr[i18nextNodeFsBackEndOptions] = js.undefined
}

object I18nextOptions {
  @scala.inline
  def apply(backend: i18nextNodeFsBackEndOptions = null): I18nextOptions = {
    val __obj = js.Dynamic.literal()
    if (backend != null) __obj.updateDynamic("backend")(backend)
    __obj.asInstanceOf[I18nextOptions]
  }
}

