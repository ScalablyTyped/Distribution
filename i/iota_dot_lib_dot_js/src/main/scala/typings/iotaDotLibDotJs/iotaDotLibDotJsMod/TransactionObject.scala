package typings.iotaDotLibDotJs.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Objects
//
trait TransactionObject extends js.Object {
  var address: String
  var attachmentTimestamp: Double
  var attachmentTimestampLowerBound: Double
  var attachmentTimestampUpperBound: Double
  var branchTransaction: String
  var bundle: Double
  var currentIndex: Double
  var hash: String
  var lastIndex: Double
  var nonce: String
  var signatureMessageFragment: String
  var tag: String
  var timestamp: Double
  var trunkTransaction: String
  var value: Double
}

object TransactionObject {
  @scala.inline
  def apply(
    address: String,
    attachmentTimestamp: Double,
    attachmentTimestampLowerBound: Double,
    attachmentTimestampUpperBound: Double,
    branchTransaction: String,
    bundle: Double,
    currentIndex: Double,
    hash: String,
    lastIndex: Double,
    nonce: String,
    signatureMessageFragment: String,
    tag: String,
    timestamp: Double,
    trunkTransaction: String,
    value: Double
  ): TransactionObject = {
    val __obj = js.Dynamic.literal(address = address, attachmentTimestamp = attachmentTimestamp, attachmentTimestampLowerBound = attachmentTimestampLowerBound, attachmentTimestampUpperBound = attachmentTimestampUpperBound, branchTransaction = branchTransaction, bundle = bundle, currentIndex = currentIndex, hash = hash, lastIndex = lastIndex, nonce = nonce, signatureMessageFragment = signatureMessageFragment, tag = tag, timestamp = timestamp, trunkTransaction = trunkTransaction, value = value)
  
    __obj.asInstanceOf[TransactionObject]
  }
}

