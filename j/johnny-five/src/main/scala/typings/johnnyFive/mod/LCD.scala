package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("johnny-five", "LCD")
@js.native
class LCD protected () extends js.Object {
  def this(option: LCDGeneralOption) = this()
  def this(option: LCDI2COption) = this()
  def this(option: LCDParallelOption) = this()
  var cols: Double = js.native
  var id: String = js.native
  var rows: Double = js.native
  def autoscroll(): this.type = js.native
  def backlight(): this.type = js.native
  def bgColor(color: js.Any): this.type = js.native
  def blink(): this.type = js.native
  def clear(): this.type = js.native
  def cursor(row: Double, col: Double): this.type = js.native
  def display(): this.type = js.native
  def home(): this.type = js.native
  def noAutoscroll(): this.type = js.native
  def noBacklight(): this.type = js.native
  def noBlink(): this.type = js.native
  def noDisplay(): this.type = js.native
  def off(): this.type = js.native
  def on(): this.type = js.native
  def print(message: String): this.type = js.native
  def useChar(char: String): this.type = js.native
}

