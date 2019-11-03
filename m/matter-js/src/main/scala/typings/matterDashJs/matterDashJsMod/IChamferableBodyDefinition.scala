package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChamferableBodyDefinition extends IBodyDefinition {
  var chamfer: js.UndefOr[IChamfer] = js.undefined
}

object IChamferableBodyDefinition {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    angularSpeed: Int | Double = null,
    angularVelocity: Int | Double = null,
    area: Int | Double = null,
    axes: js.Array[Vector] = null,
    bounds: Bounds = null,
    chamfer: IChamfer = null,
    collisionFilter: ICollisionFilter = null,
    density: Int | Double = null,
    force: Vector = null,
    friction: Int | Double = null,
    frictionAir: Int | Double = null,
    frictionStatic: Int | Double = null,
    id: Int | Double = null,
    inertia: Int | Double = null,
    inverseInertia: Int | Double = null,
    inverseMass: Int | Double = null,
    isSensor: js.UndefOr[Boolean] = js.undefined,
    isSleeping: js.UndefOr[Boolean] = js.undefined,
    isStatic: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    mass: Int | Double = null,
    motion: Int | Double = null,
    parent: Body = null,
    parts: js.Array[Body] = null,
    plugin: js.Any = null,
    position: Vector = null,
    render: IBodyRenderOptions = null,
    restitution: Int | Double = null,
    sleepThreshold: Int | Double = null,
    slop: Int | Double = null,
    speed: Int | Double = null,
    timeScale: Int | Double = null,
    torque: Int | Double = null,
    `type`: String = null,
    velocity: Vector = null,
    vertices: js.Array[Vector] = null
  ): IChamferableBodyDefinition = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (angularSpeed != null) __obj.updateDynamic("angularSpeed")(angularSpeed.asInstanceOf[js.Any])
    if (angularVelocity != null) __obj.updateDynamic("angularVelocity")(angularVelocity.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (chamfer != null) __obj.updateDynamic("chamfer")(chamfer)
    if (collisionFilter != null) __obj.updateDynamic("collisionFilter")(collisionFilter)
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (force != null) __obj.updateDynamic("force")(force)
    if (friction != null) __obj.updateDynamic("friction")(friction.asInstanceOf[js.Any])
    if (frictionAir != null) __obj.updateDynamic("frictionAir")(frictionAir.asInstanceOf[js.Any])
    if (frictionStatic != null) __obj.updateDynamic("frictionStatic")(frictionStatic.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inertia != null) __obj.updateDynamic("inertia")(inertia.asInstanceOf[js.Any])
    if (inverseInertia != null) __obj.updateDynamic("inverseInertia")(inverseInertia.asInstanceOf[js.Any])
    if (inverseMass != null) __obj.updateDynamic("inverseMass")(inverseMass.asInstanceOf[js.Any])
    if (!js.isUndefined(isSensor)) __obj.updateDynamic("isSensor")(isSensor)
    if (!js.isUndefined(isSleeping)) __obj.updateDynamic("isSleeping")(isSleeping)
    if (!js.isUndefined(isStatic)) __obj.updateDynamic("isStatic")(isStatic)
    if (label != null) __obj.updateDynamic("label")(label)
    if (mass != null) __obj.updateDynamic("mass")(mass.asInstanceOf[js.Any])
    if (motion != null) __obj.updateDynamic("motion")(motion.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (parts != null) __obj.updateDynamic("parts")(parts)
    if (plugin != null) __obj.updateDynamic("plugin")(plugin)
    if (position != null) __obj.updateDynamic("position")(position)
    if (render != null) __obj.updateDynamic("render")(render)
    if (restitution != null) __obj.updateDynamic("restitution")(restitution.asInstanceOf[js.Any])
    if (sleepThreshold != null) __obj.updateDynamic("sleepThreshold")(sleepThreshold.asInstanceOf[js.Any])
    if (slop != null) __obj.updateDynamic("slop")(slop.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (torque != null) __obj.updateDynamic("torque")(torque.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (velocity != null) __obj.updateDynamic("velocity")(velocity)
    if (vertices != null) __obj.updateDynamic("vertices")(vertices)
    __obj.asInstanceOf[IChamferableBodyDefinition]
  }
}

