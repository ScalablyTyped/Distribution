package typings
package ltxLib.libElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/Element", "Element")
@js.native
class Element protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, attrs: js.Any) = this()
  var attrs: js.Any = js.native
  var children: js.Array[Element] = js.native
  var name: java.lang.String = js.native
  var parent: Element = js.native
  def attr(attr: js.Any, `val`: js.Any): js.Any = js.native
  def attrsEquals(el: Element): scala.Boolean = js.native
  /** create child node and return it */
  def c(name: java.lang.String): Element = js.native
  /** create child node and return it */
  def c(name: java.lang.String, attrs: js.Any): Element = js.native
  def childrenEquals(el: Element): scala.Boolean = js.native
  def equals(el: Element): scala.Boolean = js.native
  /**
       * find the namespace to the given prefix, upwards recursively
       **/
  def findNS(prefix: java.lang.String): js.Any = js.native
  /**
       * xmlns can be null, returns the matching attribute.
       **/
  def getAttr(name: java.lang.String): js.Any = js.native
  /**
       * xmlns can be null, returns the matching attribute.
       **/
  def getAttr(name: java.lang.String, xmlns: js.Any): js.Any = js.native
  /**
       * xmlns can be null
       **/
  def getChild(name: java.lang.String): Element = js.native
  /**
       * xmlns can be null
       **/
  def getChild(name: java.lang.String, xmlns: js.Any): Element = js.native
  /**
       * xmlns and recursive can be null
       **/
  def getChildByAttr(attr: js.Any, `val`: js.Any): Element = js.native
  /**
       * xmlns and recursive can be null
       **/
  def getChildByAttr(attr: js.Any, `val`: js.Any, xmlns: js.Any): Element = js.native
  /**
       * xmlns and recursive can be null
       **/
  def getChildByAttr(attr: js.Any, `val`: js.Any, xmlns: js.Any, recursive: js.Any): Element = js.native
  /**
       * Return all direct descendents that are Elements.
       * This differs from `getChildren` in that it will exclude text nodes,
       * processing instructions, etc.
       */
  def getChildElements(): js.Array[Element] = js.native
  def getChildText(name: java.lang.String): java.lang.String = js.native
  def getChildText(name: java.lang.String, xmlns: js.Any): java.lang.String = js.native
  /**
       * xmlns can be null
       **/
  def getChildren(name: java.lang.String): js.Array[Element] = js.native
  /**
       * xmlns can be null
       **/
  def getChildren(name: java.lang.String, xmlns: js.Any): js.Array[Element] = js.native
  /**
       * xmlns and recursive can be null
       **/
  def getChildrenByAttr(attr: js.Any, `val`: js.Any): js.Array[Element] = js.native
  /**
       * xmlns and recursive can be null
       **/
  def getChildrenByAttr(attr: js.Any, `val`: js.Any, xmlns: js.Any): js.Array[Element] = js.native
  /**
       * xmlns and recursive can be null
       **/
  def getChildrenByAttr(attr: js.Any, `val`: js.Any, xmlns: js.Any, recursive: js.Any): js.Array[Element] = js.native
  /**
       * retrieves the namespace of the current element, upwards recursively
       **/
  def getNS(): js.Any = js.native
  /**
       * without prefix.
       */
  def getName(): java.lang.String = js.native
  def getText(): java.lang.String = js.native
  /**
       * Recursiverly gets all xmlns defined, in the form of {url:prefix}
       **/
  def getXmlns(): js.Any = js.native
  /**
       * if (element.is('message', 'jabber:client')) ...
       **/
  def is(name: java.lang.String): scala.Boolean = js.native
  /**
       * if (element.is('message', 'jabber:client')) ...
       **/
  def is(name: java.lang.String, xmlns: js.Any): scala.Boolean = js.native
  def nameEquals(el: Element): scala.Boolean = js.native
  /**
       * Either:
       *   el.remove(childEl)
       *   el.remove('author', 'urn:...')
       */
  def remove(el: Element): Element = js.native
  /**
       * Either:
       *   el.remove(childEl)
       *   el.remove('author', 'urn:...')
       */
  def remove(el: Element, xmlns: js.Any): Element = js.native
  /** returns uppermost parent */
  def root(): Element = js.native
  def setAttrs(attrs: js.Any): scala.Unit = js.native
  /** add text node and return element */
  def t(text: java.lang.String): Element = js.native
  def text(`val`: java.lang.String): java.lang.String = js.native
  def toJSON(): js.Any = js.native
  def tree(): Element = js.native
  /** just parent or itself */
  def up(): Element = js.native
  def write(writer: js.Any): scala.Unit = js.native
}

