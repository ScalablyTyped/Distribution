package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiBooleans.`false`
import typings.hapiHapi.hapiHapiStrings.optional
import typings.hapiHapi.hapiHapiStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptionsAccess extends StObject {
  
  /**
    * @default none.
    * An object or array of objects specifying the route access rules. Each rule is evaluated against an incoming request and access is granted if at least one of the rules matches. Each rule object
    * must include at least one of scope or entity.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccess)
    */
  var access: js.UndefOr[RouteOptionsAccessObject | js.Array[RouteOptionsAccessObject]] = js.undefined
  
  /**
    * @default 'any'.
    * The required authenticated entity type. If set, must match the entity value of the request authenticated credentials. Available values:
    * * 'any' - the authentication can be on behalf of a user or application.
    * * 'user' - the authentication must be on behalf of a user which is identified by the presence of a 'user' attribute in the credentials object returned by the authentication strategy.
    * * 'app' - the authentication must be on behalf of an application which is identified by the lack of presence of a user attribute in the credentials object returned by the authentication
    * strategy.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessentity)
    */
  var entity: js.UndefOr[AccessEntity] = js.undefined
  
  /**
    * @default 'required'.
    * The authentication mode. Available values:
    * * 'required' - authentication is required.
    * * 'optional' - authentication is optional - the request must include valid credentials or no credentials at all.
    * * 'try' - similar to 'optional', any request credentials are attempted authentication, but if the credentials are invalid, the request proceeds regardless of the authentication error.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthmode)
    */
  var mode: js.UndefOr[AuthMode] = js.undefined
  
  /**
    * @default false, unless the scheme requires payload authentication.
    * If set, the incoming request payload is authenticated after it is processed. Requires a strategy with payload authentication support (e.g. Hawk). Cannot be set to a value other than 'required'
    * when the scheme sets the authentication options.payload to true. Available values:
    * * false - no payload authentication.
    * * 'required' - payload authentication required.
    * * 'optional' - payload authentication performed only when the client includes payload authentication information (e.g. hash attribute in Hawk).
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthpayload)
    */
  var payload: js.UndefOr[`false` | required | optional] = js.undefined
  
  /**
    * @default false (no scope requirements).
    * The application scope required to access the route. Value can be a scope string or an array of scope strings. When authenticated, the credentials object scope property must contain at least
    * one of the scopes defined to access the route. If a scope string begins with a + character, that scope is required. If a scope string begins with a ! character, that scope is forbidden. For
    * example, the scope ['!a', '+b', 'c', 'd'] means the incoming request credentials' scope must not include 'a', must include 'b', and must include one of 'c' or 'd'. You may also access
    * properties on the request object (query, params, payload, and credentials) to populate a dynamic scope by using the '{' and '}' characters around the property name, such as 'user-{params.id}'.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthaccessscope)
    */
  var scope: js.UndefOr[RouteOptionsAccessScope] = js.undefined
  
  /**
    * @default the default strategy set via server.auth.default().
    * An array of string strategy names in the order they should be attempted. Cannot be used together with strategy.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthstrategies)
    */
  var strategies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @default the default strategy set via server.auth.default().
    * A string strategy names. Cannot be used together with strategies.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsauthstrategy)
    */
  var strategy: js.UndefOr[String] = js.undefined
}
object RouteOptionsAccess {
  
  @scala.inline
  def apply(): RouteOptionsAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptionsAccess]
  }
  
  @scala.inline
  implicit class RouteOptionsAccessMutableBuilder[Self <: RouteOptionsAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess(value: RouteOptionsAccessObject | js.Array[RouteOptionsAccessObject]): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    @scala.inline
    def setAccessVarargs(value: RouteOptionsAccessObject*): Self = StObject.set(x, "access", js.Array(value :_*))
    
    @scala.inline
    def setEntity(value: AccessEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    @scala.inline
    def setMode(value: AuthMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPayload(value: `false` | required | optional): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setScope(value: RouteOptionsAccessScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    @scala.inline
    def setStrategies(value: js.Array[String]): Self = StObject.set(x, "strategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategiesUndefined: Self = StObject.set(x, "strategies", js.undefined)
    
    @scala.inline
    def setStrategiesVarargs(value: String*): Self = StObject.set(x, "strategies", js.Array(value :_*))
    
    @scala.inline
    def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
