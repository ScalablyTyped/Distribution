package typings.intlDashMessageformat.intlDashMessageformatMod

import typings.intlDashMessageformat.Anon_Date
import typings.intlDashMessageformat.Fn_Input
import typings.intlDashMessageformat.libCoreMod.Options
import typings.intlDashMessageformat.libFormattersMod.Formats
import typings.intlDashMessageformatDashParser.libParserMod.ParseFunction
import typings.intlDashMessageformatDashParser.libTypesMod.MessageFormatElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
class IntlMessageFormat protected ()
  extends typings.intlDashMessageformat.libCoreMod.IntlMessageFormat {
  def this(message: String) = this()
  def this(message: js.Array[MessageFormatElement]) = this()
  def this(message: String, locales: String) = this()
  def this(message: String, locales: js.Array[String]) = this()
  def this(message: js.Array[MessageFormatElement], locales: String) = this()
  def this(message: js.Array[MessageFormatElement], locales: js.Array[String]) = this()
  def this(message: String, locales: String, overrideFormats: Partial[Formats]) = this()
  def this(message: String, locales: js.Array[String], overrideFormats: Partial[Formats]) = this()
  def this(message: js.Array[MessageFormatElement], locales: String, overrideFormats: Partial[Formats]) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.Array[String],
    overrideFormats: Partial[Formats]
  ) = this()
  def this(message: String, locales: String, overrideFormats: Partial[Formats], opts: Options) = this()
  def this(message: String, locales: js.Array[String], overrideFormats: Partial[Formats], opts: Options) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: String,
    overrideFormats: Partial[Formats],
    opts: Options
  ) = this()
  def this(
    message: js.Array[MessageFormatElement],
    locales: js.Array[String],
    overrideFormats: Partial[Formats],
    opts: Options
  ) = this()
}

/* static members */
@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
object IntlMessageFormat extends js.Object {
  var __parse: js.UndefOr[Fn_Input with ParseFunction] = js.native
  var defaultLocale: String = js.native
  var formats: Anon_Date = js.native
}

