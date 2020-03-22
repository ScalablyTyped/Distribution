package typings.luminoDatagrid.textrendererMod.TextRenderer.formatExponential

import typings.luminoDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatExponential")
@js.native
object ^ extends js.Object {
  /**
    * Create a scientific notation format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new scientific notation format function.
    *
    * #### Notes
    * This formatter uses the builtin `Number()` and `toExponential()`
    * to coerce values.
    *
    * The `formatIntlNumber()` formatter is more flexible, but slower.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

