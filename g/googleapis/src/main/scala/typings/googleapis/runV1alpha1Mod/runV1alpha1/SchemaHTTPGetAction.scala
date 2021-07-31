package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
trait SchemaHTTPGetAction extends StObject {
  
  /**
    * Host name to connect to, defaults to the pod IP. You probably want to set
    * &quot;Host&quot; in httpHeaders instead. +optional
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    * +optional
    */
  var httpHeaders: js.UndefOr[js.Array[SchemaHTTPHeader]] = js.undefined
  
  /**
    * Path to access on the HTTP server. +optional
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Name or number of the port to access on the container. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: js.UndefOr[SchemaIntOrString] = js.undefined
  
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP. +optional
    */
  var scheme: js.UndefOr[String] = js.undefined
}
object SchemaHTTPGetAction {
  
  @scala.inline
  def apply(): SchemaHTTPGetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTPGetAction]
  }
  
  @scala.inline
  implicit class SchemaHTTPGetActionMutableBuilder[Self <: SchemaHTTPGetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHttpHeaders(value: js.Array[SchemaHTTPHeader]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpHeadersUndefined: Self = StObject.set(x, "httpHeaders", js.undefined)
    
    @scala.inline
    def setHttpHeadersVarargs(value: SchemaHTTPHeader*): Self = StObject.set(x, "httpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPort(value: SchemaIntOrString): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
  }
}
