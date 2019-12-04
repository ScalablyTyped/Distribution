package typings.ionic.libStartMod

import typings.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportedFramework extends js.Object {
  var description: String
  var name: String
  var `type`: ProjectType
}

object SupportedFramework {
  @scala.inline
  def apply(description: String, name: String, `type`: ProjectType): SupportedFramework = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedFramework]
  }
}

