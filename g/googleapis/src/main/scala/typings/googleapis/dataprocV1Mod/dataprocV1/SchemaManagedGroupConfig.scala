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
  def apply(instanceGroupManagerName: String = null, instanceTemplateName: String = null): SchemaManagedGroupConfig = {
    val __obj = js.Dynamic.literal()
    if (instanceGroupManagerName != null) __obj.updateDynamic("instanceGroupManagerName")(instanceGroupManagerName.asInstanceOf[js.Any])
    if (instanceTemplateName != null) __obj.updateDynamic("instanceTemplateName")(instanceTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaManagedGroupConfig]
  }
}

