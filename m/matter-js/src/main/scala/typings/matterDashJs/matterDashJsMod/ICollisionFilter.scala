package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollisionFilter extends js.Object {
  var category: Double
  var group: Double
  var mask: Double
}

object ICollisionFilter {
  @scala.inline
  def apply(category: Double, group: Double, mask: Double): ICollisionFilter = {
    val __obj = js.Dynamic.literal(category = category, group = group, mask = mask)
  
    __obj.asInstanceOf[ICollisionFilter]
  }
}

