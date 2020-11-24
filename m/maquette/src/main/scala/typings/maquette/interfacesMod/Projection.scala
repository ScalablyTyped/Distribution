package typings.maquette.interfacesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Projection extends js.Object {
  
  /**
    * The DOM node that is used as the root of this [[Projection]].
    */
  val domNode: Element = js.native
  
  def getLastRender(): VNode = js.native
  
  /**
    * Updates the real DOM to match the new virtual DOM tree.
    * @param updatedVnode The updated virtual DOM tree. Note: The selector for the root of the [[VNode]] tree may not change.
    */
  def update(updatedVnode: VNode): Unit = js.native
}
object Projection {
  
  @scala.inline
  def apply(domNode: Element, getLastRender: () => VNode, update: VNode => Unit): Projection = {
    val __obj = js.Dynamic.literal(domNode = domNode.asInstanceOf[js.Any], getLastRender = js.Any.fromFunction0(getLastRender), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Projection]
  }
  
  @scala.inline
  implicit class ProjectionOps[Self <: Projection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomNode(value: Element): Self = this.set("domNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLastRender(value: () => VNode): Self = this.set("getLastRender", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: VNode => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
}
