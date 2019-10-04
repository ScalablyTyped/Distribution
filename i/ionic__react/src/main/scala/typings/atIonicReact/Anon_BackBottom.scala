package typings.atIonicReact

import typings.atIonicReact.atIonicReactStrings.back
import typings.atIonicReact.atIonicReactStrings.bottom
import typings.atIonicReact.atIonicReactStrings.none
import typings.atIonicReact.atIonicReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackBottom extends js.Object {
  var currentPath: js.UndefOr[String] = js.undefined
  var navigate: js.UndefOr[js.Function2[/* path */ String, /* direction */ back | none, Unit]] = js.undefined
  var slot: js.UndefOr[bottom | top] = js.undefined
}

object Anon_BackBottom {
  @scala.inline
  def apply(
    currentPath: String = null,
    navigate: (/* path */ String, /* direction */ back | none) => Unit = null,
    slot: bottom | top = null
  ): Anon_BackBottom = {
    val __obj = js.Dynamic.literal()
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath)
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction2(navigate))
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackBottom]
  }
}

