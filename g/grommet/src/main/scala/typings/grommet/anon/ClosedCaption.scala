package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosedCaption extends js.Object {
  var closedCaption: js.UndefOr[js.Any] = js.native
  var color: js.UndefOr[ColorType] = js.native
  var configure: js.UndefOr[js.Any] = js.native
  var fullScreen: js.UndefOr[js.Any] = js.native
  var pause: js.UndefOr[js.Any] = js.native
  var play: js.UndefOr[js.Any] = js.native
  var reduceVolume: js.UndefOr[js.Any] = js.native
  var volume: js.UndefOr[js.Any] = js.native
}

object ClosedCaption {
  @scala.inline
  def apply(): ClosedCaption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedCaption]
  }
  @scala.inline
  implicit class ClosedCaptionOps[Self <: ClosedCaption] (val x: Self) extends AnyVal {
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
    def setClosedCaption(value: js.Any): Self = this.set("closedCaption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedCaption: Self = this.set("closedCaption", js.undefined)
    @scala.inline
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setConfigure(value: js.Any): Self = this.set("configure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigure: Self = this.set("configure", js.undefined)
    @scala.inline
    def setFullScreen(value: js.Any): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setPause(value: js.Any): Self = this.set("pause", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    @scala.inline
    def setPlay(value: js.Any): Self = this.set("play", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlay: Self = this.set("play", js.undefined)
    @scala.inline
    def setReduceVolume(value: js.Any): Self = this.set("reduceVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReduceVolume: Self = this.set("reduceVolume", js.undefined)
    @scala.inline
    def setVolume(value: js.Any): Self = this.set("volume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolume: Self = this.set("volume", js.undefined)
  }
  
}

