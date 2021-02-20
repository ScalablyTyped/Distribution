package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event issued when a job seeker interacts with the application that
  * implements Cloud Talent Solution.
  */
@js.native
trait SchemaJobEvent extends StObject {
  
  /**
    * Required.  The job name(s) associated with this event. For example, if
    * this is an impression event, this field contains the identifiers of all
    * jobs shown to the job seeker. If this was a view event, this field
    * contains the identifier of the viewed job.
    */
  var jobs: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required.  The type of the event (see JobEventType).
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaJobEvent {
  
  @scala.inline
  def apply(): SchemaJobEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobEvent]
  }
  
  @scala.inline
  implicit class SchemaJobEventMutableBuilder[Self <: SchemaJobEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: js.Array[String]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: String*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
