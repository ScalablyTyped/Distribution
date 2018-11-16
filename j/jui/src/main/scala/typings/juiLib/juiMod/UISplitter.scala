package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UISplitter extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_BarStyle): this.type = js.native
  @JSName("setDirection")
  def setDirection_horizontal(d: juiLib.juiLibStrings.horizontal): scala.Unit = js.native
  @JSName("setDirection")
  def setDirection_vertical(d: juiLib.juiLibStrings.vertical): scala.Unit = js.native
  def setHide(index: scala.Double): scala.Unit = js.native
  def setInitSize(size: scala.Double): scala.Unit = js.native
  def setShow(index: scala.Double): scala.Unit = js.native
  def toggle(index: scala.Double): scala.Unit = js.native
}

