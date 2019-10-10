package typings.leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object leafletMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.geojson.geojsonMod.Feature
  import typings.geojson.geojsonMod.GeometryObject
  import typings.leaflet.Anon_Active
  import typings.leaflet.leafletStrings.center
  import typings.std.Error
  import typings.std.HTMLElement

  type BoundsExpression = Bounds | BoundsLiteral
  type BoundsLiteral = js.Tuple2[PointTuple, PointTuple]
  type Content = String | HTMLElement
  type Control = Control_
  type CrossOrigin = Boolean | String
  type DoneCallback = js.Function2[/* error */ js.UndefOr[Error], /* tile */ js.UndefOr[HTMLElement], Unit]
  type DragEndEventHandlerFn = js.Function1[/* event */ DragEndEvent, Unit]
  type ErrorEventHandlerFn = js.Function1[/* event */ ErrorEvent, Unit]
  type Icon[T /* <: BaseIconOptions */] = Icon_[T]
  type InternalTiles = StringDictionary[Anon_Active]
  type LatLngBoundsExpression = LatLngBounds | LatLngBoundsLiteral
  type LatLngBoundsLiteral = js.Array[LatLngTuple]
  /* Rewritten from type alias, can be one of: 
    - typings.leaflet.leafletMod.LatLng
    - typings.leaflet.leafletMod.LatLngLiteral
    - typings.leaflet.leafletMod.LatLngTuple
  */
  type LatLngExpression = _LatLngExpression | LatLngTuple
  type LatLngTuple = js.Tuple2[Double, Double]
  type LayerEventHandlerFn = js.Function1[/* event */ LayerEvent, Unit]
  type LayersControlEventHandlerFn = js.Function1[/* event */ LayersControlEvent, Unit]
  type LeafletEventHandlerFn = js.Function1[/* event */ LeafletEvent, Unit]
  type LeafletKeyboardEventHandlerFn = js.Function1[/* event */ LeafletKeyboardEvent, Unit]
  type LeafletMouseEventHandlerFn = js.Function1[/* event */ LeafletMouseEvent, Unit]
  type LocationEventHandlerFn = js.Function1[/* event */ LocationEvent, Unit]
  type PointExpression = Point | PointTuple
  type PointTuple = js.Tuple2[Double, Double]
  type PopupEventHandlerFn = js.Function1[/* event */ PopupEvent, Unit]
  type ResizeEventHandlerFn = js.Function1[/* event */ ResizeEvent, Unit]
  type StyleFunction[P] = js.Function1[/* feature */ js.UndefOr[Feature[GeometryObject, P]], PathOptions]
  type TileErrorEventHandlerFn = js.Function1[/* event */ TileErrorEvent, Unit]
  type TileEventHandlerFn = js.Function1[/* event */ TileEvent, Unit]
  type TooltipEventHandlerFn = js.Function1[/* event */ TooltipEvent, Unit]
  type Zoom = Boolean | center
  type ZoomAnimEventHandlerFn = js.Function1[/* event */ ZoomAnimEvent, Unit]
}
