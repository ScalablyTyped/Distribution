package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the rendering of the map type control. */
@js.native
trait MapTypeControlOptions extends js.Object {
  /** IDs of map types to show in the control. */
  var mapTypeIds: js.UndefOr[js.Array[MapTypeId | String]] = js.native
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_RIGHT.
    */
  var position: js.UndefOr[ControlPosition] = js.native
  /** Style id. Used to select what style of map type control to display. */
  var style: js.UndefOr[MapTypeControlStyle] = js.native
}

object MapTypeControlOptions {
  @scala.inline
  def apply(): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  @scala.inline
  implicit class MapTypeControlOptionsOps[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
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
    def setMapTypeIdsVarargs(value: (MapTypeId | String)*): Self = this.set("mapTypeIds", js.Array(value :_*))
    @scala.inline
    def setMapTypeIds(value: js.Array[MapTypeId | String]): Self = this.set("mapTypeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeIds: Self = this.set("mapTypeIds", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStyle(value: MapTypeControlStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

