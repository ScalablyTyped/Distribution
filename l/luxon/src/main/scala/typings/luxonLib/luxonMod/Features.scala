package typings
package luxonLib.luxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  var intl: scala.Boolean
  var intlTokens: scala.Boolean
  var zones: scala.Boolean
}

object Features {
  @scala.inline
  def apply(intl: scala.Boolean, intlTokens: scala.Boolean, zones: scala.Boolean): Features = {
    val __obj = js.Dynamic.literal(intl = intl, intlTokens = intlTokens, zones = zones)
  
    __obj.asInstanceOf[Features]
  }
}

