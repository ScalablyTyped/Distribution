package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @JSImport("ltx/lib/Element", "Element")
  @js.native
  class Element protected () extends StObject {
    def this(name: String) = this()
    def this(name: String, attrs: String) = this()
    def this(name: String, attrs: StringDictionary[js.Any]) = this()
    
    def attr(attr: String): js.Any = js.native
    def attr(attr: String, `val`: js.Any): js.Any = js.native
    
    var attrs: StringDictionary[js.Any] = js.native
    
    def attrsEquals(el: Element): Boolean = js.native
    
    /** create child node and return it */
    def c(name: String): Element = js.native
    def c(name: String, attrs: StringDictionary[js.Any]): Element = js.native
    
    var children: js.Array[Element] = js.native
    
    def childrenEquals(el: Element): Boolean = js.native
    
    def clone[T /* <: Element */](el: T): T = js.native
    @JSName("clone")
    var clone_Original: FnCall = js.native
    
    def cnode[T /* <: Element */](child: T): T = js.native
    
    def equals(el: Element): Boolean = js.native
    
    /**
      * find the namespace to the given prefix, upwards recursively
      */
    def findNS(prefix: String): js.UndefOr[String] = js.native
    
    /**
      * returns the matching attribute.
      */
    def getAttr(name: String): js.Any = js.native
    def getAttr(name: String, xmlns: String): js.Any = js.native
    
    def getChild(name: String): js.UndefOr[Element] = js.native
    def getChild(name: String, xmlns: String): js.UndefOr[Element] = js.native
    
    def getChildByAttr(attr: String, `val`: js.Any): js.UndefOr[Element] = js.native
    def getChildByAttr(attr: String, `val`: js.Any, xmlns: String): js.UndefOr[Element] = js.native
    def getChildByAttr(attr: String, `val`: js.Any, xmlns: String, recursive: Boolean): js.UndefOr[Element] = js.native
    def getChildByAttr(attr: String, `val`: js.Any, xmlns: Unit, recursive: Boolean): js.UndefOr[Element] = js.native
    
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
    
    def getChildrenByAttr(attr: String, `val`: js.Any): js.Array[Element] = js.native
    def getChildrenByAttr(attr: String, `val`: js.Any, xmlns: String): js.Array[Element] = js.native
    def getChildrenByAttr(attr: String, `val`: js.Any, xmlns: String, recursive: Boolean): js.Array[Element] = js.native
    def getChildrenByAttr(attr: String, `val`: js.Any, xmlns: Unit, recursive: Boolean): js.Array[Element] = js.native
    
    def getChildrenByFilter(filter: js.Function1[/* child */ Node, Boolean]): js.Array[Element] = js.native
    def getChildrenByFilter(filter: js.Function1[/* child */ Node, Boolean], recursive: Boolean): js.Array[Element] = js.native
    
    /**
      * retrieves the namespace of the current element, upwards recursively
      */
    def getNS(): js.UndefOr[String] = js.native
    
    /**
      * without prefix.
      */
    def getName(): String = js.native
    
    def getText(): String = js.native
    
    /**
      * Recursiverly gets all xmlns defined, in the form of {url:prefix}
      */
    def getXmlns(): StringDictionary[String] = js.native
    
    /**
      * if (element.is('message', 'jabber:client')) ...
      */
    def is(name: String): Boolean = js.native
    def is(name: String, xmlns: String): Boolean = js.native
    
    var name: String = js.native
    
    def nameEquals(el: Element): Boolean = js.native
    
    var parent: Element | Null = js.native
    
    def remove(el: String): this.type = js.native
    def remove(el: String, xmlns: String): this.type = js.native
    /**
      * Either:
      *   el.remove(childEl)
      *   el.remove('author', 'urn:...')
      */
    def remove(el: Element): this.type = js.native
    def remove(el: Element, xmlns: String): this.type = js.native
    
    /** returns uppermost parent */
    def root(): Element | this.type = js.native
    
    def setAttrs(attrs: String): Unit = js.native
    def setAttrs(attrs: StringDictionary[js.Any]): Unit = js.native
    
    /** add text node and return element */
    def t(text: TextNode): this.type = js.native
    
    def text(): String = js.native
    def text(`val`: String): String = js.native
    
    def toJSON(): ElementJson = js.native
    
    def tree(): Element | this.type = js.native
    
    /** just parent or itself */
    def up(): Element | this.type = js.native
    
    def write(writer: js.Function1[/* part */ String, Unit]): Unit = js.native
  }
  
  trait ElementJson extends StObject {
    
    var attrs: StringDictionary[js.Any]
    
    var children: js.Array[ElementJson | TextNode]
    
    var name: String
  }
  object ElementJson {
    
    inline def apply(attrs: StringDictionary[js.Any], children: js.Array[ElementJson | TextNode], name: String): ElementJson = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementJson]
    }
    
    extension [Self <: ElementJson](x: Self) {
      
      inline def setAttrs(value: StringDictionary[js.Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[ElementJson | TextNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: (ElementJson | TextNode)*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Node = Element | TextNode
  
  type TextNode = String | Double
}
