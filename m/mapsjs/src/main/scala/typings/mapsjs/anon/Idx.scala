package typings.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Idx extends StObject {
  
  var idx: Double
  
  var setIdx: Double
}
object Idx {
  
  inline def apply(idx: Double, setIdx: Double): Idx = {
    val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], setIdx = setIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[Idx]
  }
  
  extension [Self <: Idx](x: Self) {
    
    inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
    
    inline def setSetIdx(value: Double): Self = StObject.set(x, "setIdx", value.asInstanceOf[js.Any])
  }
}
