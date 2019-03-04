package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseConstraint extends js.Object {
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  var body: Body
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: ICollisionFilter
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  var constraint: Constraint
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @property mouse
    * @type mouse
    * @default mouse
    */
  var mouse: Mouse
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: java.lang.String
}

object MouseConstraint {
  @scala.inline
  def apply(
    body: Body,
    collisionFilter: ICollisionFilter,
    constraint: Constraint,
    mouse: Mouse,
    `type`: java.lang.String
  ): MouseConstraint = {
    val __obj = js.Dynamic.literal(body = body, collisionFilter = collisionFilter, constraint = constraint, mouse = mouse)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MouseConstraint]
  }
}

