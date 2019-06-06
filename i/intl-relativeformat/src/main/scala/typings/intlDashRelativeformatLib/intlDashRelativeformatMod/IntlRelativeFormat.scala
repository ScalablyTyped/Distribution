package typings
package intlDashRelativeformatLib.intlDashRelativeformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlRelativeFormat
  extends org.scalablytyped.runtime.Instantiable0[IntlRelativeFormat]
     with org.scalablytyped.runtime.Instantiable2[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      /* opts */ IntlRelativeFormatOptions, 
      IntlRelativeFormat
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* locales */ js.Array[java.lang.String]) | (/* locales */ java.lang.String), 
      IntlRelativeFormat
    ] {
  var __localeData__ : stdLib.Record[java.lang.String, intlDashRelativeformatLib.libTypesMod.LocaleData] = js.native
  var defaultLocale: java.lang.String = js.native
  var thresholds: stdLib.Record[java.lang.String, scala.Double] = js.native
  def apply(): IntlRelativeFormat = js.native
  def apply(locales: java.lang.String): IntlRelativeFormat = js.native
  def apply(locales: java.lang.String, opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
  def apply(locales: js.Array[java.lang.String]): IntlRelativeFormat = js.native
  def apply(locales: js.Array[java.lang.String], opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
  def __addLocaleData(data: intlDashRelativeformatLib.libTypesMod.LocaleData*): scala.Unit = js.native
  def format(
    date: /* import warning: ImportType.apply Failed type conversion: std.ConstructorParameters<std.DateConstructor>[0] */ js.Any
  ): java.lang.String = js.native
  def format(
    date: /* import warning: ImportType.apply Failed type conversion: std.ConstructorParameters<std.DateConstructor>[0] */ js.Any,
    opts: intlDashRelativeformatLib.Anon_Now
  ): java.lang.String = js.native
  def resolvedOptions(): intlDashRelativeformatLib.Anon_Locale = js.native
}

