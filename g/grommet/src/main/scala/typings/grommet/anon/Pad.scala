package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pad extends StObject {
  
  var border: js.UndefOr[`11`] = js.undefined
  
  var pad: js.UndefOr[HorizontalVertical] = js.undefined
}
object Pad {
  
  inline def apply(): Pad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pad]
  }
  
  extension [Self <: Pad](x: Self) {
    
    inline def setBorder(value: `11`): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setPad(value: HorizontalVertical): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
