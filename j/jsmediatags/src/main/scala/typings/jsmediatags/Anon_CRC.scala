package typings.jsmediatags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CRC extends js.Object {
  var CRC: Double
  var RESTRICTIONS: Double
  var UPDATE: Double
}

object Anon_CRC {
  @scala.inline
  def apply(CRC: Double, RESTRICTIONS: Double, UPDATE: Double): Anon_CRC = {
    val __obj = js.Dynamic.literal(CRC = CRC, RESTRICTIONS = RESTRICTIONS, UPDATE = UPDATE)
  
    __obj.asInstanceOf[Anon_CRC]
  }
}

