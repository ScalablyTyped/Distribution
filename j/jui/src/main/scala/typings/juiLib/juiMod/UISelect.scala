package typings
package juiLib.juiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UISelect extends js.Object {
  def apply(selector: js.Any): this.type = js.native
  def apply(selector: js.Any, options: juiLib.Anon_Event): this.type = js.native
  def getSelectedIndex(): scala.Double = js.native
  def getValue(): js.Any | js.Array[_] = js.native
  def setSelectedIndex(index: scala.Double): scala.Unit = js.native
  def setValue(value: js.Any): scala.Unit = js.native
  def setValue(value: js.Array[_]): scala.Unit = js.native
  def update(data: js.Array[_]): scala.Unit = js.native
}

