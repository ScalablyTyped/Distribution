package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionInstanceGroupManagersSetTemplateRequest extends js.Object {
  /**
    * URL of the InstanceTemplate resource from which all new instances will be
    * created.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
}

object SchemaRegionInstanceGroupManagersSetTemplateRequest {
  @scala.inline
  def apply(): SchemaRegionInstanceGroupManagersSetTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionInstanceGroupManagersSetTemplateRequest]
  }
  @scala.inline
  implicit class SchemaRegionInstanceGroupManagersSetTemplateRequestOps[Self <: SchemaRegionInstanceGroupManagersSetTemplateRequest] (val x: Self) extends AnyVal {
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
    def setInstanceTemplate(value: String): Self = this.set("instanceTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTemplate: Self = this.set("instanceTemplate", js.undefined)
  }
  
}

