package typings.koaDashJoiDashRouterDashDocs.koaDashJoiDashRouterDashDocsMod.koaJoiRouterDocs

import typings.koaDashJoiDashRouterDashDocs.Anon_Description
import typings.koaDashJoiDashRouterDashDocs.Anon_DescriptionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecConfig extends js.Object {
  var basePath: String
  var info: Anon_Description
  var tags: js.Array[Anon_DescriptionName]
}

object SpecConfig {
  @scala.inline
  def apply(basePath: String, info: Anon_Description, tags: js.Array[Anon_DescriptionName]): SpecConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpecConfig]
  }
}

