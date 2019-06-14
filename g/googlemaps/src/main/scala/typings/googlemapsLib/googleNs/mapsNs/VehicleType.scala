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
  
  /* 0 */ val BUS: BUS with scala.Double = js.native
  /* 1 */ val CABLE_CAR: CABLE_CAR with scala.Double = js.native
  /* 2 */ val COMMUTER_TRAIN: COMMUTER_TRAIN with scala.Double = js.native
  /* 3 */ val FERRY: FERRY with scala.Double = js.native
  /* 4 */ val FUNICULAR: FUNICULAR with scala.Double = js.native
  /* 5 */ val GONDOLA_LIFT: GONDOLA_LIFT with scala.Double = js.native
  /* 6 */ val HEAVY_RAIL: HEAVY_RAIL with scala.Double = js.native
  /* 7 */ val HIGH_SPEED_TRAIN: HIGH_SPEED_TRAIN with scala.Double = js.native
  /* 8 */ val INTERCITY_BUS: INTERCITY_BUS with scala.Double = js.native
  /* 9 */ val METRO_RAIL: METRO_RAIL with scala.Double = js.native
  /* 10 */ val MONORAIL: MONORAIL with scala.Double = js.native
  /* 11 */ val OTHER: OTHER with scala.Double = js.native
  /* 12 */ val RAIL: RAIL with scala.Double = js.native
  /* 13 */ val SHARE_TAXI: SHARE_TAXI with scala.Double = js.native
  /* 14 */ val SUBWAY: SUBWAY with scala.Double = js.native
  /* 15 */ val TRAM: TRAM with scala.Double = js.native
  /* 16 */ val TROLLEYBUS: TROLLEYBUS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[googlemapsLib.googleNs.mapsNs.VehicleType with scala.Double] = js.native
}

