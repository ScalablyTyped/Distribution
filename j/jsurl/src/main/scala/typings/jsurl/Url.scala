package typings.jsurl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Url[T] extends StObject {
  
  var hash: String = js.native
  
  var host: String = js.native
  
  var href: String = js.native
  
  var pass: String = js.native
  
  var path: String = js.native
  
  var port: String = js.native
  
  var protocol: String = js.native
  
  var query: T = js.native
  
  var user: String = js.native
}
object Url {
  
  @scala.inline
  def apply[T](
    hash: String,
    host: String,
    href: String,
    pass: String,
    path: String,
    port: String,
    protocol: String,
    query: T,
    user: String
  ): Url[T] = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url[T]]
  }
  
  @scala.inline
  implicit class UrlMutableBuilder[Self <: Url[_], T] (val x: Self with Url[T]) extends AnyVal {
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: T): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
