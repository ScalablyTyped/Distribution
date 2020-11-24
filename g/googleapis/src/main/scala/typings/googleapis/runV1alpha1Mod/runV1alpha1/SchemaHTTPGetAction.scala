package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
@js.native
trait SchemaHTTPGetAction extends js.Object {
  
  /**
    * Host name to connect to, defaults to the pod IP. You probably want to set
    * &quot;Host&quot; in httpHeaders instead. +optional
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    * +optional
    */
  var httpHeaders: js.UndefOr[js.Array[SchemaHTTPHeader]] = js.native
  
  /**
    * Path to access on the HTTP server. +optional
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Name or number of the port to access on the container. Number must be in
    * the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: js.UndefOr[SchemaIntOrString] = js.native
  
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP. +optional
    */
  var scheme: js.UndefOr[String] = js.native
}
object SchemaHTTPGetAction {
  
  @scala.inline
  def apply(): SchemaHTTPGetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTPGetAction]
  }
  
  @scala.inline
  implicit class SchemaHTTPGetActionOps[Self <: SchemaHTTPGetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHttpHeadersVarargs(value: SchemaHTTPHeader*): Self = this.set("httpHeaders", js.Array(value :_*))
    
    @scala.inline
    def setHttpHeaders(value: js.Array[SchemaHTTPHeader]): Self = this.set("httpHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpHeaders: Self = this.set("httpHeaders", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPort(value: SchemaIntOrString): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
  }
}
