package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.srcDomelementMod.DOMElement
import typings.ltx.srcDomelementMod.default
import typings.ltx.srcElementMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object libDomelementMod {
  
  @JSImport("ltx/lib/DOMElement", JSImport.Namespace)
  @js.native
  open class ^ () extends default
  @JSImport("ltx/lib/DOMElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createElement(name: String, attrs: String, children: Node*): DOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement]
  inline def createElement(name: String, attrs: StringDictionary[Any], children: Node*): DOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement]
  inline def createElement(name: String, attrs: Unit, children: Node*): DOMElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")((scala.List(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[DOMElement]
}
