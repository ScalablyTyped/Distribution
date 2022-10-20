package typings.hapiHapi.mod

import typings.hapiHapi.hapiHapiBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteOptions[Refs /* <: ReqRef */]
  extends StObject
     with CommonRouteProperties[Refs] {
  
  /**
    * Route authentication configuration. Value can be:
    * false to disable authentication if a default strategy is set.
    * a string with the name of an authentication strategy registered with server.auth.strategy(). The strategy will be set to 'required' mode.
    * an authentication configuration object.
    * [See docs](https://github.com/hapijs/hapi/blob/master/API.md#-routeoptionsapp)
    */
  var auth: js.UndefOr[`false` | String | RouteOptionsAccess] = js.undefined
}
object RouteOptions {
  
  inline def apply[Refs /* <: ReqRef */](): RouteOptions[Refs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteOptions[Refs]]
  }
  
  extension [Self <: RouteOptions[?], Refs /* <: ReqRef */](x: Self & RouteOptions[Refs]) {
    
    inline def setAuth(value: `false` | String | RouteOptionsAccess): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
