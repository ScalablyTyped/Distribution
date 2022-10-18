package typings.ipfsBitswap.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetMessageSize extends StObject {
  
  var maxSizeReplaceHasWithBlock: js.UndefOr[Double] & Double
  
  var targetMessageSize: js.UndefOr[Double] & Double
}
object TargetMessageSize {
  
  inline def apply(
    maxSizeReplaceHasWithBlock: js.UndefOr[Double] & Double,
    targetMessageSize: js.UndefOr[Double] & Double
  ): TargetMessageSize = {
    val __obj = js.Dynamic.literal(maxSizeReplaceHasWithBlock = maxSizeReplaceHasWithBlock.asInstanceOf[js.Any], targetMessageSize = targetMessageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetMessageSize]
  }
  
  extension [Self <: TargetMessageSize](x: Self) {
    
    inline def setMaxSizeReplaceHasWithBlock(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "maxSizeReplaceHasWithBlock", value.asInstanceOf[js.Any])
    
    inline def setTargetMessageSize(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "targetMessageSize", value.asInstanceOf[js.Any])
  }
}
