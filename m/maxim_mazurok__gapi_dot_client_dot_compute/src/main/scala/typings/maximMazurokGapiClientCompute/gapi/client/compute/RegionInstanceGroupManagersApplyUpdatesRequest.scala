package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionInstanceGroupManagersApplyUpdatesRequest extends js.Object {
  
  /** Flag to update all instances instead of specified list of ?instances?. If the flag is set to true then the instances may not be specified in the request. */
  var allInstances: js.UndefOr[Boolean] = js.native
  
  /** The list of URLs of one or more instances for which you want to apply updates. Each URL can be a full URL or a partial URL, such as zones/[ZONE]/instances/[INSTANCE_NAME]. */
  var instances: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The minimal action that you want to perform on each instance during the update:
    * - REPLACE: At minimum, delete the instance and create it again.
    * - RESTART: Stop the instance and start it again.
    * - REFRESH: Do not stop the instance.
    * - NONE: Do not disrupt the instance at all.  By default, the minimum action is NONE. If your update requires a more disruptive action than you set with this flag, the necessary
    * action is performed to execute the update.
    */
  var minimalAction: js.UndefOr[String] = js.native
  
  /**
    * The most disruptive action that you want to perform on each instance during the update:
    * - REPLACE: Delete the instance and create it again.
    * - RESTART: Stop the instance and start it again.
    * - REFRESH: Do not stop the instance.
    * - NONE: Do not disrupt the instance at all.  By default, the most disruptive allowed action is REPLACE. If your update requires a more disruptive action than you set with this flag,
    * the update request will fail.
    */
  var mostDisruptiveAllowedAction: js.UndefOr[String] = js.native
}
object RegionInstanceGroupManagersApplyUpdatesRequest {
  
  @scala.inline
  def apply(): RegionInstanceGroupManagersApplyUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionInstanceGroupManagersApplyUpdatesRequest]
  }
  
  @scala.inline
  implicit class RegionInstanceGroupManagersApplyUpdatesRequestOps[Self <: RegionInstanceGroupManagersApplyUpdatesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllInstances(value: Boolean): Self = this.set("allInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllInstances: Self = this.set("allInstances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: String*): Self = this.set("instances", js.Array(value :_*))
    
    @scala.inline
    def setInstances(value: js.Array[String]): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    
    @scala.inline
    def setMinimalAction(value: String): Self = this.set("minimalAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimalAction: Self = this.set("minimalAction", js.undefined)
    
    @scala.inline
    def setMostDisruptiveAllowedAction(value: String): Self = this.set("mostDisruptiveAllowedAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostDisruptiveAllowedAction: Self = this.set("mostDisruptiveAllowedAction", js.undefined)
  }
}
