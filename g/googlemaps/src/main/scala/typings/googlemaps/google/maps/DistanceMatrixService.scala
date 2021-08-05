package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A service for computing distances between multiple origins and destinations.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixService Maps JavaScript API}
  */
trait DistanceMatrixService extends StObject {
  
  /**
    * Issues a distance matrix request.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/distance-matrix#DistanceMatrixService.getDistanceMatrix Maps JavaScript API}
    */
  def getDistanceMatrix(
    request: DistanceMatrixRequest,
    callback: js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, Unit]
  ): Unit
}
object DistanceMatrixService {
  
  inline def apply(
    getDistanceMatrix: (DistanceMatrixRequest, js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, Unit]) => Unit
  ): DistanceMatrixService = {
    val __obj = js.Dynamic.literal(getDistanceMatrix = js.Any.fromFunction2(getDistanceMatrix))
    __obj.asInstanceOf[DistanceMatrixService]
  }
  
  extension [Self <: DistanceMatrixService](x: Self) {
    
    inline def setGetDistanceMatrix(
      value: (DistanceMatrixRequest, js.Function2[/* response */ DistanceMatrixResponse, /* status */ DistanceMatrixStatus, Unit]) => Unit
    ): Self = StObject.set(x, "getDistanceMatrix", js.Any.fromFunction2(value))
  }
}
