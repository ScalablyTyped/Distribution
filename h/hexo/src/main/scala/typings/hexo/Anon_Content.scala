package typings.hexo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content
  extends /* key */ StringDictionary[js.Any] {
  var content: String
}

object Anon_Content {
  @scala.inline
  def apply(content: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Content]
  }
}

