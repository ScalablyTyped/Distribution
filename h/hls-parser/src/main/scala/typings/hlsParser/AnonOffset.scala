package typings.hlsParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: Double
  var precise: Boolean
}

object AnonOffset {
  @scala.inline
  def apply(offset: Double, precise: Boolean): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], precise = precise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOffset]
  }
}

