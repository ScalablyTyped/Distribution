package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.calibratedData
import typings.johnnyFive.johnnyFiveStrings.data
import typings.johnnyFive.johnnyFiveStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IR {
  
  object Reflect {
    
    @JSImport("johnny-five", "IR.Reflect.Array")
    @js.native
    class Array protected () extends StObject {
      def this(option: ArrayOption) = this()
      
      def calibrate(): Unit = js.native
      
      def calibrateUntil(predicate: js.Function0[Unit]): Unit = js.native
      
      def disable(): Unit = js.native
      
      def enable(): Unit = js.native
      
      def loadCalibration(option: LoadCalibrationOption): Unit = js.native
      
      def on(event: String, cb: js.Function0[Unit]): this.type = js.native
      @JSName("on")
      def on_calibratedData(event: calibratedData, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
      @JSName("on")
      def on_data(event: data, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
      @JSName("on")
      def on_line(event: line, cb: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
    }
  }
  
  trait ArrayOption extends StObject {
    
    var emitter: Double | String
    
    var freq: js.UndefOr[Double] = js.undefined
    
    var pins: js.Array[Double | String]
  }
  object ArrayOption {
    
    @scala.inline
    def apply(emitter: Double | String, pins: js.Array[Double | String]): ArrayOption = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArrayOption]
    }
    
    @scala.inline
    implicit class ArrayOptionMutableBuilder[Self <: ArrayOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmitter(value: Double | String): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreq(value: Double): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
      
      @scala.inline
      def setPins(value: js.Array[Double | String]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinsVarargs(value: (Double | String)*): Self = StObject.set(x, "pins", js.Array(value :_*))
    }
  }
  
  trait LoadCalibrationOption extends StObject {
    
    var max: js.Array[Double]
    
    var min: js.Array[Double]
  }
  object LoadCalibrationOption {
    
    @scala.inline
    def apply(max: js.Array[Double], min: js.Array[Double]): LoadCalibrationOption = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadCalibrationOption]
    }
    
    @scala.inline
    implicit class LoadCalibrationOptionMutableBuilder[Self <: LoadCalibrationOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: js.Array[Double]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVarargs(value: Double*): Self = StObject.set(x, "max", js.Array(value :_*))
      
      @scala.inline
      def setMin(value: js.Array[Double]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVarargs(value: Double*): Self = StObject.set(x, "min", js.Array(value :_*))
    }
  }
}
