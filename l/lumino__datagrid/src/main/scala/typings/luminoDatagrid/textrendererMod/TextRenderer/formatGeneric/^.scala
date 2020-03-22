package typings.luminoDatagrid.textrendererMod.TextRenderer.formatGeneric

import typings.luminoDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatGeneric")
@js.native
object ^ extends js.Object {
  /**
    * Create a generic text format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new generic text format function.
    *
    * #### Notes
    * This formatter uses the builtin `String()` to coerce any value
    * to a string.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}

