package typings.ionic.libStartMod

import typings.ionic.ionicBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClonedAppSchema
  extends BaseAppSchema
     with AppSchema {
  var cloned: `true`
  var url: String
}

object ClonedAppSchema {
  @scala.inline
  def apply(
    cloned: `true`,
    projectDir: String,
    projectId: String,
    url: String,
    appflowId: String = null,
    packageId: String = null
  ): ClonedAppSchema = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (appflowId != null) __obj.updateDynamic("appflowId")(appflowId.asInstanceOf[js.Any])
    if (packageId != null) __obj.updateDynamic("packageId")(packageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClonedAppSchema]
  }
}

