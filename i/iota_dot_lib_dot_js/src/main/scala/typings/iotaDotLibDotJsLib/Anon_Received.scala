package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Received extends js.Object {
  var received: js.Array[iotaDotLibDotJsLib.iotaDotLibDotJsMod.TransactionObject]
  var sent: js.Array[iotaDotLibDotJsLib.iotaDotLibDotJsMod.TransactionObject]
}

object Anon_Received {
  @scala.inline
  def apply(
    received: js.Array[iotaDotLibDotJsLib.iotaDotLibDotJsMod.TransactionObject],
    sent: js.Array[iotaDotLibDotJsLib.iotaDotLibDotJsMod.TransactionObject]
  ): Anon_Received = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("received")(received)
    __obj.updateDynamic("sent")(sent)
    __obj.asInstanceOf[Anon_Received]
  }
}

