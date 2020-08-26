package typings.intlMessageformat.mod

import typings.intlMessageformat.anon.Locale
import typings.intlMessageformat.anon.PartialFormats
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
  def this(message: String, locales: js.UndefOr[scala.Nothing], overrideFormats: PartialFormats) = this()
  def this(message: String, locales: String, overrideFormats: PartialFormats) = this()
  def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.UndefOr[scala.Nothing],
    overrideFormats: PartialFormats
  ) = this()
  def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: PartialFormats) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.Array[String],
    overrideFormats: PartialFormats
  ) = this()
  def this(
    message: String,
    locales: js.UndefOr[scala.Nothing],
    overrideFormats: js.UndefOr[scala.Nothing],
    opts: Options
  ) = this()
  def this(
    message: String,
    locales: js.UndefOr[scala.Nothing],
    overrideFormats: PartialFormats,
    opts: Options
  ) = this()
  def this(message: String, locales: String, overrideFormats: js.UndefOr[scala.Nothing], opts: Options) = this()
  def this(message: String, locales: String, overrideFormats: PartialFormats, opts: Options) = this()
  def this(
    message: String,
    locales: js.Array[String],
    overrideFormats: js.UndefOr[scala.Nothing],
    opts: Options
  ) = this()
  def this(message: String, locales: js.Array[String], overrideFormats: PartialFormats, opts: Options) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.UndefOr[scala.Nothing],
    overrideFormats: js.UndefOr[scala.Nothing],
    opts: Options
  ) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.UndefOr[scala.Nothing],
    overrideFormats: PartialFormats,
    opts: Options
  ) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: String,
    overrideFormats: js.UndefOr[scala.Nothing],
    opts: Options
  ) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: String,
    overrideFormats: PartialFormats,
    opts: Options
  ) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.Array[String],
    overrideFormats: js.UndefOr[scala.Nothing],
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
  def format[T](): String | T | (js.Array[String | T]) = js.native
  def format[T](
    values: Record[
      String, 
      js.UndefOr[
        String | Double | Boolean | Date | T | (FormatXMLElementFn[T, String | (js.Array[String | T])]) | Null
      ]
    ]
  ): String | T | (js.Array[String | T]) = js.native
  def formatToParts[T](): js.Array[MessageFormatPart[T]] = js.native
  def formatToParts[T](
    values: Record[
      String, 
      js.UndefOr[
        String | Double | Boolean | Date | T | (FormatXMLElementFn[T, String | (js.Array[String | T])]) | Null
      ]
    ]
  ): js.Array[MessageFormatPart[T]] = js.native
  def getAst(): js.Array[MessageFormatElement] = js.native
  def resolvedOptions(): Locale = js.native
}

/* static members */
@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
object IntlMessageFormat extends js.Object {
  var __parse: js.UndefOr[
    js.Function2[
      /* input */ String, 
      /* opts */ js.UndefOr[ParseOptions], 
      js.Array[MessageFormatElement]
    ]
  ] = js.native
  var formats: typings.intlMessageformat.anon.Date = js.native
  var memoizedDefaultLocale: js.Any = js.native
  def defaultLocale: String = js.native
}

