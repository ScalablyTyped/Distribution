package typings.grommet.anon

import typings.grommet.utilsMod.GapType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var gap: js.UndefOr[GapType] = js.undefined
}
object `31` {
  
  inline def apply(): `31` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`31`]
  }
  
  extension [Self <: `31`](x: Self) {
    
    inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
  }
}
