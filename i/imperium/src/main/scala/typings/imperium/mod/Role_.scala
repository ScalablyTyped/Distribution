package typings.imperium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("imperium", "Role")
@js.native
class Role_ protected () extends js.Object {
  def this(imperium: Imperium, roleName: String) = this()
  
  /* Add action with specific params */
  def can(action: String, params: RoleParams): Role_ = js.native
  
  // Imperium instance to retreive child role
  var imperium: Imperium = js.native
  
  /* Get actions of childRoleName and replace params */
  def is(childRoleName: String, params: RoleParams): Role_ = js.native
  
  // Contain all the actions for this specific role
  var role: RoleActions = js.native
  
  // Role name
  var roleName: String = js.native
}
