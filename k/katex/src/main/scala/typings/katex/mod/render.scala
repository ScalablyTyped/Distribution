package typings.katex.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("katex", "render")
@js.native
object render extends js.Object {
  def apply(tex: String, element: HTMLElement): Unit = js.native
  def apply(tex: String, element: HTMLElement, options: KatexOptions): Unit = js.native
}

