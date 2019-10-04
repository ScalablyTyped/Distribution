package typings.intlDashRelativeformat.intlDashRelativeformatMod.Global

import org.scalablytyped.runtime.Instantiable0
import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
import typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod.RelativeTimeLocaleData
import typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod.UnpackedLocaleFieldsData
import typings.intlDashRelativeformat.intlDashRelativeformatStrings.localeMatcher
import typings.std.Pick
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Intl")
@js.native
object IntlNs extends js.Object {
  @js.native
  class RelativeTimeFormat ()
    extends typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
  
  @js.native
  object RelativeTimeFormat
    extends Instantiable0[
          typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
        ] {
    val __INTERNAL_SLOT_MAP__ : js.Any = js.native
    var __defaultLocale: js.Any = js.native
    var availableLocales: js.Any = js.native
    var getDefaultLocale: js.Any = js.native
    var localeData: Record[String, UnpackedLocaleFieldsData] = js.native
    var polyfilled: Boolean = js.native
    var relevantExtensionKeys: js.Any = js.native
    def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: String, options: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[String] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: js.Array[String], options: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[String] = js.native
  }
  
}

