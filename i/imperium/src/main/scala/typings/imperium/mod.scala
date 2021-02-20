package typings.imperium

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.imperium.imperiumStrings.body
import typings.imperium.imperiumStrings.headers
import typings.imperium.imperiumStrings.params
import typings.imperium.imperiumStrings.query
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imperium", "Imperium")
  @js.native
  class Imperium () extends StObject {
    
    /* private */ def addRole(roleName: String, getAcl: GetAcl): Unit = js.native
    
    // Check if current user can do action(s)
    def can(actionS: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    def can(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    def can(actionS: Action): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    var context: js.Array[String] = js.native
    
    def evaluateRouteAction(req: Request_[ParamsDictionary, _, _, Query], expr: String, key: String, context: Context_): String = js.native
    
    def evaluateRouteActions(req: Request_[ParamsDictionary, _, _, Query], action: js.Array[Action], context: Context_): Actions = js.native
    
    def evaluateUserAction(action: RoleParams, context: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
    
    def evaluateUserActions(req: Request_[ParamsDictionary, _, _, Query], roles: js.Array[Role_]): js.Promise[js.Array[Action]] = js.native
    
    // Check if user has role(s) act like as an OR
    def is(roleNames: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    def is(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
    
    // Add new role with specific ImperiumGetAcl
    def role(roleName: String): Role_ = js.native
    def role(roleName: String, getAcl: GetAcl): Role_ = js.native
    
    var roles: Roles_ = js.native
  }
  
  @JSImport("imperium", "Role")
  @js.native
  class Role_ protected () extends StObject {
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
  
  @JSImport("imperium", "UnauthorizedError")
  @js.native
  class UnauthorizedError protected () extends Error {
    def this(message: String, status: Double, context: js.Any) = this()
  }
  
  @JSImport("imperium", "can")
  @js.native
  def can(actionS: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  @JSImport("imperium", "can")
  @js.native
  def can(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  @JSImport("imperium", "can")
  @js.native
  def can(actionS: Action): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  @JSImport("imperium", "context")
  @js.native
  val context: js.Array[String] = js.native
  
  @JSImport("imperium", "evaluateRouteAction")
  @js.native
  def evaluateRouteAction(req: Request_[ParamsDictionary, _, _, Query], expr: String, key: String, context: Context_): String = js.native
  
  @JSImport("imperium", "evaluateRouteActions")
  @js.native
  def evaluateRouteActions(req: Request_[ParamsDictionary, _, _, Query], action: js.Array[Action], context: Context_): Actions = js.native
  
  @JSImport("imperium", "evaluateUserAction")
  @js.native
  def evaluateUserAction(action: RoleParams, context: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
  
  @JSImport("imperium", "evaluateUserActions")
  @js.native
  def evaluateUserActions(req: Request_[ParamsDictionary, _, _, Query], roles: js.Array[Role_]): js.Promise[js.Array[Action]] = js.native
  
  @JSImport("imperium", "is")
  @js.native
  def is(roleNames: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  @JSImport("imperium", "is")
  @js.native
  def is(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  
  @JSImport("imperium", "role")
  @js.native
  def role(roleName: String): Role_ = js.native
  @JSImport("imperium", "role")
  @js.native
  def role(roleName: String, getAcl: GetAcl): Role_ = js.native
  
  @JSImport("imperium", "roles")
  @js.native
  val roles: Roles_ = js.native
  
  @js.native
  trait Action extends /* key */ StringDictionary[String] {
    
    var action: String = js.native
  }
  object Action {
    
    @scala.inline
    def apply(action: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  type Actions = js.Array[String] | String
  
  type Context_ = js.Array[params | query | headers | body]
  
  type GetAcl = js.Function1[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    js.Promise[Boolean | js.Object]
  ]
  
  @js.native
  trait RoleActions extends StObject {
    
    var actions: js.Array[Action] = js.native
    
    var getAcl: js.UndefOr[GetAcl] = js.native
  }
  object RoleActions {
    
    @scala.inline
    def apply(actions: js.Array[Action]): RoleActions = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleActions]
    }
    
    @scala.inline
    implicit class RoleActionsMutableBuilder[Self <: RoleActions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setGetAcl(
        value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Promise[Boolean | js.Object]
      ): Self = StObject.set(x, "getAcl", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAclUndefined: Self = StObject.set(x, "getAcl", js.undefined)
    }
  }
  
  type RoleParams = StringDictionary[String]
  
  type Roles_ = StringDictionary[RoleActions]
}
