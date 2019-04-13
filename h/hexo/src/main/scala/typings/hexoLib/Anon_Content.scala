package typings
package hexoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var content: java.lang.String
}

object Anon_Content {
  @scala.inline
  def apply(
    content: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Content]
  }
}

