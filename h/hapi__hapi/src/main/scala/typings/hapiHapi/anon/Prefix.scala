package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prefix extends StObject {
  
  /**
    * the route path prefix used by any calls to server.route() from the server. Note that if a prefix is used and the route path is set to '/', the resulting path will not include
    * the trailing slash.
    */
  var prefix: String
  
  /** the route virtual host settings used by any calls to server.route() from the server. */
  var vhost: String
}
object Prefix {
  
  @scala.inline
  def apply(prefix: String, vhost: String): Prefix = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prefix]
  }
  
  @scala.inline
  implicit class PrefixMutableBuilder[Self <: Prefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
  }
}
