package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.multisig
//
@js.native
trait IotaMultisig extends js.Object {
  def addSignature(bundleToSign: js.Array[TransactionObject], inputAddress: java.lang.String, key: java.lang.String): scala.Unit = js.native
  def addSignature(
    bundleToSign: js.Array[TransactionObject],
    inputAddress: java.lang.String,
    key: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* bundle */ js.Array[TransactionObject], scala.Unit]
  ): scala.Unit = js.native
  def address(digestTrytes: java.lang.String): MultisigAddress = js.native
  def address(digestTrytes: js.Array[java.lang.String]): MultisigAddress = js.native
  def getDigest(seed: java.lang.String, index: scala.Double, security: Security): java.lang.String = js.native
  def getKey(seed: java.lang.String, index: scala.Double, security: Security): java.lang.String = js.native
  def initiateTransfer(
    securitySum: scala.Double,
    inputAddress: java.lang.String,
    remainderAddress: java.lang.String,
    transfers: js.Array[TransferObject]
  ): scala.Unit = js.native
  def initiateTransfer(
    securitySum: scala.Double,
    inputAddress: java.lang.String,
    remainderAddress: java.lang.String,
    transfers: js.Array[TransferObject],
    callback: js.Function2[/* error */ stdLib.Error, /* bundle */ js.Array[TransactionObject], scala.Unit]
  ): scala.Unit = js.native
  def validateAddress(multisigAddress: java.lang.String, digests: js.Array[java.lang.String]): scala.Boolean = js.native
}

