package typings.materialTabs.tabComponentMod

import typings.materialBase.componentMod.MDCComponent
import typings.materialTabs.tabFoundationMod.MDCTabFoundation
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tabs/tab/component", "MDCTab")
@js.native
class MDCTab () extends MDCComponent[MDCTabFoundation] {
  
  val computedLeft: Double = js.native
  
  val computedWidth: Double = js.native
  
  var isActive: Boolean = js.native
  
  def measureSelf(): Unit = js.native
  
  var preventDefaultOnClick: Boolean = js.native
  
  var root_ : HTMLElement = js.native
}
/* static members */
@JSImport("@material/tabs/tab/component", "MDCTab")
@js.native
object MDCTab extends js.Object {
  
  def attachTo(root: Element): MDCTab = js.native
}
