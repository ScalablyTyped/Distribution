package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralizationProps extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  var n: js.UndefOr[Double] = js.undefined
}
object PluralizationProps {
  
  inline def apply(): PluralizationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluralizationProps]
  }
  
  extension [Self <: PluralizationProps](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
  }
}
