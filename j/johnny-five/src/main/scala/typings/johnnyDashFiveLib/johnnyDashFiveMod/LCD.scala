package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "LCD")
@js.native
class LCD protected () extends js.Object {
  def this(option: LCDGeneralOption) = this()
  def this(option: LCDI2COption) = this()
  def this(option: LCDParallelOption) = this()
  var cols: scala.Double = js.native
  var id: java.lang.String = js.native
  var rows: scala.Double = js.native
  def autoscroll(): scala.Unit = js.native
  def backlight(): scala.Unit = js.native
  def bgColor(color: js.Any): scala.Unit = js.native
  def blink(): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def cursor(row: scala.Double, col: scala.Double): scala.Unit = js.native
  def display(): scala.Unit = js.native
  def home(): scala.Unit = js.native
  def noAutoscroll(): scala.Unit = js.native
  def noBacklight(): scala.Unit = js.native
  def noBlink(): scala.Unit = js.native
  def noDisplay(): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def on(): scala.Unit = js.native
  def print(message: java.lang.String): scala.Unit = js.native
  def useChar(char: java.lang.String): scala.Unit = js.native
}

