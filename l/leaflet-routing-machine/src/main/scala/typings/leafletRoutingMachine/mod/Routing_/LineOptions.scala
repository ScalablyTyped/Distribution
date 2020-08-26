package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOptions extends js.Object {
  var addWaypoints: js.UndefOr[Boolean] = js.native
  var extendToWaypoints: Boolean = js.native
  var missingRouteStyles: js.UndefOr[js.Array[PathOptions]] = js.native
  var missingRouteTolerance: Double = js.native
  var styles: js.UndefOr[js.Array[PathOptions]] = js.native
}

object LineOptions {
  @scala.inline
  def apply(extendToWaypoints: Boolean, missingRouteTolerance: Double): LineOptions = {
    val __obj = js.Dynamic.literal(extendToWaypoints = extendToWaypoints.asInstanceOf[js.Any], missingRouteTolerance = missingRouteTolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
  @scala.inline
  implicit class LineOptionsOps[Self <: LineOptions] (val x: Self) extends AnyVal {
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
    def setExtendToWaypoints(value: Boolean): Self = this.set("extendToWaypoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setMissingRouteTolerance(value: Double): Self = this.set("missingRouteTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddWaypoints(value: Boolean): Self = this.set("addWaypoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddWaypoints: Self = this.set("addWaypoints", js.undefined)
    @scala.inline
    def setMissingRouteStylesVarargs(value: PathOptions*): Self = this.set("missingRouteStyles", js.Array(value :_*))
    @scala.inline
    def setMissingRouteStyles(value: js.Array[PathOptions]): Self = this.set("missingRouteStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMissingRouteStyles: Self = this.set("missingRouteStyles", js.undefined)
    @scala.inline
    def setStylesVarargs(value: PathOptions*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[PathOptions]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

