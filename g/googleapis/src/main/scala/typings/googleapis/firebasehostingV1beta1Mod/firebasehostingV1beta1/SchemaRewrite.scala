package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRewrite extends StObject {
  
  /**
    * The request will be forwarded to Firebase Dynamic Links.
    */
  var dynamicLinks: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The function to proxy requests to. Must match the exported function name exactly.
    */
  var function: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specify a Cloud region for rewritten Functions invocations. If not provided, defaults to us-central1.
    */
  var functionRegion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
    */
  var glob: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL path to rewrite the request to.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-supplied RE2 regular expression to match against the request URL path.
    */
  var regex: js.UndefOr[String | Null] = js.undefined
  
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
    
    inline def setDynamicLinksNull: Self = StObject.set(x, "dynamicLinks", null)
    
    inline def setDynamicLinksUndefined: Self = StObject.set(x, "dynamicLinks", js.undefined)
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionNull: Self = StObject.set(x, "function", null)
    
    inline def setFunctionRegion(value: String): Self = StObject.set(x, "functionRegion", value.asInstanceOf[js.Any])
    
    inline def setFunctionRegionNull: Self = StObject.set(x, "functionRegion", null)
    
    inline def setFunctionRegionUndefined: Self = StObject.set(x, "functionRegion", js.undefined)
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    inline def setGlobNull: Self = StObject.set(x, "glob", null)
    
    inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexNull: Self = StObject.set(x, "regex", null)
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setRun(value: SchemaCloudRunRewrite): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
