package typings.jestDashHasteDashMap.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerMetadata extends js.Object {
  var dependencies: js.UndefOr[js.Array[String] | Null] = js.undefined
  var id: js.UndefOr[String | Null] = js.undefined
  var module: js.UndefOr[ModuleMetaData | Null] = js.undefined
  var sha1: js.UndefOr[String | Null] = js.undefined
}

object WorkerMetadata {
  @scala.inline
  def apply(
    dependencies: js.Array[String] = null,
    id: String = null,
    module: ModuleMetaData = null,
    sha1: String = null
  ): WorkerMetadata = {
    val __obj = js.Dynamic.literal()
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (module != null) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (sha1 != null) __obj.updateDynamic("sha1")(sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerMetadata]
  }
}

