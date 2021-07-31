package typings.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StateQuality extends StObject
@JSGlobal("ioBroker.StateQuality")
@js.native
object StateQuality extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StateQuality & Double] = js.native
  
  // or undefined or null
  @js.native
  sealed trait bad
    extends StObject
       with StateQuality
  /* 0x01 */ val bad: typings.iobroker.mod.global.ioBroker.StateQuality.bad & Double = js.native
  
  @js.native
  sealed trait device_not_connected
    extends StObject
       with StateQuality
  /* 0x42 */ val device_not_connected: typings.iobroker.mod.global.ioBroker.StateQuality.device_not_connected & Double = js.native
  
  @js.native
  sealed trait device_reports_error
    extends StObject
       with StateQuality
  /* 0x44 */ val device_reports_error: typings.iobroker.mod.global.ioBroker.StateQuality.device_reports_error & Double = js.native
  
  @js.native
  sealed trait general_device_problem
    extends StObject
       with StateQuality
  /* 0x41 */ val general_device_problem: typings.iobroker.mod.global.ioBroker.StateQuality.general_device_problem & Double = js.native
  
  @js.native
  sealed trait general_problem
    extends StObject
       with StateQuality
  /* 0x01 */ val general_problem: typings.iobroker.mod.global.ioBroker.StateQuality.general_problem & Double = js.native
  
  @js.native
  sealed trait general_sensor_problem
    extends StObject
       with StateQuality
  /* 0x81 */ val general_sensor_problem: typings.iobroker.mod.global.ioBroker.StateQuality.general_sensor_problem & Double = js.native
  
  @js.native
  sealed trait good
    extends StObject
       with StateQuality
  /* 0x00 */ val good: typings.iobroker.mod.global.ioBroker.StateQuality.good & Double = js.native
  
  @js.native
  sealed trait sensor_not_connected
    extends StObject
       with StateQuality
  /* 0x82 */ val sensor_not_connected: typings.iobroker.mod.global.ioBroker.StateQuality.sensor_not_connected & Double = js.native
  
  @js.native
  sealed trait sensor_reports_error
    extends StObject
       with StateQuality
  /* 0x84 */ val sensor_reports_error: typings.iobroker.mod.global.ioBroker.StateQuality.sensor_reports_error & Double = js.native
}
