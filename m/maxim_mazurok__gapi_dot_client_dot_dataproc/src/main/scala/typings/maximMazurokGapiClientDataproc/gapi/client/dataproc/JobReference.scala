package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobReference extends StObject {
  
  /**
    * Optional. The job ID, which must be unique within the project.The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100
    * characters.If not specified by the caller, the job ID will be provided by the server.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /** Optional. The ID of the Google Cloud Platform project that the job belongs to. If specified, must match the request project ID. */
  var projectId: js.UndefOr[String] = js.undefined
}
object JobReference {
  
  @scala.inline
  def apply(): JobReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobReference]
  }
  
  @scala.inline
  implicit class JobReferenceMutableBuilder[Self <: JobReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
