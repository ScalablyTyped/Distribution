package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitRoutePreference extends js.Object

@JSGlobal("google.maps.TransitRoutePreference")
@js.native
object TransitRoutePreference extends js.Object {
  @js.native
  sealed trait FEWER_TRANSFERS extends TransitRoutePreference
  
  @js.native
  sealed trait LESS_WALKING extends TransitRoutePreference
  
}

