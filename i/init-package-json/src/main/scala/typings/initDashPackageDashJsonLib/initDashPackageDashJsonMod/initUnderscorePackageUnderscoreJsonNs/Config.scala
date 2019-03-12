package typings
package initDashPackageDashJsonLib.initDashPackageDashJsonMod.initUnderscorePackageUnderscoreJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def get(k: java.lang.String): js.Any
}

object Config {
  @scala.inline
  def apply(
    get: java.lang.String => js.Any,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Config = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Config]
  }
}

