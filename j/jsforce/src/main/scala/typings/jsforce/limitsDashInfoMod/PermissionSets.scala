package typings.jsforce.limitsDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionSets extends Limit {
  var CreateCustom: Limit
}

object PermissionSets {
  @scala.inline
  def apply(CreateCustom: Limit, Max: Double, Remaining: Double): PermissionSets = {
    val __obj = js.Dynamic.literal(CreateCustom = CreateCustom, Max = Max, Remaining = Remaining)
  
    __obj.asInstanceOf[PermissionSets]
  }
}

