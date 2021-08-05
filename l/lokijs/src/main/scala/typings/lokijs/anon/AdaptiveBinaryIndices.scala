package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdaptiveBinaryIndices extends StObject {
  
  var adaptiveBinaryIndices: js.UndefOr[Boolean] = js.undefined
}
object AdaptiveBinaryIndices {
  
  inline def apply(): AdaptiveBinaryIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdaptiveBinaryIndices]
  }
  
  extension [Self <: AdaptiveBinaryIndices](x: Self) {
    
    inline def setAdaptiveBinaryIndices(value: Boolean): Self = StObject.set(x, "adaptiveBinaryIndices", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveBinaryIndicesUndefined: Self = StObject.set(x, "adaptiveBinaryIndices", js.undefined)
  }
}
