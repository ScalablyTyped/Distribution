package typings.maximMazurokGapiClientBigquery.anon

import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.ErrorProto
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobConfiguration
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobReference
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobStatistics
import typings.maximMazurokGapiClientBigquery.gapi.client.bigquery.JobStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends js.Object {
  
  /** [Full-projection-only] Specifies the job configuration. */
  var configuration: js.UndefOr[JobConfiguration] = js.native
  
  /** A result object that will be present only if the job has failed. */
  var errorResult: js.UndefOr[ErrorProto] = js.native
  
  /** Unique opaque ID of the job. */
  var id: js.UndefOr[String] = js.native
  
  /** Job reference uniquely identifying the job. */
  var jobReference: js.UndefOr[JobReference] = js.native
  
  /** The resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** Running state of the job. When the state is DONE, errorResult can be checked to determine whether the job succeeded or failed. */
  var state: js.UndefOr[String] = js.native
  
  /** [Output-only] Information about the job, including starting time and ending time of the job. */
  var statistics: js.UndefOr[JobStatistics] = js.native
  
  /** [Full-projection-only] Describes the state of the job. */
  var status: js.UndefOr[JobStatus] = js.native
  
  /** [Full-projection-only] Email address of the user who ran the job. */
  var user_email: js.UndefOr[String] = js.native
}
object Configuration {
  
  @scala.inline
  def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit class ConfigurationOps[Self <: Configuration] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: JobConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setErrorResult(value: ErrorProto): Self = this.set("errorResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorResult: Self = this.set("errorResult", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setJobReference(value: JobReference): Self = this.set("jobReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobReference: Self = this.set("jobReference", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatistics(value: JobStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    
    @scala.inline
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setUser_email(value: String): Self = this.set("user_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_email: Self = this.set("user_email", js.undefined)
  }
}
