package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDesc extends StObject {
  
  var default: Boolean
  
  var desc: String
  
  var `type`: String
}
object DefaultDesc {
  
  inline def apply(default: Boolean, desc: String, `type`: String): DefaultDesc = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDesc]
  }
  
  extension [Self <: DefaultDesc](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
