package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Grow extends StObject {
  
  var grow: js.UndefOr[Double] = js.undefined
  
  var shrink: js.UndefOr[Double] = js.undefined
}
object Grow {
  
  inline def apply(): Grow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Grow]
  }
  
  extension [Self <: Grow](x: Self) {
    
    inline def setGrow(value: Double): Self = StObject.set(x, "grow", value.asInstanceOf[js.Any])
    
    inline def setGrowUndefined: Self = StObject.set(x, "grow", js.undefined)
    
    inline def setShrink(value: Double): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
  }
}
