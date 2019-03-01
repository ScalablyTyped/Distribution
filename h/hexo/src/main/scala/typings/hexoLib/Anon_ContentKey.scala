package typings
package hexoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentKey
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var content: java.lang.String
}

object Anon_ContentKey {
  @scala.inline
  def apply(
    content: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ContentKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_ContentKey]
  }
}

