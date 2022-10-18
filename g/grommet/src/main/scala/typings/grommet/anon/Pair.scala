package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pair extends StObject {
  
  var gap: js.UndefOr[Row] = js.undefined
  
  var name: js.UndefOr[WidthString] = js.undefined
  
  var pair: js.UndefOr[`30`] = js.undefined
  
  var value: js.UndefOr[WidthString] = js.undefined
}
object Pair {
  
  inline def apply(): Pair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pair]
  }
  
  extension [Self <: Pair](x: Self) {
    
    inline def setGap(value: Row): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setName(value: WidthString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPair(value: `30`): Self = StObject.set(x, "pair", value.asInstanceOf[js.Any])
    
    inline def setPairUndefined: Self = StObject.set(x, "pair", js.undefined)
    
    inline def setValue(value: WidthString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
