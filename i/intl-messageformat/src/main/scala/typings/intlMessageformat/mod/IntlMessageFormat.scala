package typings.intlMessageformat.mod

import typings.intlMessageformat.AnonDate
import typings.intlMessageformat.AnonLocale
import typings.intlMessageformat.FnCall
import typings.intlMessageformat.PartialFormats
import typings.intlMessageformatParser.mod.MessageFormatElement
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
class IntlMessageFormat protected () extends js.Object {
  def this(message: String) = this()
  def this(message: js.Array[MessageFormatElement]) = this()
  def this(message: String, locales: String) = this()
  def this(message: String, locales: js.Array[String]) = this()
  def this(message: js.Array[MessageFormatElement], locales: String) = this()
  def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
  def this(message: String, locales: String, overrideFormats: PartialFormats) = this()
  def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats) = this()
  def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: PartialFormats) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.Array[String],
    overrideFormats: PartialFormats
  ) = this()
  def this(message: String, locales: String, overrideFormats: PartialFormats, opts: Options) = this()
  def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats, opts: Options) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: String,
    overrideFormats: PartialFormats,
    opts: Options
  ) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.Array[String],
    overrideFormats: PartialFormats,
    opts: Options
  ) = this()
  val ast: js.Any = js.native
  val formats: js.Any = js.native
  val formatterCache: js.Any = js.native
  val formatters: js.Any = js.native
  val locales: js.Any = js.native
  val message: js.Any = js.native
  def format(): String = js.native
  def format(values: Record[String, PrimitiveType]): String = js.native
  def formatHTMLMessage(): js.Array[String | js.Object] = js.native
  def formatHTMLMessage(
    values: Record[
      String, 
      js.UndefOr[String | Double | Boolean | js.Object | Date | FormatXMLElementFn | Null]
    ]
  ): js.Array[String | js.Object] = js.native
  def formatToParts(): js.Array[MessageFormatPart] = js.native
  def formatToParts(values: Record[String, _]): js.Array[MessageFormatPart] = js.native
  def getAst(): js.Array[MessageFormatElement] = js.native
  def resolvedOptions(): AnonLocale = js.native
}

/* static members */
@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
object IntlMessageFormat extends js.Object {
  var __parse: js.UndefOr[FnCall] = js.native
  var defaultLocale: String = js.native
  var formats: AnonDate = js.native
}

