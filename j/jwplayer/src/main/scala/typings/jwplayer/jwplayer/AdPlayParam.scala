package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdPlayParam extends StObject {
  
  var creativetype: String = js.native
  
  var newstate: String = js.native
  
  var oldstate: String = js.native
  
  var tag: String = js.native
}
object AdPlayParam {
  
  @scala.inline
  def apply(creativetype: String, newstate: String, oldstate: String, tag: String): AdPlayParam = {
    val __obj = js.Dynamic.literal(creativetype = creativetype.asInstanceOf[js.Any], newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdPlayParam]
  }
  
  @scala.inline
  implicit class AdPlayParamMutableBuilder[Self <: AdPlayParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativetype(value: String): Self = StObject.set(x, "creativetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewstate(value: String): Self = StObject.set(x, "newstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldstate(value: String): Self = StObject.set(x, "oldstate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
