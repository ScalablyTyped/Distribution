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

