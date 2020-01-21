package typings.jsforce.limitsInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionSets extends Limit {
  var CreateCustom: Limit
}

object PermissionSets {
  @scala.inline
  def apply(CreateCustom: Limit, Max: Double, Remaining: Double): PermissionSets = {
    val __obj = js.Dynamic.literal(CreateCustom = CreateCustom.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Remaining = Remaining.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PermissionSets]
  }
}

