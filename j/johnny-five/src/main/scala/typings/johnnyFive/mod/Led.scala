package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Led")
@js.native
class Led protected () extends StObject {
  def this(option: Double) = this()
  def this(option: LedOption) = this()
  
  def blink(): Unit = js.native
  def blink(ms: Double): Unit = js.native
  
  def brightness(`val`: Double): Unit = js.native
  
  def fade(brightness: Double, ms: Double): Unit = js.native
  
  def fadeIn(ms: Double): Unit = js.native
  
  def fadeOut(ms: Double): Unit = js.native
  
  var id: String = js.native
  
  def off(): Unit = js.native
  
  def on(): Unit = js.native
  
  var pin: Double = js.native
  
  def pulse(ms: Double): Unit = js.native
  
  def stop(ms: Double): Unit = js.native
  
  def strobe(ms: Double): Unit = js.native
  
  def toggle(): Unit = js.native
}
object Led {
  
  @JSImport("johnny-five", "Led.Digits")
  @js.native
  class Digits protected () extends StObject {
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
  class Matrix protected () extends StObject {
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
    
    def led(index: Double, row: Double, col: Double, state: js.Any): Unit = js.native
    def led(row: Double, col: Double, state: js.Any): Unit = js.native
    
    def off(): Unit = js.native
    def off(index: Double): Unit = js.native
    
    def on(): Unit = js.native
    def on(index: Double): Unit = js.native
    
    def row(index: Double, row: Double, `val`: Double): Unit = js.native
    def row(row: Double, `val`: Double): Unit = js.native
  }
  
  @JSImport("johnny-five", "Led.RGB")
  @js.native
  class RGB protected () extends StObject {
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
  
  @js.native
  trait DigitsOption extends StObject {
    
    var controller: js.UndefOr[String] = js.native
    
    var devices: js.UndefOr[Double] = js.native
    
    var pins: js.Any = js.native
  }
  object DigitsOption {
    
    @scala.inline
    def apply(pins: js.Any): DigitsOption = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[DigitsOption]
    }
    
    @scala.inline
    implicit class DigitsOptionMutableBuilder[Self <: DigitsOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setDevices(value: Double): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
      
      @scala.inline
      def setPins(value: js.Any): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MatrixIC2Option extends StObject {
    
    var addresses: js.UndefOr[js.Array[_]] = js.native
    
    var controller: String = js.native
    
    var dims: js.UndefOr[js.Any] = js.native
    
    var isBicolor: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
  }
  object MatrixIC2Option {
    
    @scala.inline
    def apply(controller: String): MatrixIC2Option = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixIC2Option]
    }
    
    @scala.inline
    implicit class MatrixIC2OptionMutableBuilder[Self <: MatrixIC2Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddresses(value: js.Array[_]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
      
      @scala.inline
      def setAddressesVarargs(value: js.Any*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      @scala.inline
      def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDims(value: js.Any): Self = StObject.set(x, "dims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimsUndefined: Self = StObject.set(x, "dims", js.undefined)
      
      @scala.inline
      def setIsBicolor(value: Boolean): Self = StObject.set(x, "isBicolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBicolorUndefined: Self = StObject.set(x, "isBicolor", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    }
  }
  
  @js.native
  trait MatrixOption extends StObject {
    
    var devices: js.UndefOr[Double] = js.native
    
    var pins: js.Any = js.native
  }
  object MatrixOption {
    
    @scala.inline
    def apply(pins: js.Any): MatrixOption = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixOption]
    }
    
    @scala.inline
    implicit class MatrixOptionMutableBuilder[Self <: MatrixOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDevices(value: Double): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
      
      @scala.inline
      def setPins(value: js.Any): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RGBOption extends StObject {
    
    var controller: js.UndefOr[String] = js.native
    
    var isAnode: js.UndefOr[Boolean] = js.native
    
    var pins: js.Array[Double] = js.native
  }
  object RGBOption {
    
    @scala.inline
    def apply(pins: js.Array[Double]): RGBOption = {
      val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBOption]
    }
    
    @scala.inline
    implicit class RGBOptionMutableBuilder[Self <: RGBOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      @scala.inline
      def setIsAnode(value: Boolean): Self = StObject.set(x, "isAnode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAnodeUndefined: Self = StObject.set(x, "isAnode", js.undefined)
      
      @scala.inline
      def setPins(value: js.Array[Double]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinsVarargs(value: Double*): Self = StObject.set(x, "pins", js.Array(value :_*))
    }
  }
}
