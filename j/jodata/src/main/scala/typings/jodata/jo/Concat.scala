package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concat extends js.Object {
  var LeftSide: String | Concat
  var RightSide: String | Concat
}

object Concat {
  @scala.inline
  def apply(LeftSide: String | Concat, RightSide: String | Concat): Concat = {
    val __obj = js.Dynamic.literal(LeftSide = LeftSide.asInstanceOf[js.Any], RightSide = RightSide.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concat]
  }
}

