package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeocoderLocationType extends StObject
@JSGlobal("google.maps.GeocoderLocationType")
@js.native
object GeocoderLocationType extends StObject {
  
  @js.native
  sealed trait APPROXIMATE
    extends StObject
       with GeocoderLocationType
  
  @js.native
  sealed trait GEOMETRIC_CENTER
    extends StObject
       with GeocoderLocationType
  
  @js.native
  sealed trait RANGE_INTERPOLATED
    extends StObject
       with GeocoderLocationType
  
  @js.native
  sealed trait ROOFTOP
    extends StObject
       with GeocoderLocationType
}
