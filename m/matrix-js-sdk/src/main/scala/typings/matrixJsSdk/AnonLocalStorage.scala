package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocalStorage extends js.Object {
  var localStorage: js.UndefOr[js.Any] = js.undefined
}

object AnonLocalStorage {
  @scala.inline
  def apply(localStorage: js.Any = null): AnonLocalStorage = {
    val __obj = js.Dynamic.literal()
    if (localStorage != null) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocalStorage]
  }
}

