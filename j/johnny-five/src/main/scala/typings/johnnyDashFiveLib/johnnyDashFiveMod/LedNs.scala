package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "Led")
@js.native
object LedNs extends js.Object {
  @js.native
  class Digits protected () extends js.Object {
    def this(option: DigitsOption) = this()
    val devices: scala.Double = js.native
    var digitOrder: scala.Double = js.native
    val isMatrix: scala.Boolean = js.native
    def brightness(index: scala.Double, value: scala.Double): scala.Unit = js.native
    def brightness(value: scala.Double): scala.Unit = js.native
    def clear(): scala.Unit = js.native
    def clear(index: scala.Double): scala.Unit = js.native
    def draw(index: scala.Double, position: scala.Double, character: scala.Double): scala.Unit = js.native
    def draw(position: scala.Double, character: scala.Double): scala.Unit = js.native
    def off(): scala.Unit = js.native
    def off(index: scala.Double): scala.Unit = js.native
    def on(): scala.Unit = js.native
    def on(index: scala.Double): scala.Unit = js.native
  }
  
  
  trait DigitsOption extends js.Object {
    var controller: js.UndefOr[java.lang.String] = js.undefined
    var devices: js.UndefOr[scala.Double] = js.undefined
    var pins: js.Any
  }
  
  @js.native
  class Matrix protected () extends js.Object {
    def this(option: MatrixIC2Option) = this()
    def this(option: MatrixOption) = this()
    val devices: scala.Double = js.native
    val isMatrix: scala.Boolean = js.native
    def brightness(index: scala.Double, value: scala.Double): scala.Unit = js.native
    def brightness(value: scala.Double): scala.Unit = js.native
    def clear(): scala.Unit = js.native
    def clear(index: scala.Double): scala.Unit = js.native
    def column(index: scala.Double, row: scala.Double, `val`: scala.Double): scala.Unit = js.native
    def column(row: scala.Double, `val`: scala.Double): scala.Unit = js.native
    def draw(index: scala.Double, position: scala.Double, character: scala.Double): scala.Unit = js.native
    def draw(position: scala.Double, character: scala.Double): scala.Unit = js.native
    def led(index: scala.Double, row: scala.Double, col: scala.Double, state: js.Any): scala.Unit = js.native
    def led(row: scala.Double, col: scala.Double, state: js.Any): scala.Unit = js.native
    def off(): scala.Unit = js.native
    def off(index: scala.Double): scala.Unit = js.native
    def on(): scala.Unit = js.native
    def on(index: scala.Double): scala.Unit = js.native
    def row(index: scala.Double, row: scala.Double, `val`: scala.Double): scala.Unit = js.native
    def row(row: scala.Double, `val`: scala.Double): scala.Unit = js.native
  }
  
  
  trait MatrixIC2Option extends js.Object {
    var addresses: js.UndefOr[js.Array[_]] = js.undefined
    var controller: java.lang.String
    var dims: js.UndefOr[js.Any] = js.undefined
    var isBicolor: js.UndefOr[scala.Boolean] = js.undefined
    var rotation: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait MatrixOption extends js.Object {
    var devices: js.UndefOr[scala.Double] = js.undefined
    var pins: js.Any
  }
  
  @js.native
  class RGB protected () extends js.Object {
    def this(option: RGBOption) = this()
    var blue: johnnyDashFiveLib.johnnyDashFiveMod.Led = js.native
    var green: johnnyDashFiveLib.johnnyDashFiveMod.Led = js.native
    val isAnode: scala.Boolean = js.native
    var red: johnnyDashFiveLib.johnnyDashFiveMod.Led = js.native
    def color(value: java.lang.String): scala.Unit = js.native
    def fadeIn(ms: scala.Double): scala.Unit = js.native
    def fadeOut(ms: scala.Double): scala.Unit = js.native
    def intensity(value: scala.Double): scala.Unit = js.native
    def off(): scala.Unit = js.native
    def on(): scala.Unit = js.native
    def pulse(ms: scala.Double): scala.Unit = js.native
    def stop(ms: scala.Double): scala.Unit = js.native
    def strobe(ms: scala.Double): scala.Unit = js.native
    def toggle(): scala.Unit = js.native
  }
  
  
  trait RGBOption extends js.Object {
    var controller: js.UndefOr[java.lang.String] = js.undefined
    var isAnode: js.UndefOr[scala.Boolean] = js.undefined
    var pins: js.Array[scala.Double]
  }
  
}

