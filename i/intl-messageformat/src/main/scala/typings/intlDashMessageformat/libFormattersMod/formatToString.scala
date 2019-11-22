package typings.intlDashMessageformat.libFormattersMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod.MessageFormatElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/formatters", "formatToString")
@js.native
object formatToString extends js.Object {
  def apply(els: js.Array[MessageFormatElement], locales: String, formatters: Formatters, formats: Formats): String = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType]
  ): String = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: String,
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType],
    originalMessage: String
  ): String = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats
  ): String = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType]
  ): String = js.native
  def apply(
    els: js.Array[MessageFormatElement],
    locales: js.Array[String],
    formatters: Formatters,
    formats: Formats,
    values: Record[String, PrimitiveType],
    originalMessage: String
  ): String = js.native
}

