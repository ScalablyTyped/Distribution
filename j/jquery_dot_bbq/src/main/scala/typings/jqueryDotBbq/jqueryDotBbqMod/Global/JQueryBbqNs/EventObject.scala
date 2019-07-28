package typings.jqueryDotBbq.jqueryDotBbqMod.Global.JQueryBbqNs

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventObject extends JQueryEventObject {
  var fragment: String = js.native
  def getState(): js.Any = js.native
  def getState(key: String): js.Any = js.native
  def getState(key: String, coerce: Boolean): js.Any = js.native
}

