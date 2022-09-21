package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobStatus extends StObject {
  
  /**
    * Optional. The number of actively running instances. +optional
    */
  var active: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
    */
  var completionTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The latest available observations of a job's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
    */
  var conditions: js.UndefOr[js.Array[SchemaJobCondition]] = js.undefined
  
  /**
    * Optional. The number of instances which reached phase Failed. +optional
    */
  var failed: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
    */
  var imageDigest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Status of completed, failed, and running instances. +optional
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceStatus]] = js.undefined
  
  /**
    * Optional. The 'generation' of the job that was last processed by the controller.
    */
  var observedGeneration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The number of instances which reached phase Succeeded. +optional
    */
  var succeeded: js.UndefOr[Double | Null] = js.undefined
}
object SchemaJobStatus {
  
  inline def apply(): SchemaJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobStatus]
  }
  
  extension [Self <: SchemaJobStatus](x: Self) {
    
    inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeNull: Self = StObject.set(x, "completionTime", null)
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaJobCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaJobCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedNull: Self = StObject.set(x, "failed", null)
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setImageDigest(value: String): Self = StObject.set(x, "imageDigest", value.asInstanceOf[js.Any])
    
    inline def setImageDigestNull: Self = StObject.set(x, "imageDigest", null)
    
    inline def setImageDigestUndefined: Self = StObject.set(x, "imageDigest", js.undefined)
    
    inline def setInstances(value: js.Array[SchemaInstanceStatus]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaInstanceStatus*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    
    inline def setObservedGenerationNull: Self = StObject.set(x, "observedGeneration", null)
    
    inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSucceeded(value: Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededNull: Self = StObject.set(x, "succeeded", null)
    
    inline def setSucceededUndefined: Self = StObject.set(x, "succeeded", js.undefined)
  }
}
