package typings.jscodeshift.jsxelementMod

import typings.jscodeshift.collectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraversalMethods extends js.Object {
  /**
    * Returns all children that are JSXElements.
    * This method only applies to JSXElement typed collections.
    */
  def childElements(): Collection[JSXElement]
  /**
    * Returns all child nodes, including literals and expressions.
    * This method only applies to JSXElement typed collections.
    */
  def childNodes(): Collection[JSXElementChild]
}

object TraversalMethods {
  @scala.inline
  def apply(childElements: () => Collection[JSXElement], childNodes: () => Collection[JSXElementChild]): TraversalMethods = {
    val __obj = js.Dynamic.literal(childElements = js.Any.fromFunction0(childElements), childNodes = js.Any.fromFunction0(childNodes))
    __obj.asInstanceOf[TraversalMethods]
  }
}

