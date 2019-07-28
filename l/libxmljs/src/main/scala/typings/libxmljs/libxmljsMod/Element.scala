package typings.libxmljs.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxmljs", "Element")
@js.native
class Element protected () extends Node {
  def this(doc: Document, name: String) = this()
  def this(doc: Document, name: String, content: String) = this()
  /**
    * @return The original element, not the child.
    */
  def addChild(child: Element): this.type = js.native
  def addNextSibling(siblingNode: Node): Node = js.native
  def addPrevSibling(siblingNode: Node): Node = js.native
  def attr(attrObject: StringMap): this.type = js.native
  def attr(name: String): Attribute | Null = js.native
  def attrs(): js.Array[Attribute] = js.native
  def child(idx: Double): Node | Null = js.native
  def childNodes(): js.Array[Node] = js.native
  def defineNamespace(prefixOrHref: String): Namespace = js.native
  def defineNamespace(prefixOrHref: String, hrefInCaseOfPrefix: String): Namespace = js.native
  def find(xpath: String): js.Array[Node] = js.native
  def find(xpath: String, namespaces: StringMap): js.Array[Node] = js.native
  def find(xpath: String, ns_uri: String): js.Array[Node] = js.native
  def get(xpath: String): Element | Null = js.native
  def get(xpath: String, ns_uri: String): Element | Null = js.native
  def name(): String = js.native
  def name(newName: String): this.type = js.native
  def namespace(newNamespace: Namespace): this.type = js.native
  def namespace(prefixOrHref: String): Namespace = js.native
  def namespace(prefixOrHref: String, hrefInCaseOfPrefix: String): Namespace = js.native
  def nextElement(): Element | Null = js.native
  def node(name: String): Element = js.native
  def node(name: String, content: String): Element = js.native
  def path(): String = js.native
  def prevElement(): Element | Null = js.native
  def replace(replacement: String): String = js.native
  def replace(replacement: Element): Element = js.native
  def text(): String = js.native
  def text(newText: String): this.type = js.native
}

