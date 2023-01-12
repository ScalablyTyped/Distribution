package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strong extends StObject {
  
  var medium: js.UndefOr[Double] = js.undefined
  
  var strong: js.UndefOr[Double] = js.undefined
  
  var weak: js.UndefOr[Double] = js.undefined
}
object Strong {
  
  inline def apply(): Strong = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Strong]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Strong] (val x: Self) extends AnyVal {
    
    inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setStrong(value: Double): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    
    inline def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    
    inline def setWeak(value: Double): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
