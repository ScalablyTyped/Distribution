package typings.mapboxShelfPack.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOption extends js.Object {
  /// If true , the sprite will automatically grow
  var autoResize: js.UndefOr[Boolean] = js.native
}

object CreateOption {
  @scala.inline
  def apply(): CreateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOption]
  }
  @scala.inline
  implicit class CreateOptionOps[Self <: CreateOption] (val x: Self) extends AnyVal {
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
    def setAutoResize(value: Boolean): Self = this.set("autoResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoResize: Self = this.set("autoResize", js.undefined)
  }
  
}

