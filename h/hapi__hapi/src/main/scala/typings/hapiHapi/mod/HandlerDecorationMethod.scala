package typings.hapiHapi.mod

import typings.hapiHapi.mod.Lifecycle.Method
import typings.hapiHapi.mod.Lifecycle.ReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerDecorationMethod extends StObject {
  
  def apply(route: RequestRoute, options: Any): Method[ReqRefDefaults, ReturnValue[ReqRefDefaults]] = js.native
  
  var defaults: js.UndefOr[
    RouteOptions[ReqRefDefaults] | (js.Function1[/* method */ Any, RouteOptions[ReqRefDefaults]])
  ] = js.native
}
