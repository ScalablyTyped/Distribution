package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A [`redirect`](/docs/hosting/full-config#redirects) represents the
  * configuration for returning an HTTP redirect response given a matching
  * request URL path.
  */
trait SchemaRedirect extends StObject {
  
  /**
    * Required. The user-supplied [glob
    * pattern](/docs/hosting/full-config#glob_pattern_matching) to match
    * against the request URL path.
    */
  var glob: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The value to put in the HTTP location header of the response.
    * &lt;br&gt;The location can contain capture group values from the pattern
    * using a `:` prefix to identify the segment and an optional `*` to capture
    * the rest of the URL. For example: &lt;code&gt;&quot;glob&quot;:
    * &quot;/:capture*&quot;, &lt;br&gt;&quot;statusCode&quot;: 301,
    * &lt;br&gt;&quot;location&quot;:
    * &quot;https://example.com/foo/:capture&quot;&lt;/code&gt;
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The status HTTP code to return in the response. It must be a
    * valid 3xx status code.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}
object SchemaRedirect {
  
  @scala.inline
  def apply(): SchemaRedirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRedirect]
  }
  
  @scala.inline
  implicit class SchemaRedirectMutableBuilder[Self <: SchemaRedirect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
