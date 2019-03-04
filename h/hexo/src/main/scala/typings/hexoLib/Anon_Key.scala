package typings
package hexoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var path: java.lang.String
  var text: java.lang.String
}

object Anon_Key {
  @scala.inline
  def apply(
    path: java.lang.String,
    text: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(path = path, text = text)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

