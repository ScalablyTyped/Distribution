package typings.iabVpaid.iab.vpaid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Creative Data with AdParameters field */
trait CreativeData extends js.Object {
  var AdParameters: String
}

object CreativeData {
  @scala.inline
  def apply(AdParameters: String): CreativeData = {
    val __obj = js.Dynamic.literal(AdParameters = AdParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeData]
  }
}

