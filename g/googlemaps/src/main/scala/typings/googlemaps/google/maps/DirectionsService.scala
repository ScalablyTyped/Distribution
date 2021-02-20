package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsService extends StObject {
  
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]
  ): Unit = js.native
}
object DirectionsService {
  
  @scala.inline
  def apply(
    route: (DirectionsRequest, js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]) => Unit
  ): DirectionsService = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route))
    __obj.asInstanceOf[DirectionsService]
  }
  
  @scala.inline
  implicit class DirectionsServiceMutableBuilder[Self <: DirectionsService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoute(
      value: (DirectionsRequest, js.Function2[/* result */ DirectionsResult, /* status */ DirectionsStatus, Unit]) => Unit
    ): Self = StObject.set(x, "route", js.Any.fromFunction2(value))
  }
}
