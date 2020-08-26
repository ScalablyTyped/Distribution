package typings.intlMessageformat.mod

import typings.intlMessageformat.anon.Date
import typings.intlMessageformat.anon.PartialFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", JSImport.Default)
@js.native
class default protected () extends IntlMessageFormat {
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
}

/* static members */
@JSImport("intl-messageformat", JSImport.Default)
@js.native
object default extends js.Object {
  var __parse: js.UndefOr[
    js.Function2[
      /* input */ String, 
      /* opts */ js.UndefOr[ParseOptions], 
      js.Array[MessageFormatElement]
    ]
  ] = js.native
  var formats: Date = js.native
  var memoizedDefaultLocale: js.Any = js.native
  def defaultLocale: String = js.native
}

