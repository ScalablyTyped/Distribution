package typings.mapboxMapboxSdk.directionsMod

import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsService extends StObject {
  
  def getDirections(request: DirectionsRequest): MapiRequest
}
object DirectionsService {
  
  inline def apply(getDirections: DirectionsRequest => MapiRequest): DirectionsService = {
    val __obj = js.Dynamic.literal(getDirections = js.Any.fromFunction1(getDirections))
    __obj.asInstanceOf[DirectionsService]
  }
  
  extension [Self <: DirectionsService](x: Self) {
    
    inline def setGetDirections(value: DirectionsRequest => MapiRequest): Self = StObject.set(x, "getDirections", js.Any.fromFunction1(value))
  }
}
