package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /**
    * decorations on the request object.
    */
  var request: js.Array[String]
  
  /**
    * decorations on the server object.
    */
  var server: js.Array[String]
  
  /**
    * decorations on the response toolkit.
    */
  var toolkit: js.Array[String]
}
object Request {
  
  @scala.inline
  def apply(request: js.Array[String], server: js.Array[String], toolkit: js.Array[String]): Request = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], toolkit = toolkit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequest(value: js.Array[String]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestVarargs(value: String*): Self = StObject.set(x, "request", js.Array(value :_*))
    
    @scala.inline
    def setServer(value: js.Array[String]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVarargs(value: String*): Self = StObject.set(x, "server", js.Array(value :_*))
    
    @scala.inline
    def setToolkit(value: js.Array[String]): Self = StObject.set(x, "toolkit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolkitVarargs(value: String*): Self = StObject.set(x, "toolkit", js.Array(value :_*))
  }
}
