package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apns extends js.Object {
  var apns: Anon_CerData
  var gcm: Anon_ServerApiKey
}

object Anon_Apns {
  @scala.inline
  def apply(apns: Anon_CerData, gcm: Anon_ServerApiKey): Anon_Apns = {
    val __obj = js.Dynamic.literal(apns = apns, gcm = gcm)
  
    __obj.asInstanceOf[Anon_Apns]
  }
}

