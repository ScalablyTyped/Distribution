package typings.leaflet.mod.Control_

import typings.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScaleOptions extends ControlOptions {
  var imperial: js.UndefOr[Boolean] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var metric: js.UndefOr[Boolean] = js.native
  var updateWhenIdle: js.UndefOr[Boolean] = js.native
}

object ScaleOptions {
  @scala.inline
  def apply(): ScaleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleOptions]
  }
  @scala.inline
  implicit class ScaleOptionsOps[Self <: ScaleOptions] (val x: Self) extends AnyVal {
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
    def setImperial(value: Boolean): Self = this.set("imperial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImperial: Self = this.set("imperial", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMetric(value: Boolean): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setUpdateWhenIdle(value: Boolean): Self = this.set("updateWhenIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateWhenIdle: Self = this.set("updateWhenIdle", js.undefined)
  }
  
}

