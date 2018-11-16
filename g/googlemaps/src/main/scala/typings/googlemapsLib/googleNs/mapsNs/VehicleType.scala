package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VehicleType extends js.Object

@JSGlobal("google.maps.VehicleType")
@js.native
object VehicleType extends js.Object {
  @js.native
  sealed trait BUS
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait CABLE_CAR
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait COMMUTER_TRAIN
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait FERRY
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait FUNICULAR
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait GONDOLA_LIFT
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait HEAVY_RAIL
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait HIGH_SPEED_TRAIN
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait INTERCITY_BUS
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait METRO_RAIL
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait MONORAIL
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait OTHER
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait RAIL
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait SHARE_TAXI
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait SUBWAY
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait TRAM
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  @js.native
  sealed trait TROLLEYBUS
    extends googlemapsLib.googleNs.mapsNs.VehicleType
  
  val BUS: BUS with java.lang.String = js.native
  val CABLE_CAR: CABLE_CAR with java.lang.String = js.native
  val COMMUTER_TRAIN: COMMUTER_TRAIN with java.lang.String = js.native
  val FERRY: FERRY with java.lang.String = js.native
  val FUNICULAR: FUNICULAR with java.lang.String = js.native
  val GONDOLA_LIFT: GONDOLA_LIFT with java.lang.String = js.native
  val HEAVY_RAIL: HEAVY_RAIL with java.lang.String = js.native
  val HIGH_SPEED_TRAIN: HIGH_SPEED_TRAIN with java.lang.String = js.native
  val INTERCITY_BUS: INTERCITY_BUS with java.lang.String = js.native
  val METRO_RAIL: METRO_RAIL with java.lang.String = js.native
  val MONORAIL: MONORAIL with java.lang.String = js.native
  val OTHER: OTHER with java.lang.String = js.native
  val RAIL: RAIL with java.lang.String = js.native
  val SHARE_TAXI: SHARE_TAXI with java.lang.String = js.native
  val SUBWAY: SUBWAY with java.lang.String = js.native
  val TRAM: TRAM with java.lang.String = js.native
  val TROLLEYBUS: TROLLEYBUS with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[googlemapsLib.googleNs.mapsNs.VehicleType with java.lang.String] = js.native
}

