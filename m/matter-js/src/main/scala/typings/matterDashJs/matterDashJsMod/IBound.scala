package typings.matterDashJs.matterDashJsMod

import typings.matterDashJs.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBound extends js.Object {
  var max: Anon_X
  var min: Anon_X
}

object IBound {
  @scala.inline
  def apply(max: Anon_X, min: Anon_X): IBound = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[IBound]
  }
}

