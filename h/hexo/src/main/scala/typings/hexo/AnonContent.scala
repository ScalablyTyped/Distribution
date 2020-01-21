package typings.hexo

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent
  extends /* key */ StringDictionary[js.Any] {
  var content: String
}

object AnonContent {
  @scala.inline
  def apply(content: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonContent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonContent]
  }
}

