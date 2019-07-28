package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VehicleType extends js.Object

@JSGlobal("google.maps.VehicleType")
@js.native
object VehicleType extends js.Object {
  @js.native
  sealed trait BUS extends VehicleType
  
  @js.native
  sealed trait CABLE_CAR extends VehicleType
  
  @js.native
  sealed trait COMMUTER_TRAIN extends VehicleType
  
  @js.native
  sealed trait FERRY extends VehicleType
  
  @js.native
  sealed trait FUNICULAR extends VehicleType
  
  @js.native
  sealed trait GONDOLA_LIFT extends VehicleType
  
  @js.native
  sealed trait HEAVY_RAIL extends VehicleType
  
  @js.native
  sealed trait HIGH_SPEED_TRAIN extends VehicleType
  
  @js.native
  sealed trait INTERCITY_BUS extends VehicleType
  
  @js.native
  sealed trait METRO_RAIL extends VehicleType
  
  @js.native
  sealed trait MONORAIL extends VehicleType
  
  @js.native
  sealed trait OTHER extends VehicleType
  
  @js.native
  sealed trait RAIL extends VehicleType
  
  @js.native
  sealed trait SHARE_TAXI extends VehicleType
  
  @js.native
  sealed trait SUBWAY extends VehicleType
  
  @js.native
  sealed trait TRAM extends VehicleType
  
  @js.native
  sealed trait TROLLEYBUS extends VehicleType
  
  /* 0 */ val BUS: typings.googlemaps.googleNs.mapsNs.VehicleType.BUS with Double = js.native
  /* 1 */ val CABLE_CAR: typings.googlemaps.googleNs.mapsNs.VehicleType.CABLE_CAR with Double = js.native
  /* 2 */ val COMMUTER_TRAIN: typings.googlemaps.googleNs.mapsNs.VehicleType.COMMUTER_TRAIN with Double = js.native
  /* 3 */ val FERRY: typings.googlemaps.googleNs.mapsNs.VehicleType.FERRY with Double = js.native
  /* 4 */ val FUNICULAR: typings.googlemaps.googleNs.mapsNs.VehicleType.FUNICULAR with Double = js.native
  /* 5 */ val GONDOLA_LIFT: typings.googlemaps.googleNs.mapsNs.VehicleType.GONDOLA_LIFT with Double = js.native
  /* 6 */ val HEAVY_RAIL: typings.googlemaps.googleNs.mapsNs.VehicleType.HEAVY_RAIL with Double = js.native
  /* 7 */ val HIGH_SPEED_TRAIN: typings.googlemaps.googleNs.mapsNs.VehicleType.HIGH_SPEED_TRAIN with Double = js.native
  /* 8 */ val INTERCITY_BUS: typings.googlemaps.googleNs.mapsNs.VehicleType.INTERCITY_BUS with Double = js.native
  /* 9 */ val METRO_RAIL: typings.googlemaps.googleNs.mapsNs.VehicleType.METRO_RAIL with Double = js.native
  /* 10 */ val MONORAIL: typings.googlemaps.googleNs.mapsNs.VehicleType.MONORAIL with Double = js.native
  /* 11 */ val OTHER: typings.googlemaps.googleNs.mapsNs.VehicleType.OTHER with Double = js.native
  /* 12 */ val RAIL: typings.googlemaps.googleNs.mapsNs.VehicleType.RAIL with Double = js.native
  /* 13 */ val SHARE_TAXI: typings.googlemaps.googleNs.mapsNs.VehicleType.SHARE_TAXI with Double = js.native
  /* 14 */ val SUBWAY: typings.googlemaps.googleNs.mapsNs.VehicleType.SUBWAY with Double = js.native
  /* 15 */ val TRAM: typings.googlemaps.googleNs.mapsNs.VehicleType.TRAM with Double = js.native
  /* 16 */ val TROLLEYBUS: typings.googlemaps.googleNs.mapsNs.VehicleType.TROLLEYBUS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VehicleType with Double] = js.native
}

