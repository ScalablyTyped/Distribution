package typings
package intlDashMessageformatLib.intlDashMessageformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
class IntlMessageFormat protected ()
  extends intlDashMessageformatLib.libCoreMod.IntlMessageFormat {
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
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern, locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], opts: intlDashMessageformatLib.libCoreMod.Options) = this()
  def this(message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], opts: intlDashMessageformatLib.libCoreMod.Options) = this()
  def this(message: java.lang.String, locales: java.lang.String, overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], opts: intlDashMessageformatLib.libCoreMod.Options) = this()
  def this(message: java.lang.String, locales: js.Array[java.lang.String], overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], opts: intlDashMessageformatLib.libCoreMod.Options) = this()
}

/* static members */
@JSImport("intl-messageformat", "IntlMessageFormat")
@js.native
object IntlMessageFormat extends js.Object {
  var __parse: js.UndefOr[
    js.Function1[
      /* msg */ java.lang.String, 
      intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern
    ]
  ] = js.native
  var defaultLocale: java.lang.String = js.native
  var formats: intlDashMessageformatLib.Anon_Date = js.native
}

