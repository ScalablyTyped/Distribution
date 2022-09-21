package typings.grommet.anon

import typings.grommet.utilsMod.ThicknessType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gap extends StObject {
  
  var gap: js.UndefOr[ThicknessType] = js.undefined
}
object Gap {
  
  inline def apply(): Gap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gap]
  }
  
  extension [Self <: Gap](x: Self) {
    
    inline def setGap(value: ThicknessType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
  }
}
