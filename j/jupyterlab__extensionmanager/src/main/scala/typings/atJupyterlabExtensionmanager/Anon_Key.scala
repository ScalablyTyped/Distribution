package typings.atJupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends /* key */ StringDictionary[String] {
  /**
    * The version tagged as 'latest'.
    */
  var latest: String
}

object Anon_Key {
  @scala.inline
  def apply(latest: String, StringDictionary: /* key */ StringDictionary[String] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(latest = latest)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

