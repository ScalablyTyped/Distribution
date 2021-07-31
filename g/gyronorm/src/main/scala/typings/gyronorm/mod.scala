package typings.gyronorm

import typings.gyronorm.anon.Absolute
import typings.gyronorm.anon.Alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gyronorm", "GyroNorm")
  @js.native
  class GyroNorm () extends StObject {
    
    def init(options: Options): js.Promise[Unit] = js.native
    
    def start(callback: js.Function1[/* data */ MotionAndOrientationPayload, Unit]): Unit = js.native
    
    def startLogging(listener: LogListener): Unit = js.native
    
    def stopLogging(): Unit = js.native
  }
  /* static members */
  object GyroNorm {
    
    @JSImport("gyronorm", "GyroNorm")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gyronorm", "GyroNorm.ACCELERATION")
    @js.native
    def ACCELERATION: String = js.native
    @scala.inline
    def ACCELERATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCELERATION")(x.asInstanceOf[js.Any])
    
    @JSImport("gyronorm", "GyroNorm.ACCELERATION_INCLUDING_GRAVITY")
    @js.native
    def ACCELERATION_INCLUDING_GRAVITY: String = js.native
    @scala.inline
    def ACCELERATION_INCLUDING_GRAVITY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCELERATION_INCLUDING_GRAVITY")(x.asInstanceOf[js.Any])
    
    @JSImport("gyronorm", "GyroNorm.DEVICE_ORIENTATION")
    @js.native
    def DEVICE_ORIENTATION: String = js.native
    @scala.inline
    def DEVICE_ORIENTATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVICE_ORIENTATION")(x.asInstanceOf[js.Any])
    
    @JSImport("gyronorm", "GyroNorm.GAME")
    @js.native
    def GAME: String = js.native
    @scala.inline
    def GAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GAME")(x.asInstanceOf[js.Any])
    
    @JSImport("gyronorm", "GyroNorm.ROTATION_RATE")
    @js.native
    def ROTATION_RATE: String = js.native
    @scala.inline
    def ROTATION_RATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROTATION_RATE")(x.asInstanceOf[js.Any])
    
    @JSImport("gyronorm", "GyroNorm.WORLD")
    @js.native
    def WORLD: String = js.native
    @scala.inline
    def WORLD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WORLD")(x.asInstanceOf[js.Any])
  }
  
  type LogListener = js.Function1[/* data */ LoggerData, Unit]
  
  trait LoggerData extends StObject {
    
    var code: Double
    
    var message: String
  }
  object LoggerData {
    
    @scala.inline
    def apply(code: Double, message: String): LoggerData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerData]
    }
    
    @scala.inline
    implicit class LoggerDataMutableBuilder[Self <: LoggerData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait MotionAndOrientationPayload extends StObject {
    
    var dm: Alpha
    
    var `do`: Absolute
  }
  object MotionAndOrientationPayload {
    
    @scala.inline
    def apply(dm: Alpha, `do`: Absolute): MotionAndOrientationPayload = {
      val __obj = js.Dynamic.literal(dm = dm.asInstanceOf[js.Any])
      __obj.updateDynamic("do")(`do`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MotionAndOrientationPayload]
    }
    
    @scala.inline
    implicit class MotionAndOrientationPayloadMutableBuilder[Self <: MotionAndOrientationPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDm(value: Alpha): Self = StObject.set(x, "dm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDo(value: Absolute): Self = StObject.set(x, "do", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /**
      * How many digits after the decimal point will there be in the return values
      */
    var decimalCount: js.UndefOr[Double] = js.undefined
    
    /**
      * How often GyroNorm returns data (in milliseconds)
      */
    var frequency: js.UndefOr[Double] = js.undefined
    
    /**
      * If the gravity related values to be normalized
      */
    var gravityNormalized: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to be called to log messages from gyronorm.js
      */
    var logger: js.UndefOr[LogListener] = js.undefined
    
    /**
      * Can be GyroNorm.GAME or GyroNorm.WORLD. gn.GAME returns
      * orientation values with respect to the head direction of the device.
      * gn.WORLD returns the orientation values with respect to the actual
      * north direction of the world.
      */
    var orientationBase: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true it will return screen adjusted values
      */
    var screenAdjusted: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimalCount(value: Double): Self = StObject.set(x, "decimalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalCountUndefined: Self = StObject.set(x, "decimalCount", js.undefined)
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setGravityNormalized(value: Boolean): Self = StObject.set(x, "gravityNormalized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityNormalizedUndefined: Self = StObject.set(x, "gravityNormalized", js.undefined)
      
      @scala.inline
      def setLogger(value: /* data */ LoggerData => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setOrientationBase(value: String): Self = StObject.set(x, "orientationBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationBaseUndefined: Self = StObject.set(x, "orientationBase", js.undefined)
      
      @scala.inline
      def setScreenAdjusted(value: Boolean): Self = StObject.set(x, "screenAdjusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenAdjustedUndefined: Self = StObject.set(x, "screenAdjusted", js.undefined)
    }
  }
}
