package typings.leaflet.mod.Control_

import typings.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersOptions extends ControlOptions {
  var autoZIndex: js.UndefOr[Boolean] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var hideSingleBase: js.UndefOr[Boolean] = js.native
}

object LayersOptions {
  @scala.inline
  def apply(): LayersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayersOptions]
  }
  @scala.inline
  implicit class LayersOptionsOps[Self <: LayersOptions] (val x: Self) extends AnyVal {
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
    def setAutoZIndex(value: Boolean): Self = this.set("autoZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoZIndex: Self = this.set("autoZIndex", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setHideSingleBase(value: Boolean): Self = this.set("hideSingleBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSingleBase: Self = this.set("hideSingleBase", js.undefined)
  }
  
}

