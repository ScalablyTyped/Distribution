package typings.leafletFullscreen.mod.Control_

import typings.leaflet.mod.ControlPosition
import typings.leafletFullscreen.leafletFullscreenBooleans.`false`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenOptions extends js.Object {
  var content: js.UndefOr[String] = js.native
  var forcePseudoFullscreen: js.UndefOr[Boolean] = js.native
  var forceSeparateButton: js.UndefOr[Boolean] = js.native
  var fullscreenElement: js.UndefOr[`false` | HTMLElement] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var pseudoFullscreen: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var titleCancel: js.UndefOr[String] = js.native
}

object FullscreenOptions {
  @scala.inline
  def apply(): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenOptions]
  }
  @scala.inline
  implicit class FullscreenOptionsOps[Self <: FullscreenOptions] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setForcePseudoFullscreen(value: Boolean): Self = this.set("forcePseudoFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcePseudoFullscreen: Self = this.set("forcePseudoFullscreen", js.undefined)
    @scala.inline
    def setForceSeparateButton(value: Boolean): Self = this.set("forceSeparateButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceSeparateButton: Self = this.set("forceSeparateButton", js.undefined)
    @scala.inline
    def setFullscreenElement(value: `false` | HTMLElement): Self = this.set("fullscreenElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenElement: Self = this.set("fullscreenElement", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPseudoFullscreen(value: Boolean): Self = this.set("pseudoFullscreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudoFullscreen: Self = this.set("pseudoFullscreen", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleCancel(value: String): Self = this.set("titleCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleCancel: Self = this.set("titleCancel", js.undefined)
  }
  
}

