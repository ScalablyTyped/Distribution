package typings.hastscript

import typings.hast.mod.Element
import typings.hast.mod.Properties
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * DSL to create virtual hast trees for HTML or SVG
    *
    * @param selector Simple CSS selector
    * @param properties Map of properties
    * @param children (Lists of) child nodes
    */
  /**
    * DSL to create virtual hast trees for HTML or SVG
    *
    * @param selector Simple CSS selector
    * @param children (Lists of) child nodes
    */
  inline def apply(): Element = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Element]
  inline def apply(selector: String): Element = ^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def apply(selector: String, children: String): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, children: js.Array[String | Node]): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, children: Node): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, properties: Unit, children: String): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, properties: Unit, children: js.Array[String | Node]): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, properties: Unit, children: Node): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, properties: Properties): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, properties: Properties, children: String): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, properties: Properties, children: js.Array[String | Node]): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: String, properties: Properties, children: Node): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, children: String): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, children: js.Array[String | Node]): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, children: Node): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, properties: Unit, children: String): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, properties: Unit, children: js.Array[String | Node]): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, properties: Unit, children: Node): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, properties: Properties): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, properties: Properties, children: String): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, properties: Properties, children: js.Array[String | Node]): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  inline def apply(selector: Unit, properties: Properties, children: Node): Element = (^.asInstanceOf[js.Dynamic].apply(selector.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  @JSImport("hastscript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
