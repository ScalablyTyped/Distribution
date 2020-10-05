package typings.leaflet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  type BoundsExpression = typings.leaflet.mod.Bounds_ | typings.leaflet.mod.BoundsLiteral
  type BoundsLiteral = js.Tuple2[typings.leaflet.mod.PointTuple, typings.leaflet.mod.PointTuple]
  type Content = java.lang.String | typings.std.HTMLElement
  type Control_ = typings.leaflet.mod.Control__
  type CrossOrigin = scala.Boolean | java.lang.String
  type DoneCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error], 
    /* tile */ js.UndefOr[typings.std.HTMLElement], 
    scala.Unit
  ]
  type DragEndEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.DragEndEvent, scala.Unit]
  type ErrorEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.ErrorEvent, scala.Unit]
  type Icon_[T /* <: typings.leaflet.mod.BaseIconOptions */] = typings.leaflet.mod.Icon__[T]
  type InternalTiles = org.scalablytyped.runtime.StringDictionary[typings.leaflet.anon.Active]
  type LatLngBoundsExpression = typings.leaflet.mod.LatLngBounds_ | typings.leaflet.mod.LatLngBoundsLiteral
  type LatLngBoundsLiteral = js.Array[typings.leaflet.mod.LatLngTuple]
  /* Rewritten from type alias, can be one of: 
    - typings.leaflet.mod.LatLng_
    - typings.leaflet.mod.LatLngLiteral
    - typings.leaflet.mod.LatLngTuple
  */
  type LatLngExpression = typings.leaflet.mod._LatLngExpression | typings.leaflet.mod.LatLngTuple
  type LatLngTuple = js.Tuple2[scala.Double, scala.Double]
  type LayerEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LayerEvent, scala.Unit]
  type LayersControlEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LayersControlEvent, scala.Unit]
  type LeafletEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LeafletEvent, scala.Unit]
  type LeafletKeyboardEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LeafletKeyboardEvent, scala.Unit]
  type LeafletMouseEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LeafletMouseEvent, scala.Unit]
  type LocationEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.LocationEvent, scala.Unit]
  type PointExpression = typings.leaflet.mod.Point_ | typings.leaflet.mod.PointTuple
  type PointTuple = js.Tuple2[scala.Double, scala.Double]
  type PopupEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.PopupEvent, scala.Unit]
  type ResizeEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.ResizeEvent, scala.Unit]
  type StyleFunction[P] = js.Function1[
    /* feature */ js.UndefOr[typings.geojson.mod.Feature[typings.geojson.mod.GeometryObject, P]], 
    typings.leaflet.mod.PathOptions
  ]
  type TileErrorEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TileErrorEvent, scala.Unit]
  type TileEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TileEvent, scala.Unit]
  type TooltipEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.TooltipEvent, scala.Unit]
  type Zoom = scala.Boolean | typings.leaflet.leafletStrings.center
  type ZoomAnimEventHandlerFn = js.Function1[/* event */ typings.leaflet.mod.ZoomAnimEvent, scala.Unit]
}
