package typings.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends /* key */ StringDictionary[String] {
  /**
    * The version tagged as 'latest'.
    */
  var latest: String
}

object AnonKey {
  @scala.inline
  def apply(latest: String, StringDictionary: /* key */ StringDictionary[String] = null): AnonKey = {
    val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKey]
  }
}

