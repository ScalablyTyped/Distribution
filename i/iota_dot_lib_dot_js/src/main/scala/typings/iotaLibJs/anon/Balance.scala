package typings.iotaLibJs.anon

import typings.iotaLibJs.mod.InputObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Balance extends js.Object {
  var addresses: js.Array[String]
  var balance: Double
  var inputs: js.Array[InputObject]
  var latestAddress: String
  var transfers: js.Array[String]
}

object Balance {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    balance: Double,
    inputs: js.Array[InputObject],
    latestAddress: String,
    transfers: js.Array[String]
  ): Balance = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], latestAddress = latestAddress.asInstanceOf[js.Any], transfers = transfers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balance]
  }
}

