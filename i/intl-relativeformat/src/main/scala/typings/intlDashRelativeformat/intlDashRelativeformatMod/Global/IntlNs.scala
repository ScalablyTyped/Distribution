package typings.intlDashRelativeformat.intlDashRelativeformatMod.Global

import org.scalablytyped.runtime.Instantiable0
import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
import typings.atFormatjsIntlDashUtils.distRelativeDashTimeDashTypesMod.RelativeTimeLocaleData
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
    var __localeData__ : Record[String, RelativeTimeLocaleData] = js.native
    var polyfilled: Boolean = js.native
    def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
    def supportedLocalesOf(locales: String): js.Array[js.UndefOr[String]] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[js.UndefOr[String]] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: String, opts: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: js.Array[String], opts: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
  }
  
}

