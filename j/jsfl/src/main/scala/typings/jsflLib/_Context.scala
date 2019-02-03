package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("_Context")
@js.native
class _Context () extends js.Object {
  var elements: js.Array[FlashElement] = js.native
  var frame: FlashFrame = js.native
  var keyframes: js.Array[FlashFrame] = js.native
  var layer: FlashLayer = js.native
  def goto(): js.Any = js.native
  def setLayer(index: scala.Double): js.Any = js.native
  def update(): js.Any = js.native
}

/* static members */
@JSGlobal("_Context")
@js.native
object _Context extends js.Object {
  def create(): jsflLib._Context = js.native
  def from(frame: jsflLib.FlashFrame): jsflLib._Context = js.native
}

