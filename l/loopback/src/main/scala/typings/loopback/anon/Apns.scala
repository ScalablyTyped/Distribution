package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Apns extends js.Object {
  var apns: CerData
  var gcm: ServerApiKey
}

object Apns {
  @scala.inline
  def apply(apns: CerData, gcm: ServerApiKey): Apns = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Apns]
  }
}

