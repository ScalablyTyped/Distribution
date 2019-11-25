package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstraintDefinition extends js.Object {
  /**
    * The first possible `Body` that this constraint is attached to.
    *
    * @property bodyA
    * @type body
    * @default null
    */
  var bodyA: js.UndefOr[Body] = js.undefined
  /**
    * The second possible `Body` that this constraint is attached to.
    *
    * @property bodyB
    * @type body
    * @default null
    */
  var bodyB: js.UndefOr[Body] = js.undefined
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
  var damping: js.UndefOr[Double] = js.undefined
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  var id: js.UndefOr[Double] = js.undefined
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Constraint"
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * A `Number` that specifies the target resting length of the constraint.
    * It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    *
    * @property length
    * @type number
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointA
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointA: js.UndefOr[Vector] = js.undefined
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointB
    * @type vector
    * @default { x: 0, y: 0 }
    */
  var pointB: js.UndefOr[Vector] = js.undefined
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  var render: js.UndefOr[IConstraintRenderDefinition] = js.undefined
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`.
    * A value of `1` means the constraint should be very stiff.
    * A value of `0.2` means the constraint acts like a soft spring.
    *
    * @property stiffness
    * @type number
    * @default 1
    */
  var stiffness: js.UndefOr[Double] = js.undefined
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object IConstraintDefinition {
  @scala.inline
  def apply(
    bodyA: Body = null,
    bodyB: Body = null,
    damping: Int | Double = null,
    id: Int | Double = null,
    label: String = null,
    length: Int | Double = null,
    pointA: Vector = null,
    pointB: Vector = null,
    render: IConstraintRenderDefinition = null,
    stiffness: Int | Double = null,
    `type`: String = null
  ): IConstraintDefinition = {
    val __obj = js.Dynamic.literal()
    if (bodyA != null) __obj.updateDynamic("bodyA")(bodyA.asInstanceOf[js.Any])
    if (bodyB != null) __obj.updateDynamic("bodyB")(bodyB.asInstanceOf[js.Any])
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (pointA != null) __obj.updateDynamic("pointA")(pointA.asInstanceOf[js.Any])
    if (pointB != null) __obj.updateDynamic("pointB")(pointB.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (stiffness != null) __obj.updateDynamic("stiffness")(stiffness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConstraintDefinition]
  }
}

