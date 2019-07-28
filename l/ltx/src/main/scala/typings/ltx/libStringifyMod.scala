package typings.ltx

import typings.ltx.libElementMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ltx/lib/stringify", JSImport.Namespace)
@js.native
object libStringifyMod extends js.Object {
  def stringify(el: Element): String = js.native
  def stringify(el: Element, indent: Double): String = js.native
  def stringify(el: Element, indent: Double, level: Double): String = js.native
}

