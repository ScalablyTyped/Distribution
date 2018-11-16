package typings
package impressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impress extends js.Object {
  def getStep(step: js.Any): js.Any = js.native
  def goto(element: js.Any): js.Any = js.native
  def goto(element: js.Any, duration: scala.Double): js.Any = js.native
  def init(): scala.Unit = js.native
  def next(): js.Any = js.native
  def prev(): js.Any = js.native
}

