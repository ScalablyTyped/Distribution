package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkUtilization extends StObject {
  
  /** Target bytes received per second. */
  var targetReceivedBytesPerSecond: js.UndefOr[Double] = js.undefined
  
  /** Target packets received per second. */
  var targetReceivedPacketsPerSecond: js.UndefOr[Double] = js.undefined
  
  /** Target bytes sent per second. */
  var targetSentBytesPerSecond: js.UndefOr[Double] = js.undefined
  
  /** Target packets sent per second. */
  var targetSentPacketsPerSecond: js.UndefOr[Double] = js.undefined
}
object NetworkUtilization {
  
  inline def apply(): NetworkUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkUtilization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkUtilization] (val x: Self) extends AnyVal {
    
    inline def setTargetReceivedBytesPerSecond(value: Double): Self = StObject.set(x, "targetReceivedBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetReceivedBytesPerSecondUndefined: Self = StObject.set(x, "targetReceivedBytesPerSecond", js.undefined)
    
    inline def setTargetReceivedPacketsPerSecond(value: Double): Self = StObject.set(x, "targetReceivedPacketsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetReceivedPacketsPerSecondUndefined: Self = StObject.set(x, "targetReceivedPacketsPerSecond", js.undefined)
    
    inline def setTargetSentBytesPerSecond(value: Double): Self = StObject.set(x, "targetSentBytesPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetSentBytesPerSecondUndefined: Self = StObject.set(x, "targetSentBytesPerSecond", js.undefined)
    
    inline def setTargetSentPacketsPerSecond(value: Double): Self = StObject.set(x, "targetSentPacketsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setTargetSentPacketsPerSecondUndefined: Self = StObject.set(x, "targetSentPacketsPerSecond", js.undefined)
  }
}
