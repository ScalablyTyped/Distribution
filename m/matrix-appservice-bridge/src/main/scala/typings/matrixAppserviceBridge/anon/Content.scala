package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.libComponentsBridgeInfoStateMod.MSC2346Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var content: MSC2346Content
  
  var state_key: String
  
  var `type`: String
}
object Content {
  
  inline def apply(content: MSC2346Content, state_key: String, `type`: String): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], state_key = state_key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    inline def setContent(value: MSC2346Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setState_key(value: String): Self = StObject.set(x, "state_key", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
