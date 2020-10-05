package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MuiName extends js.Object {
  var muiName: String = js.native
}

object MuiName {
  @scala.inline
  def apply(muiName: String): MuiName = {
    val __obj = js.Dynamic.literal(muiName = muiName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MuiName]
  }
  @scala.inline
  implicit class MuiNameOps[Self <: MuiName] (val x: Self) extends AnyVal {
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
    def setMuiName(value: String): Self = this.set("muiName", value.asInstanceOf[js.Any])
  }
  
}

