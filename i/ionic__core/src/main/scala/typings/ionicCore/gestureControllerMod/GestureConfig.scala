package typings.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureConfig extends js.Object {
  var disableScroll: js.UndefOr[Boolean] = js.native
  var name: String = js.native
  var priority: js.UndefOr[Double] = js.native
}

object GestureConfig {
  @scala.inline
  def apply(name: String): GestureConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureConfig]
  }
  @scala.inline
  implicit class GestureConfigOps[Self <: GestureConfig] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisableScroll(value: Boolean): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScroll: Self = this.set("disableScroll", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
  
}

