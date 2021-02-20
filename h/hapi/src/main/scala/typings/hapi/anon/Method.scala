package typings.hapi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method extends StObject {
  
  var method: String = js.native
  
  var path: String = js.native
  
  var vhost: js.UndefOr[String] = js.native
}
object Method {
  
  @scala.inline
  def apply(method: String, path: String): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVhostUndefined: Self = StObject.set(x, "vhost", js.undefined)
  }
}
