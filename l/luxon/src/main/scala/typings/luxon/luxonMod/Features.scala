package typings.luxon.luxonMod

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
    val __obj = js.Dynamic.literal(intl = intl, intlTokens = intlTokens, zones = zones)
  
    __obj.asInstanceOf[Features]
  }
}

