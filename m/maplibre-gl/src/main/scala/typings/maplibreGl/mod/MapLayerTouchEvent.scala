package typings.maplibreGl.mod

import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerTouchEvent extends MapTouchEvent {
  
  var features: js.UndefOr[js.Array[typings.geojson.mod.Feature[Geometry, GeoJsonProperties]]] = js.native
}
