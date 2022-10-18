package typings.lesgo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var sub: js.UndefOr[Double] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setSub(value: Double): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    
    inline def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
  }
}
