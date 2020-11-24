package typings.intlRelativeformat.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.intlRelativeformat.anon.Locale
import typings.intlRelativeformat.anon.Now
import typings.intlRelativeformat.typesMod.LocaleData
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlRelativeFormat
  extends Instantiable0[IntlRelativeFormat]
     with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), IntlRelativeFormat]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
      /* opts */ IntlRelativeFormatOptions, 
      IntlRelativeFormat
    ] {
  
  def apply(): IntlRelativeFormat = js.native
  def apply(locales: js.UndefOr[scala.Nothing], opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
  def apply(locales: String): IntlRelativeFormat = js.native
  def apply(locales: String, opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
  def apply(locales: js.Array[String]): IntlRelativeFormat = js.native
  def apply(locales: js.Array[String], opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
  
  def __addLocaleData(data: LocaleData*): Unit = js.native
  
  var __localeData__ : Record[String, LocaleData] = js.native
  
  var defaultLocale: String = js.native
  
  @JSName("format")
  def format_0(
    date: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<std.DateConstructor & new (value : number): std.<global>.Date>[0] */ js.Any
  ): String = js.native
  @JSName("format")
  def format_0(
    date: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<std.DateConstructor & new (value : number): std.<global>.Date>[0] */ js.Any,
    opts: Now
  ): String = js.native
  
  def resolvedOptions(): Locale = js.native
  
  var thresholds: Record[String, Double] = js.native
}
