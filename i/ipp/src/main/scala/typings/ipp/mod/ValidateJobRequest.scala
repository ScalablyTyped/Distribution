package typings.ipp.mod

import typings.ipp.anon.Documentname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateJobRequest extends js.Object {
  
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  
  var `operation-attributes-tag`: Documentname = js.native
}
object ValidateJobRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Documentname): ValidateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateJobRequest]
  }
  
  @scala.inline
  implicit class ValidateJobRequestOps[Self <: ValidateJobRequest] (val x: Self) extends AnyVal {
    
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
    def `setOperation-attributes-tag`(value: Documentname): Self = this.set("operation-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = this.set("job-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJob-attributes-tag`: Self = this.set("job-attributes-tag", js.undefined)
  }
}
