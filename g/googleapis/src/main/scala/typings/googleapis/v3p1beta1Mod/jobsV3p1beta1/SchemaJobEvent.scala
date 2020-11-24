package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event issued when a job seeker interacts with the application that
  * implements Cloud Talent Solution.
  */
@js.native
trait SchemaJobEvent extends js.Object {
  
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
  implicit class SchemaJobEventOps[Self <: SchemaJobEvent] (val x: Self) extends AnyVal {
    
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
    def setJobsVarargs(value: String*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: js.Array[String]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
