package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait World extends Composite {
  var bounds: Bounds
  var gravity: Gravity
}

object World {
  @scala.inline
  def apply(
    bodies: js.Array[Body],
    bounds: Bounds,
    composites: js.Array[Composite],
    constraints: js.Array[Constraint],
    gravity: Gravity,
    id: scala.Double,
    isModified: scala.Boolean,
    label: java.lang.String,
    parent: Composite,
    `type`: java.lang.String
  ): World = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bodies")(bodies)
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("composites")(composites)
    __obj.updateDynamic("constraints")(constraints)
    __obj.updateDynamic("gravity")(gravity)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[World]
  }
}

