package typings.googlemaps.googleNs.mapsNs

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
  
  /* 0 */ val BUS: typings.googlemaps.googleNs.mapsNs.TransitMode.BUS with Double = js.native
  /* 1 */ val RAIL: typings.googlemaps.googleNs.mapsNs.TransitMode.RAIL with Double = js.native
  /* 2 */ val SUBWAY: typings.googlemaps.googleNs.mapsNs.TransitMode.SUBWAY with Double = js.native
  /* 3 */ val TRAIN: typings.googlemaps.googleNs.mapsNs.TransitMode.TRAIN with Double = js.native
  /* 4 */ val TRAM: typings.googlemaps.googleNs.mapsNs.TransitMode.TRAM with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitMode with Double] = js.native
}

