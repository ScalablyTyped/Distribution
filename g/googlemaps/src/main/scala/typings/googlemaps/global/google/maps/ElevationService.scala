package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.ElevationResult
import typings.googlemaps.google.maps.LocationElevationRequest
import typings.googlemaps.google.maps.PathElevationRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.ElevationService")
@js.native
class ElevationService ()
  extends StObject
     with typings.googlemaps.google.maps.ElevationService {
  
  /* CompleteClass */
  override def getElevationAlongPath(
    request: PathElevationRequest,
    callback: js.Function2[
      /* results */ js.Array[ElevationResult], 
      /* status */ typings.googlemaps.google.maps.ElevationStatus, 
      Unit
    ]
  ): Unit = js.native
  
  /* CompleteClass */
  override def getElevationForLocations(
    request: LocationElevationRequest,
    callback: js.Function2[
      /* results */ js.Array[ElevationResult], 
      /* status */ typings.googlemaps.google.maps.ElevationStatus, 
      Unit
    ]
  ): Unit = js.native
}
