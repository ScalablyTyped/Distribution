package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchFlexTemplateResponse extends js.Object {
  
  /** The job that was launched, if the request was not a dry run and the job was successfully launched. */
  var job: js.UndefOr[Job] = js.native
}
object LaunchFlexTemplateResponse {
  
  @scala.inline
  def apply(): LaunchFlexTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchFlexTemplateResponse]
  }
  
  @scala.inline
  implicit class LaunchFlexTemplateResponseOps[Self <: LaunchFlexTemplateResponse] (val x: Self) extends AnyVal {
    
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
    def setJob(value: Job): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
  }
}
