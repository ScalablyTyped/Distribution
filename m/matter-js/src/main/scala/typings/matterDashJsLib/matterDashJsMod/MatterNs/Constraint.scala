package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  /**
    * The first possible `Body` that this constraint is attached to.
    *
    * @property bodyA
    * @type body
    * @default null
    */
  var bodyA: Body
  /**
    * The second possible `Body` that this constraint is attached to.
    *
    * @property bodyB
    * @type body
    * @default null
    */
  var bodyB: Body
  /**
    * A `Number` that specifies the damping of the constraint, 
    * i.e. the amount of resistance applied to each body based on their velocities to limit the amount of oscillation.
    * Damping will only be apparent when the constraint also has a very low `stiffness`.
    * A value of `0.1` means the constraint will apply heavy damping, resulting in little to no oscillation.
    * A value of `0` means the constraint will apply no damping.
    *
    * @property damping
    * @type number
    * @default 0
    */
  var damping: scala.Double
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: scala.Double
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Constraint"
    */
  var label: java.lang.String
  /**
    * A `Number` that specifies the target resting length of the constraint.
    * It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    *
    * @property length
    * @type number
    */
  var length: scala.Double
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointA
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointA: Vector
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointB
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointB: Vector
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  var render: IConstraintRenderDefinition
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`.
    * A value of `1` means the constraint should be very stiff.
    * A value of `0.2` means the constraint acts like a soft spring.
    *
    * @property stiffness
    * @type number
    * @default 1
    */
  var stiffness: scala.Double
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: java.lang.String
}

object Constraint {
  @scala.inline
  def apply(
    bodyA: Body,
    bodyB: Body,
    damping: scala.Double,
    id: scala.Double,
    label: java.lang.String,
    length: scala.Double,
    pointA: Vector,
    pointB: Vector,
    render: IConstraintRenderDefinition,
    stiffness: scala.Double,
    `type`: java.lang.String
  ): Constraint = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("damping")(damping)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("pointA")(pointA)
    __obj.updateDynamic("pointB")(pointB)
    __obj.updateDynamic("render")(render)
    __obj.updateDynamic("stiffness")(stiffness)
    __obj.asInstanceOf[Constraint]
  }
}

