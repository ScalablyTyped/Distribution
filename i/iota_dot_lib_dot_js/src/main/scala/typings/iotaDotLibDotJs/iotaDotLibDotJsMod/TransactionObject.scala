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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], attachmentTimestamp = attachmentTimestamp.asInstanceOf[js.Any], attachmentTimestampLowerBound = attachmentTimestampLowerBound.asInstanceOf[js.Any], attachmentTimestampUpperBound = attachmentTimestampUpperBound.asInstanceOf[js.Any], branchTransaction = branchTransaction.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], currentIndex = currentIndex.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lastIndex = lastIndex.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], signatureMessageFragment = signatureMessageFragment.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], trunkTransaction = trunkTransaction.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionObject]
  }
}

