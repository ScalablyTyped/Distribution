package typings.luminoDatagrid.textrendererMod.TextRenderer.formatISODateTime

import typings.luminoDatagrid.textrendererMod.TextRenderer.FormatFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/textrenderer", "TextRenderer.formatISODateTime")
@js.native
object ^ extends js.Object {
  
  /**
    * Create an ISO datetime format function.
    *
    * @param options - The options for creating the format function.
    *
    * @returns A new ISO datetime format function.
    *
    * #### Notes
    * This formatter uses `Date.toISOString()` to format the values.
    *
    * If a value is not a `Date` object, `new Date(value)` is used to
    * coerce the value to a date.
    *
    * The `formatIntlDateTime()` formatter is more flexible, but slower.
    */
  def apply(): FormatFunc = js.native
  def apply(options: IOptions): FormatFunc = js.native
}
