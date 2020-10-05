package typings.materialUi.MaterialUI.propTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait origin extends js.Object {
  var horizontal: typings.materialUi.MaterialUI.propTypes.horizontal = js.native
  var vertical: typings.materialUi.MaterialUI.propTypes.vertical = js.native
}

object origin {
  @scala.inline
  def apply(horizontal: horizontal, vertical: vertical): origin = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[origin]
  }
  @scala.inline
  implicit class originOps[Self <: origin] (val x: Self) extends AnyVal {
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
    def setHorizontal(value: horizontal): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertical(value: vertical): Self = this.set("vertical", value.asInstanceOf[js.Any])
  }
  
}

