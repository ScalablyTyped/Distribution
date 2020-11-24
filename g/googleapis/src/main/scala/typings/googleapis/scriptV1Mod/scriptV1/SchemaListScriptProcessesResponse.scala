package typings.googleapis.scriptV1Mod.scriptV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response with the list of Process resources.
  */
@js.native
trait SchemaListScriptProcessesResponse extends js.Object {
  
  /**
    * Token for the next page of results. If empty, there are no more pages
    * remaining.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * List of processes matching request parameters.
    */
  var processes: js.UndefOr[js.Array[SchemaGoogleAppsScriptTypeProcess]] = js.native
}
object SchemaListScriptProcessesResponse {
  
  @scala.inline
  def apply(): SchemaListScriptProcessesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListScriptProcessesResponse]
  }
  
  @scala.inline
  implicit class SchemaListScriptProcessesResponseOps[Self <: SchemaListScriptProcessesResponse] (val x: Self) extends AnyVal {
    
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
    def setProcessesVarargs(value: SchemaGoogleAppsScriptTypeProcess*): Self = this.set("processes", js.Array(value :_*))
    
    @scala.inline
    def setProcesses(value: js.Array[SchemaGoogleAppsScriptTypeProcess]): Self = this.set("processes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcesses: Self = this.set("processes", js.undefined)
  }
}
