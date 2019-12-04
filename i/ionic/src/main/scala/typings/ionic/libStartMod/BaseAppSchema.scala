package typings.ionic.libStartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseAppSchema extends js.Object {
  var appflowId: js.UndefOr[String] = js.undefined
  var packageId: js.UndefOr[String] = js.undefined
  var projectDir: String
  var projectId: String
}

object BaseAppSchema {
  @scala.inline
  def apply(projectDir: String, projectId: String, appflowId: String = null, packageId: String = null): BaseAppSchema = {
    val __obj = js.Dynamic.literal(projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    if (appflowId != null) __obj.updateDynamic("appflowId")(appflowId.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAppSchema]
  }
}

