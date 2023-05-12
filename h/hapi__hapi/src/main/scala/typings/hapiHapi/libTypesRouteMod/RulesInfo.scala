package typings.hapiHapi.libTypesRouteMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulesInfo extends StObject {
  
  var method: String
  
  var path: String
  
  var vhost: String
}
object RulesInfo {
  
  inline def apply(method: String, path: String, vhost: String): RulesInfo = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], vhost = vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RulesInfo] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setVhost(value: String): Self = StObject.set(x, "vhost", value.asInstanceOf[js.Any])
  }
}
