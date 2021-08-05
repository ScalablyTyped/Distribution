package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameType extends StObject {
  
  var data: js.Any
  
  var description: String
  
  var id: String
}
object FrameType {
  
  inline def apply(data: js.Any, description: String, id: String): FrameType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameType]
  }
  
  extension [Self <: FrameType](x: Self) {
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
