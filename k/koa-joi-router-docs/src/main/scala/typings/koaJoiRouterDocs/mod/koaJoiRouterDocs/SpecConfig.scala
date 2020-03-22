package typings.koaJoiRouterDocs.mod.koaJoiRouterDocs

import typings.koaJoiRouterDocs.AnonDescription
import typings.koaJoiRouterDocs.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecConfig extends js.Object {
  var basePath: String
  var info: AnonDescription
  var tags: js.Array[AnonName]
}

object SpecConfig {
  @scala.inline
  def apply(basePath: String, info: AnonDescription, tags: js.Array[AnonName]): SpecConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SpecConfig]
  }
}

