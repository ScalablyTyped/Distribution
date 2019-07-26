package typings
package intlDashMessageformatLib.intlDashMessageformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createDefaultFormatters(): intlDashMessageformatLib.libFormattersMod.Formatters = js.native
  def createDefaultFormatters(cache: intlDashMessageformatLib.libFormattersMod.FormatterCache): intlDashMessageformatLib.libFormattersMod.Formatters = js.native
  def formatToParts(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats
  ): js.Array[intlDashMessageformatLib.libFormattersMod.MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[java.lang.String, _]
  ): js.Array[intlDashMessageformatLib.libFormattersMod.MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[java.lang.String, _],
    originalMessage: java.lang.String
  ): js.Array[intlDashMessageformatLib.libFormattersMod.MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats
  ): js.Array[intlDashMessageformatLib.libFormattersMod.MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[java.lang.String, _]
  ): js.Array[intlDashMessageformatLib.libFormattersMod.MessageFormatPart] = js.native
  def formatToParts(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[java.lang.String, _],
    originalMessage: java.lang.String
  ): js.Array[intlDashMessageformatLib.libFormattersMod.MessageFormatPart] = js.native
  def formatToString(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats
  ): java.lang.String = js.native
  def formatToString(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[java.lang.String, intlDashMessageformatLib.libFormattersMod.PrimitiveType]
  ): java.lang.String = js.native
  def formatToString(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[java.lang.String, intlDashMessageformatLib.libFormattersMod.PrimitiveType],
    originalMessage: java.lang.String
  ): java.lang.String = js.native
  def formatToString(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats
  ): java.lang.String = js.native
  def formatToString(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[java.lang.String, intlDashMessageformatLib.libFormattersMod.PrimitiveType]
  ): java.lang.String = js.native
  def formatToString(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[java.lang.String, intlDashMessageformatLib.libFormattersMod.PrimitiveType],
    originalMessage: java.lang.String
  ): java.lang.String = js.native
  def formatXMLMessage(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats
  ): js.Array[java.lang.String | js.Object] = js.native
  def formatXMLMessage(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[
      java.lang.String, 
      intlDashMessageformatLib.libFormattersMod.PrimitiveType | js.Object | intlDashMessageformatLib.libFormattersMod.FormatXMLElementFn
    ]
  ): js.Array[java.lang.String | js.Object] = js.native
  def formatXMLMessage(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: java.lang.String,
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[
      java.lang.String, 
      intlDashMessageformatLib.libFormattersMod.PrimitiveType | js.Object | intlDashMessageformatLib.libFormattersMod.FormatXMLElementFn
    ],
    originalMessage: java.lang.String
  ): js.Array[java.lang.String | js.Object] = js.native
  def formatXMLMessage(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats
  ): js.Array[java.lang.String | js.Object] = js.native
  def formatXMLMessage(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[
      java.lang.String, 
      intlDashMessageformatLib.libFormattersMod.PrimitiveType | js.Object | intlDashMessageformatLib.libFormattersMod.FormatXMLElementFn
    ]
  ): js.Array[java.lang.String | js.Object] = js.native
  def formatXMLMessage(
    els: js.Array[intlDashMessageformatDashParserLib.libTypesMod.MessageFormatElement],
    locales: js.Array[java.lang.String],
    formatters: intlDashMessageformatLib.libFormattersMod.Formatters,
    formats: intlDashMessageformatLib.libFormattersMod.Formats,
    values: stdLib.Record[
      java.lang.String, 
      intlDashMessageformatLib.libFormattersMod.PrimitiveType | js.Object | intlDashMessageformatLib.libFormattersMod.FormatXMLElementFn
    ],
    originalMessage: java.lang.String
  ): js.Array[java.lang.String | js.Object] = js.native
}

