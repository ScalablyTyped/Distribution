package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "Element")
@js.native
abstract class Element () extends js.Object {
  var __brand: scala.Nothing = js.native
  def attributes(): org.scalablytyped.runtime.StringDictionary[Attribute] = js.native
  def childElementCount(): scala.Double = js.native
  def childNodes(): js.Array[Element] = js.native
  def children(): js.Array[Element] = js.native
  def classList(): js.Array[java.lang.String] = js.native
  def className(): js.UndefOr[java.lang.String] = js.native
  def contains(element: Element): scala.Boolean = js.native
  def firstChild(): js.UndefOr[Element] = js.native
  def firstElementChild(): js.UndefOr[Element] = js.native
  def getAttribute(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getAttributeNode(name: java.lang.String): js.UndefOr[Attribute] = js.native
  def getElementsByClassName(name: java.lang.String): js.Array[Element] = js.native
  def getElementsByTagName(name: java.lang.String): js.Array[Element] = js.native
  def hasAttribute(name: java.lang.String): scala.Boolean = js.native
  def hasAttributes(): scala.Boolean = js.native
  def hasChildNodes(): scala.Boolean = js.native
  def id(): java.lang.String = js.native
  def innerHTML(): js.UndefOr[java.lang.String] = js.native
  def isDefaultNamespace(): scala.Boolean = js.native
  def isEqualNode(element: Element): scala.Boolean = js.native
  def isSameNode(element: Element): scala.Boolean = js.native
  def lang(): js.UndefOr[java.lang.String] = js.native
  def lastChild(): js.UndefOr[Element] = js.native
  def lastElementChild(): js.UndefOr[Element] = js.native
  def matches(selector: java.lang.String): scala.Boolean = js.native
  def namespaceURI(): java.lang.String = js.native
  def nextElementSibling(): js.UndefOr[Element] = js.native
  def nextSibling(): js.UndefOr[Element] = js.native
  def nodeName(): java.lang.String = js.native
  def nodeType(): js.UndefOr[NodeType] = js.native
  def nodeValue(): js.UndefOr[java.lang.String] = js.native
  def ownerDocument(): js.UndefOr[Element] = js.native
  def parentElement(): js.UndefOr[Element] = js.native
  def parentNode(): js.UndefOr[Element] = js.native
  def previousElementSibling(): js.UndefOr[Element] = js.native
  def previousSibling(): js.UndefOr[Element] = js.native
  def querySelector(selector: java.lang.String): js.UndefOr[Element] = js.native
  def querySelectorAll(selector: java.lang.String): js.Array[Element] = js.native
  def textContent(): java.lang.String = js.native
}

