package typings
package jsDashSha512Lib.jsDashSha512Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  def array(): js.Array[scala.Double]
  def arrayBuffer(): stdLib.ArrayBuffer
  def digest(): js.Array[scala.Double]
  def hex(): java.lang.String
  def update(messageToHash: java.lang.String): Hash
}

object Hash {
  @scala.inline
  def apply(
    array: js.Function0[js.Array[scala.Double]],
    arrayBuffer: js.Function0[stdLib.ArrayBuffer],
    digest: js.Function0[js.Array[scala.Double]],
    hex: js.Function0[java.lang.String],
    update: js.Function1[java.lang.String, Hash]
  ): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("array")(array)
    __obj.updateDynamic("arrayBuffer")(arrayBuffer)
    __obj.updateDynamic("digest")(digest)
    __obj.updateDynamic("hex")(hex)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Hash]
  }
}

