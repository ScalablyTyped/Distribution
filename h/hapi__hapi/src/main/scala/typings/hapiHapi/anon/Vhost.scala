package typings.hapiHapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vhost extends StObject {
  
  /**
    * string added as prefix to any route path (must begin with '/'). If a plugin registers a child plugin the prefix is passed on to the child or is added in front of the child-specific prefix.
    */
  var prefix: String = js.native
  
  /**
    * virtual host string (or array of strings) applied to every route. The outer-most vhost overrides the any nested configuration.
    */
  var vhost: js.UndefOr[String | js.Array[String]] = js.native
}
object Vhost {
  
  @scala.inline
  def apply(prefix: String): Vhost = {
    val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vhost]
  }
  
  @scala.inline
  implicit class VhostMutableBuilder[Self <: Vhost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhost(value: String | js.Array[String]): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
    
    @scala.inline
    def setVhostVarargs(value: String*): Self = StObject.set(x, "vhost", js.Array(value :_*))
  }
}
