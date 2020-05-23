package typings.materialAnimation

import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/animation", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val transformStyleProperties: js.Array[String] = js.native
  def getCorrectEventName(windowObj: Window, eventType: String): String = js.native
  def getCorrectPropertyName(windowObj: Window, eventType: String): String = js.native
}

