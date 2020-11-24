package typings.ipp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FullRequest extends js.Object {
  
  var data: js.UndefOr[Buffer] = js.native
  
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  
  var `operation-attributes-tag`: js.UndefOr[OperationAttributes] = js.native
}
object FullRequest {
  
  @scala.inline
  def apply(): FullRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullRequest]
  }
  
  @scala.inline
  implicit class FullRequestOps[Self <: FullRequest] (val x: Self) extends AnyVal {
    
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
    def setData(value: Buffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = this.set("job-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteJob-attributes-tag`: Self = this.set("job-attributes-tag", js.undefined)
    
    @scala.inline
    def `setOperation-attributes-tag`(value: OperationAttributes): Self = this.set("operation-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteOperation-attributes-tag`: Self = this.set("operation-attributes-tag", js.undefined)
  }
}
