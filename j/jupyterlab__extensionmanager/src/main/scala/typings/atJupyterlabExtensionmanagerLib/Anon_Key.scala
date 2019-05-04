package typings
package atJupyterlabExtensionmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  /**
    * The version tagged as 'latest'.
    */
  var latest: java.lang.String
}

object Anon_Key {
  @scala.inline
  def apply(
    latest: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(latest = latest)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

