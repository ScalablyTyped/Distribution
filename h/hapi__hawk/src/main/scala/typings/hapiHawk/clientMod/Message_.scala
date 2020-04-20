package typings.hapiHawk.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message_ extends js.Object {
  var hash: String
  var id: String
  var mac: String
  var nonce: String
  var ts: String
}

object Message_ {
  @scala.inline
  def apply(hash: String, id: String, mac: String, nonce: String, ts: String): Message_ = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message_]
  }
}

