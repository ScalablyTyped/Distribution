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
    val __obj = js.Dynamic.literal(bodies = bodies, bounds = bounds, composites = composites, constraints = constraints, gravity = gravity, id = id, isModified = isModified, label = label, parent = parent)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[World]
  }
}

