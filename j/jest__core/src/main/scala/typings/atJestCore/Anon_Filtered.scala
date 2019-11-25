package typings.atJestCore

import typings.atJestCore.buildTypesMod.FilterResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filtered extends js.Object {
  var filtered: js.Array[FilterResult]
}

object Anon_Filtered {
  @scala.inline
  def apply(filtered: js.Array[FilterResult]): Anon_Filtered = {
    val __obj = js.Dynamic.literal(filtered = filtered.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Filtered]
  }
}

