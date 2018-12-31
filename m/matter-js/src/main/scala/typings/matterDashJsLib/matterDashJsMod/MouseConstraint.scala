package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "MouseConstraint")
@js.native
class MouseConstraint ()
  extends matterDashJsLib.matterDashJsMod.MatterNs.MouseConstraint {
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  /* CompleteClass */
  override var body: matterDashJsLib.matterDashJsMod.MatterNs.Body = js.native
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type object
    */
  /* CompleteClass */
  override var collisionFilter: matterDashJsLib.matterDashJsMod.MatterNs.ICollisionFilter = js.native
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  /* CompleteClass */
  override var constraint: matterDashJsLib.matterDashJsMod.MatterNs.Constraint = js.native
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @property mouse
    * @type mouse
    * @default mouse
    */
  /* CompleteClass */
  override var mouse: matterDashJsLib.matterDashJsMod.MatterNs.Mouse = js.native
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

@JSImport("matter-js", "MouseConstraint")
@js.native
object MouseConstraint extends js.Object {
  /**
    * Creates a new mouse constraint.
    * All properties have default values, and many are pre-calculated automatically based on other properties.
    * See the properties section below for detailed information on what you can pass via the `options` object.
    * @method create
    * @param {engine} engine
    * @param {} options
    * @return {MouseConstraint} A new MouseConstraint
    */
  def create(engine: matterDashJsLib.matterDashJsMod.MatterNs.Engine): matterDashJsLib.matterDashJsMod.MatterNs.MouseConstraint = js.native
  def create(
    engine: matterDashJsLib.matterDashJsMod.MatterNs.Engine,
    options: matterDashJsLib.matterDashJsMod.MatterNs.IMouseConstraintDefinition
  ): matterDashJsLib.matterDashJsMod.MatterNs.MouseConstraint = js.native
}

