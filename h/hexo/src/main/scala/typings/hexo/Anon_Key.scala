package typings.hexo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ StringDictionary[js.Any] {
  var path: String
  var text: String
}

object Anon_Key {
  @scala.inline
  def apply(path: String, text: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(path = path, text = text)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

