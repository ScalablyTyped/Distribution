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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeContacts")(activeContacts)
    __obj.updateDynamic("bodyA")(bodyA)
    __obj.updateDynamic("bodyB")(bodyB)
    __obj.updateDynamic("contacts")(contacts)
    __obj.updateDynamic("friction")(friction)
    __obj.updateDynamic("frictionStatic")(frictionStatic)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inverseMass")(inverseMass)
    __obj.updateDynamic("isActive")(isActive)
    __obj.updateDynamic("restitution")(restitution)
    __obj.updateDynamic("separation")(separation)
    __obj.updateDynamic("slop")(slop)
    __obj.updateDynamic("timeCreated")(timeCreated)
    __obj.updateDynamic("timeUpdated")(timeUpdated)
    __obj.asInstanceOf[IPair]
  }
}

