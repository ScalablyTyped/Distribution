package typings.hapiHapi.libTypesRouteMod

import typings.hapiHapi.libTypesRequestMod.ReqRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSettings[Refs /* <: ReqRef */]
  extends StObject
     with CommonRouteProperties[Refs] {
  
  var auth: js.UndefOr[AuthSettings] = js.undefined
}
object RouteSettings {
  
  inline def apply[Refs /* <: ReqRef */](): RouteSettings[Refs] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSettings[Refs]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteSettings[?], Refs /* <: ReqRef */] (val x: Self & RouteSettings[Refs]) extends AnyVal {
    
    inline def setAuth(value: AuthSettings): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
