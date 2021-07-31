package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.DistanceMatrixRequest
import typings.googlemaps.google.maps.DistanceMatrixResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service for computing distances between multiple origins and destinations.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixService Maps JavaScript API}
  */
@JSGlobal("google.maps.DistanceMatrixService")
@js.native
class DistanceMatrixService ()
  extends StObject
     with typings.googlemaps.google.maps.DistanceMatrixService {
  
  /**
    * Issues a distance matrix request.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixService.getDistanceMatrix Maps JavaScript API}
    */
  /* CompleteClass */
  override def getDistanceMatrix(
    request: DistanceMatrixRequest,
    callback: js.Function2[
      /* response */ DistanceMatrixResponse, 
      /* status */ typings.googlemaps.google.maps.DistanceMatrixStatus, 
      Unit
    ]
  ): Unit = js.native
}
