package typings.jointjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnmountBatchSize extends StObject {
  
  var unmountBatchSize: js.UndefOr[Double] = js.undefined
}
object UnmountBatchSize {
  
  inline def apply(): UnmountBatchSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmountBatchSize]
  }
  
  extension [Self <: UnmountBatchSize](x: Self) {
    
    inline def setUnmountBatchSize(value: Double): Self = StObject.set(x, "unmountBatchSize", value.asInstanceOf[js.Any])
    
    inline def setUnmountBatchSizeUndefined: Self = StObject.set(x, "unmountBatchSize", js.undefined)
  }
}
