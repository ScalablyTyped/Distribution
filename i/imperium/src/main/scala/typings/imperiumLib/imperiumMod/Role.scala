package typings
package imperiumLib.imperiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "Role")
@js.native
class Role protected () extends js.Object {
  def this(imperium: Imperium, roleName: java.lang.String) = this()
  // Imperium instance to retreive child role
  var imperium: Imperium = js.native
  // Contain all the actions for this specific role
  var role: RoleActions = js.native
  // Role name
  var roleName: java.lang.String = js.native
  /* Add action with specific params */
  def can(action: java.lang.String, params: RoleParams): Role = js.native
  /* Get actions of childRoleName and replace params */
  def is(childRoleName: java.lang.String, params: RoleParams): Role = js.native
}

