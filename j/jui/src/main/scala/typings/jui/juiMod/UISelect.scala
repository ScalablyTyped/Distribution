package typings.jui.juiMod

import typings.jui.Anon_Align
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UISelect extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: Anon_Align): this.type = js.native
  def getSelectedIndex(): Double = js.native
  def getValue(): js.Any | js.Array[_] = js.native
  def setSelectedIndex(index: Double): Unit = js.native
  def setValue(value: js.Any): Unit = js.native
  def setValue(value: js.Array[_]): Unit = js.native
  def update(data: js.Array[_]): Unit = js.native
}

