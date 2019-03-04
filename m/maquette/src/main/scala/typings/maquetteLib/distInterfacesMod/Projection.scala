package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Projection extends js.Object {
  /**
    * The DOM node that is used as the root of this [[Projection]].
    */
  val domNode: stdLib.Element
  def getLastRender(): VNode
  /**
    * Updates the real DOM to match the new virtual DOM tree.
    * @param updatedVnode The updated virtual DOM tree. Note: The selector for the root of the [[VNode]] tree may not change.
    */
  def update(updatedVnode: VNode): scala.Unit
}

object Projection {
  @scala.inline
  def apply(
    domNode: stdLib.Element,
    getLastRender: js.Function0[VNode],
    update: js.Function1[VNode, scala.Unit]
  ): Projection = {
    val __obj = js.Dynamic.literal(domNode = domNode, getLastRender = getLastRender, update = update)
  
    __obj.asInstanceOf[Projection]
  }
}

