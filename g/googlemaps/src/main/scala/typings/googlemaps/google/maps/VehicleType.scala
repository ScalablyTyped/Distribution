package typings.googlemaps.google.maps

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
  
  /* 0 */ val BUS: typings.googlemaps.google.maps.VehicleType.BUS with Double = js.native
  /* 1 */ val CABLE_CAR: typings.googlemaps.google.maps.VehicleType.CABLE_CAR with Double = js.native
  /* 2 */ val COMMUTER_TRAIN: typings.googlemaps.google.maps.VehicleType.COMMUTER_TRAIN with Double = js.native
  /* 3 */ val FERRY: typings.googlemaps.google.maps.VehicleType.FERRY with Double = js.native
  /* 4 */ val FUNICULAR: typings.googlemaps.google.maps.VehicleType.FUNICULAR with Double = js.native
  /* 5 */ val GONDOLA_LIFT: typings.googlemaps.google.maps.VehicleType.GONDOLA_LIFT with Double = js.native
  /* 6 */ val HEAVY_RAIL: typings.googlemaps.google.maps.VehicleType.HEAVY_RAIL with Double = js.native
  /* 7 */ val HIGH_SPEED_TRAIN: typings.googlemaps.google.maps.VehicleType.HIGH_SPEED_TRAIN with Double = js.native
  /* 8 */ val INTERCITY_BUS: typings.googlemaps.google.maps.VehicleType.INTERCITY_BUS with Double = js.native
  /* 9 */ val METRO_RAIL: typings.googlemaps.google.maps.VehicleType.METRO_RAIL with Double = js.native
  /* 10 */ val MONORAIL: typings.googlemaps.google.maps.VehicleType.MONORAIL with Double = js.native
  /* 11 */ val OTHER: typings.googlemaps.google.maps.VehicleType.OTHER with Double = js.native
  /* 12 */ val RAIL: typings.googlemaps.google.maps.VehicleType.RAIL with Double = js.native
  /* 13 */ val SHARE_TAXI: typings.googlemaps.google.maps.VehicleType.SHARE_TAXI with Double = js.native
  /* 14 */ val SUBWAY: typings.googlemaps.google.maps.VehicleType.SUBWAY with Double = js.native
  /* 15 */ val TRAM: typings.googlemaps.google.maps.VehicleType.TRAM with Double = js.native
  /* 16 */ val TROLLEYBUS: typings.googlemaps.google.maps.VehicleType.TROLLEYBUS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VehicleType with Double] = js.native
}

