package typings.hlsDashParser.hlsDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Byterange extends js.Object {
  var length: Double
  var offset: Double
}

object Byterange {
  @scala.inline
  def apply(length: Double, offset: Double): Byterange = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Byterange]
  }
}

