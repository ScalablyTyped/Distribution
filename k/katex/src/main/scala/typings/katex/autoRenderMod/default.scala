package typings.katex.autoRenderMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("katex/dist/contrib/auto-render", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Auto-render TeX expressions in HTML element
    * @param elem HTML element to auto-render
    * @param options Render options
    */
  def apply(elem: HTMLElement): Unit = js.native
  def apply(elem: HTMLElement, options: RenderMathInElementOptions): Unit = js.native
}

