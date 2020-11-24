package typings.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// iota.valid
//
@js.native
trait IotaValid extends js.Object {
  
  def isAddress(address: String): Boolean = js.native
  
  def isArray(array: js.Any): Boolean = js.native
  
  def isArrayOfAttachedTrytes(trytes: js.Any): Boolean = js.native
  
  def isArrayOfHashes(hashes: js.Any): Boolean = js.native
  
  def isArrayOfTrytes(trytes: js.Any): Boolean = js.native
  
  def isArrayOfTxObjects(transactions: js.Any): Boolean = js.native
  
  def isHash(hash: js.Any): Boolean = js.native
  
  def isInputs(inputs: js.Any): Boolean = js.native
  
  def isNum(value: js.Any): Boolean = js.native
  
  def isObject(`object`: js.Any): Boolean = js.native
  
  def isString(string: js.Any): Boolean = js.native
  
  def isTransfersArray(transfers: js.Any): Boolean = js.native
  
  def isTrytes(trytes: String): Boolean = js.native
  def isTrytes(trytes: String, length: Double): Boolean = js.native
  
  def isUri(uri: js.Any): Boolean = js.native
  
  def isValue(value: js.Any): Boolean = js.native
}
