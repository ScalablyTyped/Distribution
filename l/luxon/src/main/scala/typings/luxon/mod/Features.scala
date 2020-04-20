package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  var intl: Boolean
  var intlTokens: Boolean
  var zones: Boolean
}

object Features {
  @scala.inline
  def apply(intl: Boolean, intlTokens: Boolean, zones: Boolean): Features = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any], intlTokens = intlTokens.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}

