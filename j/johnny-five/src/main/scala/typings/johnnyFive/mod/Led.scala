package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Led")
@js.native
open class Led protected () extends StObject {
  def this(option: Double | String) = this()
  def this(option: LedOption) = this()
  
  var animation: Animation = js.native
  
  def blink(): this.type = js.native
  def blink(callback: js.Function0[Unit]): this.type = js.native
  def blink(ms: Double): this.type = js.native
  def blink(ms: Double, callback: js.Function0[Unit]): this.type = js.native
  def blink(ms: Unit, callback: js.Function0[Unit]): this.type = js.native
  
  def brightness(`val`: Double): this.type = js.native
  
  def fade(brightness: Double): this.type = js.native
  def fade(brightness: Double, ms: Double): this.type = js.native
  def fade(brightness: Double, ms: Double, callback: js.Function0[Unit]): this.type = js.native
  def fade(brightness: Double, ms: Unit, callback: js.Function0[Unit]): this.type = js.native
  
  def fadeIn(): this.type = js.native
  def fadeIn(ms: Double): this.type = js.native
  def fadeIn(ms: Double, callback: js.Function0[Unit]): this.type = js.native
  def fadeIn(ms: Unit, callback: js.Function0[Unit]): this.type = js.native
  
  def fadeOut(): this.type = js.native
  def fadeOut(ms: Double): this.type = js.native
  def fadeOut(ms: Double, callback: js.Function0[Unit]): this.type = js.native
  def fadeOut(ms: Unit, callback: js.Function0[Unit]): this.type = js.native
  
  var id: String = js.native
  
  var isOn: Boolean = js.native
  
  var isRunning: Boolean = js.native
  
  var mode: Double = js.native
  
  def off(): this.type = js.native
  
  def on(): this.type = js.native
  
  var pin: Double = js.native
  
  def pulse(): this.type = js.native
  def pulse(ms: Double): this.type = js.native
  def pulse(ms: Double, callback: js.Function0[Unit]): this.type = js.native
  def pulse(ms: Unit, callback: js.Function0[Unit]): this.type = js.native
  
  def stop(): this.type = js.native
  
  def strobe(): this.type = js.native
  def strobe(callback: js.Function0[Unit]): this.type = js.native
  def strobe(ms: Double): this.type = js.native
  def strobe(ms: Double, callback: js.Function0[Unit]): this.type = js.native
  def strobe(ms: Unit, callback: js.Function0[Unit]): this.type = js.native
  
  def toggle(): this.type = js.native
  
  var value: Double = js.native
}
object Led {
  
  @JSImport("johnny-five", "Led.Digits")
  @js.native
  open class Digits protected () extends StObject {
    def this(option: DigitsOption) = this()
    
    def brightness(index: Double, value: Double): Unit = js.native
    def brightness(value: Double): Unit = js.native
    
    def clear(): Unit = js.native
    def clear(index: Double): Unit = js.native
    
    val devices: Double = js.native
    
    var digitOrder: Double = js.native
    
    def draw(index: Double, position: Double, character: Double): Unit = js.native
    def draw(position: Double, character: Double): Unit = js.native
    
    val isMatrix: Boolean = js.native
    
    def off(): Unit = js.native
    def off(index: Double): Unit = js.native
    
    def on(): Unit = js.native
    def on(index: Double): Unit = js.native
  }
  
  @JSImport("johnny-five", "Led.Matrix")
  @js.native
  open class Matrix protected () extends StObject {
    def this(option: MatrixIC2Option) = this()
    def this(option: MatrixOption) = this()
    
    def brightness(index: Double, value: Double): Unit = js.native
    def brightness(value: Double): Unit = js.native
    
    def clear(): Unit = js.native
    def clear(index: Double): Unit = js.native
    
    def column(index: Double, row: Double, `val`: Double): Unit = js.native
    def column(row: Double, `val`: Double): Unit = js.native
    
