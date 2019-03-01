package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutVirtualElements extends js.Object {
  var allowedBindings: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  def childNodes(node: KnockoutVirtualElement): js.Array[stdLib.Node]
  def emptyNode(node: KnockoutVirtualElement): scala.Unit
  def firstChild(node: KnockoutVirtualElement): KnockoutVirtualElement
  def insertAfter(container: KnockoutVirtualElement, nodeToInsert: stdLib.Node, insertAfter: stdLib.Node): scala.Unit
  def nextSibling(node: KnockoutVirtualElement): stdLib.Node
  def prepend(node: KnockoutVirtualElement, toInsert: stdLib.Node): scala.Unit
  def setDomNodeChildren(node: KnockoutVirtualElement, newChildren: Anon_Index): scala.Unit
}

object KnockoutVirtualElements {
  @scala.inline
  def apply(
    allowedBindings: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    childNodes: js.Function1[KnockoutVirtualElement, js.Array[stdLib.Node]],
    emptyNode: js.Function1[KnockoutVirtualElement, scala.Unit],
    firstChild: js.Function1[KnockoutVirtualElement, KnockoutVirtualElement],
    insertAfter: js.Function3[KnockoutVirtualElement, stdLib.Node, stdLib.Node, scala.Unit],
    nextSibling: js.Function1[KnockoutVirtualElement, stdLib.Node],
    prepend: js.Function2[KnockoutVirtualElement, stdLib.Node, scala.Unit],
    setDomNodeChildren: js.Function2[KnockoutVirtualElement, Anon_Index, scala.Unit]
  ): KnockoutVirtualElements = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedBindings")(allowedBindings)
    __obj.updateDynamic("childNodes")(childNodes)
    __obj.updateDynamic("emptyNode")(emptyNode)
    __obj.updateDynamic("firstChild")(firstChild)
    __obj.updateDynamic("insertAfter")(insertAfter)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("prepend")(prepend)
    __obj.updateDynamic("setDomNodeChildren")(setDomNodeChildren)
    __obj.asInstanceOf[KnockoutVirtualElements]
  }
}

