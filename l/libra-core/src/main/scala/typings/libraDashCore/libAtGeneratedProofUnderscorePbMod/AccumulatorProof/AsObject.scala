package typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var bitmap: String
  var nonDefaultSiblingsList: js.Array[Uint8Array | String]
}

object AsObject {
  @scala.inline
  def apply(bitmap: String, nonDefaultSiblingsList: js.Array[Uint8Array | String]): AsObject = {
    val __obj = js.Dynamic.literal(bitmap = bitmap, nonDefaultSiblingsList = nonDefaultSiblingsList)
  
    __obj.asInstanceOf[AsObject]
  }
}

