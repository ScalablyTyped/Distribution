package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollisionFilter extends js.Object {
  var category: scala.Double
  var group: scala.Double
  var mask: scala.Double
}

object ICollisionFilter {
  @scala.inline
  def apply(category: scala.Double, group: scala.Double, mask: scala.Double): ICollisionFilter = {
    val __obj = js.Dynamic.literal(category = category, group = group, mask = mask)
  
    __obj.asInstanceOf[ICollisionFilter]
  }
}

