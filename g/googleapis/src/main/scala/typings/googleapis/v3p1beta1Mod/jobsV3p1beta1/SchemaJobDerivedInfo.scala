package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  Derived details about the job posting.
  */
@js.native
trait SchemaJobDerivedInfo extends js.Object {
  
  /**
    * Job categories derived from Job.title and Job.description.
    */
  var jobCategories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Structured locations of the job, resolved from Job.addresses.  locations
    * are exactly matched to Job.addresses in the same order.
    */
  var locations: js.UndefOr[js.Array[SchemaLocation]] = js.native
}
object SchemaJobDerivedInfo {
  
  @scala.inline
  def apply(): SchemaJobDerivedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJobDerivedInfo]
  }
  
  @scala.inline
  implicit class SchemaJobDerivedInfoOps[Self <: SchemaJobDerivedInfo] (val x: Self) extends AnyVal {
    
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
    def setJobCategoriesVarargs(value: String*): Self = this.set("jobCategories", js.Array(value :_*))
    
    @scala.inline
    def setJobCategories(value: js.Array[String]): Self = this.set("jobCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobCategories: Self = this.set("jobCategories", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: SchemaLocation*): Self = this.set("locations", js.Array(value :_*))
    
    @scala.inline
    def setLocations(value: js.Array[SchemaLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
  }
}
