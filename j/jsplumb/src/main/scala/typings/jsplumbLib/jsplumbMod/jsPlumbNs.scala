package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsplumb", "jsPlumb")
@js.native
object jsPlumbNs extends js.Object {
  def addClass(el: stdLib.NodeListOf[stdLib.Element], clazz: java.lang.String): scala.Unit = js.native
  def extend(target: js.Object, source: js.Object): js.Any = js.native
  def getInstance(): jsplumbLib.jsplumbMod.jsPlumbInstance = js.native
  def getInstance(_defaults: jsplumbLib.jsplumbMod.Defaults): jsplumbLib.jsplumbMod.jsPlumbInstance = js.native
  def off(el: js.Any, event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(el: js.Any, event: java.lang.String, delegateSelector: java.lang.String, handler: js.Function): scala.Unit = js.native
  def on(el: js.Any, event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def removeClass(el: stdLib.NodeListOf[stdLib.Element], clazz: java.lang.String): scala.Unit = js.native
  def revalidate(el: stdLib.Element): scala.Unit = js.native
}

