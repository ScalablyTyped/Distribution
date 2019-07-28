package typings.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ECBlocks")
@js.native
class ECBlocks protected () extends js.Object {
  def this(ecCodewordsPerBlock: Double, ecBlocks1: ECB) = this()
  def this(ecCodewordsPerBlock: Double, ecBlocks1: ECB, ecBlocks2: ECB) = this()
  val ECCodewordsPerBlock: Double = js.native
  val NumBlocks: Double = js.native
  val TotalECCodewords: Double = js.native
  var ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB]) = js.native
  var ecCodewordsPerBlock: Double = js.native
  def getECBlocks(): js.Array[ECB] | (js.Tuple2[ECB, ECB]) = js.native
}

