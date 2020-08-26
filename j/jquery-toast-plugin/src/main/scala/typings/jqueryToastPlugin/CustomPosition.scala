package typings.jqueryToastPlugin

import typings.jqueryToastPlugin.jqueryToastPluginStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPosition extends js.Object {
  var bottom: Double | auto = js.native
  var left: Double | auto = js.native
  var right: Double | auto = js.native
  var top: Double | auto = js.native
}

object CustomPosition {
  @scala.inline
  def apply(bottom: Double | auto, left: Double | auto, right: Double | auto, top: Double | auto): CustomPosition = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPosition]
  }
  @scala.inline
  implicit class CustomPositionOps[Self <: CustomPosition] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double | auto): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double | auto): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double | auto): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double | auto): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

