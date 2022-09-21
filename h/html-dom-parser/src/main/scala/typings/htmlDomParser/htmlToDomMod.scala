package typings.htmlDomParser

import typings.domhandler.mod.DataNode
import typings.domhandler.mod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlToDomMod {
  
  @JSImport("html-dom-parser/lib/client/html-to-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String): js.Array[DataNode | Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[DataNode | Element]]
}
