package typings
package jscodeshiftLib.srcCollectionsJSXElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalMethods extends js.Object {
  /**
    * Returns all children that are JSXElements.
    * This method only applies to JSXElement typed collections.
    */
  def childElements(): jscodeshiftLib.srcCollectionMod.Collection[JSXElement]
  /**
    * Returns all child nodes, including literals and expressions.
    * This method only applies to JSXElement typed collections.
    */
  def childNodes(): jscodeshiftLib.srcCollectionMod.Collection[JSXElementChild]
}

object TraversalMethods {
  @scala.inline
  def apply(
    childElements: () => jscodeshiftLib.srcCollectionMod.Collection[JSXElement],
    childNodes: () => jscodeshiftLib.srcCollectionMod.Collection[JSXElementChild]
  ): TraversalMethods = {
    val __obj = js.Dynamic.literal(childElements = js.Any.fromFunction0(childElements), childNodes = js.Any.fromFunction0(childNodes))
  
    __obj.asInstanceOf[TraversalMethods]
  }
}

