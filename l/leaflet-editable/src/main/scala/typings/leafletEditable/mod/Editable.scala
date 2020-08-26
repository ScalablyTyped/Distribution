package typings.leafletEditable.mod

import org.scalablytyped.runtime.TopLevel
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Make geometries editable in Leaflet.
  *
  * This is not a plug and play UI, and will not. This is a minimal, lightweight, and fully extendable API to
  * control editing of geometries. So you can easily build your own UI with your own needs and choices.
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Mixin.LeafletMixinEvents * / any */ @js.native
trait Editable extends js.Object {
  var currentPolygon: Polyline | Polygon | Marker = js.native
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var options: EditOptions = js.native
  /**
    * When you need to commit any ongoing drawing, without needing to know which editor is active.
    */
  def commitDrawing(): Unit = js.native
  /**
    * Start adding a marker. If latlng is given, the marker will be shown first at this point. In any case, it
    * will follow the user mouse, and will have a final latlng on next click (or touch). If options is given,
    * it will be passed to the marker class constructor.
    */
  def startMarker(): Marker = js.native
  def startMarker(latLng: js.UndefOr[scala.Nothing], options: MarkerOptions): Marker = js.native
  def startMarker(latLng: LatLng_): Marker = js.native
  def startMarker(latLng: LatLng_, options: MarkerOptions): Marker = js.native
  /**
    * Start drawing a polygon. If latlng is given, a first point will be added. In any case, continuing on user
    * click. If options is given, it will be passed to the polygon class constructor.
    */
  def startPolygon(): Polygon = js.native
  def startPolygon(latLng: js.UndefOr[scala.Nothing], options: PolylineOptions): Polygon = js.native
  def startPolygon(latLng: LatLng_): Polygon = js.native
  def startPolygon(latLng: LatLng_, options: PolylineOptions): Polygon = js.native
  /**
    * Start drawing a polyline. If latlng is given, a first point will be added. In any case, continuing on user
    * click. If options is given, it will be passed to the polyline class constructor.
    */
  def startPolyline(): Polyline = js.native
  def startPolyline(latLng: js.UndefOr[scala.Nothing], options: PolylineOptions): Polyline = js.native
  def startPolyline(latLng: LatLng_): Polyline = js.native
  def startPolyline(latLng: LatLng_, options: PolylineOptions): Polyline = js.native
  /**
    * When you need to stop any ongoing drawing, without needing to know which editor is active.
    */
  def stopDrawing(): Unit = js.native
}

@JSImport("leaflet", "Editable")
@js.native
object Editable extends TopLevel[EditableStatic]

