package typings.koaJoiRouterDocs.mod.koaJoiRouterDocs

import typings.koaJoiRouterDocs.anon.Description
import typings.koaJoiRouterDocs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecConfig extends js.Object {
  var basePath: String
  var info: Description
  var tags: js.Array[Name]
}

object SpecConfig {
  @scala.inline
  def apply(basePath: String, info: Description, tags: js.Array[Name]): SpecConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecConfig]
  }
}

