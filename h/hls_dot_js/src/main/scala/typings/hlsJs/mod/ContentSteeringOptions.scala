package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSteeringOptions extends StObject {
  
  var pathwayId: String
  
  var uri: String
}
object ContentSteeringOptions {
  
  inline def apply(pathwayId: String, uri: String): ContentSteeringOptions = {
    val __obj = js.Dynamic.literal(pathwayId = pathwayId.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSteeringOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentSteeringOptions] (val x: Self) extends AnyVal {
    
    inline def setPathwayId(value: String): Self = StObject.set(x, "pathwayId", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
