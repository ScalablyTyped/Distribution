package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the resources used to actively manage an instance group.
  */
@js.native
trait SchemaManagedGroupConfig extends js.Object {
  /**
    * Output only. The name of the Instance Group Manager for this group.
    */
  var instanceGroupManagerName: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the Instance Template used for the Managed
    * Instance Group.
    */
  var instanceTemplateName: js.UndefOr[String] = js.native
}

object SchemaManagedGroupConfig {
  @scala.inline
  def apply(): SchemaManagedGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedGroupConfig]
  }
  @scala.inline
  implicit class SchemaManagedGroupConfigOps[Self <: SchemaManagedGroupConfig] (val x: Self) extends AnyVal {
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
    def setInstanceGroupManagerName(value: String): Self = this.set("instanceGroupManagerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceGroupManagerName: Self = this.set("instanceGroupManagerName", js.undefined)
    @scala.inline
    def setInstanceTemplateName(value: String): Self = this.set("instanceTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTemplateName: Self = this.set("instanceTemplateName", js.undefined)
  }
  
}

