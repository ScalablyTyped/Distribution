package typings.ipfsBitswap.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxSizeReplaceHasWithBlock extends StObject {
  
  var maxSizeReplaceHasWithBlock: js.UndefOr[Double] = js.undefined
  
  var targetMessageSize: js.UndefOr[Double] = js.undefined
}
object MaxSizeReplaceHasWithBlock {
  
  inline def apply(): MaxSizeReplaceHasWithBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxSizeReplaceHasWithBlock]
  }
  
  extension [Self <: MaxSizeReplaceHasWithBlock](x: Self) {
    
    inline def setMaxSizeReplaceHasWithBlock(value: Double): Self = StObject.set(x, "maxSizeReplaceHasWithBlock", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeReplaceHasWithBlockUndefined: Self = StObject.set(x, "maxSizeReplaceHasWithBlock", js.undefined)
    
    inline def setTargetMessageSize(value: Double): Self = StObject.set(x, "targetMessageSize", value.asInstanceOf[js.Any])
    
    inline def setTargetMessageSizeUndefined: Self = StObject.set(x, "targetMessageSize", js.undefined)
  }
}
