package typings.libraCore.proofPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/proof_pb", "AccumulatorProof")
@js.native
class AccumulatorProof_ () extends Message {
  
  def addNonDefaultSiblings(value: String): Uint8Array | String = js.native
  def addNonDefaultSiblings(value: String, index: Double): Uint8Array | String = js.native
  def addNonDefaultSiblings(value: Uint8Array): Uint8Array | String = js.native
  def addNonDefaultSiblings(value: Uint8Array, index: Double): Uint8Array | String = js.native
  
  def clearNonDefaultSiblingsList(): Unit = js.native
  
  def getBitmap(): String = js.native
  
  def getNonDefaultSiblingsList(): js.Array[Uint8Array | String] = js.native
  
  def getNonDefaultSiblingsList_asB64(): js.Array[String] = js.native
  
  def getNonDefaultSiblingsList_asU8(): js.Array[Uint8Array] = js.native
  
  def setBitmap(value: String): Unit = js.native
  
  def setNonDefaultSiblingsList(value: js.Array[Uint8Array | String]): Unit = js.native
}
