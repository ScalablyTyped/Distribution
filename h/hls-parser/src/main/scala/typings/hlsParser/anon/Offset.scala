package typings.hlsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: Double
  var precise: Boolean
}

object Offset {
  @scala.inline
  def apply(offset: Double, precise: Boolean): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], precise = precise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

