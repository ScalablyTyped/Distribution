package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagerActionsSummary extends js.Object {
  
  /**
    * [Output Only] The total number of instances in the managed instance group
    * that are scheduled to be abandoned. Abandoning an instance removes it
    * from the managed instance group without deleting it.
    */
  var abandoning: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are scheduled to be created or are currently being created. If the group
    * fails to create any of these instances, it tries again until it creates
    * the instance successfully.  If you have disabled creation retries, this
    * field will not be populated; instead, the creatingWithoutRetries field
    * will be populated.
    */
  var creating: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances that the managed instance group
    * will attempt to create. The group attempts to create each instance only
    * once. If the group fails to create any of these instances, it decreases
    * the group&#39;s targetSize value accordingly.
    */
  var creatingWithoutRetries: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are scheduled to be deleted or are currently being deleted.
    */
  var deleting: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are running and have no scheduled actions.
    */
  var none: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are scheduled to be recreated or are currently being being recreated.
    * Recreating an instance deletes the existing root persistent disk and
    * creates a new disk from the image that is defined in the instance
    * template.
    */
  var recreating: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are being reconfigured with properties that do not require a restart or a
    * recreate action. For example, setting or removing target pools for the
    * instance.
    */
  var refreshing: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are scheduled to be restarted or are currently being restarted.
    */
  var restarting: js.UndefOr[Double] = js.native
  
  /**
    * [Output Only] The number of instances in the managed instance group that
    * are being verified. See the managedInstances[].currentAction property in
    * the listManagedInstances method documentation.
    */
  var verifying: js.UndefOr[Double] = js.native
}
object SchemaInstanceGroupManagerActionsSummary {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagerActionsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerActionsSummary]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagerActionsSummaryOps[Self <: SchemaInstanceGroupManagerActionsSummary] (val x: Self) extends AnyVal {
    
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
    def setAbandoning(value: Double): Self = this.set("abandoning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbandoning: Self = this.set("abandoning", js.undefined)
    
    @scala.inline
    def setCreating(value: Double): Self = this.set("creating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreating: Self = this.set("creating", js.undefined)
    
    @scala.inline
    def setCreatingWithoutRetries(value: Double): Self = this.set("creatingWithoutRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatingWithoutRetries: Self = this.set("creatingWithoutRetries", js.undefined)
    
    @scala.inline
    def setDeleting(value: Double): Self = this.set("deleting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleting: Self = this.set("deleting", js.undefined)
    
    @scala.inline
    def setNone(value: Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNone: Self = this.set("none", js.undefined)
    
    @scala.inline
    def setRecreating(value: Double): Self = this.set("recreating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecreating: Self = this.set("recreating", js.undefined)
    
    @scala.inline
    def setRefreshing(value: Double): Self = this.set("refreshing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshing: Self = this.set("refreshing", js.undefined)
    
    @scala.inline
    def setRestarting(value: Double): Self = this.set("restarting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestarting: Self = this.set("restarting", js.undefined)
    
    @scala.inline
    def setVerifying(value: Double): Self = this.set("verifying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifying: Self = this.set("verifying", js.undefined)
  }
}
