package typings.kikBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Platform extends js.Object {
  var platform: Browser
}

object Platform {
  @scala.inline
  def apply(platform: Browser): Platform = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Platform]
  }
}

