package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FragLoadingData extends StObject {
  
  var frag: Fragment
  
  var part: js.UndefOr[Part] = js.undefined
  
  var targetBufferTime: Double | Null
}
object FragLoadingData {
  
  inline def apply(frag: Fragment): FragLoadingData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], targetBufferTime = null)
    __obj.asInstanceOf[FragLoadingData]
  }
  
  extension [Self <: FragLoadingData](x: Self) {
    
    inline def setFrag(value: Fragment): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setPart(value: Part): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setTargetBufferTime(value: Double): Self = StObject.set(x, "targetBufferTime", value.asInstanceOf[js.Any])
    
    inline def setTargetBufferTimeNull: Self = StObject.set(x, "targetBufferTime", null)
  }
}
