package typings.jestHasteMap.typesMod

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
    dependencies: js.UndefOr[Null | js.Array[String]] = js.undefined,
    id: js.UndefOr[Null | String] = js.undefined,
    module: js.UndefOr[Null | ModuleMetaData] = js.undefined,
    sha1: js.UndefOr[Null | String] = js.undefined
  ): WorkerMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dependencies)) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(module)) __obj.updateDynamic("module")(module.asInstanceOf[js.Any])
    if (!js.isUndefined(sha1)) __obj.updateDynamic("sha1")(sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerMetadata]
  }
}

