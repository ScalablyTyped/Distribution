package typings
package inputmaskLib.inputmaskMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLElement extends js.Object {
  var inputmask: js.UndefOr[inputmaskLib.inputmaskMod.Instance] = js.undefined
}

object HTMLElement {
  @scala.inline
  def apply(inputmask: inputmaskLib.inputmaskMod.Instance = null): HTMLElement = {
    val __obj = js.Dynamic.literal()
    if (inputmask != null) __obj.updateDynamic("inputmask")(inputmask)
    __obj.asInstanceOf[HTMLElement]
  }
}

