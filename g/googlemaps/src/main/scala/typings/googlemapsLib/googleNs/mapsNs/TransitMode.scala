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
  
  val BUS: BUS with java.lang.String = js.native
  val RAIL: RAIL with java.lang.String = js.native
  val SUBWAY: SUBWAY with java.lang.String = js.native
  val TRAIN: TRAIN with java.lang.String = js.native
  val TRAM: TRAM with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.TransitMode with java.lang.String] = js.native
}

