package typings.iostDashContract.IOSTContract

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
    val __obj = js.Dynamic.literal(auth_list = auth_list, expiration = expiration, gas_limit = gas_limit, gas_ratio = gas_ratio, hash = hash, publisher = publisher, time = time)
  
    __obj.asInstanceOf[Tx]
  }
}

