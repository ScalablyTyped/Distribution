package typings.imperium.imperiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "Role")
@js.native
class Role protected () extends js.Object {
  def this(imperium: Imperium, roleName: String) = this()
  // Imperium instance to retreive child role
  var imperium: Imperium = js.native
  // Contain all the actions for this specific role
  var role: RoleActions = js.native
  // Role name
  var roleName: String = js.native
  /* Add action with specific params */
  def can(action: String, params: RoleParams): Role = js.native
  /* Get actions of childRoleName and replace params */
  def is(childRoleName: String, params: RoleParams): Role = js.native
}

@JSImport("imperium", "role")
@js.native
object role extends js.Object {
  def apply(roleName: String): Role = js.native
  def apply(roleName: String, getAcl: GetAcl): Role = js.native
}

