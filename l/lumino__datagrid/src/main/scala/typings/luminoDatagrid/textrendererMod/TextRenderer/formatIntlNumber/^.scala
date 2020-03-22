package typings.luminoDatagrid.textrendererMod.TextRenderer.formatIntlNumber

import typings.luminoDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatIntlNumber")
@js.native
object ^ extends js.Object {
  /**
    * Create an international number format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new international number format function.
    *
    * #### Notes
    * This formatter uses the builtin `Intl.NumberFormat` object to
    * coerce values.
    *
    * This is the most flexible (but slowest) number formatter.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

