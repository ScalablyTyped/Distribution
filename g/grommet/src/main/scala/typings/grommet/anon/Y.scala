package typings.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var x: js.UndefOr[Boolean | `0`] = js.undefined
  
  var y: js.UndefOr[Boolean | `0`] = js.undefined
}
object Y {
  
  inline def apply(): Y = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Y]
  }
  
  extension [Self <: Y](x: Self) {
    
    inline def setX(value: Boolean | `0`): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Boolean | `0`): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
