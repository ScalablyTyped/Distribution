package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJobSpec extends StObject {
  
  /**
    * Optional. Not supported. Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it. If set to zero, the system will never attempt to terminate the job based on time. Otherwise, the value must be positive integer. +optional
    */
  var activeDeadlineSeconds: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the number of retries per instance, before marking this job failed. If set to zero, instances will never retry on failure. +optional
    */
  var backoffLimit: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Specifies the desired number of successfully finished instances the job should be run with. Setting to 1 means that parallelism is limited to 1 and the success of that instance signals the success of the job. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
    */
  var completions: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Specifies the maximum desired number of instances the job should run at any given time. Must be <= completions. The actual number of instances running in steady state will be less than this number when ((.spec.completions - .status.successful) < .spec.parallelism), i.e. when the work left to do is less than max parallelism. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
    */
  var parallelism: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Describes the instance that will be created when executing a job.
    */
  var template: js.UndefOr[SchemaInstanceTemplateSpec] = js.undefined
  
  /**
    * Optional. Not supported. ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is set to zero, the Job won't be automatically deleted. +optional
    */
  var ttlSecondsAfterFinished: js.UndefOr[Double | Null] = js.undefined
}
object SchemaJobSpec {
  
  inline def apply(): SchemaJobSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobSpec]
  }
  
  extension [Self <: SchemaJobSpec](x: Self) {
    
    inline def setActiveDeadlineSeconds(value: String): Self = StObject.set(x, "activeDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setActiveDeadlineSecondsNull: Self = StObject.set(x, "activeDeadlineSeconds", null)
    
    inline def setActiveDeadlineSecondsUndefined: Self = StObject.set(x, "activeDeadlineSeconds", js.undefined)
    
    inline def setBackoffLimit(value: Double): Self = StObject.set(x, "backoffLimit", value.asInstanceOf[js.Any])
    
    inline def setBackoffLimitNull: Self = StObject.set(x, "backoffLimit", null)
    
    inline def setBackoffLimitUndefined: Self = StObject.set(x, "backoffLimit", js.undefined)
    
    inline def setCompletions(value: Double): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
    
    inline def setCompletionsNull: Self = StObject.set(x, "completions", null)
    
    inline def setCompletionsUndefined: Self = StObject.set(x, "completions", js.undefined)
    
    inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismNull: Self = StObject.set(x, "parallelism", null)
    
    inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
    
    inline def setTemplate(value: SchemaInstanceTemplateSpec): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTtlSecondsAfterFinished(value: Double): Self = StObject.set(x, "ttlSecondsAfterFinished", value.asInstanceOf[js.Any])
    
    inline def setTtlSecondsAfterFinishedNull: Self = StObject.set(x, "ttlSecondsAfterFinished", null)
    
    inline def setTtlSecondsAfterFinishedUndefined: Self = StObject.set(x, "ttlSecondsAfterFinished", js.undefined)
  }
}
