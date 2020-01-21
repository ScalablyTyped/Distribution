package typings.libraCore.proofPbMod.SparseMerkleProof

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var bitmap: Uint8Array | String
  var leaf: Uint8Array | String
  var nonDefaultSiblingsList: js.Array[Uint8Array | String]
}

object AsObject {
  @scala.inline
  def apply(
    bitmap: Uint8Array | String,
    leaf: Uint8Array | String,
    nonDefaultSiblingsList: js.Array[Uint8Array | String]
  ): AsObject = {
    val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], nonDefaultSiblingsList = nonDefaultSiblingsList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

