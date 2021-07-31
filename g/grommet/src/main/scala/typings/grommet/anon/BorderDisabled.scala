package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderDisabled extends StObject {
  
  var border: js.UndefOr[Radius] = js.undefined
  
  var disabled: js.UndefOr[OpacityOpacityType] = js.undefined
}
object BorderDisabled {
  
  @scala.inline
  def apply(): BorderDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderDisabled]
  }
  
  @scala.inline
  implicit class BorderDisabledMutableBuilder[Self <: BorderDisabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: Radius): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setDisabled(value: OpacityOpacityType): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
