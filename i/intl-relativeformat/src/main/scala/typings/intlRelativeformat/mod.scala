package typings.intlRelativeformat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.LocaleFieldsData
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeLocaleData
import typings.formatjsIntlRelativetimeformat.anon.PickIntlRelativeTimeForma
import typings.intlRelativeformat.anon.Locale
import typings.intlRelativeformat.anon.Now
import typings.intlRelativeformat.typesMod.LocaleData
import typings.intlRelativeformat.typesMod.STYLE
import typings.intlRelativeformat.typesMod.SUPPORTED_FIELD
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("intl-relativeformat", JSImport.Default)
  @js.native
  class default () extends IntlRelativeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], opts: IntlRelativeFormatOptions) = this()
    def this(locales: String, opts: IntlRelativeFormatOptions) = this()
    def this(locales: js.Array[String], opts: IntlRelativeFormatOptions) = this()
  }
  @JSImport("intl-relativeformat", JSImport.Default)
  @js.native
  val default: IntlRelativeFormat = js.native
  
  object global {
    
    object Intl {
      
      /* was `typeof IntlRelativeTimeFormat` */
      @JSGlobal("Intl.RelativeTimeFormat")
      @js.native
      class RelativeTimeFormat ()
        extends typings.formatjsIntlRelativetimeformat.mod.default {
        def this(locales: String) = this()
        def this(locales: js.Array[String]) = this()
        def this(locales: js.UndefOr[scala.Nothing], options: IntlRelativeTimeFormatOptions) = this()
        def this(locales: String, options: IntlRelativeTimeFormatOptions) = this()
        def this(locales: js.Array[String], options: IntlRelativeTimeFormatOptions) = this()
      }
      /* static members */
      object RelativeTimeFormat {
        
        @JSGlobal("Intl.RelativeTimeFormat")
        @js.native
        val ^ : js.Any = js.native
        
        @JSGlobal("Intl.RelativeTimeFormat.__addLocaleData")
        @js.native
        def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
        
        @JSGlobal("Intl.RelativeTimeFormat.__defaultLocale")
        @js.native
        def __defaultLocale: js.Any = js.native
        @scala.inline
        def __defaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("__defaultLocale")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Intl.RelativeTimeFormat.availableLocales")
        @js.native
        def availableLocales: js.Any = js.native
        @scala.inline
        def availableLocales_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableLocales")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Intl.RelativeTimeFormat.getDefaultLocale")
        @js.native
        def getDefaultLocale: js.Any = js.native
        @scala.inline
        def getDefaultLocale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultLocale")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Intl.RelativeTimeFormat.localeData")
        @js.native
        def localeData: Record[String, LocaleFieldsData] = js.native
        @scala.inline
        def localeData_=(x: Record[String, LocaleFieldsData]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localeData")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Intl.RelativeTimeFormat.polyfilled")
        @js.native
        def polyfilled: Boolean = js.native
        @scala.inline
        def polyfilled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polyfilled")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Intl.RelativeTimeFormat.relevantExtensionKeys")
        @js.native
        def relevantExtensionKeys: js.Any = js.native
        @scala.inline
        def relevantExtensionKeys_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relevantExtensionKeys")(x.asInstanceOf[js.Any])
        
        @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
        @js.native
        def supportedLocalesOf(locales: String): js.Array[String] = js.native
        @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
        @js.native
        def supportedLocalesOf(locales: String, options: PickIntlRelativeTimeForma): js.Array[String] = js.native
        @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
        @js.native
        def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
        @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
        @js.native
        def supportedLocalesOf(locales: js.Array[String], options: PickIntlRelativeTimeForma): js.Array[String] = js.native
      }
    }
  }
  
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
      date: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<std.DateConstructor>[0] */ js.Any
    ): String = js.native
    @JSName("format")
    def format_0(
      date: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<std.DateConstructor>[0] */ js.Any,
      opts: Now
    ): String = js.native
    
    def resolvedOptions(): Locale = js.native
    
    var thresholds: Record[String, Double] = js.native
  }
  
  @js.native
  trait IntlRelativeFormatOptions extends StObject {
    
    var style: js.UndefOr[STYLE] = js.native
    
    var units: js.UndefOr[SUPPORTED_FIELD] = js.native
  }
  object IntlRelativeFormatOptions {
    
    @scala.inline
    def apply(): IntlRelativeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntlRelativeFormatOptions]
    }
    
    @scala.inline
    implicit class IntlRelativeFormatOptionsMutableBuilder[Self <: IntlRelativeFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: STYLE): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUnits(value: SUPPORTED_FIELD): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  type _To = IntlRelativeFormat
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IntlRelativeFormat = default
}
