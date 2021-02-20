package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Element
import typings.ltx.elementMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createElementMod {
  
  @JSImport("ltx/lib/createElement", "createElement")
  @js.native
  def createElement(name: String, attrs: js.UndefOr[scala.Nothing], children: Node*): Element = js.native
  @JSImport("ltx/lib/createElement", "createElement")
  @js.native
  def createElement(name: String, attrs: String, children: Node*): Element = js.native
  @JSImport("ltx/lib/createElement", "createElement")
  @js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): Element = js.native
}
