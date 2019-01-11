package typings
package imperiumLib.imperiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val context: js.Array[java.lang.String] = js.native
  val roles: imperiumLib.imperiumMod.Roles = js.native
  def can(actionS: imperiumLib.imperiumMod.Action): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def can(actionS: java.lang.String): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def can(actionS: js.Array[imperiumLib.imperiumMod.Action | java.lang.String]): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def evaluateRouteAction(
    req: expressLib.expressMod.eNs.Request,
    expr: java.lang.String,
    key: java.lang.String,
    context: imperiumLib.imperiumMod.Context
  ): java.lang.String = js.native
  def evaluateRouteActions(
    req: expressLib.expressMod.eNs.Request,
    action: js.Array[imperiumLib.imperiumMod.Action],
    context: imperiumLib.imperiumMod.Context
  ): imperiumLib.imperiumMod.Actions = js.native
  def evaluateUserAction(
    action: imperiumLib.imperiumMod.RoleParams,
    context: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  ): org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def evaluateUserActions(req: expressLib.expressMod.eNs.Request, roles: js.Array[imperiumLib.imperiumMod.Role]): js.Promise[js.Array[imperiumLib.imperiumMod.Action]] = js.native
  def is(roleNames: java.lang.String): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def is(roleNames: js.Array[java.lang.String]): js.Promise[expressLib.expressMod.eNs.RequestHandler] = js.native
  def role(roleName: java.lang.String): imperiumLib.imperiumMod.Role = js.native
  def role(roleName: java.lang.String, getAcl: imperiumLib.imperiumMod.GetAcl): imperiumLib.imperiumMod.Role = js.native
}

