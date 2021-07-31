package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceMetadata extends StObject {
  
  /** The time at which the operation failed or was completed successfully. */
  var finishTime: js.UndefOr[String] = js.undefined
  
  /** The request that prompted the initiation of this UpdateInstance operation. */
  var originalRequest: js.UndefOr[PartialUpdateInstanceRequest] = js.undefined
  
  /** The time at which the original request was received. */
  var requestTime: js.UndefOr[String] = js.undefined
}
object UpdateInstanceMetadata {
  
  @scala.inline
  def apply(): UpdateInstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceMetadata]
  }
  
  @scala.inline
  implicit class UpdateInstanceMetadataMutableBuilder[Self <: UpdateInstanceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinishTime(value: String): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTimeUndefined: Self = StObject.set(x, "finishTime", js.undefined)
    
    @scala.inline
    def setOriginalRequest(value: PartialUpdateInstanceRequest): Self = StObject.set(x, "originalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalRequestUndefined: Self = StObject.set(x, "originalRequest", js.undefined)
    
    @scala.inline
    def setRequestTime(value: String): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeUndefined: Self = StObject.set(x, "requestTime", js.undefined)
  }
}
