package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPlatform extends js.Object {
  var platform: AnonBrowser
}

object AnonPlatform {
  @scala.inline
  def apply(platform: AnonBrowser): AnonPlatform = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPlatform]
  }
}

