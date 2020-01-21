package typings.hapiBell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUri extends js.Object {
  var uri: js.UndefOr[String] = js.undefined
}

object AnonUri {
  @scala.inline
  def apply(uri: String = null): AnonUri = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUri]
  }
}

