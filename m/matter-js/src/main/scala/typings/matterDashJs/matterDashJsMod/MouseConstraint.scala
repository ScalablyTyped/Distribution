package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matter-js", "MouseConstraint")
@js.native
class MouseConstraint () extends js.Object {
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  var body: Body = js.native
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: ICollisionFilter = js.native
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  var constraint: Constraint = js.native
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @property mouse
    * @type mouse
    * @default mouse
    */
  var mouse: Mouse = js.native
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: String = js.native
}

/* static members */
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
  def create(engine: Engine): MouseConstraint = js.native
  def create(engine: Engine, options: IMouseConstraintDefinition): MouseConstraint = js.native
}

