package typings
package ltxLib.libElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/Element", "Element")
@js.native
class Element protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, attrs: ScalablyTyped.runtime.StringDictionary[js.Any]) = this()
  def this(name: java.lang.String, attrs: java.lang.String) = this()
  var attrs: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var children: js.Array[Element] = js.native
  @JSName("clone")
  var clone_Original: js.Function1[/* el */ this.type, this.type] = js.native
  var name: java.lang.String = js.native
  var parent: Element | scala.Null = js.native
  def attr(attr: java.lang.String): js.Any = js.native
  def attr(attr: java.lang.String, `val`: js.Any): js.Any = js.native
  def attrsEquals(el: Element): scala.Boolean = js.native
  /** create child node and return it */
  def c(name: java.lang.String): Element = js.native
  /** create child node and return it */
  def c(name: java.lang.String, attrs: ScalablyTyped.runtime.StringDictionary[js.Any]): Element = js.native
  def childrenEquals(el: Element): scala.Boolean = js.native
  def clone[T /* <: Element */](el: T): T = js.native
  def cnode[T /* <: Element */](child: T): T = js.native
  def equals(el: Element): scala.Boolean = js.native
  /**
       * find the namespace to the given prefix, upwards recursively
       */
  def findNS(prefix: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
       * returns the matching attribute.
       */
  def getAttr(name: java.lang.String): js.Any = js.native
  /**
       * returns the matching attribute.
       */
  def getAttr(name: java.lang.String, xmlns: java.lang.String): js.Any = js.native
  def getChild(name: java.lang.String): js.UndefOr[Element] = js.native
  def getChild(name: java.lang.String, xmlns: java.lang.String): js.UndefOr[Element] = js.native
  def getChildByAttr(attr: java.lang.String, `val`: js.Any): js.UndefOr[Element] = js.native
  def getChildByAttr(attr: java.lang.String, `val`: js.Any, xmlns: java.lang.String): js.UndefOr[Element] = js.native
  def getChildByAttr(attr: java.lang.String, `val`: js.Any, xmlns: java.lang.String, recursive: scala.Boolean): js.UndefOr[Element] = js.native
  /**
       * Return all direct descendents that are Elements.
       * This differs from `getChildren` in that it will exclude text nodes,
       * processing instructions, etc.
       */
  def getChildElements(): js.Array[Element] = js.native
  def getChildText(name: java.lang.String): java.lang.String | scala.Null = js.native
  def getChildText(name: java.lang.String, xmlns: java.lang.String): java.lang.String | scala.Null = js.native
  def getChildren(name: java.lang.String): js.Array[Element] = js.native
  def getChildren(name: java.lang.String, xmlns: java.lang.String): js.Array[Element] = js.native
  def getChildrenByAttr(attr: java.lang.String, `val`: js.Any): js.Array[Element] = js.native
  def getChildrenByAttr(attr: java.lang.String, `val`: js.Any, xmlns: java.lang.String): js.Array[Element] = js.native
  def getChildrenByAttr(attr: java.lang.String, `val`: js.Any, xmlns: java.lang.String, recursive: scala.Boolean): js.Array[Element] = js.native
  def getChildrenByFilter(filter: js.Function1[/* child */ Node, scala.Boolean]): js.Array[Element] = js.native
  def getChildrenByFilter(filter: js.Function1[/* child */ Node, scala.Boolean], recursive: scala.Boolean): js.Array[Element] = js.native
  /**
       * retrieves the namespace of the current element, upwards recursively
       */
  def getNS(): js.UndefOr[java.lang.String] = js.native
  /**
       * without prefix.
       */
  def getName(): java.lang.String = js.native
  def getText(): java.lang.String = js.native
  /**
       * Recursiverly gets all xmlns defined, in the form of {url:prefix}
       */
  def getXmlns(): ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
       * if (element.is('message', 'jabber:client')) ...
       */
  def is(name: java.lang.String): scala.Boolean = js.native
  /**
       * if (element.is('message', 'jabber:client')) ...
       */
  def is(name: java.lang.String, xmlns: java.lang.String): scala.Boolean = js.native
  def nameEquals(el: Element): scala.Boolean = js.native
  /**
       * Either:
       *   el.remove(childEl)
       *   el.remove('author', 'urn:...')
       */
  def remove(el: java.lang.String): this.type = js.native
  /**
       * Either:
       *   el.remove(childEl)
       *   el.remove('author', 'urn:...')
       */
  def remove(el: java.lang.String, xmlns: java.lang.String): this.type = js.native
  /**
       * Either:
       *   el.remove(childEl)
       *   el.remove('author', 'urn:...')
       */
  def remove(el: Element): this.type = js.native
  /**
       * Either:
       *   el.remove(childEl)
       *   el.remove('author', 'urn:...')
       */
  def remove(el: Element, xmlns: java.lang.String): this.type = js.native
  /** returns uppermost parent */
  def root(): Element | this.type = js.native
  def setAttrs(attrs: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def setAttrs(attrs: java.lang.String): scala.Unit = js.native
  /** add text node and return element */
  def t(text: TextNode): this.type = js.native
  def text(): java.lang.String = js.native
  def text(`val`: java.lang.String): java.lang.String = js.native
  def toJSON(): ElementJson = js.native
  def tree(): Element | this.type = js.native
  /** just parent or itself */
  def up(): Element | this.type = js.native
  def write(writer: js.Function1[/* part */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

