package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TravelMode extends StObject
@JSGlobal("google.maps.TravelMode")
@js.native
object TravelMode extends StObject {
  
  @js.native
  sealed trait BICYCLING
    extends StObject
       with TravelMode
  
  @js.native
  sealed trait DRIVING
    extends StObject
       with TravelMode
  
  @js.native
  sealed trait TRANSIT
    extends StObject
       with TravelMode
  
  @js.native
  sealed trait TWO_WHEELER
    extends StObject
       with TravelMode
  
  @js.native
  sealed trait WALKING
    extends StObject
       with TravelMode
}
