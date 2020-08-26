package typings.ionicCore.gestureControllerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockerConfig extends js.Object {
  var disable: js.UndefOr[js.Array[String]] = js.native
  var disableScroll: js.UndefOr[Boolean] = js.native
}

object BlockerConfig {
  @scala.inline
  def apply(): BlockerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockerConfig]
  }
  @scala.inline
  implicit class BlockerConfigOps[Self <: BlockerConfig] (val x: Self) extends AnyVal {
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
    def setDisableVarargs(value: String*): Self = this.set("disable", js.Array(value :_*))
    @scala.inline
    def setDisable(value: js.Array[String]): Self = this.set("disable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    @scala.inline
    def setDisableScroll(value: Boolean): Self = this.set("disableScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableScroll: Self = this.set("disableScroll", js.undefined)
  }
  
}

