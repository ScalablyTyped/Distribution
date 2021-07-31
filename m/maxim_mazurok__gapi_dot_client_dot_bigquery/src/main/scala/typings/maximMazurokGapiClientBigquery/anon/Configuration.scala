package typings.maximMazurokGapiClientBigquery.anon

import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.ErrorProto
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobConfiguration
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobReference
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobStatistics
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configuration extends StObject {
  
  /** [Full-projection-only] Specifies the job configuration. */
  var configuration: js.UndefOr[JobConfiguration] = js.undefined
  
  /** A result object that will be present only if the job has failed. */
  var errorResult: js.UndefOr[ErrorProto] = js.undefined
  
  /** Unique opaque ID of the job. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Job reference uniquely identifying the job. */
  var jobReference: js.UndefOr[JobReference] = js.undefined
  
  /** The resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Running state of the job. When the state is DONE, errorResult can be checked to determine whether the job succeeded or failed. */
  var state: js.UndefOr[String] = js.undefined
  
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[JobStatistics] = js.undefined
  
  /** [Full-projection-only] Describes the state of the job. */
  var status: js.UndefOr[JobStatus] = js.undefined
  
  /** [Full-projection-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[String] = js.undefined
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: JobConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setErrorResult(value: ErrorProto): Self = StObject.set(x, "errorResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorResultUndefined: Self = StObject.set(x, "errorResult", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setJobReference(value: JobReference): Self = StObject.set(x, "jobReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobReferenceUndefined: Self = StObject.set(x, "jobReference", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatistics(value: JobStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUser_email(value: String): Self = StObject.set(x, "user_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_emailUndefined: Self = StObject.set(x, "user_email", js.undefined)
  }
}
