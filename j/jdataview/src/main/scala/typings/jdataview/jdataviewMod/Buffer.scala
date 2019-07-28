package typings.jdataview.jdataviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends Bytes {
  var byteLength: Double
}

object Buffer {
  @scala.inline
  def apply(byteLength: Double, length: Double): Buffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength, length = length)
  
    __obj.asInstanceOf[Buffer]
  }
}

