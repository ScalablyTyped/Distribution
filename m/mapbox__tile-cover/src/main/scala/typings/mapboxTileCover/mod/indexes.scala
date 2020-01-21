package typings.mapboxTileCover.mod

import typings.geojson.mod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mapbox/tile-cover", "indexes")
@js.native
object indexes extends js.Object {
  def apply(geom: Geometry, limits: Limits): js.Array[String] = js.native
}

