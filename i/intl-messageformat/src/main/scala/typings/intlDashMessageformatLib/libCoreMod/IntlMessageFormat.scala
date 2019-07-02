package typings
package intlDashMessageformatLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlMessageFormat
  extends org.scalablytyped.runtime.Instantiable2[
      (/* message */ intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern) | (/* message */ java.lang.String), 
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      IntlMessageFormat
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* message */ intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern) | (/* message */ java.lang.String), 
      IntlMessageFormat
    ]
     with org.scalablytyped.runtime.Instantiable3[
      (/* message */ intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern) | (/* message */ java.lang.String), 
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* overrideFormats */ stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats], 
      IntlMessageFormat
    ] {
  @JSName("__parse")
  var __parse_Original: js.Function1[
    /* msg */ java.lang.String, 
    intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern
  ] = js.native
  var defaultLocale: java.lang.String = js.native
  var formats: intlDashMessageformatLib.libCompilerMod.Formats = js.native
  def apply(
    message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern
  ): IntlMessageFormat = js.native
  def apply(
    message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern,
    locales: java.lang.String
  ): IntlMessageFormat = js.native
  def apply(
    message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern,
    locales: java.lang.String,
    overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats]
  ): IntlMessageFormat = js.native
  def apply(
    message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern,
    locales: js.Array[java.lang.String]
  ): IntlMessageFormat = js.native
  def apply(
    message: intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern,
    locales: js.Array[java.lang.String],
    overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats]
  ): IntlMessageFormat = js.native
  def apply(message: java.lang.String): IntlMessageFormat = js.native
  def apply(message: java.lang.String, locales: java.lang.String): IntlMessageFormat = js.native
  def apply(
    message: java.lang.String,
    locales: java.lang.String,
    overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats]
  ): IntlMessageFormat = js.native
  def apply(message: java.lang.String, locales: js.Array[java.lang.String]): IntlMessageFormat = js.native
  def apply(
    message: java.lang.String,
    locales: js.Array[java.lang.String],
    overrideFormats: stdLib.Partial[intlDashMessageformatLib.libCompilerMod.Formats]
  ): IntlMessageFormat = js.native
  def __parse(msg: java.lang.String): intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern = js.native
  def format(): java.lang.String = js.native
  def format(
    values: stdLib.Record[
      java.lang.String, 
      js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]
    ]
  ): java.lang.String = js.native
  def getAst(): stdLib.ReturnType[
    js.Function1[
      /* msg */ java.lang.String, 
      intlDashMessageformatDashParserLib.intlDashMessageformatDashParserMod.MessageFormatPattern
    ]
  ] = js.native
  def resolvedOptions(): intlDashMessageformatLib.Anon_Locale = js.native
}

