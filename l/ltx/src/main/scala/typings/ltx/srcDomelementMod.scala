package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.ltxInts.`1`
import typings.ltx.srcElementMod.Node
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDomelementMod {
  
  @JSImport("ltx/src/DOMElement", JSImport.Default)
  @js.native
  open class default () extends DOMElement
  /* static members */
  object default {
    
    @JSImport("ltx/src/DOMElement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createElement(name: String, attrs: String, children: Node*): DOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement]
    inline def createElement(name: String, attrs: StringDictionary[Any], children: Node*): DOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement]
    inline def createElement(name: String, attrs: Unit, children: Node*): DOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement]
  }
  
  @js.native
  trait DOMElement
    extends typings.ltx.srcElementMod.default {
    
    def appendChild(child: Node): Unit = js.native
    
    val childNodes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Element.prototype.children */ Any = js.native
    
    var getAttribute: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Element.prototype.getAttr */ Any = js.native
    
    def getAttributeNS(ns: String, name: String): Any = js.native
    
    var getElementsByTagName: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Element.prototype.getChildren */ Any = js.native
    
    val localName: ReturnType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Element.prototype.getName */ Any
      ] = js.native
    
    val namespaceURI: ReturnType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Element.prototype.getNS */ Any
      ] = js.native
    
    var nodeName: String = js.native
    
    var nodeType: `1` = js.native
    
    val parentNode: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Element.prototype.parent */ Any = js.native
    
    def removeAttribute(name: String): Unit = js.native
    
    def removeAttributeNS(ns: String, name: String): Unit = js.native
    
    def removeChild(child: Node): Unit = js.native
    
    def setAttribute(attr: String, `val`: Any): Unit = js.native
    
    def setAttributeNS(ns: String, name: String, value: Any): Unit = js.native
    
    var textContent: String = js.native
  }
}
