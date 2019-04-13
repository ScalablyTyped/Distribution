package typings
package matterDashJsLib.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseConstraintDefinition extends js.Object {
  /**
    * The `Body` that is currently being moved by the user, or `null` if no body.
    *
    * @property body
    * @type body
    * @default null
    */
  var body: js.UndefOr[Body] = js.undefined
  /**
    * An `Object` that specifies the collision filter properties.
    * The collision filter allows the user to define which types of body this mouse constraint can interact with.
    * See `body.collisionFilter` for more information.
    *
    * @property collisionFilter
    * @type object
    */
  var collisionFilter: js.UndefOr[ICollisionFilter] = js.undefined
  /**
    * The `Constraint` object that is used to move the body during interaction.
    *
    * @property constraint
    * @type constraint
    */
  var constraint: js.UndefOr[Constraint] = js.undefined
  /**
    * The `Mouse` instance in use. If not supplied in `MouseConstraint.create`, one will be created.
    *
    * @property mouse
    * @type mouse
    * @default mouse
    */
  var mouse: js.UndefOr[Mouse] = js.undefined
  /**
    * A `String` denoting the type of object.
    *
    * @property type
    * @type string
    * @default "constraint"
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object IMouseConstraintDefinition {
  @scala.inline
  def apply(
    body: Body = null,
    collisionFilter: ICollisionFilter = null,
    constraint: Constraint = null,
    mouse: Mouse = null,
    `type`: java.lang.String = null
  ): IMouseConstraintDefinition = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (collisionFilter != null) __obj.updateDynamic("collisionFilter")(collisionFilter)
    if (constraint != null) __obj.updateDynamic("constraint")(constraint)
    if (mouse != null) __obj.updateDynamic("mouse")(mouse)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMouseConstraintDefinition]
  }
}

