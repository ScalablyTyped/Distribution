package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBound extends js.Object {
  var max: matterDashJsLib.Anon_X
  var min: matterDashJsLib.Anon_X
}

object IBound {
  @scala.inline
  def apply(max: matterDashJsLib.Anon_X, min: matterDashJsLib.Anon_X): IBound = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[IBound]
  }
}

