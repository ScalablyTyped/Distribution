package typings.hexoFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingNull extends js.Object {
  var encoding: js.UndefOr[String | Null] = js.undefined
}

object AnonEncodingNull {
  @scala.inline
  def apply(encoding: String = null): AnonEncodingNull = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingNull]
  }
}

