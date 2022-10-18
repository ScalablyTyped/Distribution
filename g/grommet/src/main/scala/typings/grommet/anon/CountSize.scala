package typings.grommet.anon

import typings.grommet.componentsGridMod.GridSizeType
import typings.grommet.componentsGridMod._GridColumnsType
import typings.grommet.grommetStrings.fill
import typings.grommet.grommetStrings.fit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountSize
  extends StObject
     with _GridColumnsType {
  
  var count: js.UndefOr[fit | fill | Double] = js.undefined
  
  var size: js.UndefOr[GridSizeType] = js.undefined
}
object CountSize {
  
  inline def apply(): CountSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountSize]
  }
  
  extension [Self <: CountSize](x: Self) {
    
    inline def setCount(value: fit | fill | Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSize(value: GridSizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: String*): Self = StObject.set(x, "size", js.Array(value*))
  }
}