    val devices: Double = js.native
    
    def draw(index: Double, position: Double, character: Double): Unit = js.native
    def draw(position: Double, character: Double): Unit = js.native
    
    val isMatrix: Boolean = js.native
    
    def led(index: Double, row: Double, col: Double, state: Any): Unit = js.native
    def led(row: Double, col: Double, state: Any): Unit = js.native
    
    def off(): Unit = js.native
    def off(index: Double): Unit = js.native
    
    def on(): Unit = js.native
    def on(index: Double): Unit = js.native
    
    def row(index: Double, row: Double, `val`: Double): Unit = js.native
    def row(row: Double, `val`: Double): Unit = js.native
  }
  
  @JSImport("johnny-five", "Led.RGB")
  @js.native
  open class RGB protected () extends StObject {
    def this(option: RGBOption) = this()
    
    var blue: Led = js.native
    
    def color(value: String): Unit = js.native
    
    def fadeIn(ms: Double): Unit = js.native
    
    def fadeOut(ms: Double): Unit = js.native
    
    var green: Led = js.native
    
    def intensity(value: Double): Unit = js.native
    
    val isAnode: Boolean = js.native
    
    def off(): Unit = js.native
    
    def on(): Unit = js.native
    
    def pulse(ms: Double): Unit = js.native
    
    var red: Led = js.native
    
    def stop(ms: Double): Unit = js.native
    
    def strobe(ms: Double): Unit = js.native
    
    def toggle(): Unit = js.native
  }
  
  trait DigitsOption extends StObject {
    
    var controller: js.UndefOr[String] = js.undefined
    
    var devices: js.UndefOr[Double] = js.undefined
    
    var pins: Any
  }
  object DigitsOption {
    
    inline def apply(pins: Any): DigitsOption = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigitsOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DigitsOption] (val x: Self) extends AnyVal {
      
      inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setDevices(value: Double): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
      
      inline def setPins(value: Any): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatrixIC2Option extends StObject {
    
    var addresses: js.UndefOr[js.Array[Any]] = js.undefined
    
    var controller: String
    
    var dims: js.UndefOr[Any] = js.undefined
    
    var isBicolor: js.UndefOr[Boolean] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
  }
  object MatrixIC2Option {
    
    inline def apply(controller: String): MatrixIC2Option = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixIC2Option]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatrixIC2Option] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[Any]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      inline def setAddressesVarargs(value: Any*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setDims(value: Any): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
      
      inline def setDimsUndefined: Self = StObject.set(x, "dims", js.undefined)
      
      inline def setIsBicolor(value: Boolean): Self = StObject.set(x, "isBicolor", value.asInstanceOf[js.Any])
      
      inline def setIsBicolorUndefined: Self = StObject.set(x, "isBicolor", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    }
  }
  
  trait MatrixOption extends StObject {
    
    var devices: js.UndefOr[Double] = js.undefined
    
    var pins: Any
  }
  object MatrixOption {
    
    inline def apply(pins: Any): MatrixOption = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatrixOption] (val x: Self) extends AnyVal {
      
      inline def setDevices(value: Double): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
      
      inline def setPins(value: Any): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBOption extends StObject {
    
    var controller: js.UndefOr[String] = js.undefined
    
    var isAnode: js.UndefOr[Boolean] = js.undefined
    
    var pins: js.Array[Double]
  }
  object RGBOption {
    
    inline def apply(pins: js.Array[Double]): RGBOption = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RGBOption] (val x: Self) extends AnyVal {
      
      inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setIsAnode(value: Boolean): Self = StObject.set(x, "isAnode", value.asInstanceOf[js.Any])
      
      inline def setIsAnodeUndefined: Self = StObject.set(x, "isAnode", js.undefined)
      
      inline def setPins(value: js.Array[Double]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      inline def setPinsVarargs(value: Double*): Self = StObject.set(x, "pins", js.Array(value*))
    }
  }
}
