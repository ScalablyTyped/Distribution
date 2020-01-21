package typings.ltx

import org.scalablytyped.runtime.StringDictionary
import typings.ltx.elementMod.Element
import typings.ltx.elementMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/createElement", JSImport.Namespace)
@js.native
object createElementMod extends js.Object {
  def createElement(name: String): Element = js.native
  def createElement(name: String, attrs: String, children: Node*): Element = js.native
  def createElement(name: String, attrs: StringDictionary[js.Any], children: Node*): Element = js.native
}

