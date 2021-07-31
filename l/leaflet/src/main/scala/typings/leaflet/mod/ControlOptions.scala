package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlOptions extends StObject {
  
  var position: js.UndefOr[ControlPosition] = js.undefined
}
object ControlOptions {
  
  @scala.inline
  def apply(): ControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlOptions]
  }
  
  @scala.inline
  implicit class ControlOptionsMutableBuilder[Self <: ControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
