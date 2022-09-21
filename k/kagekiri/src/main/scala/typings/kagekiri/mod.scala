package typings.kagekiri

import typings.std.DocumentOrShadowRoot
import typings.std.Element
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kagekiri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def closest(selector: String, element: Node): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("closest")(selector.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def getElementById(id: String): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def getElementById(id: String, context: DocumentOrShadowRoot): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementById")(id.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def getElementsByClassName(names: String): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByClassName")(names.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  inline def getElementsByClassName(names: String, context: Node): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByClassName")(names.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def getElementsByName(name: String): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  inline def getElementsByName(name: String, context: DocumentOrShadowRoot): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByName")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def getElementsByTagName(tagName: String): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagName(tagName: String, context: Node): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagName")(tagName.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def getElementsByTagNameNS(namespaceURI: String, localName: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagNameNS")(namespaceURI.asInstanceOf[js.Any], localName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def getElementsByTagNameNS(namespaceURI: String, localName: String, context: Node): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("getElementsByTagNameNS")(namespaceURI.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def matches(selector: String, element: Node): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(selector.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def querySelector(selector: String): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("querySelector")(selector.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def querySelector(selector: String, context: Node): Element | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelector")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  inline def querySelectorAll(selector: String): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  inline def querySelectorAll(selector: String, context: Node): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySelectorAll")(selector.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
}
