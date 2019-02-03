package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "Constraint")
@js.native
class Constraint ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.Constraint {
  /**
    * The first possible `Body` that this constraint is attached to.
    *
    * @property bodyA
    * @type body
    * @default null
    */
  /* CompleteClass */
  override var bodyA: matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  /**
    * The second possible `Body` that this constraint is attached to.
    *
    * @property bodyB
    * @type body
    * @default null
    */
  /* CompleteClass */
  override var bodyB: matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
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
  /* CompleteClass */
  override var damping: scala.Double = js.native
  /**
    * An integer `Number` uniquely identifying number generated in `Composite.create` by `Common.nextId`.
    *
    * @property id
    * @type number
    */
  /* CompleteClass */
  override var id: scala.Double = js.native
  /**
    * An arbitrary `String` name to help the user identify and manage bodies.
    *
    * @property label
    * @type string
    * @default "Constraint"
    */
  /* CompleteClass */
  override var label: java.lang.String = js.native
  /**
    * A `Number` that specifies the target resting length of the constraint.
    * It is calculated automatically in `Constraint.create` from initial positions of the `constraint.bodyA` and `constraint.bodyB`.
    *
    * @property length
    * @type number
    */
  /* CompleteClass */
  override var length: scala.Double = js.native
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointA
    * @type vector
    * @default { x: 0, y: 0 }
    */
  /* CompleteClass */
  override var pointA: matterDashJsLib.matterDashJsMod.MatterNs.Vector = js.native
  /**
    * A `Vector` that specifies the offset of the constraint from center of the `constraint.bodyA` if defined, otherwise a world-space position.
    *
    * @property pointB
    * @type vector
    * @default { x: 0, y: 0 }
    */
  /* CompleteClass */
  override var pointB: matterDashJsLib.matterDashJsMod.MatterNs.Vector = js.native
  /**
    * An `Object` that defines the rendering properties to be consumed by the module `Matter.Render`.
    *
    * @property render
    * @type object
    */
  /* CompleteClass */
  override var render: matterDashJsLib.matterDashJsMod.MatterNs.IConstraintRenderDefinition = js.native
  /**
    * A `Number` that specifies the stiffness of the constraint, i.e. the rate at which it returns to its resting `constraint.length`.
    * A value of `1` means the constraint should be very stiff.
    * A value of `0.2` means the constraint acts like a soft spring.
    *
    * @property stiffness
    * @type number
    * @default 1
    */
  /* CompleteClass */
  override var stiffness: scala.Double = js.native
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
}

/* static members */
@JSImport("matter-js", "Constraint")
@js.native
object Constraint extends js.Object {
  /**
    * Creates a new constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {} options
    * @return {constraint} constraint
    */
  def create(options: matterDashJsLib.matterDashJsMod.MatterNs.IConstraintDefinition): matterDashJsLib.matterDashJsMod.MatterNs.Constraint = js.native
}

