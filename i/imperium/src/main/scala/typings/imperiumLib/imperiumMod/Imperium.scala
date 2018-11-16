package typings
package imperiumLib.imperiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "Imperium")
@js.native
class Imperium () extends js.Object {
  var context: js.Array[java.lang.String] = js.native
  var roles: Roles = js.native
  /* private */ def addRole(roleName: java.lang.String, getAcl: GetAcl): scala.Unit = js.native
  // Check if current user can do action(s)
  def can(actionS: Action): stdLib.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  // Check if current user can do action(s)
  def can(actionS: java.lang.String): stdLib.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  // Check if current user can do action(s)
  def can(actionS: js.Array[Action | java.lang.String]): stdLib.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def evaluateRouteAction(
    req: expressLib.expressMod.eNs.Request,
    expr: java.lang.String,
    key: java.lang.String,
    context: Context
  ): java.lang.String = js.native
  def evaluateRouteActions(req: expressLib.expressMod.eNs.Request, action: js.Array[Action], context: Context): Actions = js.native
  def evaluateUserAction(action: RoleParams, context: ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]]): ScalablyTyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def evaluateUserActions(req: expressLib.expressMod.eNs.Request, roles: js.Array[Role]): stdLib.Promise[js.Array[Action]] = js.native
  // Check if user has role(s) act like as an OR
  def is(roleNames: java.lang.String): stdLib.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  // Check if user has role(s) act like as an OR
  def is(roleNames: js.Array[java.lang.String]): stdLib.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  // Add new role with specific ImperiumGetAcl
  def role(roleName: java.lang.String): Role = js.native
  // Add new role with specific ImperiumGetAcl
  def role(roleName: java.lang.String, getAcl: GetAcl): Role = js.native
}

