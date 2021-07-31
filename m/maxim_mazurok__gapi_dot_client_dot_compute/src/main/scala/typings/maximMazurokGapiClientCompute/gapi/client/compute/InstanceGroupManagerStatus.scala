package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupManagerStatus extends StObject {
  
  /** [Output Only] The URL of the Autoscaler that targets this instance group manager. */
  var autoscaler: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently
    * undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance
    * group itself is not being modified.
    */
  var isStable: js.UndefOr[Boolean] = js.undefined
  
  /** [Output Only] Stateful status of the given Instance Group Manager. */
  var stateful: js.UndefOr[InstanceGroupManagerStatusStateful] = js.undefined
  
  /** [Output Only] A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager. */
  var versionTarget: js.UndefOr[InstanceGroupManagerStatusVersionTarget] = js.undefined
}
object InstanceGroupManagerStatus {
  
  @scala.inline
  def apply(): InstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagerStatus]
  }
  
  @scala.inline
  implicit class InstanceGroupManagerStatusMutableBuilder[Self <: InstanceGroupManagerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoscaler(value: String): Self = StObject.set(x, "autoscaler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoscalerUndefined: Self = StObject.set(x, "autoscaler", js.undefined)
    
    @scala.inline
    def setIsStable(value: Boolean): Self = StObject.set(x, "isStable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsStableUndefined: Self = StObject.set(x, "isStable", js.undefined)
    
    @scala.inline
    def setStateful(value: InstanceGroupManagerStatusStateful): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
    
    @scala.inline
    def setVersionTarget(value: InstanceGroupManagerStatusVersionTarget): Self = StObject.set(x, "versionTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTargetUndefined: Self = StObject.set(x, "versionTarget", js.undefined)
  }
}
