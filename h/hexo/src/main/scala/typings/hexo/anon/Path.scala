package typings.hexo.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Path
  extends /* key */ StringDictionary[js.Any] {
  var path: String
  var text: String
}

object Path {
  @scala.inline
  def apply(path: String, text: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Path]
  }
}

