package typings.lwip.lwipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lwip", "create")
@js.native
object create extends js.Object {
  def apply(width: Double, height: Double, callback: ImageCallback): Unit = js.native
  def apply(width: Double, height: Double, color: Color, callback: ImageCallback): Unit = js.native
}

