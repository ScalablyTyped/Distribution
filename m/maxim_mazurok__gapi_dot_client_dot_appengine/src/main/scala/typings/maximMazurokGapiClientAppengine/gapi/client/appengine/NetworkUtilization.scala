package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkUtilization extends StObject {
  
  /** Target bytes received per second. */
  var targetReceivedBytesPerSecond: js.UndefOr[Double] = js.native
  
  /** Target packets received per second. */
  var targetReceivedPacketsPerSecond: js.UndefOr[Double] = js.native
  
  /** Target bytes sent per second. */
  var targetSentBytesPerSecond: js.UndefOr[Double] = js.native
  
  /** Target packets sent per second. */
  var targetSentPacketsPerSecond: js.UndefOr[Double] = js.native
}
object NetworkUtilization {
  
  @scala.inline
  def apply(): NetworkUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkUtilization]
  }
  
  @scala.inline
  implicit class NetworkUtilizationMutableBuilder[Self <: NetworkUtilization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetReceivedBytesPerSecond(value: Double): Self = StObject.set(x, "targetReceivedBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReceivedBytesPerSecondUndefined: Self = StObject.set(x, "targetReceivedBytesPerSecond", js.undefined)
    
    @scala.inline
    def setTargetReceivedPacketsPerSecond(value: Double): Self = StObject.set(x, "targetReceivedPacketsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReceivedPacketsPerSecondUndefined: Self = StObject.set(x, "targetReceivedPacketsPerSecond", js.undefined)
    
    @scala.inline
    def setTargetSentBytesPerSecond(value: Double): Self = StObject.set(x, "targetSentBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSentBytesPerSecondUndefined: Self = StObject.set(x, "targetSentBytesPerSecond", js.undefined)
    
    @scala.inline
    def setTargetSentPacketsPerSecond(value: Double): Self = StObject.set(x, "targetSentPacketsPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSentPacketsPerSecondUndefined: Self = StObject.set(x, "targetSentPacketsPerSecond", js.undefined)
  }
}
