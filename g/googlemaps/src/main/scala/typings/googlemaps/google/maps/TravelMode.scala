package typings.googlemaps.google.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TravelMode extends js.Object

@JSGlobal("google.maps.TravelMode")
@js.native
object TravelMode extends js.Object {
  @js.native
  sealed trait BICYCLING extends TravelMode
  
  @js.native
  sealed trait DRIVING extends TravelMode
  
  @js.native
  sealed trait TRANSIT extends TravelMode
  
  @js.native
  sealed trait TWO_WHEELER extends TravelMode
  
  @js.native
  sealed trait WALKING extends TravelMode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TravelMode with String] = js.native
  /* "BICYCLING" */ @js.native
  object BICYCLING extends TopLevel[BICYCLING with String]
  
  /* "DRIVING" */ @js.native
  object DRIVING extends TopLevel[DRIVING with String]
  
  /* "TRANSIT" */ @js.native
  object TRANSIT extends TopLevel[TRANSIT with String]
  
  /* "TWO_WHEELER" */ @js.native
  object TWO_WHEELER extends TopLevel[TWO_WHEELER with String]
  
  /* "WALKING" */ @js.native
  object WALKING extends TopLevel[WALKING with String]
  
}

