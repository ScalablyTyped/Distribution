package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderPad extends StObject {
  
  var border: js.UndefOr[`4`] = js.undefined
  
  var pad: js.UndefOr[HorizontalVertical] = js.undefined
}
object BorderPad {
  
  inline def apply(): BorderPad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderPad]
  }
  
  extension [Self <: BorderPad](x: Self) {
    
    inline def setBorder(value: `4`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setPad(value: HorizontalVertical): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
