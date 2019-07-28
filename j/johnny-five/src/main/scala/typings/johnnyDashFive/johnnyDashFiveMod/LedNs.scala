package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveMod.LedNs.DigitsOption
import typings.johnnyDashFive.johnnyDashFiveMod.LedNs.MatrixIC2Option
import typings.johnnyDashFive.johnnyDashFiveMod.LedNs.MatrixOption
import typings.johnnyDashFive.johnnyDashFiveMod.LedNs.RGBOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Led")
@js.native
object LedNs extends js.Object {
  @js.native
  class Digits protected () extends js.Object {
    def this(option: DigitsOption) = this()
    val devices: Double = js.native
    var digitOrder: Double = js.native
    val isMatrix: Boolean = js.native
    def brightness(index: Double, value: Double): Unit = js.native
    def brightness(value: Double): Unit = js.native
    def clear(): Unit = js.native
    def clear(index: Double): Unit = js.native
    def draw(index: Double, position: Double, character: Double): Unit = js.native
    def draw(position: Double, character: Double): Unit = js.native
    def off(): Unit = js.native
    def off(index: Double): Unit = js.native
    def on(): Unit = js.native
    def on(index: Double): Unit = js.native
  }
  
  trait DigitsOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var devices: js.UndefOr[Double] = js.undefined
    var pins: js.Any
  }
  
  @js.native
  class Matrix protected () extends js.Object {
    def this(option: MatrixIC2Option) = this()
    def this(option: MatrixOption) = this()
    val devices: Double = js.native
    val isMatrix: Boolean = js.native
    def brightness(index: Double, value: Double): Unit = js.native
    def brightness(value: Double): Unit = js.native
    def clear(): Unit = js.native
    def clear(index: Double): Unit = js.native
    def column(index: Double, row: Double, `val`: Double): Unit = js.native
    def column(row: Double, `val`: Double): Unit = js.native
    def draw(index: Double, position: Double, character: Double): Unit = js.native
    def draw(position: Double, character: Double): Unit = js.native
    def led(index: Double, row: Double, col: Double, state: js.Any): Unit = js.native
    def led(row: Double, col: Double, state: js.Any): Unit = js.native
    def off(): Unit = js.native
    def off(index: Double): Unit = js.native
    def on(): Unit = js.native
    def on(index: Double): Unit = js.native
    def row(index: Double, row: Double, `val`: Double): Unit = js.native
    def row(row: Double, `val`: Double): Unit = js.native
  }
  
  trait MatrixIC2Option extends js.Object {
    var addresses: js.UndefOr[js.Array[_]] = js.undefined
    var controller: String
    var dims: js.UndefOr[js.Any] = js.undefined
    var isBicolor: js.UndefOr[Boolean] = js.undefined
    var rotation: js.UndefOr[Double] = js.undefined
  }
  
  trait MatrixOption extends js.Object {
    var devices: js.UndefOr[Double] = js.undefined
    var pins: js.Any
  }
  
  @js.native
  class RGB protected () extends js.Object {
    def this(option: RGBOption) = this()
    var blue: Led = js.native
    var green: Led = js.native
    val isAnode: Boolean = js.native
    var red: Led = js.native
    def color(value: String): Unit = js.native
    def fadeIn(ms: Double): Unit = js.native
    def fadeOut(ms: Double): Unit = js.native
    def intensity(value: Double): Unit = js.native
    def off(): Unit = js.native
    def on(): Unit = js.native
    def pulse(ms: Double): Unit = js.native
    def stop(ms: Double): Unit = js.native
    def strobe(ms: Double): Unit = js.native
    def toggle(): Unit = js.native
  }
  
  trait RGBOption extends js.Object {
    var controller: js.UndefOr[String] = js.undefined
    var isAnode: js.UndefOr[Boolean] = js.undefined
    var pins: js.Array[Double]
  }
  
}

