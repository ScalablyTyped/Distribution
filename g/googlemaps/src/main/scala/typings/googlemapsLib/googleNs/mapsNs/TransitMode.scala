package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitMode extends js.Object

@JSGlobal("google.maps.TransitMode")
@js.native
object TransitMode extends js.Object {
  @js.native
  sealed trait BUS
    extends googlemapsLib.googleNs.mapsNs.TransitMode
  
  @js.native
  sealed trait RAIL
    extends googlemapsLib.googleNs.mapsNs.TransitMode
  
  @js.native
  sealed trait SUBWAY
    extends googlemapsLib.googleNs.mapsNs.TransitMode
  
  @js.native
  sealed trait TRAIN
    extends googlemapsLib.googleNs.mapsNs.TransitMode
  
  @js.native
  sealed trait TRAM
    extends googlemapsLib.googleNs.mapsNs.TransitMode
  
  /* 0 */ val BUS: BUS with scala.Double = js.native
  /* 1 */ val RAIL: RAIL with scala.Double = js.native
  /* 2 */ val SUBWAY: SUBWAY with scala.Double = js.native
  /* 3 */ val TRAIN: TRAIN with scala.Double = js.native
  /* 4 */ val TRAM: TRAM with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.TransitMode with scala.Double] = js.native
}

