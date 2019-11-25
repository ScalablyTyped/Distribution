package typings.i18nextDashBrowserDashLanguagedetector.i18nextDashBrowserDashLanguagedetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDetector extends js.Object {
  var cacheUserLanguage: js.UndefOr[js.Function2[/* lng */ String, /* options */ DetectorOptions, Unit]] = js.undefined
  var name: String
  def lookup(options: DetectorOptions): js.UndefOr[String]
}

object CustomDetector {
  @scala.inline
  def apply(
    lookup: DetectorOptions => js.UndefOr[String],
    name: String,
    cacheUserLanguage: (/* lng */ String, /* options */ DetectorOptions) => Unit = null
  ): CustomDetector = {
    val __obj = js.Dynamic.literal(lookup = js.Any.fromFunction1(lookup), name = name.asInstanceOf[js.Any])
    if (cacheUserLanguage != null) __obj.updateDynamic("cacheUserLanguage")(js.Any.fromFunction2(cacheUserLanguage))
    __obj.asInstanceOf[CustomDetector]
  }
}

