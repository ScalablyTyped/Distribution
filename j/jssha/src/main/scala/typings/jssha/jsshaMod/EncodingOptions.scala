package typings.jssha.jsshaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
}

object EncodingOptions {
  @scala.inline
  def apply(encoding: String = null): EncodingOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingOptions]
  }
}

