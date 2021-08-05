package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A [`rewrite`](/docs/hosting/full-config#rewrites) represents an internal
  * content rewrite on the version. If the pattern matches, the request will be
  * handled as if it were to the destination path specified in the
  * configuration.
  */
trait SchemaRewrite extends StObject {
  
  /**
    * The request will be forwarded to Firebase Dynamic Links.
    */
  var dynamicLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The function to proxy requests to. Must match the exported function name
    * exactly.
    */
  var function: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The user-supplied [glob
    * pattern](/docs/hosting/full-config#glob_pattern_matching) to match
    * against the request URL path.
    */
  var glob: js.UndefOr[String] = js.undefined
  
  /**
    * The URL path to rewrite the request to.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The request will be forwarded to Cloud Run.
    */
  var run: js.UndefOr[SchemaCloudRunRewrite] = js.undefined
}
object SchemaRewrite {
  
  inline def apply(): SchemaRewrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRewrite]
  }
  
  extension [Self <: SchemaRewrite](x: Self) {
    
    inline def setDynamicLinks(value: Boolean): Self = StObject.set(x, "dynamicLinks", value.asInstanceOf[js.Any])
    
    inline def setDynamicLinksUndefined: Self = StObject.set(x, "dynamicLinks", js.undefined)
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRun(value: SchemaCloudRunRewrite): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
