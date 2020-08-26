package typings.materialDom

import typings.std.EventListenerOptions
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/dom/events", JSImport.Namespace)
@js.native
object eventsMod extends js.Object {
  def applyPassive(): Boolean | EventListenerOptions = js.native
  def applyPassive(globalObj: Window): Boolean | EventListenerOptions = js.native
}

