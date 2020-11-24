package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitTemplateVersionRequest extends js.Object {
  
  /** TemplateVersion obejct to create. */
  var templateVersion: js.UndefOr[TemplateVersion] = js.native
}
object CommitTemplateVersionRequest {
  
  @scala.inline
  def apply(): CommitTemplateVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitTemplateVersionRequest]
  }
  
  @scala.inline
  implicit class CommitTemplateVersionRequestOps[Self <: CommitTemplateVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setTemplateVersion(value: TemplateVersion): Self = this.set("templateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateVersion: Self = this.set("templateVersion", js.undefined)
  }
}
