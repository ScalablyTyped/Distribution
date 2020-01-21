package typings.intlMessageformat.formattersMod

import typings.intlMessageformatParser.mod.MessageFormatElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/formatters", "formatHTMLMessage")
@js.native
object formatHTMLMessage extends js.Object {
  def apply(els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): js.Array[String | js.Object] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType | js.Object | FormatXMLElementFn]
  ): js.Array[String | js.Object] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType | js.Object | FormatXMLElementFn],
    originalMessage: String
  ): js.Array[String | js.Object] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): js.Array[String | js.Object] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType | js.Object | FormatXMLElementFn]
  ): js.Array[String | js.Object] = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType | js.Object | FormatXMLElementFn],
    originalMessage: String
  ): js.Array[String | js.Object] = js.native
}

