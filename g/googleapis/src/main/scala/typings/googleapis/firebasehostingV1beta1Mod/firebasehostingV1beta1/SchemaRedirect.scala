package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRedirect extends StObject {
  
  /**
    * The user-supplied [glob](https://firebase.google.com/docs/hosting/full-config#glob_pattern_matching) to match against the request URL path.
    */
  var glob: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The value to put in the HTTP location header of the response. The location can contain capture group values from the pattern using a `:` prefix to identify the segment and an optional `*` to capture the rest of the URL. For example: "glob": "/:capture*", "statusCode": 301, "location": "https://example.com/foo/:capture"
    */
  var location: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user-supplied RE2 regular expression to match against the request URL path.
    */
  var regex: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The status HTTP code to return in the response. It must be a valid 3xx status code.
    */
  var statusCode: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRedirect {
  
  inline def apply(): SchemaRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRedirect]
  }
  
  extension [Self <: SchemaRedirect](x: Self) {
    
    inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    inline def setGlobNull: Self = StObject.set(x, "glob", null)
    
    inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    inline def setRegexNull: Self = StObject.set(x, "regex", null)
    
    inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeNull: Self = StObject.set(x, "statusCode", null)
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
