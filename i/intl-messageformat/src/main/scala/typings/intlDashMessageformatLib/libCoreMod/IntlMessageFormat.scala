package typings
package intlDashMessageformatLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/core", "IntlMessageFormat")
@js.native
class IntlMessageFormat protected () extends js.Object {
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern) = this()
  def this(message: java.lang.String) = this()
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern, locales: java.lang.String) = this()
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern, locales: js.Array[java.lang.String]) = this()
  def this(message: java.lang.String, locales: java.lang.String) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String]) = this()
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern, locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats]) = this()
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats]) = this()
  def this(message: java.lang.String, locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats]) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats]) = this()
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern, locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], opts: Options) = this()
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], opts: Options) = this()
  def this(message: java.lang.String, locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], opts: Options) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], opts: Options) = this()
  var ast: js.Any = js.native
  var locale: js.Any = js.native
  var message: js.Any = js.native
  var pattern: js.Any = js.native
  def format(): java.lang.String = js.native
  def format(
    values: stdLib.Record[
      java.lang.String, 
      js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
    ]
  ): java.lang.String = js.native
  def getAst(): intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern = js.native
  def resolvedOptions(): intlDashMessageformatLib.Anon_Locale = js.native
}

/* static members */
@JSImport("intl-messageformat/lib/core", "IntlMessageFormat")
@js.native
object IntlMessageFormat extends js.Object {
  var defaultLocale: java.lang.String = js.native
  var formats: intlDashMessageformatLib.Anon_Date = js.native
  def __parse(msg: java.lang.String): intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern = js.native
}

