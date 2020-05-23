package typings.hapiBell.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uri extends js.Object {
  var uri: js.UndefOr[String] = js.undefined
}

object Uri {
  @scala.inline
  def apply(uri: String = null): Uri = {
    val __obj = js.Dynamic.literal()
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uri]
  }
}

