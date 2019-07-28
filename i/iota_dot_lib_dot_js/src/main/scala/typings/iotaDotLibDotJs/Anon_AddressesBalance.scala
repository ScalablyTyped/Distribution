package typings.iotaDotLibDotJs

import typings.iotaDotLibDotJs.iotaDotLibDotJsMod.InputObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressesBalance extends js.Object {
  var addresses: js.Array[String]
  var balance: Double
  var inputs: js.Array[InputObject]
  var latestAddress: String
  var transfers: js.Array[String]
}

object Anon_AddressesBalance {
  @scala.inline
  def apply(
    addresses: js.Array[String],
    balance: Double,
    inputs: js.Array[InputObject],
    latestAddress: String,
    transfers: js.Array[String]
  ): Anon_AddressesBalance = {
    val __obj = js.Dynamic.literal(addresses = addresses, balance = balance, inputs = inputs, latestAddress = latestAddress, transfers = transfers)
  
    __obj.asInstanceOf[Anon_AddressesBalance]
  }
}

