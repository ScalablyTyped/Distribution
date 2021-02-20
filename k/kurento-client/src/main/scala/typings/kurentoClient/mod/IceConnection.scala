package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IceConnection extends StObject {
  
  var componentId: Double = js.native
  
  var state: js.Any = js.native
  
  var streamId: String = js.native
}
object IceConnection {
  
  @scala.inline
  def apply(componentId: Double, state: js.Any, streamId: String): IceConnection = {
    val __obj = js.Dynamic.literal(componentId = componentId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceConnection]
  }
  
  @scala.inline
  implicit class IceConnectionMutableBuilder[Self <: IceConnection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentId(value: Double): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
  }
}
