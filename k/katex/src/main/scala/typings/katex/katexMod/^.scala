package typings.katex.katexMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("katex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def render(tex: String, element: HTMLElement): Unit = js.native
  def render(tex: String, element: HTMLElement, options: KatexOptions): Unit = js.native
  def renderToString(tex: String): String = js.native
  def renderToString(tex: String, options: KatexOptions): String = js.native
}

