package typings.gyronorm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * How many digits after the decimal point will there be in the return values
    */
  var decimalCount: js.UndefOr[Double] = js.native
  
  /**
    * How often GyroNorm returns data (in milliseconds)
    */
  var frequency: js.UndefOr[Double] = js.native
  
  /**
    * If the gravity related values to be normalized
    */
  var gravityNormalized: js.UndefOr[Boolean] = js.native
  
  /**
    * Function to be called to log messages from gyronorm.js
    */
  var logger: js.UndefOr[LogListener] = js.native
  
  /**
    * Can be GyroNorm.GAME or GyroNorm.WORLD. gn.GAME returns
    * orientation values with respect to the head direction of the device.
    * gn.WORLD returns the orientation values with respect to the actual
    * north direction of the world.
    */
  var orientationBase: js.UndefOr[String] = js.native
  
  /**
    * If set to true it will return screen adjusted values
    */
  var screenAdjusted: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecimalCount(value: Double): Self = this.set("decimalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalCount: Self = this.set("decimalCount", js.undefined)
    
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    
    @scala.inline
    def setGravityNormalized(value: Boolean): Self = this.set("gravityNormalized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravityNormalized: Self = this.set("gravityNormalized", js.undefined)
    
    @scala.inline
    def setLogger(value: /* data */ LoggerData => Unit): Self = this.set("logger", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setOrientationBase(value: String): Self = this.set("orientationBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientationBase: Self = this.set("orientationBase", js.undefined)
    
    @scala.inline
    def setScreenAdjusted(value: Boolean): Self = this.set("screenAdjusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenAdjusted: Self = this.set("screenAdjusted", js.undefined)
  }
}
