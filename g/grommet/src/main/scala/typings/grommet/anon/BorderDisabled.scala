package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderDisabled extends StObject {
  
  var border: js.UndefOr[Radius] = js.undefined
  
  var disabled: js.UndefOr[OpacityOpacityType] = js.undefined
}
object BorderDisabled {
  
  inline def apply(): BorderDisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderDisabled]
  }
  
  extension [Self <: BorderDisabled](x: Self) {
    
    inline def setBorder(value: Radius): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setDisabled(value: OpacityOpacityType): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
  }
}
