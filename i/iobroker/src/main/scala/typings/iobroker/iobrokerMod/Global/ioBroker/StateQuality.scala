package typings.iobroker.iobrokerMod.Global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StateQuality extends js.Object

@JSGlobal("ioBroker.StateQuality")
@js.native
object StateQuality extends js.Object {
  @js.native
  sealed trait bad extends StateQuality
  
  @js.native
  sealed trait device_not_connected extends StateQuality
  
  @js.native
  sealed trait device_reports_error extends StateQuality
  
  @js.native
  sealed trait general_device_problem extends StateQuality
  
  @js.native
  sealed trait general_problem extends StateQuality
  
  @js.native
  sealed trait general_sensor_problem extends StateQuality
  
   // or undefined or null
  @js.native
  sealed trait good extends StateQuality
  
  @js.native
  sealed trait sensor_not_connected extends StateQuality
  
  @js.native
  sealed trait sensor_reports_error extends StateQuality
  
  /* 0x01 */ val bad: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.bad with Double = js.native
  /* 0x42 */ val device_not_connected: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.device_not_connected with Double = js.native
  /* 0x44 */ val device_reports_error: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.device_reports_error with Double = js.native
  /* 0x41 */ val general_device_problem: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.general_device_problem with Double = js.native
  /* 0x01 */ val general_problem: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.general_problem with Double = js.native
  /* 0x81 */ val general_sensor_problem: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.general_sensor_problem with Double = js.native
  /* 0x00 */ val good: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.good with Double = js.native
  /* 0x82 */ val sensor_not_connected: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.sensor_not_connected with Double = js.native
  /* 0x84 */ val sensor_reports_error: typings.iobroker.iobrokerMod.Global.ioBroker.StateQuality.sensor_reports_error with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StateQuality with Double] = js.native
}

