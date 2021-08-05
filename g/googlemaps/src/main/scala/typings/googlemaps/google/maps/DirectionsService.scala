package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsService extends StObject {
  
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]
  ): Unit
}
object DirectionsService {
  
  inline def apply(
    route: (DirectionsRequest, js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]) => Unit
  ): DirectionsService = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route))
    __obj.asInstanceOf[DirectionsService]
  }
  
  extension [Self <: DirectionsService](x: Self) {
    
    inline def setRoute(
      value: (DirectionsRequest, js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]) => Unit
    ): Self = StObject.set(x, "route", js.Any.fromFunction2(value))
  }
}
