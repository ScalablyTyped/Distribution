package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPair extends js.Object {
  var activeContacts: js.Any
  var bodyA: Body
  var bodyB: Body
  var contacts: js.Any
  var friction: scala.Double
  var frictionStatic: scala.Double
  var id: scala.Double
  var inverseMass: scala.Double
  var isActive: scala.Boolean
  var restitution: scala.Double
  var separation: scala.Double
  var slop: scala.Double
  var timeCreated: scala.Double
  var timeUpdated: scala.Double
}

object IPair {
  @scala.inline
  def apply(
    activeContacts: js.Any,
    bodyA: Body,
    bodyB: Body,
    contacts: js.Any,
    friction: scala.Double,
    frictionStatic: scala.Double,
    id: scala.Double,
    inverseMass: scala.Double,
    isActive: scala.Boolean,
    restitution: scala.Double,
    separation: scala.Double,
    slop: scala.Double,
    timeCreated: scala.Double,
    timeUpdated: scala.Double
  ): IPair = {
    val __obj = js.Dynamic.literal(activeContacts = activeContacts, bodyA = bodyA, bodyB = bodyB, contacts = contacts, friction = friction, frictionStatic = frictionStatic, id = id, inverseMass = inverseMass, isActive = isActive, restitution = restitution, separation = separation, slop = slop, timeCreated = timeCreated, timeUpdated = timeUpdated)
  
    __obj.asInstanceOf[IPair]
  }
}

