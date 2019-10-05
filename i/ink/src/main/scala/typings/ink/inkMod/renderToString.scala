package typings.ink.inkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ink", "renderToString")
@js.native
object renderToString extends js.Object {
  def apply(tree: InkElement): String = js.native
  def apply(tree: InkElement, prevTree: InkElement): String = js.native
}

