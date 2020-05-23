package typings.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ECBlocks")
@js.native
class ECBlocks protected ()
  extends typings.jsqrcode.ECBlocks {
  def this(ecCodewordsPerBlock: Double, ecBlocks1: typings.jsqrcode.ECB) = this()
  def this(ecCodewordsPerBlock: Double, ecBlocks1: typings.jsqrcode.ECB, ecBlocks2: typings.jsqrcode.ECB) = this()
  /* CompleteClass */
  override val ECCodewordsPerBlock: Double = js.native
  /* CompleteClass */
  override val NumBlocks: Double = js.native
  /* CompleteClass */
  override val TotalECCodewords: Double = js.native
  /* CompleteClass */
  override var ecBlocks: js.Array[typings.jsqrcode.ECB] | (js.Tuple2[typings.jsqrcode.ECB, typings.jsqrcode.ECB]) = js.native
  /* CompleteClass */
  override var ecCodewordsPerBlock: Double = js.native
  /* CompleteClass */
  override def getECBlocks(): js.Array[typings.jsqrcode.ECB] | (js.Tuple2[typings.jsqrcode.ECB, typings.jsqrcode.ECB]) = js.native
}

