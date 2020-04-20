package typings.maquette.interfacesMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /**
    * The DOM node that is used as the root of this [[Projection]].
    */
  val domNode: Element
  def getLastRender(): VNode
  /**
    * Updates the real DOM to match the new virtual DOM tree.
    * @param updatedVnode The updated virtual DOM tree. Note: The selector for the root of the [[VNode]] tree may not change.
    */
  def update(updatedVnode: VNode): Unit
}

object Projection {
  @scala.inline
  def apply(domNode: Element, getLastRender: () => VNode, update: VNode => Unit): Projection = {
    val __obj = js.Dynamic.literal(domNode = domNode.asInstanceOf[js.Any], getLastRender = js.Any.fromFunction0(getLastRender), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[Projection]
  }
}

