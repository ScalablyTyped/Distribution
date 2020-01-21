package typings.katex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("katex", "renderToString")
@js.native
object renderToString extends js.Object {
  def apply(tex: String): String = js.native
  def apply(tex: String, options: KatexOptions): String = js.native
}

