package typings.karmaFirefoxLauncher.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomLauncher extends js.Object {
  /**
    * extensions that you want loaded into the browser on startup
    */
  var extensions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * configure preferences for the Firefox instance that is loaded
    */
  var prefs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object CustomLauncher {
  @scala.inline
  def apply(extensions: js.Array[String] = null, prefs: StringDictionary[js.Any] = null): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (prefs != null) __obj.updateDynamic("prefs")(prefs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLauncher]
  }
}

