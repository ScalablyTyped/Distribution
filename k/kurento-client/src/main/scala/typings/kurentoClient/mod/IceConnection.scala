package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IceConnection extends StObject {
  
  var componentId: Double
  
  var state: js.Any
  
  var streamId: String
}
object IceConnection {
  
  inline def apply(componentId: Double, state: js.Any, streamId: String): IceConnection = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceConnection]
  }
  
  extension [Self <: IceConnection](x: Self) {
    
    inline def setComponentId(value: Double): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    inline def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
