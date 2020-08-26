package typings.mapboxMapboxSdk.tilequeryMod

import typings.mapboxGl.mod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileQueryRequest extends js.Object {
  /**
    * The longitude and latitude to be queried.
    */
  var coordinates: LngLatLike = js.native
  /**
    * Whether or not to deduplicate results. (optional, default true)
    */
  var dedupe: Boolean = js.native
  /**
    * Queries for a specific geometry type.
    */
  var geometry: GeometryType = js.native
  var layers: js.UndefOr[js.Array[String]] = js.native
  /**
    * The number of features to return, between 1 and 50. (optional, default 5)
    */
  var limit: Double = js.native
  /**
    * The maps being queried. If you need to composite multiple layers, provide multiple map IDs.
    */
  var mapIds: js.Array[String] = js.native
  /**
    * The approximate distance in meters to query for features. (optional, default 0)
    */
  var radius: Double = js.native
}

object TileQueryRequest {
  @scala.inline
  def apply(
    coordinates: LngLatLike,
    dedupe: Boolean,
    geometry: GeometryType,
    limit: Double,
    mapIds: js.Array[String],
    radius: Double
  ): TileQueryRequest = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], dedupe = dedupe.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], mapIds = mapIds.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileQueryRequest]
  }
  @scala.inline
  implicit class TileQueryRequestOps[Self <: TileQueryRequest] (val x: Self) extends AnyVal {
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
    def setCoordinates(value: LngLatLike): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setDedupe(value: Boolean): Self = this.set("dedupe", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometry(value: GeometryType): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapIdsVarargs(value: String*): Self = this.set("mapIds", js.Array(value :_*))
    @scala.inline
    def setMapIds(value: js.Array[String]): Self = this.set("mapIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayersVarargs(value: String*): Self = this.set("layers", js.Array(value :_*))
    @scala.inline
    def setLayers(value: js.Array[String]): Self = this.set("layers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
  }
  
}

