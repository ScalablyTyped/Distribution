package typings.instagramPrivateApi

import typings.instagramPrivateApi.instagramPrivateApiStrings.`3`
import typings.instagramPrivateApi.instagramPrivateApiStrings.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLengthSourcetype extends js.Object {
  var length: Double
  var source_type: `3` | `4`
}

object AnonLengthSourcetype {
  @scala.inline
  def apply(length: Double, source_type: `3` | `4`): AnonLengthSourcetype = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLengthSourcetype]
  }
}

