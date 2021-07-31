package typings.jwplayer.jwplayer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlsParam extends StObject {
  
  var controls: Boolean
}
object ControlsParam {
  
  @scala.inline
  def apply(controls: Boolean): ControlsParam = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlsParam]
  }
  
  @scala.inline
  implicit class ControlsParamMutableBuilder[Self <: ControlsParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
  }
}
