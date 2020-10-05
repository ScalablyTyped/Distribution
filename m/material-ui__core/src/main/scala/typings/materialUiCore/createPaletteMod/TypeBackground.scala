package typings.materialUiCore.createPaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeBackground extends js.Object {
  var default: String = js.native
  var paper: String = js.native
}

object TypeBackground {
  @scala.inline
  def apply(default: String, paper: String): TypeBackground = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeBackground]
  }
  @scala.inline
  implicit class TypeBackgroundOps[Self <: TypeBackground] (val x: Self) extends AnyVal {
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaper(value: String): Self = this.set("paper", value.asInstanceOf[js.Any])
  }
  
}

