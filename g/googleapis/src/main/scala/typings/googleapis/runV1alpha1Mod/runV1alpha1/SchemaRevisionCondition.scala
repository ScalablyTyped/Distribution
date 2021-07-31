package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * RevisionCondition defines a readiness condition for a Revision.
  */
trait SchemaRevisionCondition extends StObject {
  
  /**
    * Last time the condition transitioned from one status to another.
    * +optional
    */
  var lastTransitionTime: js.UndefOr[String] = js.undefined
  
  /**
    * Human readable message indicating details about the current status.
    * +optional
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * One-word CamelCase reason for the condition&#39;s last transition.
    * +optional
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the condition, one of True, False, Unknown.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * RevisionConditionType is used to communicate the status of the
    * reconciliation process. See also:
    * https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-reporting
    * Types include:  * &quot;Ready&quot;: True when the Revision is ready. *
    * &quot;ResourcesAvailable&quot;: True when underlying resources have been
    * provisioned. * &quot;ContainerHealthy&quot;: True when the Revision
    * readiness check completes. * &quot;Active&quot;: True when the Revision
    * may receive traffic.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaRevisionCondition {
  
  @scala.inline
  def apply(): SchemaRevisionCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRevisionCondition]
  }
  
  @scala.inline
  implicit class SchemaRevisionConditionMutableBuilder[Self <: SchemaRevisionCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastTransitionTime(value: String): Self = StObject.set(x, "lastTransitionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTransitionTimeUndefined: Self = StObject.set(x, "lastTransitionTime", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
