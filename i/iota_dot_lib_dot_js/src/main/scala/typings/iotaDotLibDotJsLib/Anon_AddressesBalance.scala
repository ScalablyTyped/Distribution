package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressesBalance extends js.Object {
  var addresses: js.Array[java.lang.String]
  var balance: scala.Double
  var inputs: js.Array[iotaDotLibDotJsLib.iotaDotLibDotJsMod.InputObject]
  var latestAddress: java.lang.String
  var transfers: js.Array[java.lang.String]
}

object Anon_AddressesBalance {
  @scala.inline
  def apply(
    addresses: js.Array[java.lang.String],
    balance: scala.Double,
    inputs: js.Array[iotaDotLibDotJsLib.iotaDotLibDotJsMod.InputObject],
    latestAddress: java.lang.String,
    transfers: js.Array[java.lang.String]
  ): Anon_AddressesBalance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addresses")(addresses)
    __obj.updateDynamic("balance")(balance)
    __obj.updateDynamic("inputs")(inputs)
    __obj.updateDynamic("latestAddress")(latestAddress)
    __obj.updateDynamic("transfers")(transfers)
    __obj.asInstanceOf[Anon_AddressesBalance]
  }
}

