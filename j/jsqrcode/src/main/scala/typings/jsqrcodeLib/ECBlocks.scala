package typings
package jsqrcodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ECBlocks")
@js.native
class ECBlocks protected () extends js.Object {
  def this(ecCodewordsPerBlock: scala.Double, ecBlocks1: ECB) = this()
  def this(ecCodewordsPerBlock: scala.Double, ecBlocks1: ECB, ecBlocks2: ECB) = this()
  val ECCodewordsPerBlock: scala.Double = js.native
  val NumBlocks: scala.Double = js.native
  val TotalECCodewords: scala.Double = js.native
  var ecBlocks: js.Array[ECB] | (js.Tuple2[ECB, ECB]) = js.native
  var ecCodewordsPerBlock: scala.Double = js.native
  def getECBlocks(): js.Array[ECB] | (js.Tuple2[ECB, ECB]) = js.native
}

