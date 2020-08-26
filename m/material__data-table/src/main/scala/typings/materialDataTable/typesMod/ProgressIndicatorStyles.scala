package typings.materialDataTable.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressIndicatorStyles extends js.Object {
  var height: String = js.native
  var top: String = js.native
}

object ProgressIndicatorStyles {
  @scala.inline
  def apply(height: String, top: String): ProgressIndicatorStyles = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressIndicatorStyles]
  }
  @scala.inline
  implicit class ProgressIndicatorStylesOps[Self <: ProgressIndicatorStyles] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

