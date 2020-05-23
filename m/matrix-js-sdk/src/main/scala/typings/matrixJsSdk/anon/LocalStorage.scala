package typings.matrixJsSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStorage extends js.Object {
  var localStorage: js.UndefOr[js.Any] = js.undefined
}

object LocalStorage {
  @scala.inline
  def apply(localStorage: js.Any = null): LocalStorage = {
    val __obj = js.Dynamic.literal()
    if (localStorage != null) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStorage]
  }
}

