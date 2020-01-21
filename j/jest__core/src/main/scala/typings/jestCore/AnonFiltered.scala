package typings.jestCore

import typings.jestCore.typesMod.FilterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiltered extends js.Object {
  var filtered: js.Array[FilterResult]
}

object AnonFiltered {
  @scala.inline
  def apply(filtered: js.Array[FilterResult]): AnonFiltered = {
    val __obj = js.Dynamic.literal(filtered = filtered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFiltered]
  }
}

