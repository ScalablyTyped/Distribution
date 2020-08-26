package typings.mapbox.mod.global.L.mapbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridControlOptions extends ControlOptions {
  var follow: js.UndefOr[Boolean] = js.native
  var location: js.UndefOr[Boolean] = js.native
  var pinnable: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var touchTeaser: js.UndefOr[Boolean] = js.native
}

object GridControlOptions {
  @scala.inline
  def apply(): GridControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridControlOptions]
  }
  @scala.inline
  implicit class GridControlOptionsOps[Self <: GridControlOptions] (val x: Self) extends AnyVal {
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
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setLocation(value: Boolean): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setPinnable(value: Boolean): Self = this.set("pinnable", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinnable: Self = this.set("pinnable", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTouchTeaser(value: Boolean): Self = this.set("touchTeaser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchTeaser: Self = this.set("touchTeaser", js.undefined)
  }
  
}

