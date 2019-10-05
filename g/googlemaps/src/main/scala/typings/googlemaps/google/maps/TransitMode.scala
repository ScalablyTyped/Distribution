package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitMode extends js.Object

@JSGlobal("google.maps.TransitMode")
@js.native
object TransitMode extends js.Object {
  @js.native
  sealed trait BUS extends TransitMode
  
  @js.native
  sealed trait RAIL extends TransitMode
  
  @js.native
  sealed trait SUBWAY extends TransitMode
  
  @js.native
  sealed trait TRAIN extends TransitMode
  
  @js.native
  sealed trait TRAM extends TransitMode
  
  /* 0 */ val BUS: typings.googlemaps.google.maps.TransitMode.BUS with Double = js.native
  /* 1 */ val RAIL: typings.googlemaps.google.maps.TransitMode.RAIL with Double = js.native
  /* 2 */ val SUBWAY: typings.googlemaps.google.maps.TransitMode.SUBWAY with Double = js.native
  /* 3 */ val TRAIN: typings.googlemaps.google.maps.TransitMode.TRAIN with Double = js.native
  /* 4 */ val TRAM: typings.googlemaps.google.maps.TransitMode.TRAM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitMode with Double] = js.native
}

