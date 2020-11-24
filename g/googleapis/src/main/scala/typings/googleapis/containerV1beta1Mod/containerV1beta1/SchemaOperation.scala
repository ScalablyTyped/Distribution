package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This operation resource represents operations that may have happened or are
  * happening on the cluster. All fields are output only.
  */
@js.native
trait SchemaOperation extends js.Object {
  
  /**
    * Which conditions caused the current cluster state.
    */
  var clusterConditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.native
  
  /**
    * Detailed operation progress, if available.
    */
  var detail: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The time the operation completed, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The name of the Google Compute Engine
    * [zone](/compute/docs/regions-zones/regions-zones#available) or
    * [region](/compute/docs/regions-zones/regions-zones#available) in which
    * the cluster resides.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * The server-assigned ID for the operation.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Which conditions caused the current node pool state.
    */
  var nodepoolConditions: js.UndefOr[js.Array[SchemaStatusCondition]] = js.native
  
  /**
    * The operation type.
    */
  var operationType: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Progress information for an operation.
    */
  var progress: js.UndefOr[SchemaOperationProgress] = js.native
  
  /**
    * Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The time the operation started, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * The current status of the operation.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * If an error has occurred, a textual description of the error.
    */
  var statusMessage: js.UndefOr[String] = js.native
  
  /**
    * Server-defined URL for the target of the operation.
    */
  var targetLink: js.UndefOr[String] = js.native
  
  /**
    * The name of the Google Compute Engine
    * [zone](/compute/docs/zones#available) in which the operation is taking
    * place. This field is deprecated, use location instead.
    */
  var zone: js.UndefOr[String] = js.native
}
object SchemaOperation {
  
  @scala.inline
  def apply(): SchemaOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperation]
  }
  
  @scala.inline
  implicit class SchemaOperationOps[Self <: SchemaOperation] (val x: Self) extends AnyVal {
    
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
    def setClusterConditionsVarargs(value: SchemaStatusCondition*): Self = this.set("clusterConditions", js.Array(value :_*))
    
    @scala.inline
    def setClusterConditions(value: js.Array[SchemaStatusCondition]): Self = this.set("clusterConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterConditions: Self = this.set("clusterConditions", js.undefined)
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNodepoolConditionsVarargs(value: SchemaStatusCondition*): Self = this.set("nodepoolConditions", js.Array(value :_*))
    
    @scala.inline
    def setNodepoolConditions(value: js.Array[SchemaStatusCondition]): Self = this.set("nodepoolConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodepoolConditions: Self = this.set("nodepoolConditions", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setProgress(value: SchemaOperationProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setTargetLink(value: String): Self = this.set("targetLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetLink: Self = this.set("targetLink", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
