package typings.jdataview.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends Bytes {
  var byteLength: Double
}

object Buffer {
  @scala.inline
  def apply(byteLength: Double, length: Double): Buffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Buffer]
  }
}

