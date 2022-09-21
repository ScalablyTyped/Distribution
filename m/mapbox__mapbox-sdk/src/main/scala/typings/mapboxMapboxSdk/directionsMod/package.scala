package typings.mapboxMapboxSdk.directionsMod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.mapboxMapboxSdk.directionsMod.^
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default(config: SdkConfig): DirectionsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[DirectionsService]
inline def default(config: typings.mapboxMapboxSdk.mod.default): DirectionsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[DirectionsService]

type DirectionsRequest[T /* <: DirectionsGeometry */] = CommonDirectionsRequest[T] & DirectionsProfileExclusion

type Polyline = String

type RouteGeometry = LineString | MultiLineString | Polyline
