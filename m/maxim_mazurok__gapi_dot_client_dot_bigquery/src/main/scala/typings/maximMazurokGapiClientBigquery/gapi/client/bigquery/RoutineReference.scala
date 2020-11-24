package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoutineReference extends js.Object {
  
  /** [Required] The ID of the dataset containing this routine. */
  var datasetId: js.UndefOr[String] = js.native
  
  /** [Required] The ID of the project containing this routine. */
  var projectId: js.UndefOr[String] = js.native
  
  /** [Required] The ID of the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters. */
  var routineId: js.UndefOr[String] = js.native
}
object RoutineReference {
  
  @scala.inline
  def apply(): RoutineReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutineReference]
  }
  
  @scala.inline
  implicit class RoutineReferenceOps[Self <: RoutineReference] (val x: Self) extends AnyVal {
    
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
    def setDatasetId(value: String): Self = this.set("datasetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetId: Self = this.set("datasetId", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setRoutineId(value: String): Self = this.set("routineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutineId: Self = this.set("routineId", js.undefined)
  }
}
