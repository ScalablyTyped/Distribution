package typings
package jdataviewLib.jdataviewMod.jDataViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends Bytes {
  var byteLength: scala.Double
}

object Buffer {
  @scala.inline
  def apply(byteLength: scala.Double, length: scala.Double): Buffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("byteLength")(byteLength)
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[Buffer]
  }
}

