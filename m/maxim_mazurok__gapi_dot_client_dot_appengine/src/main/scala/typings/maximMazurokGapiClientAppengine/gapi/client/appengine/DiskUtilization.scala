package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskUtilization extends StObject {
  
  /** Target bytes read per second. */
  var targetReadBytesPerSecond: js.UndefOr[Double] = js.undefined
  
  /** Target ops read per seconds. */
  var targetReadOpsPerSecond: js.UndefOr[Double] = js.undefined
  
  /** Target bytes written per second. */
  var targetWriteBytesPerSecond: js.UndefOr[Double] = js.undefined
  
  /** Target ops written per second. */
  var targetWriteOpsPerSecond: js.UndefOr[Double] = js.undefined
}
object DiskUtilization {
  
  inline def apply(): DiskUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskUtilization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskUtilization] (val x: Self) extends AnyVal {
    
    inline def setTargetReadBytesPerSecond(value: Double): Self = StObject.set(x, "targetReadBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetReadBytesPerSecondUndefined: Self = StObject.set(x, "targetReadBytesPerSecond", js.undefined)
    
    inline def setTargetReadOpsPerSecond(value: Double): Self = StObject.set(x, "targetReadOpsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetReadOpsPerSecondUndefined: Self = StObject.set(x, "targetReadOpsPerSecond", js.undefined)
    
    inline def setTargetWriteBytesPerSecond(value: Double): Self = StObject.set(x, "targetWriteBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetWriteBytesPerSecondUndefined: Self = StObject.set(x, "targetWriteBytesPerSecond", js.undefined)
    
    inline def setTargetWriteOpsPerSecond(value: Double): Self = StObject.set(x, "targetWriteOpsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetWriteOpsPerSecondUndefined: Self = StObject.set(x, "targetWriteOpsPerSecond", js.undefined)
  }
}
