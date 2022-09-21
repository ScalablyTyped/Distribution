package typings.htmlReactParser

import typings.htmlReactParser.anon.Style
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributesToPropsMod {
  
  @JSImport("html-react-parser/lib/attributes-to-props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(attributes: Attributes): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(attributes.asInstanceOf[js.Any]).asInstanceOf[Props]
  
  type Attributes = Record[String, String]
  
  type Props = (Record[String, String]) & Style
}
