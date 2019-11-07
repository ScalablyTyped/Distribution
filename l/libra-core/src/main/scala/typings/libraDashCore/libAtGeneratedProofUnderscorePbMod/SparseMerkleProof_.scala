package typings.libraDashCore.libAtGeneratedProofUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof")
@js.native
class SparseMerkleProof_ () extends Message {
  def addNonDefaultSiblings(value: String): Uint8Array | String = js.native
  def addNonDefaultSiblings(value: String, index: Double): Uint8Array | String = js.native
  def addNonDefaultSiblings(value: Uint8Array): Uint8Array | String = js.native
  def addNonDefaultSiblings(value: Uint8Array, index: Double): Uint8Array | String = js.native
  def clearNonDefaultSiblingsList(): Unit = js.native
  def getBitmap(): Uint8Array | String = js.native
  def getBitmap_asB64(): String = js.native
  def getBitmap_asU8(): Uint8Array = js.native
  def getLeaf(): Uint8Array | String = js.native
  def getLeaf_asB64(): String = js.native
  def getLeaf_asU8(): Uint8Array = js.native
  def getNonDefaultSiblingsList(): js.Array[Uint8Array | String] = js.native
  def getNonDefaultSiblingsList_asB64(): js.Array[String] = js.native
  def getNonDefaultSiblingsList_asU8(): js.Array[Uint8Array] = js.native
  def setBitmap(value: String): Unit = js.native
  def setBitmap(value: Uint8Array): Unit = js.native
  def setLeaf(value: String): Unit = js.native
  def setLeaf(value: Uint8Array): Unit = js.native
  def setNonDefaultSiblingsList(value: js.Array[Uint8Array | String]): Unit = js.native
}

