package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferChangeParam extends StObject {
  
  var bufferPercent: Double = js.native
  
  var duration: Double = js.native
  
  var metadata: js.Any = js.native
  
  var position: Double = js.native
}
object BufferChangeParam {
  
  @scala.inline
  def apply(bufferPercent: Double, duration: Double, metadata: js.Any, position: Double): BufferChangeParam = {
    val __obj = js.Dynamic.literal(bufferPercent = bufferPercent.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferChangeParam]
  }
  
  @scala.inline
  implicit class BufferChangeParamMutableBuilder[Self <: BufferChangeParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferPercent(value: Double): Self = StObject.set(x, "bufferPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
