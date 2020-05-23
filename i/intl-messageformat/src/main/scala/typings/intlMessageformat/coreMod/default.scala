package typings.intlMessageformat.coreMod

import typings.intlMessageformat.anon.Date
import typings.intlMessageformat.anon.FnCall
import typings.intlMessageformat.anon.PartialFormats
import typings.intlMessageformatParser.mod.MessageFormatElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/core", JSImport.Default)
@js.native
class default protected () extends IntlMessageFormat {
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
}

/* static members */
@JSImport("intl-messageformat/lib/core", JSImport.Default)
@js.native
object default extends js.Object {
  var __parse: js.UndefOr[FnCall] = js.native
  var defaultLocale: String = js.native
  var formats: Date = js.native
}

