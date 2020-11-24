package typings.jsplumb.mod

import typings.std.Element
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsplumb", "jsPlumb")
@js.native
object jsPlumb extends js.Object {
  
  def addClass(el: NodeListOf[Element], clazz: String): Unit = js.native
  
  def extend(target: js.Object, source: js.Object): js.Any = js.native
  
  def getInstance(): jsPlumbInstance = js.native
  def getInstance(_defaults: Defaults): jsPlumbInstance = js.native
  
  def off(el: js.Any, event: String, handler: js.Function): Unit = js.native
  
  def on(el: js.Any, event: String, delegateSelector: String, handler: js.Function): Unit = js.native
  def on(el: js.Any, event: String, handler: js.Function): Unit = js.native
  
  def removeClass(el: NodeListOf[Element], clazz: String): Unit = js.native
  
  def revalidate(el: Element): Unit = js.native
}
