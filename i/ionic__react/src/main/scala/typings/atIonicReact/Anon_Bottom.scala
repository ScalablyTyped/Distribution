package typings.atIonicReact

import typings.atIonicReact.atIonicReactStrings.bottom
import typings.atIonicReact.atIonicReactStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var currentPath: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[bottom | top] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(currentPath: String = null, slot: bottom | top = null): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (currentPath != null) __obj.updateDynamic("currentPath")(currentPath)
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

