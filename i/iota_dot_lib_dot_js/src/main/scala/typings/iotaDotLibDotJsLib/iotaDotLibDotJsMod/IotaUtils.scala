package typings
package iotaDotLibDotJsLib.iotaDotLibDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.utils
//
@js.native
trait IotaUtils extends js.Object {
  def addChecksum(inputValue: java.lang.String): java.lang.String = js.native
  def addChecksum(inputValue: java.lang.String, checksumLength: scala.Double): java.lang.String = js.native
  def addChecksum(inputValue: java.lang.String, checksumLength: scala.Double, isAddress: scala.Boolean): java.lang.String = js.native
  def addChecksum(inputValue: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def addChecksum(inputValue: js.Array[java.lang.String], checksumLength: scala.Double): js.Array[java.lang.String] = js.native
  def addChecksum(inputValue: js.Array[java.lang.String], checksumLength: scala.Double, isAddress: scala.Boolean): js.Array[java.lang.String] = js.native
  def categorizeTransfers(transfers: js.Array[TransactionObject], addresses: js.Array[java.lang.String]): iotaDotLibDotJsLib.Anon_Received = js.native
  def convertUnits(value: scala.Double, fromUnit: IOTAUnit, toUnit: IOTAUnit): scala.Double = js.native
  def extractJson(bundle: js.Array[TransactionObject]): java.lang.String = js.native
  def fromTrytes(trytes: java.lang.String): java.lang.String = js.native
  def isBundle(bundle: js.Array[TransactionObject]): scala.Boolean = js.native
  def isValidChecksum(addressWithChecksum: java.lang.String): scala.Boolean = js.native
  def noChecksum(address: java.lang.String): java.lang.String = js.native
  def toTrytes(input: java.lang.String): java.lang.String = js.native
  def transactionObject(trytes: java.lang.String): TransactionObject = js.native
  def transactionTrytes(transaction: TransactionObject): java.lang.String = js.native
  def validateSignatures(signedBundle: js.Array[java.lang.String], inputAddress: java.lang.String): scala.Boolean = js.native
}

