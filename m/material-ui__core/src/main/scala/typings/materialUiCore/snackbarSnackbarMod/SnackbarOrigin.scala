package typings.materialUiCore.snackbarSnackbarMod

import typings.materialUiCore.materialUiCoreStrings.bottom
import typings.materialUiCore.materialUiCoreStrings.center
import typings.materialUiCore.materialUiCoreStrings.left
import typings.materialUiCore.materialUiCoreStrings.right
import typings.materialUiCore.materialUiCoreStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnackbarOrigin extends js.Object {
  var horizontal: left | center | right = js.native
  var vertical: top | bottom = js.native
}

object SnackbarOrigin {
  @scala.inline
  def apply(horizontal: left | center | right, vertical: top | bottom): SnackbarOrigin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnackbarOrigin]
  }
  @scala.inline
  implicit class SnackbarOriginOps[Self <: SnackbarOrigin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHorizontal(value: left | center | right): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: top | bottom): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
  
}

