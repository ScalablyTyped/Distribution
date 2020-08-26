package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CircleOptions extends SimpleShapeOptions {
  /**
    * When not metric, use feet instead of yards for display
    *
    * @default true
    */
  var feet: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use the metric measurement system or imperial
    *
    * @default true
    */
  var metric: js.UndefOr[Boolean] = js.native
  /**
    * When not metric, not feet use nautic mile for display
    *
    * @default false
    */
  var nautic: js.UndefOr[Boolean] = js.native
  /**
    * The options used when drawing the circle on the map.
    *
    * @default { stroke: true, color: '#3388ff', weight: 4, opacity: 0.5, fill: true, fillColor: null, fillOpacity: 0.2, clickable: true }
    */
  var shapeOptions: js.UndefOr[PathOptions] = js.native
  /**
    * Whether to show the radius in the tooltip
    *
    * @default true
    */
  var showRadius: js.UndefOr[Boolean] = js.native
}

object CircleOptions {
  @scala.inline
  def apply(): CircleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircleOptions]
  }
  @scala.inline
  implicit class CircleOptionsOps[Self <: CircleOptions] (val x: Self) extends AnyVal {
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
    def setFeet(value: Boolean): Self = this.set("feet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeet: Self = this.set("feet", js.undefined)
    @scala.inline
    def setMetric(value: Boolean): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setNautic(value: Boolean): Self = this.set("nautic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNautic: Self = this.set("nautic", js.undefined)
    @scala.inline
    def setShapeOptions(value: PathOptions): Self = this.set("shapeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeOptions: Self = this.set("shapeOptions", js.undefined)
    @scala.inline
    def setShowRadius(value: Boolean): Self = this.set("showRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRadius: Self = this.set("showRadius", js.undefined)
  }
  
}

