package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECBlocks extends js.Object {
  val ECCodewordsPerBlock: Double
  val NumBlocks: Double
  val TotalECCodewords: Double
  var ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB])
  var ecCodewordsPerBlock: Double
  def getECBlocks(): js.Array[ECB] | (js.Tuple2[ECB, ECB])
}

object ECBlocks {
  @scala.inline
  def apply(
    ECCodewordsPerBlock: Double,
    NumBlocks: Double,
    TotalECCodewords: Double,
    ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB]),
    ecCodewordsPerBlock: Double,
    getECBlocks: () => js.Array[ECB] | (js.Tuple2[ECB, ECB])
  ): ECBlocks = {
    val __obj = js.Dynamic.literal(ECCodewordsPerBlock = ECCodewordsPerBlock.asInstanceOf[js.Any], NumBlocks = NumBlocks.asInstanceOf[js.Any], TotalECCodewords = TotalECCodewords.asInstanceOf[js.Any], ecBlocks = ecBlocks.asInstanceOf[js.Any], ecCodewordsPerBlock = ecCodewordsPerBlock.asInstanceOf[js.Any], getECBlocks = js.Any.fromFunction0(getECBlocks))
    __obj.asInstanceOf[ECBlocks]
  }
}

