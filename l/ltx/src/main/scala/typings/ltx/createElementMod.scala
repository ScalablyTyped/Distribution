package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Element
import typings.ltx.elementMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createElementMod {
  
  @JSImport("ltx/lib/createElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createElement(name: String, attrs: String, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
  @scala.inline
  def createElement(name: String, attrs: Unit, children: Node*): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(name.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[Element]
}
