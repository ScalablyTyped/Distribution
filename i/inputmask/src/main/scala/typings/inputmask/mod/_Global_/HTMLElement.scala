package typings.inputmask.mod._Global_

import typings.inputmask.mod.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var inputmask: js.UndefOr[Instance] = js.undefined
}

object HTMLElement {
  @scala.inline
  def apply(inputmask: Instance = null): HTMLElement = {
    val __obj = js.Dynamic.literal()
    if (inputmask != null) __obj.updateDynamic("inputmask")(inputmask.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLElement]
  }
}

