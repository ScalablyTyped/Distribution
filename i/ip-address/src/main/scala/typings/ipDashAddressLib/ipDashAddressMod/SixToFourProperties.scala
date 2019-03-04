package typings
package ipDashAddressLib.ipDashAddressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SixToFourProperties extends js.Object {
  var gateway: java.lang.String
  var prefix: java.lang.String
}

object SixToFourProperties {
  @scala.inline
  def apply(gateway: java.lang.String, prefix: java.lang.String): SixToFourProperties = {
    val __obj = js.Dynamic.literal(gateway = gateway, prefix = prefix)
  
    __obj.asInstanceOf[SixToFourProperties]
  }
}

