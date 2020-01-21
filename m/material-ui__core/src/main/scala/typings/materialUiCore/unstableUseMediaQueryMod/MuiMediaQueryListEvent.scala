package typings.materialUiCore.unstableUseMediaQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MuiMediaQueryListEvent extends js.Object {
  var matches: Boolean = js.native
}

object MuiMediaQueryListEvent {
  @scala.inline
  def apply(matches: Boolean): MuiMediaQueryListEvent = {
    val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MuiMediaQueryListEvent]
  }
}

