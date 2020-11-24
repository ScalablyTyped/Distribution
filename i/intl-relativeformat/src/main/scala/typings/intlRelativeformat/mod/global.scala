package typings.intlRelativeformat.mod

import org.scalablytyped.runtime.Instantiable0
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.LocaleFieldsData
import typings.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeLocaleData
import typings.formatjsIntlRelativetimeformat.anon.PickIntlRelativeTimeForma
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object Intl extends js.Object {
    
    @js.native
    class RelativeTimeFormat ()
      extends typings.formatjsIntlRelativetimeformat.mod.default
    @js.native
    object RelativeTimeFormat
      extends Instantiable0[typings.formatjsIntlRelativetimeformat.mod.default] {
      
      def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
      
      var __defaultLocale: js.Any = js.native
      
      var availableLocales: js.Any = js.native
      
      var getDefaultLocale: js.Any = js.native
      
      var localeData: Record[String, LocaleFieldsData] = js.native
      
      var polyfilled: Boolean = js.native
      
      var relevantExtensionKeys: js.Any = js.native
      
      def supportedLocalesOf(locales: String): js.Array[String] = js.native
      def supportedLocalesOf(locales: String, options: PickIntlRelativeTimeForma): js.Array[String] = js.native
      def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
      def supportedLocalesOf(locales: js.Array[String], options: PickIntlRelativeTimeForma): js.Array[String] = js.native
    }
  }
}
