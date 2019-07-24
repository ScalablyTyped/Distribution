package typings
package k6Lib.htmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "Element")
@js.native
abstract class Element () extends js.Object {
  var __brand: scala.Nothing = js.native
  /** Dictionary of element attributes. */
  def attributes(): org.scalablytyped.runtime.StringDictionary[Attribute] = js.native
  /** Count of child elements. */
  def childElementCount(): scala.Double = js.native
  /** Child nodes. */
  def childNodes(): js.Array[Element] = js.native
  /** Child elements. */
  def children(): js.Array[Element] = js.native
  /** Class names. */
  def classList(): js.Array[java.lang.String] = js.native
  /**
    * Class value.
    * @returns Single string with all class names.
    */
  def className(): js.UndefOr[java.lang.String] = js.native
  /**
    * Check whether contains element.
    * @param element - Possibly contained element.
    * @returns Whether contains element. Self containment returns `true`.
    */
  def contains(element: Element): scala.Boolean = js.native
  /** First child node. */
  def firstChild(): js.UndefOr[Element] = js.native
  /** First child element. */
  def firstElementChild(): js.UndefOr[Element] = js.native
  /**
    * Get attribute value.
    * @param name - Attribute name.
    * @returns Attribute value.
    */
  def getAttribute(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Get attribute node.
    * @param name - Attribute name.
    * @returns Attribute node.
    */
  def getAttributeNode(name: java.lang.String): js.UndefOr[Attribute] = js.native
  /**
    * Get descendant elements in class.
    * @param name - Class name.
    * @return Descendant elements in class.
    */
  def getElementsByClassName(name: java.lang.String): js.Array[Element] = js.native
  /**
    * Get descendant elements with tag name.
    * @param name - Tag name.
    * @return Descendant elements with tag name.
    */
  def getElementsByTagName(name: java.lang.String): js.Array[Element] = js.native
  /**
    * Check whether has attribute.
    * @param name - Attribute name.
    * @returns Whether has attribute.
    */
  def hasAttribute(name: java.lang.String): scala.Boolean = js.native
  /** Whether has any attributes. */
  def hasAttributes(): scala.Boolean = js.native
  /** Whether has any child nodes. */
  def hasChildNodes(): scala.Boolean = js.native
  /** Identifier value. */
  def id(): java.lang.String = js.native
  /** Inner HTML. Markup of content. */
  def innerHTML(): js.UndefOr[java.lang.String] = js.native
  /** Whether has the default namespace. */
  def isDefaultNamespace(): scala.Boolean = js.native
  /**
    * Check whether node is equal.
    * @param node - Node to check.
    * @returns Whether node has equal HTML representation.
    */
  def isEqualNode(node: Element): scala.Boolean = js.native
  /**
    * Check whether node is identical.
    * @param node - Node to check.
    * @returns Whether node is self.
    */
  def isSameNode(node: Element): scala.Boolean = js.native
  /** Value of `lang` attribute. */
  def lang(): js.UndefOr[java.lang.String] = js.native
  /** Last child node. */
  def lastChild(): js.UndefOr[Element] = js.native
  /** Last child element. */
  def lastElementChild(): js.UndefOr[Element] = js.native
  /**
    * Check whether matches selector.
    * @param selector - Selector expression.
    * @returns Whether matches selector.
    */
  def matches(selector: java.lang.String): scala.Boolean = js.native
  /** Namespace URI. */
  def namespaceURI(): java.lang.String = js.native
  /** Next sibling element. */
  def nextElementSibling(): js.UndefOr[Element] = js.native
  /** Next sibling node. */
  def nextSibling(): js.UndefOr[Element] = js.native
  /** Node name. */
  def nodeName(): java.lang.String = js.native
  /** Node type. */
  def nodeType(): js.UndefOr[NodeType] = js.native
  /** Node value. */
  def nodeValue(): js.UndefOr[java.lang.String] = js.native
  /** Owning document node. */
  def ownerDocument(): js.UndefOr[Element] = js.native
  /** Parent element. */
  def parentElement(): js.UndefOr[Element] = js.native
  /** Parent node. */
  def parentNode(): js.UndefOr[Element] = js.native
  /** Previous sibling element. */
  def previousElementSibling(): js.UndefOr[Element] = js.native
  /** Previous sibling node. */
  def previousSibling(): js.UndefOr[Element] = js.native
  /**
    * Select a single descendant element.
    * @param selector - Selector expression.
    * @returns First matched element.
    */
  def querySelector(selector: java.lang.String): js.UndefOr[Element] = js.native
  /**
    * Select descendant elements.
    * @param selector - Selector expression.
    * @returns All matched elements.
    */
  def querySelectorAll(selector: java.lang.String): js.Array[Element] = js.native
  /** Text content. */
  def textContent(): java.lang.String = js.native
}

