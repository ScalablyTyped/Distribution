package typings.grommet.anon

import typings.grommet.utilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconPad extends StObject {
  
  var icon: js.UndefOr[`13`] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
}
object IconPad {
  
  inline def apply(): IconPad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconPad]
  }
  
  extension [Self <: IconPad](x: Self) {
    
    inline def setIcon(value: `13`): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
