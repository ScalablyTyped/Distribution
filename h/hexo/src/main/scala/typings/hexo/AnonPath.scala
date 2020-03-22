package typings.hexo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPath
  extends /* key */ StringDictionary[js.Any] {
  var path: String
  var text: String
}

object AnonPath {
  @scala.inline
  def apply(path: String, text: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonPath = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonPath]
  }
}

