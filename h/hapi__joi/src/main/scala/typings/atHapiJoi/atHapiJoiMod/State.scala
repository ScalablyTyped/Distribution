package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var ancestors: js.UndefOr[js.Any] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var localize: js.UndefOr[js.Function1[/* repeated */ js.Any, this.type]] = js.undefined
  var parent: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var reference: js.UndefOr[js.Any] = js.undefined
}

object State {
  @scala.inline
  def apply(
    ancestors: js.Any = null,
    key: String = null,
    localize: /* repeated */ js.Any => State = null,
    parent: js.Any = null,
    path: String = null,
    reference: js.Any = null
  ): State = {
    val __obj = js.Dynamic.literal()
    if (ancestors != null) __obj.updateDynamic("ancestors")(ancestors)
    if (key != null) __obj.updateDynamic("key")(key)
    if (localize != null) __obj.updateDynamic("localize")(js.Any.fromFunction1(localize))
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (path != null) __obj.updateDynamic("path")(path)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    __obj.asInstanceOf[State]
  }
}

