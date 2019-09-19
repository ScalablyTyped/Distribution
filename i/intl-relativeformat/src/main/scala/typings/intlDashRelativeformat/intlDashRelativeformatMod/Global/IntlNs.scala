package typings.intlDashRelativeformat.intlDashRelativeformatMod.Global

import org.scalablytyped.runtime.Instantiable1
import typings.atFormatjsIntlDashRelativetimeformat.distCoreMod.IntlRelativeTimeFormatOptions
import typings.atFormatjsIntlDashRelativetimeformat.distTypesMod.LocaleData
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
  class RelativeTimeFormat protected ()
    extends typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default {
    def this(/* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param hasLocalesOptions because its type [string | Array<string> | undefined, IntlRelativeTimeFormatOptions | undefined] is not an array type */ hasLocalesOptions: js.Tuple2[js.UndefOr[String | js.Array[String]], js.UndefOr[IntlRelativeTimeFormatOptions]]) = this()
  }
  
  @js.native
  object RelativeTimeFormat
    extends Instantiable1[
          /* hasLocalesOptions */ js.Tuple2[js.UndefOr[String | js.Array[String]], js.UndefOr[IntlRelativeTimeFormatOptions]], 
          typings.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.default
        ] {
    var __localeData__ : Record[String, LocaleData] = js.native
    var polyfilled: Boolean = js.native
    def __addLocaleData(data: LocaleData*): Unit = js.native
    def supportedLocalesOf(locales: String): js.Array[js.UndefOr[String]] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[js.UndefOr[String]] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: String, __1_0: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
    @JSName("supportedLocalesOf")
    def supportedLocalesOf_localeMatcher(locales: js.Array[String], __1_0: Pick[IntlRelativeTimeFormatOptions, localeMatcher]): js.Array[js.UndefOr[String]] = js.native
  }
  
}

