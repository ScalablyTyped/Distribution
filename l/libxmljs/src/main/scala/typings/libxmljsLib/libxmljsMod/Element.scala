package typings
package libxmljsLib.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libxmljs", "Element")
@js.native
class Element protected () extends Node {
  def this(doc: Document, name: java.lang.String) = this()
  def this(doc: Document, name: java.lang.String, content: java.lang.String) = this()
  /**
    * @return The original element, not the child.
    */
  def addChild(child: Element): this.type = js.native
  def addNextSibling(siblingNode: Node): Node = js.native
  def attr(attrObject: StringMap): this.type = js.native
  def attr(name: java.lang.String): Attribute | scala.Null = js.native
  def attrs(): js.Array[Attribute] = js.native
  def child(idx: scala.Double): Node | scala.Null = js.native
  def childNodes(): js.Array[Node] = js.native
  def defineNamespace(prefixOrHref: java.lang.String): Namespace = js.native
  def defineNamespace(prefixOrHref: java.lang.String, hrefInCaseOfPrefix: java.lang.String): Namespace = js.native
  def find(xpath: java.lang.String): js.Array[Node] = js.native
  def find(xpath: java.lang.String, namespaces: StringMap): js.Array[Node] = js.native
  def find(xpath: java.lang.String, ns_uri: java.lang.String): js.Array[Node] = js.native
  def get(xpath: java.lang.String): Element | scala.Null = js.native
  def get(xpath: java.lang.String, ns_uri: java.lang.String): Element | scala.Null = js.native
  def name(): java.lang.String = js.native
  def name(newName: java.lang.String): this.type = js.native
  def namespace(newNamespace: Namespace): this.type = js.native
  def namespace(prefixOrHref: java.lang.String): Namespace = js.native
  def namespace(prefixOrHref: java.lang.String, hrefInCaseOfPrefix: java.lang.String): Namespace = js.native
  def nextElement(): Element | scala.Null = js.native
  def node(name: java.lang.String): Element = js.native
  def node(name: java.lang.String, content: java.lang.String): Element = js.native
  def path(): java.lang.String = js.native
  def prevElement(): Element | scala.Null = js.native
  def replace(replacement: java.lang.String): java.lang.String = js.native
  def replace(replacement: Element): Element = js.native
  def text(): java.lang.String = js.native
  def text(newText: java.lang.String): this.type = js.native
}

