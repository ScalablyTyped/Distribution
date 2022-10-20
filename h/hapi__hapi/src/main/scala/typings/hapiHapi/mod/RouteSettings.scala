package typings.hapiHapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteSettings
  extends StObject
     with CommonRouteProperties[ReqRefDefaults] {
  
  var auth: js.UndefOr[AuthSettings] = js.undefined
}
object RouteSettings {
  
  inline def apply(): RouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteSettings]
  }
  
  extension [Self <: RouteSettings](x: Self) {
    
    inline def setAuth(value: AuthSettings): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
