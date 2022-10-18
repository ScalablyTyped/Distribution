package typings.grommet.anon

import typings.grommet.utilsMod.BackgroundType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderLabel extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[`7`] = js.undefined
  
  var label: js.UndefOr[`7`] = js.undefined
}
object BorderLabel {
  
  inline def apply(): BorderLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLabel]
  }
  
  extension [Self <: BorderLabel](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBorder(value: `7`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setLabel(value: `7`): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
