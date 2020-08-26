package typings.ipp.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintJobRequest extends js.Object {
  var data: Buffer = js.native
  var `job-attributes-tag`: js.UndefOr[JobTemplateAttributes] = js.native
  var `operation-attributes-tag`: typings.ipp.anon.Compression = js.native
}

object PrintJobRequest {
  @scala.inline
  def apply(data: Buffer, `operation-attributes-tag`: typings.ipp.anon.Compression): PrintJobRequest = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJobRequest]
  }
  @scala.inline
  implicit class PrintJobRequestOps[Self <: PrintJobRequest] (val x: Self) extends AnyVal {
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
    def `setOperation-attributes-tag`(value: typings.ipp.anon.Compression): Self = this.set("operation-attributes-tag", value.asInstanceOf[js.Any])
    @scala.inline
    def `setJob-attributes-tag`(value: JobTemplateAttributes): Self = this.set("job-attributes-tag", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteJob-attributes-tag`: Self = this.set("job-attributes-tag", js.undefined)
  }
  
}

