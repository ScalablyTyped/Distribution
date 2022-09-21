package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcElementMod {
  
  @JSImport("ltx/src/Element", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Element {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[Any]) = this()
  }
  
  @js.native
  trait Element extends StObject {
    
    def append(nodes: Node*): Unit = js.native
    
    def attr(attr: String): Any = js.native
    def attr(attr: String, `val`: Any): this.type = js.native
    
    var attrs: StringDictionary[Any] = js.native
    
    /** create child node and return it */
    def c(name: String): Element = js.native
    def c(name: String, attrs: StringDictionary[Any]): Element = js.native
    
    var children: js.Array[Node] = js.native
    
    def cnode(child: String): String = js.native
    def cnode(child: Element): Element = js.native
    
    /**
      * find the namespace to the given prefix, upwards recursively
      */
    def findNS(): js.UndefOr[String] = js.native
    def findNS(prefix: String): js.UndefOr[String] = js.native
    
    /**
      * returns the matching attribute.
      */
    def getAttr(name: String): Any = js.native
    def getAttr(name: String, xmlns: String): Any = js.native
    
    def getChild(name: String): js.UndefOr[Element] = js.native
    def getChild(name: String, xmlns: String): js.UndefOr[Element] = js.native
    
    def getChildByAttr(attr: String, `val`: Any): js.UndefOr[Element] = js.native
    def getChildByAttr(attr: String, `val`: Any, xmlns: String): js.UndefOr[Element] = js.native
    def getChildByAttr(attr: String, `val`: Any, xmlns: String, recursive: Boolean): js.UndefOr[Element] = js.native
    def getChildByAttr(attr: String, `val`: Any, xmlns: Unit, recursive: Boolean): js.UndefOr[Element] = js.native
    
    /**
      * Return all direct descendents that are Elements.
      * This differs from `getChildren` in that it will exclude text nodes,
      * processing instructions, etc.
      */
    def getChildElements(): js.Array[Element] = js.native
    
    def getChildText(name: String): String | Null = js.native
    def getChildText(name: String, xmlns: String): String | Null = js.native
    
    def getChildren(name: String): js.Array[Element] = js.native
    def getChildren(name: String, xmlns: String): js.Array[Element] = js.native
    
    def getChildrenByAttr(attr: String, `val`: Any): js.Array[Element] = js.native
    def getChildrenByAttr(attr: String, `val`: Any, xmlns: String): js.Array[Element] = js.native
    def getChildrenByAttr(attr: String, `val`: Any, xmlns: String, recursive: Boolean): js.Array[Element] = js.native
    def getChildrenByAttr(attr: String, `val`: Any, xmlns: Unit, recursive: Boolean): js.Array[Element] = js.native
    
    def getChildrenByFilter(filter: js.Function1[/* child */ Node, Boolean]): js.Array[Element] = js.native
    def getChildrenByFilter(filter: js.Function1[/* child */ Node, Boolean], recursive: Boolean): js.Array[Element] = js.native
    
    /**
      * Retrieves the namespace of the current element, upwards recursively
      */
    def getNS(): js.UndefOr[String] = js.native
    
    /**
      * Get name without prefix.
      */
    def getName(): String = js.native
    
    def getText(): String = js.native
    
    /**
      * Recursiverly gets all xmlns defined, in the form of {url:prefix}
      */
    def getXmlns(): StringDictionary[String] = js.native
    
    /**
      * @example
      * if (element.is('message', 'jabber:client')) {
      *     ...
      * }
      */
    def is(name: String): Boolean = js.native
    def is(name: String, xmlns: String): Boolean = js.native
    
    var name: String = js.native
    
    var parent: Element | Null = js.native
    
    def prepend(nodes: Node*): Unit = js.native
    
    def remove(el: String): this.type = js.native
    def remove(el: String, xmlns: String): this.type = js.native
    /**
      * Either:
      *   el.remove(childEl)
      *   el.remove('author', 'urn:...')
      */
    def remove(el: Node): this.type = js.native
    
    /** returns uppermost parent */
    def root(): Element | this.type = js.native
    
    def setAttrs(attrs: String): Unit = js.native
    def setAttrs(attrs: StringDictionary[Any]): Unit = js.native
    
    /** add text node and return element */
    def t(text: String): this.type = js.native
    
    def text(): String = js.native
    def text(`val`: String): this.type = js.native
    
    def tree(): Element | this.type = js.native
    
    /** just parent or itself */
    def up(): Element | this.type = js.native
    
    def write(writer: js.Function1[/* part */ String, Unit]): Unit = js.native
  }
  
  type Node = Element | String
}
