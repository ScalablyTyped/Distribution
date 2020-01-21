package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApns extends js.Object {
  var apns: AnonCerData
  var gcm: AnonServerApiKey
}

object AnonApns {
  @scala.inline
  def apply(apns: AnonCerData, gcm: AnonServerApiKey): AnonApns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApns]
  }
}

