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
    val __obj = js.Dynamic.literal(address = address, attachmentTimestamp = attachmentTimestamp, attachmentTimestampLowerBound = attachmentTimestampLowerBound, attachmentTimestampUpperBound = attachmentTimestampUpperBound, branchTransaction = branchTransaction, bundle = bundle, currentIndex = currentIndex, hash = hash, lastIndex = lastIndex, nonce = nonce, signatureMessageFragment = signatureMessageFragment, tag = tag, timestamp = timestamp, trunkTransaction = trunkTransaction, value = value)
  
    __obj.asInstanceOf[TransactionObject]
  }
}

