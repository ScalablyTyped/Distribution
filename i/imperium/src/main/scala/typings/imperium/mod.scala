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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("imperium", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("imperium", "Imperium")
  @js.native
  class Imperium () extends StObject {
    
    /* private */ def addRole(roleName: String, getAcl: GetAcl): Unit = js.native
    
    // Check if current user can do action(s)
    def can(actionS: String): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.native
    def can(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.native
    def can(actionS: Action): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.native
    
    var context: js.Array[String] = js.native
    
    def evaluateRouteAction(
      req: Request_[ParamsDictionary, js.Any, js.Any, Query],
      expr: String,
      key: String,
      context: Context_
    ): String = js.native
    
    def evaluateRouteActions(
      req: Request_[ParamsDictionary, js.Any, js.Any, Query],
      action: js.Array[Action],
      context: Context_
    ): Actions = js.native
    
    def evaluateUserAction(action: RoleParams, context: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = js.native
    
    def evaluateUserActions(req: Request_[ParamsDictionary, js.Any, js.Any, Query], roles: js.Array[Role_]): js.Promise[js.Array[Action]] = js.native
    
    // Check if user has role(s) act like as an OR
    def is(roleNames: String): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.native
    def is(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = js.native
    
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
  class UnauthorizedError protected ()
    extends StObject
       with Error {
    def this(message: String, status: Double, context: js.Any) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def can(actionS: String): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = ^.asInstanceOf[js.Dynamic].applyDynamic("can")(actionS.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]]
  inline def can(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = ^.asInstanceOf[js.Dynamic].applyDynamic("can")(actionS.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]]
  inline def can(actionS: Action): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = ^.asInstanceOf[js.Dynamic].applyDynamic("can")(actionS.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]]
  
  @JSImport("imperium", "context")
  @js.native
  val context: js.Array[String] = js.native
  
  inline def evaluateRouteAction(
    req: Request_[ParamsDictionary, js.Any, js.Any, Query],
    expr: String,
    key: String,
    context: Context_
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateRouteAction")(req.asInstanceOf[js.Any], expr.asInstanceOf[js.Any], key.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def evaluateRouteActions(
    req: Request_[ParamsDictionary, js.Any, js.Any, Query],
    action: js.Array[Action],
    context: Context_
  ): Actions = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateRouteActions")(req.asInstanceOf[js.Any], action.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Actions]
  
  inline def evaluateUserAction(action: RoleParams, context: StringDictionary[js.Array[String]]): StringDictionary[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateUserAction")(action.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[js.Array[String]]]
  
  inline def evaluateUserActions(req: Request_[ParamsDictionary, js.Any, js.Any, Query], roles: js.Array[Role_]): js.Promise[js.Array[Action]] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateUserActions")(req.asInstanceOf[js.Any], roles.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Action]]]
  
  inline def is(roleNames: String): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(roleNames.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]]
  inline def is(roleNames: js.Array[String]): js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]] = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(roleNames.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RequestHandler[ParamsDictionary, js.Any, js.Any, Query]]]
  
  inline def role(roleName: String): Role_ = ^.asInstanceOf[js.Dynamic].applyDynamic("role")(roleName.asInstanceOf[js.Any]).asInstanceOf[Role_]
  inline def role(roleName: String, getAcl: GetAcl): Role_ = (^.asInstanceOf[js.Dynamic].applyDynamic("role")(roleName.asInstanceOf[js.Any], getAcl.asInstanceOf[js.Any])).asInstanceOf[Role_]
  
  @JSImport("imperium", "roles")
  @js.native
  val roles: Roles_ = js.native
  
  trait Action
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var action: String
  }
  object Action {
    
    inline def apply(action: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    }
  }
  
  type Actions = js.Array[String] | String
  
  type Context_ = js.Array[params | query | headers | body]
  
  type GetAcl = js.Function1[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    js.Promise[Boolean | js.Object]
  ]
  
  trait RoleActions extends StObject {
    
    var actions: js.Array[Action]
    
    var getAcl: js.UndefOr[GetAcl] = js.undefined
  }
  object RoleActions {
    
    inline def apply(actions: js.Array[Action]): RoleActions = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleActions]
    }
    
    extension [Self <: RoleActions](x: Self) {
      
      inline def setActions(value: js.Array[Action]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsVarargs(value: Action*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      inline def setGetAcl(
        value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => js.Promise[Boolean | js.Object]
      ): Self = StObject.set(x, "getAcl", js.Any.fromFunction1(value))
      
      inline def setGetAclUndefined: Self = StObject.set(x, "getAcl", js.undefined)
    }
  }
  
  type RoleParams = StringDictionary[String]
  
  type Roles_ = StringDictionary[RoleActions]
}
