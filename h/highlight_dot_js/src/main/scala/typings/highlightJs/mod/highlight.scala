package typings.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highlight.js", "highlight")
@js.native
object highlight extends js.Object {
  def apply(name: String, value: String): IHighlightResult = js.native
  def apply(name: String, value: String, ignore_illegals: Boolean): IHighlightResult = js.native
  def apply(name: String, value: String, ignore_illegals: Boolean, continuation: ICompiledMode): IHighlightResult = js.native
}

