package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Objects
//
trait TransactionObject extends js.Object {
  var address: java.lang.String
  var attachmentTimestamp: scala.Double
  var attachmentTimestampLowerBound: scala.Double
  var attachmentTimestampUpperBound: scala.Double
  var branchTransaction: java.lang.String
  var bundle: scala.Double
  var currentIndex: scala.Double
  var hash: java.lang.String
  var lastIndex: scala.Double
  var nonce: java.lang.String
  var signatureMessageFragment: java.lang.String
  var tag: java.lang.String
  var timestamp: scala.Double
  var trunkTransaction: java.lang.String
  var value: scala.Double
}

object TransactionObject {
  @scala.inline
  def apply(
    address: java.lang.String,
    attachmentTimestamp: scala.Double,
    attachmentTimestampLowerBound: scala.Double,
    attachmentTimestampUpperBound: scala.Double,
    branchTransaction: java.lang.String,
    bundle: scala.Double,
    currentIndex: scala.Double,
    hash: java.lang.String,
    lastIndex: scala.Double,
    nonce: java.lang.String,
    signatureMessageFragment: java.lang.String,
    tag: java.lang.String,
    timestamp: scala.Double,
    trunkTransaction: java.lang.String,
    value: scala.Double
  ): TransactionObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("attachmentTimestamp")(attachmentTimestamp)
    __obj.updateDynamic("attachmentTimestampLowerBound")(attachmentTimestampLowerBound)
    __obj.updateDynamic("attachmentTimestampUpperBound")(attachmentTimestampUpperBound)
    __obj.updateDynamic("branchTransaction")(branchTransaction)
    __obj.updateDynamic("bundle")(bundle)
    __obj.updateDynamic("currentIndex")(currentIndex)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("lastIndex")(lastIndex)
    __obj.updateDynamic("nonce")(nonce)
    __obj.updateDynamic("signatureMessageFragment")(signatureMessageFragment)
    __obj.updateDynamic("tag")(tag)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("trunkTransaction")(trunkTransaction)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TransactionObject]
  }
}

