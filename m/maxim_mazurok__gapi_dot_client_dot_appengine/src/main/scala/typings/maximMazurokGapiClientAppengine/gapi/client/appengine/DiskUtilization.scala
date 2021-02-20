package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiskUtilization extends StObject {
  
  /** Target bytes read per second. */
  var targetReadBytesPerSecond: js.UndefOr[Double] = js.native
  
  /** Target ops read per seconds. */
  var targetReadOpsPerSecond: js.UndefOr[Double] = js.native
  
  /** Target bytes written per second. */
  var targetWriteBytesPerSecond: js.UndefOr[Double] = js.native
  
  /** Target ops written per second. */
  var targetWriteOpsPerSecond: js.UndefOr[Double] = js.native
}
object DiskUtilization {
  
  @scala.inline
  def apply(): DiskUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskUtilization]
  }
  
  @scala.inline
  implicit class DiskUtilizationMutableBuilder[Self <: DiskUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetReadBytesPerSecond(value: Double): Self = StObject.set(x, "targetReadBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReadBytesPerSecondUndefined: Self = StObject.set(x, "targetReadBytesPerSecond", js.undefined)
    
    @scala.inline
    def setTargetReadOpsPerSecond(value: Double): Self = StObject.set(x, "targetReadOpsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReadOpsPerSecondUndefined: Self = StObject.set(x, "targetReadOpsPerSecond", js.undefined)
    
    @scala.inline
    def setTargetWriteBytesPerSecond(value: Double): Self = StObject.set(x, "targetWriteBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWriteBytesPerSecondUndefined: Self = StObject.set(x, "targetWriteBytesPerSecond", js.undefined)
    
    @scala.inline
    def setTargetWriteOpsPerSecond(value: Double): Self = StObject.set(x, "targetWriteOpsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetWriteOpsPerSecondUndefined: Self = StObject.set(x, "targetWriteOpsPerSecond", js.undefined)
  }
}
