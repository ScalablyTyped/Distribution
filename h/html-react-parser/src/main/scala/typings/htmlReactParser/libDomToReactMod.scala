package typings.htmlReactParser

import typings.htmlReactParser.mod.DOMNode
import typings.htmlReactParser.mod.HTMLReactParserOptions
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomToReactMod {
  
  @JSImport("html-react-parser/lib/dom-to-react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nodes: js.Array[DOMNode]): String | Element | js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any]).asInstanceOf[String | Element | js.Array[Element]]
  inline def default(nodes: js.Array[DOMNode], options: HTMLReactParserOptions): String | Element | js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(nodes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Element | js.Array[Element]]
}
