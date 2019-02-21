package typings
package i18nextDashBrowserDashLanguagedetectorLib.i18nextDashBrowserDashLanguagedetectorMod.I18nextBrowserLanguageDetectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDetector extends js.Object {
  var cacheUserLanguage: js.UndefOr[
    js.Function2[/* lng */ java.lang.String, /* options */ DetectorOptions, scala.Unit]
  ] = js.undefined
  var name: java.lang.String
  def lookup(options: DetectorOptions): js.UndefOr[java.lang.String]
}

