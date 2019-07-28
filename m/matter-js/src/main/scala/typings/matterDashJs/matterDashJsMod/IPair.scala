package typings.matterDashJs.matterDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPair extends js.Object {
  var activeContacts: js.Any
  var bodyA: Body
  var bodyB: Body
  var contacts: js.Any
  var friction: Double
  var frictionStatic: Double
  var id: Double
  var inverseMass: Double
  var isActive: Boolean
  var restitution: Double
  var separation: Double
  var slop: Double
  var timeCreated: Double
  var timeUpdated: Double
}

object IPair {
  @scala.inline
  def apply(
    activeContacts: js.Any,
    bodyA: Body,
    bodyB: Body,
    contacts: js.Any,
    friction: Double,
    frictionStatic: Double,
    id: Double,
    inverseMass: Double,
    isActive: Boolean,
    restitution: Double,
    separation: Double,
    slop: Double,
    timeCreated: Double,
    timeUpdated: Double
  ): IPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts, bodyA = bodyA, bodyB = bodyB, contacts = contacts, friction = friction, frictionStatic = frictionStatic, id = id, inverseMass = inverseMass, isActive = isActive, restitution = restitution, separation = separation, slop = slop, timeCreated = timeCreated, timeUpdated = timeUpdated)
  
    __obj.asInstanceOf[IPair]
  }
}

