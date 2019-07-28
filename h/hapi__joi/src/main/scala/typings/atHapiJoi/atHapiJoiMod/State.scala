package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var parent: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var reference: js.UndefOr[js.Any] = js.undefined
}

object State {
  @scala.inline
  def apply(key: String = null, parent: js.Any = null, path: String = null, reference: js.Any = null): State = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (path != null) __obj.updateDynamic("path")(path)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    __obj.asInstanceOf[State]
  }
}

