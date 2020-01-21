package typings.iostContract.IOSTContract

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tx extends js.Object {
  var auth_list: js.Object
  var expiration: Double
  var gas_limit: Double
  var gas_ratio: Double
  var hash: String
  var publisher: String
  var time: Double
}

object Tx {
  @scala.inline
  def apply(
    auth_list: js.Object,
    expiration: Double,
    gas_limit: Double,
    gas_ratio: Double,
    hash: String,
    publisher: String,
    time: Double
  ): Tx = {
    val __obj = js.Dynamic.literal(auth_list = auth_list.asInstanceOf[js.Any], expiration = expiration.asInstanceOf[js.Any], gas_limit = gas_limit.asInstanceOf[js.Any], gas_ratio = gas_ratio.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tx]
  }
}

