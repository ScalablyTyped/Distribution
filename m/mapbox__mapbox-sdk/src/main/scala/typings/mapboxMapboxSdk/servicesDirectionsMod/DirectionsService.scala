package typings.mapboxMapboxSdk.servicesDirectionsMod

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.geojson
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.polyline6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsService extends StObject {
  
  def getDirections(request: DirectionsRequest[polyline | polyline6]): MapiRequest[DirectionsResponse[Polyline]] = js.native
  @JSName("getDirections")
  def getDirections_geojson(request: DirectionsRequest[geojson]): MapiRequest[DirectionsResponse[MultiLineString | LineString]] = js.native
  @JSName("getDirections")
  def getDirections_polyline(request: DirectionsRequest[polyline]): MapiRequest[DirectionsResponse[Polyline]] = js.native
}
