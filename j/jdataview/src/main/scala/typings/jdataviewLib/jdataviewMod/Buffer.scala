package typings
package jdataviewLib.jdataviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends Bytes {
  var byteLength: scala.Double
}

object Buffer {
  @scala.inline
  def apply(byteLength: scala.Double, length: scala.Double): Buffer = {
    val __obj = js.Dynamic.literal(byteLength = byteLength, length = length)
  
    __obj.asInstanceOf[Buffer]
  }
}

