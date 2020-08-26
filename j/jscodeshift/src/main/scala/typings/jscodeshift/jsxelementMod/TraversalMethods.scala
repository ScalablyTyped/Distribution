package typings.jscodeshift.jsxelementMod

import typings.jscodeshift.collectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalMethods extends js.Object {
  /**
    * Returns all children that are JSXElements.
    * This method only applies to JSXElement typed collections.
    */
  def childElements(): Collection[JSXElement] = js.native
  /**
    * Returns all child nodes, including literals and expressions.
    * This method only applies to JSXElement typed collections.
    */
  def childNodes(): Collection[JSXElementChild] = js.native
}

object TraversalMethods {
  @scala.inline
  def apply(childElements: () => Collection[JSXElement], childNodes: () => Collection[JSXElementChild]): TraversalMethods = {
    val __obj = js.Dynamic.literal(childElements = js.Any.fromFunction0(childElements), childNodes = js.Any.fromFunction0(childNodes))
    __obj.asInstanceOf[TraversalMethods]
  }
  @scala.inline
  implicit class TraversalMethodsOps[Self <: TraversalMethods] (val x: Self) extends AnyVal {
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
    def setChildElements(value: () => Collection[JSXElement]): Self = this.set("childElements", js.Any.fromFunction0(value))
    @scala.inline
    def setChildNodes(value: () => Collection[JSXElementChild]): Self = this.set("childNodes", js.Any.fromFunction0(value))
  }
  
}

