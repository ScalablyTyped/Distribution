package typings
package matterDashJsLib.matterDashJsMod.MatterNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[IBound]
  }
}

