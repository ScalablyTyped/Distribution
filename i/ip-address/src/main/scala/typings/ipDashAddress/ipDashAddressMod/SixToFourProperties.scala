package typings.ipDashAddress.ipDashAddressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SixToFourProperties extends js.Object {
  var gateway: String
  var prefix: String
}

object SixToFourProperties {
  @scala.inline
  def apply(gateway: String, prefix: String): SixToFourProperties = {
    val __obj = js.Dynamic.literal(gateway = gateway.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SixToFourProperties]
  }
}

