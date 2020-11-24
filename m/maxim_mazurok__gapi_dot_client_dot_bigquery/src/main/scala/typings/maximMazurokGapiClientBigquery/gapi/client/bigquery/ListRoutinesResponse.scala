package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRoutinesResponse extends js.Object {
  
  /** A token to request the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Routines in the requested dataset. Unless read_mask is set in the request, only the following fields are populated: etag, project_id, dataset_id, routine_id, routine_type,
    * creation_time, last_modified_time, and language.
    */
  var routines: js.UndefOr[js.Array[Routine]] = js.native
}
object ListRoutinesResponse {
  
  @scala.inline
  def apply(): ListRoutinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRoutinesResponse]
  }
  
  @scala.inline
  implicit class ListRoutinesResponseOps[Self <: ListRoutinesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setRoutinesVarargs(value: Routine*): Self = this.set("routines", js.Array(value :_*))
    
    @scala.inline
    def setRoutines(value: js.Array[Routine]): Self = this.set("routines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutines: Self = this.set("routines", js.undefined)
  }
}
