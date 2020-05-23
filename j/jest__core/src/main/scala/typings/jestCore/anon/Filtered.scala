package typings.jestCore.anon

import typings.jestCore.typesMod.FilterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filtered extends js.Object {
  var filtered: js.Array[FilterResult]
}

object Filtered {
  @scala.inline
  def apply(filtered: js.Array[FilterResult]): Filtered = {
    val __obj = js.Dynamic.literal(filtered = filtered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filtered]
  }
}

