package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StateQuality extends StObject
@JSGlobal("ioBroker.StateQuality")
@js.native
object StateQuality extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StateQuality with Double] = js.native
  
  // or undefined or null
  @js.native
  sealed trait bad extends StateQuality
  /* 0x01 */ val bad: typings.iobroker.mod.global.ioBroker.StateQuality.bad with Double = js.native
  
  @js.native
  sealed trait device_not_connected extends StateQuality
  /* 0x42 */ val device_not_connected: typings.iobroker.mod.global.ioBroker.StateQuality.device_not_connected with Double = js.native
  
  @js.native
  sealed trait device_reports_error extends StateQuality
  /* 0x44 */ val device_reports_error: typings.iobroker.mod.global.ioBroker.StateQuality.device_reports_error with Double = js.native
  
  @js.native
  sealed trait general_device_problem extends StateQuality
  /* 0x41 */ val general_device_problem: typings.iobroker.mod.global.ioBroker.StateQuality.general_device_problem with Double = js.native
  
  @js.native
  sealed trait general_problem extends StateQuality
  /* 0x01 */ val general_problem: typings.iobroker.mod.global.ioBroker.StateQuality.general_problem with Double = js.native
  
  @js.native
  sealed trait general_sensor_problem extends StateQuality
  /* 0x81 */ val general_sensor_problem: typings.iobroker.mod.global.ioBroker.StateQuality.general_sensor_problem with Double = js.native
  
  @js.native
  sealed trait good extends StateQuality
  /* 0x00 */ val good: typings.iobroker.mod.global.ioBroker.StateQuality.good with Double = js.native
  
  @js.native
  sealed trait sensor_not_connected extends StateQuality
  /* 0x82 */ val sensor_not_connected: typings.iobroker.mod.global.ioBroker.StateQuality.sensor_not_connected with Double = js.native
  
  @js.native
  sealed trait sensor_reports_error extends StateQuality
  /* 0x84 */ val sensor_reports_error: typings.iobroker.mod.global.ioBroker.StateQuality.sensor_reports_error with Double = js.native
}
