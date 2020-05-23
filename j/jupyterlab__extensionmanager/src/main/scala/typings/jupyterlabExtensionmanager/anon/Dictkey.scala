package typings.jupyterlabExtensionmanager.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[String] {
  /**
    * The version tagged as 'latest'.
    */
  var latest: String
}

object Dictkey {
  @scala.inline
  def apply(latest: String, StringDictionary: /* name */ StringDictionary[String] = null): Dictkey = {
    val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

