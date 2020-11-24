package typings.leafletPolylinedecorator.mod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "polylineDecorator")
@js.native
object polylineDecorator extends js.Object {
  
  def apply(
    paths: (Polyline_[LineString | MultiLineString, _]) | (js.Array[Polyline_[LineString | MultiLineString, _]]),
    options: js.UndefOr[PolylineDecoratorOptions]
  ): PolylineDecorator_ = js.native
}
