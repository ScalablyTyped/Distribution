package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/colors/common.CommonColors> */
@js.native
trait PartialCommonColors extends js.Object {
  var black: js.UndefOr[String] = js.native
  var white: js.UndefOr[String] = js.native
}

object PartialCommonColors {
  @scala.inline
  def apply(): PartialCommonColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCommonColors]
  }
  @scala.inline
  implicit class PartialCommonColorsOps[Self <: PartialCommonColors] (val x: Self) extends AnyVal {
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
    def setBlack(value: String): Self = this.set("black", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlack: Self = this.set("black", js.undefined)
    @scala.inline
    def setWhite(value: String): Self = this.set("white", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhite: Self = this.set("white", js.undefined)
  }
  
}

