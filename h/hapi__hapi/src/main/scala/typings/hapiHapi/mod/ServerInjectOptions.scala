package typings.hapiHapi.mod

import typings.hapiHapi.anon.Artifacts
import typings.hapiShot.mod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInjectOptions
  extends StObject
     with RequestOptions {
  
  /**
    * allows access to routes with config.isInternal set to true. Defaults to false.
    */
  var allowInternals: js.UndefOr[Boolean] = js.undefined
  
  /**
    * sets the initial value of request.app, defaults to {}.
    */
  var app: js.UndefOr[RequestApplicationState] = js.undefined
  
  /**
    * Authentication bypass options.
    */
  var auth: js.UndefOr[Artifacts] = js.undefined
  
  /**
    * sets the initial value of request.plugins, defaults to {}.
    */
  var plugins: js.UndefOr[PluginsStates] = js.undefined
}
object ServerInjectOptions {
  
  inline def apply(url: String): ServerInjectOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInjectOptions]
  }
  
  extension [Self <: ServerInjectOptions](x: Self) {
    
    inline def setAllowInternals(value: Boolean): Self = StObject.set(x, "allowInternals", value.asInstanceOf[js.Any])
    
    inline def setAllowInternalsUndefined: Self = StObject.set(x, "allowInternals", js.undefined)
    
    inline def setApp(value: RequestApplicationState): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setAuth(value: Artifacts): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPlugins(value: PluginsStates): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
  }
}
