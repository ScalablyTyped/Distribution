package typings
package ltxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/createElement", JSImport.Namespace)
@js.native
object libCreateElementMod extends js.Object {
  def createElement(name: java.lang.String): ltxLib.libElementMod.Element = js.native
  def createElement(
    name: java.lang.String,
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any],
    children: ltxLib.libElementMod.Node*
  ): ltxLib.libElementMod.Element = js.native
  def createElement(name: java.lang.String, attrs: java.lang.String, children: ltxLib.libElementMod.Node*): ltxLib.libElementMod.Element = js.native
}

