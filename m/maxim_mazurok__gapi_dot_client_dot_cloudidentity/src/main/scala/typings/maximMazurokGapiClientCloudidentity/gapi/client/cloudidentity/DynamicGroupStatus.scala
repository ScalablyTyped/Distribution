package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicGroupStatus extends StObject {
  
  /** Status of the dynamic group. */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The latest time at which the dynamic group is guaranteed to be in the given status. If status is `UP_TO_DATE`, the latest time at which the dynamic group was confirmed to be
    * up-to-date. If status is `UPDATING_MEMBERSHIPS`, the time at which dynamic group was created.
    */
  var statusTime: js.UndefOr[String] = js.undefined
}
object DynamicGroupStatus {
  
  inline def apply(): DynamicGroupStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicGroupStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicGroupStatus] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusTime(value: String): Self = StObject.set(x, "statusTime", value.asInstanceOf[js.Any])
    
    inline def setStatusTimeUndefined: Self = StObject.set(x, "statusTime", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
