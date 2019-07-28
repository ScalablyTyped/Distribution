package typings.k6.htmlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/html", "Element")
@js.native
abstract class Element () extends js.Object {
  /** Dictionary of element attributes. */
  def attributes(): StringDictionary[Attribute] = js.native
  /** Count of child elements. */
  def childElementCount(): Double = js.native
  /** Child nodes. */
  def childNodes(): js.Array[Element] = js.native
  /** Child elements. */
  def children(): js.Array[Element] = js.native
  /** Class names. */
  def classList(): js.Array[String] = js.native
  /**
    * Class value.
    * @returns Single string with all class names.
    */
  def className(): js.UndefOr[String] = js.native
  /**
    * Check whether contains element.
    * @param element - Possibly contained element.
    * @returns Whether contains element. Self containment returns `true`.
    */
  def contains(element: Element): Boolean = js.native
  /** First child node. */
  def firstChild(): js.UndefOr[Element] = js.native
  /** First child element. */
  def firstElementChild(): js.UndefOr[Element] = js.native
  /**
    * Get attribute value.
    * @param name - Attribute name.
    * @returns Attribute value.
    */
  def getAttribute(name: String): js.UndefOr[String] = js.native
  /**
    * Get attribute node.
    * @param name - Attribute name.
    * @returns Attribute node.
    */
  def getAttributeNode(name: String): js.UndefOr[Attribute] = js.native
  /**
    * Get descendant elements in class.
    * @param name - Class name.
    * @return Descendant elements in class.
    */
  def getElementsByClassName(name: String): js.Array[Element] = js.native
  /**
    * Get descendant elements with tag name.
    * @param name - Tag name.
    * @return Descendant elements with tag name.
    */
  def getElementsByTagName(name: String): js.Array[Element] = js.native
  /**
    * Check whether has attribute.
    * @param name - Attribute name.
    * @returns Whether has attribute.
    */
  def hasAttribute(name: String): Boolean = js.native
  /** Whether has any attributes. */
  def hasAttributes(): Boolean = js.native
  /** Whether has any child nodes. */
  def hasChildNodes(): Boolean = js.native
  /** Identifier value. */
  def id(): String = js.native
  /** Inner HTML. Markup of content. */
  def innerHTML(): js.UndefOr[String] = js.native
  /** Whether has the default namespace. */
  def isDefaultNamespace(): Boolean = js.native
  /**
    * Check whether node is equal.
    * @param node - Node to check.
    * @returns Whether node has equal HTML representation.
    */
  def isEqualNode(node: Element): Boolean = js.native
  /**
    * Check whether node is identical.
    * @param node - Node to check.
    * @returns Whether node is self.
    */
  def isSameNode(node: Element): Boolean = js.native
  /** Value of `lang` attribute. */
  def lang(): js.UndefOr[String] = js.native
  /** Last child node. */
  def lastChild(): js.UndefOr[Element] = js.native
  /** Last child element. */
  def lastElementChild(): js.UndefOr[Element] = js.native
  /**
    * Check whether matches selector.
    * @param selector - Selector expression.
    * @returns Whether matches selector.
    */
  def matches(selector: String): Boolean = js.native
  /** Namespace URI. */
  def namespaceURI(): String = js.native
  /** Next sibling element. */
  def nextElementSibling(): js.UndefOr[Element] = js.native
  /** Next sibling node. */
  def nextSibling(): js.UndefOr[Element] = js.native
  /** Node name. */
  def nodeName(): String = js.native
  /** Node type. */
  def nodeType(): js.UndefOr[NodeType] = js.native
  /** Node value. */
  def nodeValue(): js.UndefOr[String] = js.native
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
  def querySelector(selector: String): js.UndefOr[Element] = js.native
  /**
    * Select descendant elements.
    * @param selector - Selector expression.
    * @returns All matched elements.
    */
  def querySelectorAll(selector: String): js.Array[Element] = js.native
  /** Text content. */
  def textContent(): String = js.native
}

