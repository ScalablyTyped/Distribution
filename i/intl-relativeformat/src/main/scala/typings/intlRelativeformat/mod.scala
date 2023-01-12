package typings.intlRelativeformat

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.intlRelativeformat.anon.Locale
import typings.intlRelativeformat.anon.Now
import typings.intlRelativeformat.libTypesMod.LocaleData
import typings.intlRelativeformat.libTypesMod.STYLE
import typings.intlRelativeformat.libTypesMod.SUPPORTED_FIELD
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("intl-relativeformat", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with IntlRelativeFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, opts: IntlRelativeFormatOptions) = this()
    def this(locales: js.Array[String], opts: IntlRelativeFormatOptions) = this()
    def this(locales: Unit, opts: IntlRelativeFormatOptions) = this()
  }
  @JSImport("intl-relativeformat", JSImport.Default)
  @js.native
  val default: IntlRelativeFormat = js.native
  
  object global {
    
    object Intl {
      
      @JSGlobal("Intl")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Intl.RelativeTimeFormat")
      @js.native
      def RelativeTimeFormat: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof IntlRelativeTimeFormat */ Any = js.native
      inline def RelativeTimeFormat_=(
        x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof IntlRelativeTimeFormat */ Any
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RelativeTimeFormat")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IntlRelativeFormat
    extends StObject
       with Instantiable0[IntlRelativeFormat]
       with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), IntlRelativeFormat]
       with Instantiable2[
          (/* locales */ js.Array[String]) | (/* locales */ String) | (/* locales */ Unit), 
          /* opts */ IntlRelativeFormatOptions, 
          IntlRelativeFormat
        ] {
    
    def apply(): IntlRelativeFormat = js.native
    def apply(locales: String): IntlRelativeFormat = js.native
    def apply(locales: String, opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
    def apply(locales: js.Array[String]): IntlRelativeFormat = js.native
    def apply(locales: js.Array[String], opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
    def apply(locales: Unit, opts: IntlRelativeFormatOptions): IntlRelativeFormat = js.native
    
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
  
  trait IntlRelativeFormatOptions extends StObject {
    
    var style: js.UndefOr[STYLE] = js.undefined
    
    var units: js.UndefOr[SUPPORTED_FIELD] = js.undefined
  }
  object IntlRelativeFormatOptions {
    
    inline def apply(): IntlRelativeFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntlRelativeFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntlRelativeFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: STYLE): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUnits(value: SUPPORTED_FIELD): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
  
  type _To = IntlRelativeFormat
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: IntlRelativeFormat = default
}
